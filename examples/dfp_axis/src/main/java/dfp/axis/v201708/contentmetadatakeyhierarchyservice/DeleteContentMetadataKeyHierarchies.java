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

package dfp.axis.v201708.contentmetadatakeyhierarchyservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.ContentMetadataKeyHierarchy;
import com.google.api.ads.dfp.axis.v201708.ContentMetadataKeyHierarchyPage;
import com.google.api.ads.dfp.axis.v201708.ContentMetadataKeyHierarchyServiceInterface;
import com.google.api.ads.dfp.axis.v201708.UpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example deletes a content metadata key hierarchy. To determine
 * which content metadata key hierarchies exist, run
 * GetAllContentMetadataKeyHierarchies.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class DeleteContentMetadataKeyHierarchies {

  private static class DeleteContentMetadataKeyHierarchiesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CONTENT_METADATA_KEY_HIERARCHY_ID, required = true,
        description = "The ID of the content metadata key hierarchy.")
    private Long contentMetadataKeyHierarchyId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long contentMetadataKeyHierarchyId) throws Exception {
    // Get the ContentMetadataKeyHierarchy service.
    ContentMetadataKeyHierarchyServiceInterface contentMetadataKeyHierarchyService =
        dfpServices.get(session, ContentMetadataKeyHierarchyServiceInterface.class);

    // Create a statement to select a content metadata key hierarchy.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", contentMetadataKeyHierarchyId);

    // Get content metadata key hierarchies by statement.
    ContentMetadataKeyHierarchyPage page = contentMetadataKeyHierarchyService
        .getContentMetadataKeyHierarchiesByStatement(statementBuilder.toStatement());

    ContentMetadataKeyHierarchy contentMetadataKeyHierarchy = 
        Iterables.getOnlyElement(Arrays.asList(page.getResults()));
    
    System.out.printf("Content metadata key hierarchy with ID %d will be deleted.%n",
        contentMetadataKeyHierarchy.getId());

    statementBuilder.removeLimitAndOffset();

    // Create action.
    com.google.api.ads.dfp.axis.v201708.DeleteContentMetadataKeyHierarchies action =
        new com.google.api.ads.dfp.axis.v201708.DeleteContentMetadataKeyHierarchies();

    // Perform action.
    UpdateResult result = contentMetadataKeyHierarchyService
        .performContentMetadataKeyHierarchyAction(action, statementBuilder.toStatement());

    if (result != null && result.getNumChanges() > 0) {
      System.out.printf("Number of content metadata key hierarchies deleted: %d%n",
          result.getNumChanges());
    } else {
      System.out.println("No content metadata key hierarchies were deleted.");
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

    DeleteContentMetadataKeyHierarchiesParams params =
        new DeleteContentMetadataKeyHierarchiesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.contentMetadataKeyHierarchyId =
          Long.parseLong("INSERT_CONTENT_METADATA_KEY_HIERARCHY_ID_HERE");
    }

    runExample(dfpServices, session, params.contentMetadataKeyHierarchyId);
  }
}
