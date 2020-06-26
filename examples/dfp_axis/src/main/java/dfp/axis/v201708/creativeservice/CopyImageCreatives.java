// Copyright 2015 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dfp.axis.v201708.creativeservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.AspectRatioImageCreative;
import com.google.api.ads.dfp.axis.v201708.Creative;
import com.google.api.ads.dfp.axis.v201708.CreativeAsset;
import com.google.api.ads.dfp.axis.v201708.CreativeServiceInterface;
import com.google.api.ads.dfp.axis.v201708.ImageCreative;
import com.google.api.ads.dfp.axis.v201708.Size;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a copy of an image creative. To determine which
 * image creatives exist, run GetImageCreatives.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CopyImageCreatives {

  private static class CopyImageCreativesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CREATIVE_ID, required = true,
        description = "The ID of the image creative to copy.")
    private Long creativeId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long creativeId)
      throws Exception {
    // Get the CreativeService.
    CreativeServiceInterface creativeService =
        dfpServices.get(session, CreativeServiceInterface.class);

    // Create a statement to get the image creative.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("id", creativeId);

    // Get the creative.
    ImageCreative imageCreative = (ImageCreative) creativeService.getCreativesByStatement(
        statementBuilder.toStatement()).getResults()[0];

    // Fetch the image asset.
    CreativeAsset assetToCopy = imageCreative.getPrimaryImageAsset();
    
    Size aspectRatioSize = imageCreative.getSize();
    aspectRatioSize.setIsAspectRatio(true);
    
    AspectRatioImageCreative newImageCreative = new AspectRatioImageCreative();
    newImageCreative.setName("Copy of original image creative");
    newImageCreative.setSize(aspectRatioSize);
    newImageCreative.setAdvertiserId(imageCreative.getAdvertiserId());
    newImageCreative.setImageAssets(new CreativeAsset[] {assetToCopy});
    newImageCreative.setDestinationUrl(imageCreative.getDestinationUrl());

    // Create the creative on the server.
    Creative[] creatives =
        creativeService.createCreatives(new Creative[] {newImageCreative});

    for (Creative createdCreative : creatives) {
      System.out.printf("A creative with ID %d, name '%s', and type '%s'"
          + " was created and can be previewed at: %s%n", createdCreative.getId(),
          createdCreative.getName(), createdCreative.getClass().getSimpleName(),
          createdCreative.getPreviewUrl());
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    CopyImageCreativesParams params = new CopyImageCreativesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.creativeId = Long.parseLong("INSERT_CREATIVE_ID_HERE");
    }

    runExample(dfpServices, session, params.creativeId);
  }
}
