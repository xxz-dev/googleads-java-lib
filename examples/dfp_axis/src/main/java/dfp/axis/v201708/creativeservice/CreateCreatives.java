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
import com.google.api.ads.common.lib.utils.Media;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201708.Creative;
import com.google.api.ads.dfp.axis.v201708.CreativeAsset;
import com.google.api.ads.dfp.axis.v201708.CreativeServiceInterface;
import com.google.api.ads.dfp.axis.v201708.ImageCreative;
import com.google.api.ads.dfp.axis.v201708.ImageRedirectCreative;
import com.google.api.ads.dfp.axis.v201708.Size;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import java.util.Random;

/**
 * This example creates new creatives. To determine which creatives exist, run
 * GetAllCreatives.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateCreatives {

  private static class CreateCreativesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.ADVERTISER_ID, required = true,
        description = "The ID of the advertiser (company) that all creatives will be assigned"
            + " to.")
    private Long advertiserId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long advertiserId)
      throws Exception {
    // Get the CreativeService.
    CreativeServiceInterface creativeService =
        dfpServices.get(session, CreativeServiceInterface.class);

    // Create creative size.
    Size size = new Size();
    size.setWidth(600);
    size.setHeight(315);
    size.setIsAspectRatio(false);

    // Create an image creative.
    ImageCreative imageCreative = new ImageCreative();
    imageCreative.setName("Image creative #" + new Random().nextInt(Integer.MAX_VALUE));
    imageCreative.setAdvertiserId(advertiserId);
    imageCreative.setDestinationUrl("http://google.com");
    imageCreative.setSize(size);

    // Create image asset.
    CreativeAsset creativeAsset = new CreativeAsset();
    creativeAsset.setFileName("image.jpg");
    creativeAsset.setAssetByteArray(Media.getMediaDataFromUrl("https://goo.gl/3b9Wfh"));
    creativeAsset.setSize(size);
    imageCreative.setPrimaryImageAsset(creativeAsset);

    // Create an image redirect creative.
    ImageRedirectCreative imageRedirectCreative = new ImageRedirectCreative();
    imageRedirectCreative.setName(
        "Image redirect creative #" + new Random().nextInt(Integer.MAX_VALUE));
    imageRedirectCreative.setAdvertiserId(advertiserId);
    imageRedirectCreative.setDestinationUrl("http://google.com");
    imageRedirectCreative.setImageUrl("https://goo.gl/3b9Wfh");
    imageRedirectCreative.setSize(size);

    // Create the creatives on the server.
    Creative[] creatives =
        creativeService.createCreatives(new Creative[] {imageCreative, imageRedirectCreative});

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

    CreateCreativesParams params = new CreateCreativesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.advertiserId = Long.parseLong("INSERT_ADVERTISER_ID_HERE");
    }

    runExample(dfpServices, session, params.advertiserId);
  }
}
