// Copyright 2016 Google Inc. All Rights Reserved.
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

package dfp.axis.v201708.orderservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.DateTimes;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.Order;
import com.google.api.ads.dfp.axis.v201708.OrderPage;
import com.google.api.ads.dfp.axis.v201708.OrderServiceInterface;
import com.google.api.ads.dfp.axis.v201708.OrderStatus;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import org.joda.time.Duration;
import org.joda.time.Instant;

/**
 * This example gets all orders that are starting soon.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetOrdersStartingSoon {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    OrderServiceInterface orderService =
        dfpServices.get(session, OrderServiceInterface.class);

    // Create a statement to select orders.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("status = :status and startDateTime >= :now and startDateTime <= :soon")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("status", OrderStatus.APPROVED.toString())
        .withBindVariableValue("now", DateTimes.toDateTime(Instant.now(), "America/New_York"))
        .withBindVariableValue("soon", DateTimes.toDateTime(Instant.now().plus(
            Duration.standardDays(5L)), "America/New_York"));

    // Retrieve a small amount of orders at a time, paging through
    // until all orders have been retrieved.
    int totalResultSetSize = 0;
    do {
      OrderPage page =
          orderService.getOrdersByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        // Print out some information for each order.
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (Order order : page.getResults()) {
          System.out.printf(
              "%d) Order with ID %d and name '%s' was found.%n",
              i++,
              order.getId(),
              order.getName()
          );
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d%n", totalResultSetSize);
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential for authentication.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an API session configured from a properties file and the OAuth2
    // credentials above.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session);
  }
}
