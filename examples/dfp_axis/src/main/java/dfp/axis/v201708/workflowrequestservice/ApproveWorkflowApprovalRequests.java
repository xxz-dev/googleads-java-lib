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

package dfp.axis.v201708.workflowrequestservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.UpdateResult;
import com.google.api.ads.dfp.axis.v201708.WorkflowApprovalRequestStatus;
import com.google.api.ads.dfp.axis.v201708.WorkflowEntityType;
import com.google.api.ads.dfp.axis.v201708.WorkflowRequest;
import com.google.api.ads.dfp.axis.v201708.WorkflowRequestPage;
import com.google.api.ads.dfp.axis.v201708.WorkflowRequestServiceInterface;
import com.google.api.ads.dfp.axis.v201708.WorkflowRequestType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example approves all workflow approval requests belonging to a specific proposal.
 * To determine which proposals exist, run GetAllProposals.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class ApproveWorkflowApprovalRequests {

  private static class ApproveWorkflowApprovalRequestsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.PROPOSAL_ID, required = true,
        description = "The ID of the proposal to approve workflow approval requests for.")
    private Long proposalId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long proposalId)
      throws Exception {
    // Get the WorkflowRequestService.
    WorkflowRequestServiceInterface workflowRequestService =
        dfpServices.get(session, WorkflowRequestServiceInterface.class);

    // Create a statement to select workflow approval requests for a proposal.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE entityId = :entityId and entityType = :entityType "
            + "and type = :type and approvalStatus = :approvalStatus")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("entityId", proposalId)
        .withBindVariableValue("entityType", WorkflowEntityType.PROPOSAL.toString())
        .withBindVariableValue("approvalStatus",
            WorkflowApprovalRequestStatus.PENDING_APPROVAL.toString())
        .withBindVariableValue("type", WorkflowRequestType.WORKFLOW_APPROVAL_REQUEST.toString());

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get workflow requests by statement.
      WorkflowRequestPage page = workflowRequestService.getWorkflowRequestsByStatement(
          statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (WorkflowRequest workflowRequest : page.getResults()) {
          System.out.printf("%d) Workflow approval request with ID %d will be approved.%n",
              i++, workflowRequest.getId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of workflow approval requests to be approved: %d%n",
        totalResultSetSize);

    if (totalResultSetSize > 0) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      com.google.api.ads.dfp.axis.v201708.ApproveWorkflowApprovalRequests action =
          new com.google.api.ads.dfp.axis.v201708.ApproveWorkflowApprovalRequests();

      // Add a comment to the approval.
      action.setComment("The proposal looks good to me. Approved.");

      // Perform action.
      UpdateResult result =
          workflowRequestService.performWorkflowRequestAction(
              action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.printf("Number of workflow approval requests approved: %d%n",
            result.getNumChanges());
      } else {
        System.out.println("No workflow approval requests were approved.");
      }
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

    ApproveWorkflowApprovalRequestsParams params = new ApproveWorkflowApprovalRequestsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.proposalId = Long.parseLong("INSERT_PROPOSAL_ID_HERE");
    }

    runExample(dfpServices, session, params.proposalId);
  }
}
