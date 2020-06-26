// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.admanager.jaxws.v202002;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Column.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Column">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AD_SERVER_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_TARGETED_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_CLICKS"/>
 *     &lt;enumeration value="AD_SERVER_TARGETED_CLICKS"/>
 *     &lt;enumeration value="AD_SERVER_CTR"/>
 *     &lt;enumeration value="AD_SERVER_CPM_AND_CPC_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_CPM_AND_CPC_REVENUE_GROSS"/>
 *     &lt;enumeration value="AD_SERVER_CPD_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_CPA_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_ALL_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_ALL_REVENUE_GROSS"/>
 *     &lt;enumeration value="AD_SERVER_WITHOUT_CPD_AVERAGE_ECPM"/>
 *     &lt;enumeration value="AD_SERVER_WITH_CPD_AVERAGE_ECPM"/>
 *     &lt;enumeration value="AD_SERVER_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_LINE_ITEM_LEVEL_PERCENT_CLICKS"/>
 *     &lt;enumeration value="AD_SERVER_INVENTORY_LEVEL_WITH_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_UNFILTERED_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_UNFILTERED_CLICKS"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_CLICKS"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_TARGETED_CLICKS"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_CTR"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_REVENUE"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_AVERAGE_ECPM"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_PERCENT_CLICKS"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_INVENTORY_LEVEL_WITH_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="ADSENSE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_MATCHED_REQUESTS"/>
 *     &lt;enumeration value="AD_EXCHANGE_AD_ECPM"/>
 *     &lt;enumeration value="AD_EXCHANGE_CLICKS"/>
 *     &lt;enumeration value="AD_EXCHANGE_ESTIMATED_REVENUE"/>
 *     &lt;enumeration value="AD_EXCHANGE_COVERAGE"/>
 *     &lt;enumeration value="AD_EXCHANGE_CTR"/>
 *     &lt;enumeration value="AD_EXCHANGE_LIFT"/>
 *     &lt;enumeration value="AD_EXCHANGE_CPC"/>
 *     &lt;enumeration value="AD_EXCHANGE_AD_REQUESTS"/>
 *     &lt;enumeration value="AD_EXCHANGE_AD_REQUEST_ECPM"/>
 *     &lt;enumeration value="AD_EXCHANGE_AD_REQUEST_CTR"/>
 *     &lt;enumeration value="AD_EXCHANGE_AD_CTR"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_DROPOFF_RATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_ABANDONMENT_RATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_MATCHED_ECPM"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE"/>
 *     &lt;enumeration value="AD_EXCHANGE_AVERAGE_VIEWABLE_TIME"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_ENABLED_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_MEASURED_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_VIEWED_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_DEALS_BID_RESPONSES"/>
 *     &lt;enumeration value="AD_EXCHANGE_DEALS_MATCHED_REQUESTS"/>
 *     &lt;enumeration value="AD_EXCHANGE_DEALS_AD_REQUESTS"/>
 *     &lt;enumeration value="AD_EXCHANGE_DEALS_MATCH_RATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_AUTO_PLAY"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_CLICK_TO_PLAY"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_START"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_QUARTILE_1"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_MIDPOINT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_QUARTILE_3"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_COMPLETE"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_COMPLETION_RATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_COLLAPSE"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_EXPAND"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_FULL_SCREEN"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_MUTE"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_PAUSE"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_RESUME"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_REWIND"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_SKIPPED"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_UNMUTE"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST2_ERROR_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_100_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_101_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_102_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_200_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_201_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_202_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_203_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_300_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_301_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_302_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_303_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_400_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_401_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_402_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_403_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_405_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_500_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_501_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_502_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_503_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_600_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_601_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_602_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_603_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_604_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_900_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_VAST_ERROR_901_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_TOTAL_VAST_ERROR_COUNT"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_TOTAL_ERROR_RATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_TRUEVIEW_SKIP_RATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_TRUEVIEW_VIEWS"/>
 *     &lt;enumeration value="AD_EXCHANGE_VIDEO_TRUEVIEW_VTR"/>
 *     &lt;enumeration value="MEDIATION_THIRD_PARTY_ECPM"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_CLICKS"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_TARGETED_CLICKS"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_CTR"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_CLICKS"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_REVENUE"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE"/>
 *     &lt;enumeration value="AD_EXCHANGE_LINE_ITEM_LEVEL_AVERAGE_ECPM"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_CLICKS"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_TARGETED_CLICKS"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_CTR"/>
 *     &lt;enumeration value="TOTAL_INVENTORY_LEVEL_ALL_REVENUE"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_ALL_REVENUE"/>
 *     &lt;enumeration value="TOTAL_INVENTORY_LEVEL_WITH_CPD_AVERAGE_ECPM"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_WITHOUT_CPD_AVERAGE_ECPM"/>
 *     &lt;enumeration value="TOTAL_LINE_ITEM_LEVEL_WITH_CPD_AVERAGE_ECPM"/>
 *     &lt;enumeration value="TOTAL_CODE_SERVED_COUNT"/>
 *     &lt;enumeration value="TOTAL_AD_REQUESTS"/>
 *     &lt;enumeration value="TOTAL_RESPONSES_SERVED"/>
 *     &lt;enumeration value="TOTAL_UNMATCHED_AD_REQUESTS"/>
 *     &lt;enumeration value="TOTAL_FILL_RATE"/>
 *     &lt;enumeration value="AD_SERVER_RESPONSES_SERVED"/>
 *     &lt;enumeration value="ADSENSE_RESPONSES_SERVED"/>
 *     &lt;enumeration value="AD_EXCHANGE_RESPONSES_SERVED"/>
 *     &lt;enumeration value="TOTAL_VIDEO_OPPORTUNITIES"/>
 *     &lt;enumeration value="TOTAL_VIDEO_CAPPED_OPPORTUNITIES"/>
 *     &lt;enumeration value="TOTAL_INVENTORY_LEVEL_UNFILLED_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_CONTROL_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_CONTROL_CLICKS"/>
 *     &lt;enumeration value="OPTIMIZATION_CONTROL_CTR"/>
 *     &lt;enumeration value="OPTIMIZATION_OPTIMIZED_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_OPTIMIZED_CLICKS"/>
 *     &lt;enumeration value="OPTIMIZATION_NON_OPTIMIZED_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_NON_OPTIMIZED_CLICKS"/>
 *     &lt;enumeration value="OPTIMIZATION_EXTRA_CLICKS"/>
 *     &lt;enumeration value="OPTIMIZATION_OPTIMIZED_CTR"/>
 *     &lt;enumeration value="OPTIMIZATION_LIFT"/>
 *     &lt;enumeration value="OPTIMIZATION_COVERAGE"/>
 *     &lt;enumeration value="OPTIMIZATION_BEHIND_SCHEDULE_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_NO_CLICKS_RECORDED_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_SPONSORSHIP_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_AS_FAST_AS_POSSIBLE_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_NO_ABSOLUTE_LIFETIME_GOAL_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_CONTROL_REVENUE"/>
 *     &lt;enumeration value="OPTIMIZATION_OPTIMIZED_REVENUE"/>
 *     &lt;enumeration value="OPTIMIZATION_CONTROL_ECPM"/>
 *     &lt;enumeration value="OPTIMIZATION_OPTIMIZED_ECPM"/>
 *     &lt;enumeration value="OPTIMIZATION_FREED_UP_IMPRESSIONS"/>
 *     &lt;enumeration value="OPTIMIZATION_ECPM_LIFT"/>
 *     &lt;enumeration value="UNIQUE_REACH_FREQUENCY"/>
 *     &lt;enumeration value="UNIQUE_REACH_IMPRESSIONS"/>
 *     &lt;enumeration value="UNIQUE_REACH"/>
 *     &lt;enumeration value="GRP_POPULATION"/>
 *     &lt;enumeration value="GRP_UNIQUE_AUDIENCE"/>
 *     &lt;enumeration value="GRP_UNIQUE_AUDIENCE_SHARE"/>
 *     &lt;enumeration value="GRP_AUDIENCE_IMPRESSIONS"/>
 *     &lt;enumeration value="GRP_AUDIENCE_IMPRESSIONS_SHARE"/>
 *     &lt;enumeration value="GRP_AUDIENCE_REACH"/>
 *     &lt;enumeration value="GRP_AUDIENCE_AVERAGE_FREQUENCY"/>
 *     &lt;enumeration value="GRP_GROSS_RATING_POINTS"/>
 *     &lt;enumeration value="SDK_MEDIATION_CREATIVE_IMPRESSIONS"/>
 *     &lt;enumeration value="SDK_MEDIATION_CREATIVE_CLICKS"/>
 *     &lt;enumeration value="SELL_THROUGH_FORECASTED_IMPRESSIONS"/>
 *     &lt;enumeration value="SELL_THROUGH_AVAILABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="SELL_THROUGH_RESERVED_IMPRESSIONS"/>
 *     &lt;enumeration value="SELL_THROUGH_SELL_THROUGH_RATE"/>
 *     &lt;enumeration value="RICH_MEDIA_BACKUP_IMAGES"/>
 *     &lt;enumeration value="RICH_MEDIA_DISPLAY_TIME"/>
 *     &lt;enumeration value="RICH_MEDIA_AVERAGE_DISPLAY_TIME"/>
 *     &lt;enumeration value="RICH_MEDIA_EXPANSIONS"/>
 *     &lt;enumeration value="RICH_MEDIA_EXPANDING_TIME"/>
 *     &lt;enumeration value="RICH_MEDIA_INTERACTION_TIME"/>
 *     &lt;enumeration value="RICH_MEDIA_INTERACTION_COUNT"/>
 *     &lt;enumeration value="RICH_MEDIA_INTERACTION_RATE"/>
 *     &lt;enumeration value="RICH_MEDIA_AVERAGE_INTERACTION_TIME"/>
 *     &lt;enumeration value="RICH_MEDIA_INTERACTION_IMPRESSIONS"/>
 *     &lt;enumeration value="RICH_MEDIA_MANUAL_CLOSES"/>
 *     &lt;enumeration value="RICH_MEDIA_FULL_SCREEN_IMPRESSIONS"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_INTERACTIONS"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_INTERACTION_RATE"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_MUTES"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_PAUSES"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_PLAYES"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_MIDPOINTS"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_COMPLETES"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_REPLAYS"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_STOPS"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_UNMUTES"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_VIEW_TIME"/>
 *     &lt;enumeration value="RICH_MEDIA_VIDEO_VIEW_RATE"/>
 *     &lt;enumeration value="RICH_MEDIA_CUSTOM_EVENT_TIME"/>
 *     &lt;enumeration value="RICH_MEDIA_CUSTOM_EVENT_COUNT"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_START"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_FIRST_QUARTILE"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_MIDPOINT"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_THIRD_QUARTILE"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_COMPLETE"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_AVERAGE_VIEW_RATE"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_AVERAGE_VIEW_TIME"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_COMPLETION_RATE"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_TOTAL_ERROR_COUNT"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_VIDEO_LENGTH"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_SKIP_BUTTON_SHOWN"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_ENGAGED_VIEW"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_VIEW_THROUGH_RATE"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_AUTO_PLAYS"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_CLICK_TO_PLAYS"/>
 *     &lt;enumeration value="VIDEO_VIEWERSHIP_TOTAL_ERROR_RATE"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_100_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_101_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_102_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_200_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_201_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_202_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_203_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_300_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_301_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_302_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_303_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_400_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_401_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_402_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_403_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_405_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_500_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_501_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_502_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_503_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_600_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_601_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_602_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_603_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_604_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_900_COUNT"/>
 *     &lt;enumeration value="VIDEO_ERRORS_VAST_ERROR_901_COUNT"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_PAUSE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_RESUME"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_REWIND"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_MUTE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_UNMUTE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_COLLAPSE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_EXPAND"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_FULL_SCREEN"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_AVERAGE_INTERACTION_RATE"/>
 *     &lt;enumeration value="VIDEO_INTERACTION_VIDEO_SKIPS"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_STARTS"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_STARTS"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_COMPLETES"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETES"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_COMPLETION_RATE"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETION_RATE"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_COMPLETION_RATE_LIFT"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_SKIP_BUTTON_SHOWN"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_SKIP_BUTTON_SHOWN"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_ENGAGED_VIEW"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_ENGAGED_VIEW"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_CONTROL_VIEW_THROUGH_RATE"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_OPTIMIZED_VIEW_THROUGH_RATE"/>
 *     &lt;enumeration value="VIDEO_OPTIMIZATION_VIEW_THROUGH_RATE_LIFT"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_REVENUE"/>
 *     &lt;enumeration value="AD_SERVER_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_REVENUE"/>
 *     &lt;enumeration value="ADSENSE_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_REVENUE"/>
 *     &lt;enumeration value="AD_EXCHANGE_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"/>
 *     &lt;enumeration value="TOTAL_ACTIVE_VIEW_REVENUE"/>
 *     &lt;enumeration value="VIEW_THROUGH_CONVERSIONS"/>
 *     &lt;enumeration value="CONVERSIONS_PER_THOUSAND_IMPRESSIONS"/>
 *     &lt;enumeration value="CLICK_THROUGH_CONVERSIONS"/>
 *     &lt;enumeration value="CONVERSIONS_PER_CLICK"/>
 *     &lt;enumeration value="VIEW_THROUGH_REVENUE"/>
 *     &lt;enumeration value="CLICK_THROUGH_REVENUE"/>
 *     &lt;enumeration value="TOTAL_CONVERSIONS"/>
 *     &lt;enumeration value="TOTAL_CONVERSION_REVENUE"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_COMPETING_TOTAL"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_UNFILLED_IMPRESSIONS_COMPETING"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_ELIGIBLE_IMPRESSIONS_TOTAL"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_TOTAL"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_PERCENT_TOTAL"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_SATURATION_RATE_TOTAL"/>
 *     &lt;enumeration value="DYNAMIC_ALLOCATION_OPPORTUNITY_MATCH_RATE_TOTAL"/>
 *     &lt;enumeration value="INVOICED_IMPRESSIONS"/>
 *     &lt;enumeration value="INVOICED_UNFILLED_IMPRESSIONS"/>
 *     &lt;enumeration value="NIELSEN_IMPRESSIONS"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_IMPRESSIONS"/>
 *     &lt;enumeration value="NIELSEN_POPULATION_BASE"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_POPULATION_BASE"/>
 *     &lt;enumeration value="NIELSEN_UNIQUE_AUDIENCE"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_UNIQUE_AUDIENCE"/>
 *     &lt;enumeration value="NIELSEN_PERCENT_AUDIENCE_REACH"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_PERCENT_AUDIENCE_REACH"/>
 *     &lt;enumeration value="NIELSEN_AVERAGE_FREQUENCY"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_AVERAGE_FREQUENCY"/>
 *     &lt;enumeration value="NIELSEN_GROSS_RATING_POINTS"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_GROSS_RATING_POINTS"/>
 *     &lt;enumeration value="NIELSEN_PERCENT_IMPRESSIONS_SHARE"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_PERCENT_IMPRESSIONS_SHARE"/>
 *     &lt;enumeration value="NIELSEN_PERCENT_POPULATION_SHARE"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_PERCENT_POPULATION_SHARE"/>
 *     &lt;enumeration value="NIELSEN_PERCENT_AUDIENCE_SHARE"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_PERCENT_AUDIENCE_SHARE"/>
 *     &lt;enumeration value="NIELSEN_AUDIENCE_INDEX"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_AUDIENCE_INDEX"/>
 *     &lt;enumeration value="NIELSEN_IMPRESSIONS_INDEX"/>
 *     &lt;enumeration value="NIELSEN_IN_TARGET_IMPRESSIONS_INDEX"/>
 *     &lt;enumeration value="DP_IMPRESSIONS"/>
 *     &lt;enumeration value="DP_CLICKS"/>
 *     &lt;enumeration value="DP_QUERIES"/>
 *     &lt;enumeration value="DP_MATCHED_QUERIES"/>
 *     &lt;enumeration value="DP_COST"/>
 *     &lt;enumeration value="DP_ECPM"/>
 *     &lt;enumeration value="DP_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"/>
 *     &lt;enumeration value="DP_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="DP_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"/>
 *     &lt;enumeration value="DP_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="DP_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_HOST_IMPRESSIONS"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_HOST_CLICKS"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_HOST_CTR"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_UNFILLED_IMPRESSIONS"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_IMPRESSIONS"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_CLICKS"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_PARTNER_CTR"/>
 *     &lt;enumeration value="PARTNER_MANAGEMENT_GROSS_REVENUE"/>
 *     &lt;enumeration value="PARTNER_FINANCE_HOST_IMPRESSIONS"/>
 *     &lt;enumeration value="PARTNER_FINANCE_HOST_REVENUE"/>
 *     &lt;enumeration value="PARTNER_FINANCE_HOST_ECPM"/>
 *     &lt;enumeration value="PARTNER_FINANCE_PARTNER_REVENUE"/>
 *     &lt;enumeration value="PARTNER_FINANCE_PARTNER_ECPM"/>
 *     &lt;enumeration value="PARTNER_FINANCE_GROSS_REVENUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Column")
@XmlEnum
public enum Column {


    /**
     * 
     *                 The number of impressions delivered by the ad server.
     *                 <p>Corresponds to "Ad server impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_IMPRESSIONS("AD_SERVER_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions delivered by the ad server by explicit custom criteria targeting.
     *                 <p>Corresponds to "Ad server targeted impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_TARGETED_IMPRESSIONS("AD_SERVER_TARGETED_IMPRESSIONS"),

    /**
     * 
     *                 The number of clicks delivered by the ad server.
     *                 <p>Corresponds to "Ad server clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_CLICKS("AD_SERVER_CLICKS"),

    /**
     * 
     *                 The number of clicks delivered by the ad server by explicit custom criteria targeting.
     *                 <p>Corresponds to "Ad server targeted clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_TARGETED_CLICKS("AD_SERVER_TARGETED_CLICKS"),

    /**
     * 
     *                 The CTR for an ad delivered by the ad server.
     *                 <p>Corresponds to "Ad server CTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_CTR("AD_SERVER_CTR"),

    /**
     * 
     *                 The CPM and CPC revenue earned, calculated in publisher currency,
     *                 for the ads delivered by the ad server.
     *                 <p>Corresponds to "Ad server CPM and CPC revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_CPM_AND_CPC_REVENUE("AD_SERVER_CPM_AND_CPC_REVENUE"),

    /**
     * 
     *                 The CPM and CPC revenue earned, calculated in publisher currency, for the ads delivered by the
     *                 ad server. This includes pre-rev-share revenue for Programmatic traffic. This is a temporary
     *                 metric to help with the transition from gross to net revenue reporting.
     *                 <p>Corresponds to "Ad server CPM and CPC revenue (gross)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_CPM_AND_CPC_REVENUE_GROSS("AD_SERVER_CPM_AND_CPC_REVENUE_GROSS"),

    /**
     * 
     *                 The CPD revenue earned, calculated in publisher currency,
     *                 for the ads delivered by the ad server.
     *                 <p>Corresponds to "Ad server CPD revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_CPD_REVENUE("AD_SERVER_CPD_REVENUE"),

    /**
     * 
     *                 The CPA revenue earned, calculated in publisher currency, for the ads delivered by the
     *                 ad server.
     *                 <p>Corresponds to "CPA revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_CPA_REVENUE("AD_SERVER_CPA_REVENUE"),

    /**
     * 
     *                 The CPM, CPC and CPD revenue earned, calculated in publisher currency,
     *                 for the ads delivered by the ad server.
     *                 <p>Can correspond to any of the following in the Ad Manager UI: Ad server CPM, CPC, CPD, and vCPM revenue, Ad server CPM, CPC and CPD revenue. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ALL_REVENUE("AD_SERVER_ALL_REVENUE"),

    /**
     * 
     *                 The CPM, CPC and CPD gross revenue earned, calculated in publisher currency, for the ads
     *                 delivered by the ad server. This includes pre-rev-share revenue for Programmatic traffic.
     *                 This is a temporary metric to help with the transition from gross to net revenue reporting.
     *                 <p>Can correspond to any of the following in the Ad Manager UI: Ad server CPM, CPC, CPD, and vCPM revenue (gross), Ad server CPM, CPC and CPD revenue (gross). Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ALL_REVENUE_GROSS("AD_SERVER_ALL_REVENUE_GROSS"),

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from the CPM and CPC ads
     *                 delivered by the ad server.
     *                 <p>Corresponds to "Ad server average eCPM" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_WITHOUT_CPD_AVERAGE_ECPM("AD_SERVER_WITHOUT_CPD_AVERAGE_ECPM"),

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from the CPM, CPC and CPD ads
     *                 delivered by the ad server.
     *               
     * 
     */
    AD_SERVER_WITH_CPD_AVERAGE_ECPM("AD_SERVER_WITH_CPD_AVERAGE_ECPM"),

    /**
     * 
     *                 The ratio of the number of impressions delivered to the total impressions
     *                 delivered by the ad server for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "Ad server impressions (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS("AD_SERVER_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS"),

    /**
     * 
     *                 The ratio of the number of clicks delivered to the total clicks delivered
     *                 by the ad server for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "Ad server clicks (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_LINE_ITEM_LEVEL_PERCENT_CLICKS("AD_SERVER_LINE_ITEM_LEVEL_PERCENT_CLICKS"),

    /**
     * 
     *                 The ratio of revenue generated by ad server to the total CPM, CPC and CPD revenue earned
     *                 by ads delivered when no {@link LineItem} reservation could be found by
     *                 the ad server for inventory-level dynamic allocation.
     *                 For Ad Manager 360 networks, this includes line item-level dynamic allocation as well.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_SERVER_INVENTORY_LEVEL_WITH_CPD_PERCENT_REVENUE("AD_SERVER_INVENTORY_LEVEL_WITH_CPD_PERCENT_REVENUE"),

    /**
     * 
     *                 The ratio of revenue generated by ad server to the total CPM and CPC revenue earned by
     *                 the ads delivered for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "Ad server revenue (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE("AD_SERVER_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"),

    /**
     * 
     *                 The ratio of revenue generated by ad server to the total CPM, CPC and CPD revenue earned by
     *                 the ads delivered for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_SERVER_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE("AD_SERVER_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE"),

    /**
     * 
     *                 The number of downloaded impressions delivered by the ad server including impressions
     *                 recognized as spam.
     *                 <p>Corresponds to "Ad server unfiltered downloaded impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_UNFILTERED_IMPRESSIONS("AD_SERVER_UNFILTERED_IMPRESSIONS"),

    /**
     * 
     *                 The number of clicks delivered by the ad server including clicks recognized as spam.
     *                 <p>Corresponds to "Ad server unfiltered clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_UNFILTERED_CLICKS("AD_SERVER_UNFILTERED_CLICKS"),

    /**
     * 
     *                 The number of impressions an AdSense ad delivered for line item-level dynamic allocation.
     *                 <p>Corresponds to "AdSense impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_IMPRESSIONS("ADSENSE_LINE_ITEM_LEVEL_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions an AdSense ad delivered for line item-level dynamic allocation by
     *                 explicit custom criteria targeting.
     *                 <p>Corresponds to "AdSense targeted impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS("ADSENSE_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS"),

    /**
     * 
     *                 The number of clicks an AdSense ad delivered for line item-level dynamic allocation.
     *                 <p>Corresponds to "AdSense clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_CLICKS("ADSENSE_LINE_ITEM_LEVEL_CLICKS"),

    /**
     * 
     *                 The number of clicks an AdSense ad delivered for line item-level dynamic allocation by
     *                 explicit custom criteria targeting.
     *                 <p>Corresponds to "AdSense targeted clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_TARGETED_CLICKS("ADSENSE_LINE_ITEM_LEVEL_TARGETED_CLICKS"),

    /**
     * 
     *                 The ratio of clicks an AdSense reservation ad delivered to the number of
     *                 impressions it delivered, including line item-level dynamic allocation.
     *                 <p>Corresponds to "AdSense CTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_CTR("ADSENSE_LINE_ITEM_LEVEL_CTR"),

    /**
     * 
     *                 Revenue generated from AdSense ads delivered for line item-level dynamic allocation.
     *                 <p>Corresponds to "AdSense revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_REVENUE("ADSENSE_LINE_ITEM_LEVEL_REVENUE"),

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from the ads
     *                 delivered by AdSense for line item-level dynamic allocation.
     *                 <p>Corresponds to "AdSense average eCPM" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_AVERAGE_ECPM("ADSENSE_LINE_ITEM_LEVEL_AVERAGE_ECPM"),

    /**
     * 
     *                 The ratio of the number of impressions delivered by AdSense reservation
     *                 ads to the total impressions delivered for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "AdSense impressions (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS("ADSENSE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS"),

    /**
     * 
     *                 The ratio of the number of clicks delivered by AdSense reservation ads to
     *                 the total clicks delivered for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "AdSense clicks (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_PERCENT_CLICKS("ADSENSE_LINE_ITEM_LEVEL_PERCENT_CLICKS"),

    /**
     * 
     *                 The ratio of revenue to the total revenue earned from the dynamic allocation
     *                 CPM, CPC and CPD ads delivered when no {@link LineItem} reservation could be found
     *                 by the ad server for inventory-level dynamic allocation.
     *                 For Ad Manager 360 networks, this includes line item-level dynamic allocation as well.
     *                 Represented as a percentage.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_INVENTORY_LEVEL_WITH_CPD_PERCENT_REVENUE("DYNAMIC_ALLOCATION_INVENTORY_LEVEL_WITH_CPD_PERCENT_REVENUE"),

    /**
     * 
     *                 The ratio of revenue to the total revenue earned from the CPM and CPC ads
     *                 delivered by AdSense for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "AdSense revenue (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE("ADSENSE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"),

    /**
     * 
     *                 The ratio of revenue to the total revenue earned from the CPM, CPC and CPD ads
     *                 delivered by AdSense for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    ADSENSE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE("ADSENSE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE"),

    /**
     * 
     *                 The number of impressions an Ad Exchange ad delivered for line item-level dynamic allocation.
     *                 <p>Corresponds to "Ad Exchange impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_IMPRESSIONS("AD_EXCHANGE_LINE_ITEM_LEVEL_IMPRESSIONS"),

    /**
     * 
     *                 Ad Impressions on mapped Ad Exchange properties. When multiple text ads fill a single display
     *                 slot it is only counted once, when the top text ad is recognized. In these cases, the Ad
     *                 Impression is attributed to the top text ad.
     *                 <p>Corresponds to "Ad impressions" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_IMPRESSIONS("AD_EXCHANGE_IMPRESSIONS"),

    /**
     * 
     *                 Number of requests where a buyer was matched with the Ad request, for mapped Ad Exchange
     *                 properties.
     *                 <p>Corresponds to "Matched requests" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_MATCHED_REQUESTS("AD_EXCHANGE_MATCHED_REQUESTS"),

    /**
     * 
     *                 Ad revenue per 1000 ad impressions, for mapped Ad Exchange properties.
     *                 <p>Corresponds to "Ad eCPM" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_AD_ECPM("AD_EXCHANGE_AD_ECPM"),

    /**
     * 
     *                 The number of clicks delivered by mapped Ad Exchange properties.
     *                 <p>Corresponds to "Clicks" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_CLICKS("AD_EXCHANGE_CLICKS"),

    /**
     * 
     *                 The estimated net revenue generated by mapped Ad Exchange properties.
     *                 <p>Corresponds to "Estimated revenue" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ESTIMATED_REVENUE("AD_EXCHANGE_ESTIMATED_REVENUE"),

    /**
     * 
     *                 The coverage reported by mapped Ad Exchange properties.
     *                 <p>Corresponds to "Coverage" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_COVERAGE("AD_EXCHANGE_COVERAGE"),

    /**
     * 
     *                 The matched queries click-through rate delivered by mapped Ad Exchange properties.
     *                 <p>Corresponds to "CTR" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_CTR("AD_EXCHANGE_CTR"),

    /**
     * 
     *                 The total lift generated by mapped Ad Exchange properties.
     *                 <p>Corresponds to "Lift" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LIFT("AD_EXCHANGE_LIFT"),

    /**
     * 
     *                 The cost-per-click generated by mapped Ad Exchange properties.
     *                 <p>Corresponds to "CPC" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_CPC("AD_EXCHANGE_CPC"),

    /**
     * 
     *                 The number of ad requests issued by mapped Ad Exchange properties.
     *                 <p>Corresponds to "Ad requests" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_AD_REQUESTS("AD_EXCHANGE_AD_REQUESTS"),

    /**
     * 
     *                 The average estimated cost-per-thousand-ad requests earned by mapped Ad Exchange properties.
     *                 <p>Corresponds to "Ad request eCPM" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_AD_REQUEST_ECPM("AD_EXCHANGE_AD_REQUEST_ECPM"),

    /**
     * 
     *                 The click-through rate of ad requests issued by mapped Ad Exchange properties.
     *                 <p>Corresponds to "Ad request CTR" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_AD_REQUEST_CTR("AD_EXCHANGE_AD_REQUEST_CTR"),

    /**
     * 
     *                 The click-through rate of impressions issued by mapped Ad Exchange properties.
     *                 <p>Corresponds to "Ad CTR" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_AD_CTR("AD_EXCHANGE_AD_CTR"),

    /**
     * 
     *                 The video drop off rate for mapped Ad Exchange properties.
     *                 <p>Corresponds to "Video drop-off rate" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_DROPOFF_RATE("AD_EXCHANGE_VIDEO_DROPOFF_RATE"),

    /**
     * 
     *                 The video abandonment rate for mapped Ad Exchange properties.
     *                 <p>Corresponds to "Video abandonment rate" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_ABANDONMENT_RATE("AD_EXCHANGE_VIDEO_ABANDONMENT_RATE"),

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions generated by mapped Ad Exchange properties.
     *                 <p>Corresponds to "Matched eCPM" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_MATCHED_ECPM("AD_EXCHANGE_MATCHED_ECPM"),

    /**
     * 
     *                 The estimated percentage of impressions generated by mapped Ad Exchange properties that are
     *                 eligible for Active View measurement.
     *                 <p>Corresponds to "Active view measurable" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE("AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE"),

    /**
     * 
     *                 The percentage of viewable impressions out of all measurable impressions generated by mapped
     *                 Ad Exchange properties.
     *                 <p>Corresponds to "Active view viewable" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE("AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE"),

    /**
     * 
     *                 The average time (in seconds) that an individual ad impression generated by mapped Ad Exchange
     *                 properties was viewable.
     *                 <p>Corresponds to "Average viewable time (secs)" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_AVERAGE_VIEWABLE_TIME("AD_EXCHANGE_AVERAGE_VIEWABLE_TIME"),

    /**
     * 
     *                 Total number of impressions generated by mapped Ad Exchange properties that were eligible to
     *                 measure viewability.
     *                 <p>Corresponds to "Active view enabled impressions" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_ENABLED_IMPRESSIONS("AD_EXCHANGE_ACTIVE_VIEW_ENABLED_IMPRESSIONS"),

    /**
     * 
     *                 Total number of eligible impressions generated by mapped Ad Exchange properties that were
     *                 measurable by Active View.
     *                 <p>Corresponds to "Active view measured impressions" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_MEASURED_IMPRESSIONS("AD_EXCHANGE_ACTIVE_VIEW_MEASURED_IMPRESSIONS"),

    /**
     * 
     *                 Total number of Active View measurable impressions generated by mapped Ad Exchange properties
     *                 that were viewable.
     *                 <p>Corresponds to "Active view viewed impressions" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_VIEWED_IMPRESSIONS("AD_EXCHANGE_ACTIVE_VIEW_VIEWED_IMPRESSIONS"),

    /**
     * 
     *                 Number of responses that shows that a buyer is bidding, for mapped Ad Exchange properties.
     *                 <p>Corresponds to "Deals bid responses" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_DEALS_BID_RESPONSES("AD_EXCHANGE_DEALS_BID_RESPONSES"),

    /**
     * 
     *                 Deal ad requests for mapped Ad Exchange properties which were ?matched? with demand from the
     *                 buyer associated with the Deal. Each ?Deals matched request? represents one opportunity for the
     *                 Deal Buyer to serve their ad in the context of the Deal.
     *                 <p>Corresponds to "Deals matched requests" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_DEALS_MATCHED_REQUESTS("AD_EXCHANGE_DEALS_MATCHED_REQUESTS"),

    /**
     * 
     *                 Total ad requests associated with a given Deal, for mapped Ad Exchange properties.
     *                 <p>Corresponds to "Deals ad requests" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_DEALS_AD_REQUESTS("AD_EXCHANGE_DEALS_AD_REQUESTS"),

    /**
     * 
     *                 Deals matched requests divided by Deals ad requests, for mapped Ad Exchange properties.
     *                 <p>Corresponds to "Deals match rate" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_DEALS_MATCH_RATE("AD_EXCHANGE_DEALS_MATCH_RATE"),

    /**
     * 
     *                 Number of times that the publisher specified a video ad played automatically for video ads by
     *                 Ad Exchange properties.
     *                 <p>Corresponds to "Auto-plays" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_AUTO_PLAY("AD_EXCHANGE_VIDEO_AUTO_PLAY"),

    /**
     * 
     *                 Number of times that the publisher specified a video ad played when clicked for video ads by Ad
     *                 Exchange properties.
     *                 <p>Corresponds to "Click-to-plays" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_CLICK_TO_PLAY("AD_EXCHANGE_VIDEO_CLICK_TO_PLAY"),

    /**
     * 
     *                 The number of impressions where the video was played for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "Video start" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_START("AD_EXCHANGE_VIDEO_START"),

    /**
     * 
     *                 A count of how many users watch the first 25% of a video ad, for mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_QUARTILE_1("AD_EXCHANGE_VIDEO_QUARTILE_1"),

    /**
     * 
     *                 The number of times the video reached its midpoint during play for video ads by Ad Exchange
     *                 properties.
     *                 <p>Corresponds to "Midpoint" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_MIDPOINT("AD_EXCHANGE_VIDEO_MIDPOINT"),

    /**
     * 
     *                 A count of how many users watch the first 75% of a video ad, for mapped Ad Exchange properties.
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_QUARTILE_3("AD_EXCHANGE_VIDEO_QUARTILE_3"),

    /**
     * 
     *                 The number of times the video played to completion for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "Complete" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_COMPLETE("AD_EXCHANGE_VIDEO_COMPLETE"),

    /**
     * 
     *                 Percentage of times the video played to the end for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "Completion rate" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_COMPLETION_RATE("AD_EXCHANGE_VIDEO_COMPLETION_RATE"),

    /**
     * 
     *                 Video interaction event for video ads by Ad Exchange properties. The number of times a user
     *                 collapses a video, either to its original size or to a different size.
     *                 <p>Corresponds to "Collapse" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_COLLAPSE("AD_EXCHANGE_VIDEO_COLLAPSE"),

    /**
     * 
     *                 Video interaction event for video ads by Ad Exchange properties. The number of times a user
     *                 expands a video.
     *                 <p>Corresponds to "Expand" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_EXPAND("AD_EXCHANGE_VIDEO_EXPAND"),

    /**
     * 
     *                 Video interaction event for video ads by Ad Exchange properties. The number of times ad clip
     *                 played in full screen mode.
     *                 <p>Corresponds to "Full screen" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_FULL_SCREEN("AD_EXCHANGE_VIDEO_FULL_SCREEN"),

    /**
     * 
     *                 Video interaction event for video ads by Ad Exchange properties. The number of times video
     *                 player was in mute state during play of ad clip.
     *                 <p>Corresponds to "Mute" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_MUTE("AD_EXCHANGE_VIDEO_MUTE"),

    /**
     * 
     *                 Video interaction event for video ads by Ad Exchange properties. The number of times user
     *                 paused ad clip.
     *                 <p>Corresponds to "Pause" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_PAUSE("AD_EXCHANGE_VIDEO_PAUSE"),

    /**
     * 
     *                 Video interaction event for video ads by Ad Exchange properties. The number of times the user
     *                 unpaused the video ad.
     *                 <p>Corresponds to "Resume" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_RESUME("AD_EXCHANGE_VIDEO_RESUME"),

    /**
     * 
     *                 Video interaction event for video ads by Ad Exchange properties. The number of times a user
     *                 rewinds the video ad.
     *                 <p>Corresponds to "Rewind" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_REWIND("AD_EXCHANGE_VIDEO_REWIND"),

    /**
     * 
     *                 Video interaction event for video ads by Ad Exchange properties. The number of times a
     *                 skippable video is skipped.
     *                 <p>Corresponds to "Video skipped" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_SKIPPED("AD_EXCHANGE_VIDEO_SKIPPED"),

    /**
     * 
     *                 Video interaction event for video ads by Ad Exchange properties. The number of times a user
     *                 unmutes the video ad.
     *                 <p>Corresponds to "Unmute" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_UNMUTE("AD_EXCHANGE_VIDEO_UNMUTE"),

    /**
     * 
     *                 The number of times a VAST2 error occurred for video ads by Ad Exchange properties linked to Ad
     *                 Manager.
     *                 <p>Corresponds to "VAST2 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    @XmlEnumValue("AD_EXCHANGE_VIDEO_VAST2_ERROR_COUNT")
    AD_EXCHANGE_VIDEO_VAST_2_ERROR_COUNT("AD_EXCHANGE_VIDEO_VAST2_ERROR_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 100 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 100 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_100_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_100_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 101 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 101 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_101_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_101_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 102 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 102 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_102_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_102_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 200 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 200 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_200_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_200_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 201 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 201 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_201_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_201_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 202 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 202 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_202_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_202_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 203 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 203 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_203_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_203_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 300 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 300 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_300_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_300_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 301 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 301 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_301_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_301_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 302 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 302 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_302_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_302_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 303 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 303 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_303_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_303_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 400 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 400 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_400_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_400_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 401 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 401 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_401_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_401_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 402 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 402 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_402_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_402_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 403 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 403 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_403_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_403_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 405 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 405 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_405_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_405_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 500 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 500 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_500_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_500_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 501 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 501 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_501_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_501_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 502 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 502 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_502_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_502_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 503 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 503 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_503_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_503_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 600 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 600 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_600_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_600_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 601 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 601 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_601_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_601_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 602 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 602 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_602_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_602_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 603 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 603 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_603_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_603_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 604 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 604 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_604_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_604_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 900 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 900 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_900_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_900_COUNT"),

    /**
     * 
     *                 The number of times a VAST3 error 901 occurred for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "VAST3 901 error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_VAST_ERROR_901_COUNT("AD_EXCHANGE_VIDEO_VAST_ERROR_901_COUNT"),

    /**
     * 
     *                 The number of times an error occurred, such as a VAST redirect error, a video playback error,
     *                 or an invalid response error for video ads by Ad Exchange properties.
     *                 <p>Corresponds to "Total error count" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_TOTAL_VAST_ERROR_COUNT("AD_EXCHANGE_VIDEO_TOTAL_VAST_ERROR_COUNT"),

    /**
     * 
     *                 The video total error rate by Ad Exchange properties.
     *                 <p>Corresponds to "Total error rate" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_TOTAL_ERROR_RATE("AD_EXCHANGE_VIDEO_TOTAL_ERROR_RATE"),

    /**
     * 
     *                 Percentage of times a user clicked Skip, for mapped Ad Exchange properties.
     *                 <p>Corresponds to "TrueView skip rate" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_TRUEVIEW_SKIP_RATE("AD_EXCHANGE_VIDEO_TRUEVIEW_SKIP_RATE"),

    /**
     * 
     *                 Number of times a video ad has been viewed to completion or watched to 30 seconds, whichever
     *                 happens first, for mapped Ad Exchange properties.
     *                 <p>Corresponds to "TrueView views" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_TRUEVIEW_VIEWS("AD_EXCHANGE_VIDEO_TRUEVIEW_VIEWS"),

    /**
     * 
     *                 TrueView views divided by TrueView impressions, for mapped Ad Exchange properties.
     *                 <p>Corresponds to "TrueView VTR" in the Ad Manager UI. Compatible with the "Ad Exchange historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_VIDEO_TRUEVIEW_VTR("AD_EXCHANGE_VIDEO_TRUEVIEW_VTR"),

    /**
     * 
     *                 Mediation third-party average cost-per-thousand-impressions.
     *                 <p>Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    MEDIATION_THIRD_PARTY_ECPM("MEDIATION_THIRD_PARTY_ECPM"),

    /**
     * 
     *                 The number of impressions an Ad Exchange ad delivered for line item-level dynamic allocation
     *                 by explicit custom criteria targeting.
     *                 <p>Corresponds to "Ad Exchange targeted impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS("AD_EXCHANGE_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS"),

    /**
     * 
     *                 The number of clicks an Ad Exchange ad delivered for line item-level dynamic allocation.
     *                 <p>Corresponds to "Ad Exchange clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_CLICKS("AD_EXCHANGE_LINE_ITEM_LEVEL_CLICKS"),

    /**
     * 
     *                 The number of clicks an Ad Exchange ad delivered for line item-level dynamic allocation by
     *                 explicit custom criteria targeting.
     *                 <p>Corresponds to "Ad Exchange targeted clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_TARGETED_CLICKS("AD_EXCHANGE_LINE_ITEM_LEVEL_TARGETED_CLICKS"),

    /**
     * 
     *                 The ratio of clicks an Ad Exchange ad delivered to the number of
     *                 impressions it delivered for line item-level dynamic allocation.
     *                 <p>Corresponds to "Ad Exchange CTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_CTR("AD_EXCHANGE_LINE_ITEM_LEVEL_CTR"),

    /**
     * 
     *                 The ratio of the number of impressions delivered to the total impressions delivered
     *                 by Ad Exchange for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "Ad Exchange impressions (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS("AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_IMPRESSIONS"),

    /**
     * 
     *                 The ratio of the number of clicks delivered to the total clicks delivered
     *                 by Ad Exchange for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "Ad Exchange clicks (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_CLICKS("AD_EXCHANGE_LINE_ITEM_LEVEL_PERCENT_CLICKS"),

    /**
     * 
     *                 Revenue generated from Ad Exchange ads delivered for line item-level dynamic allocation.
     *                 Represented in publisher currency and time zone.
     *                 <p>Corresponds to "Ad Exchange revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_REVENUE("AD_EXCHANGE_LINE_ITEM_LEVEL_REVENUE"),

    /**
     * 
     *                 The ratio of revenue generated by Ad Exchange to the total revenue earned
     *                 by CPM and CPC ads delivered for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "Ad Exchange revenue (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE("AD_EXCHANGE_LINE_ITEM_LEVEL_WITHOUT_CPD_PERCENT_REVENUE"),

    /**
     * 
     *                 The ratio of revenue generated by Ad Exchange to the total revenue earned
     *                 by CPM, CPC and CPD ads delivered for line item-level dynamic allocation.
     *                 Represented as a percentage.
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE("AD_EXCHANGE_LINE_ITEM_LEVEL_WITH_CPD_PERCENT_REVENUE"),

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from the
     *                 delivery of Ad Exchange ads for line item-level dynamic allocation.
     *                 <p>Corresponds to "Ad Exchange average eCPM" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_LINE_ITEM_LEVEL_AVERAGE_ECPM("AD_EXCHANGE_LINE_ITEM_LEVEL_AVERAGE_ECPM"),

    /**
     * 
     *                 The total number of impressions delivered including line item-level dynamic allocation.
     *                 <p>Corresponds to "Total impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS("TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS"),

    /**
     * 
     *                 The total number of impressions delivered including line item-level dynamic allocation by
     *                 explicit custom criteria targeting.
     *                 <p>Corresponds to "Total targeted impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS("TOTAL_LINE_ITEM_LEVEL_TARGETED_IMPRESSIONS"),

    /**
     * 
     *                 The total number of clicks delivered including line item-level dynamic allocation.
     *                 <p>Corresponds to "Total clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_CLICKS("TOTAL_LINE_ITEM_LEVEL_CLICKS"),

    /**
     * 
     *                 The total number of clicks delivered including line item-level dynamic allocation by
     *                 explicit custom criteria targeting
     *                 <p>Corresponds to "Total targeted clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_TARGETED_CLICKS("TOTAL_LINE_ITEM_LEVEL_TARGETED_CLICKS"),

    /**
     * 
     *                 The ratio of total clicks on ads delivered by the ad servers to the total number
     *                 of impressions delivered for an ad including line item-level dynamic allocation.
     *                 <p>Corresponds to "Total CTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_CTR("TOTAL_LINE_ITEM_LEVEL_CTR"),

    /**
     * 
     *                 The total CPM, CPC and CPD revenue generated by the ad servers
     *                 including inventory-level dynamic allocation.
     *               
     * 
     */
    TOTAL_INVENTORY_LEVEL_ALL_REVENUE("TOTAL_INVENTORY_LEVEL_ALL_REVENUE"),

    /**
     * 
     *                 The total CPM and CPC revenue generated by the ad servers
     *                 including line item-level dynamic allocation.
     *                 <p>Corresponds to "Total CPM and CPC revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE("TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE"),

    /**
     * 
     *                 The total CPM, CPC and CPD revenue generated by the ad servers
     *                 including line item-level dynamic allocation.
     *                 <p>Can correspond to any of the following in the Ad Manager UI: Total CPM, CPC, CPD, and vCPM revenue, Total CPM, CPC and CPD revenue. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_ALL_REVENUE("TOTAL_LINE_ITEM_LEVEL_ALL_REVENUE"),

    /**
     * 
     *                 Estimated cost-per-thousand-impressions (eCPM) of CPM, CPC and CPD ads delivered by the
     *                 ad servers including inventory-level dynamic allocation.
     *               
     * 
     */
    TOTAL_INVENTORY_LEVEL_WITH_CPD_AVERAGE_ECPM("TOTAL_INVENTORY_LEVEL_WITH_CPD_AVERAGE_ECPM"),

    /**
     * 
     *                 Estimated cost-per-thousand-impressions (eCPM) of CPM and CPC ads delivered by the
     *                 ad servers including line item-level dynamic allocation.
     *                 <p>Corresponds to "Total average eCPM" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_WITHOUT_CPD_AVERAGE_ECPM("TOTAL_LINE_ITEM_LEVEL_WITHOUT_CPD_AVERAGE_ECPM"),

    /**
     * 
     *                 Estimated cost-per-thousand-impressions (eCPM) of CPM, CPC and CPD ads delivered by the
     *                 ad servers including line item-level dynamic allocation.
     *               
     * 
     */
    TOTAL_LINE_ITEM_LEVEL_WITH_CPD_AVERAGE_ECPM("TOTAL_LINE_ITEM_LEVEL_WITH_CPD_AVERAGE_ECPM"),

    /**
     * 
     *                 The total number of times that the code for an ad is served by the ad server including
     *                 inventory-level dynamic allocation.
     *                 <p>Corresponds to "Total code served count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_CODE_SERVED_COUNT("TOTAL_CODE_SERVED_COUNT"),

    /**
     * 
     *                 The total number of times that an ad request is sent to the ad server
     *                 including dynamic allocation.
     *                 <p>Corresponds to "Total ad requests" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_AD_REQUESTS("TOTAL_AD_REQUESTS"),

    /**
     * 
     *                 The total number of times that an ad is served by the ad server
     *                 including dynamic allocation.
     *                 <p>Corresponds to "Total responses served" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_RESPONSES_SERVED("TOTAL_RESPONSES_SERVED"),

    /**
     * 
     *                 The total number of times that an ad is not returned by the ad server.
     *                 <p>Corresponds to "Total unmatched ad requests" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_UNMATCHED_AD_REQUESTS("TOTAL_UNMATCHED_AD_REQUESTS"),

    /**
     * 
     *                 The fill rate indicating how often an ad request is filled by the ad server
     *                 including dynamic allocation.
     *                 <p>Corresponds to "Total fill rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_FILL_RATE("TOTAL_FILL_RATE"),

    /**
     * 
     *                 The total number of times that an ad is served by the ad server.
     *                 <p>Corresponds to "Ad server responses served" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_RESPONSES_SERVED("AD_SERVER_RESPONSES_SERVED"),

    /**
     * 
     *                 The total number of times that an AdSense ad is delivered.
     *                 <p>Corresponds to "AdSense responses served" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_RESPONSES_SERVED("ADSENSE_RESPONSES_SERVED"),

    /**
     * 
     *                 The total number of times that an Ad Exchange ad is delivered.
     *                 <p>Corresponds to "Ad Exchange responses served" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_RESPONSES_SERVED("AD_EXCHANGE_RESPONSES_SERVED"),

    /**
     * 
     *                 The total number of video opportunities.
     *                 <p>Corresponds to "True Opportunities" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_VIDEO_OPPORTUNITIES("TOTAL_VIDEO_OPPORTUNITIES"),

    /**
     * 
     *                 The total number of video capped opportunities.
     *                 <p>Corresponds to "Capped Opportunities" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_VIDEO_CAPPED_OPPORTUNITIES("TOTAL_VIDEO_CAPPED_OPPORTUNITIES"),

    /**
     * 
     *                 The total number of missed impressions due to the ad servers' inability to
     *                 find ads to serve, including inventory-level dynamic allocation.
     *                 <p>Corresponds to "Unfilled impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_INVENTORY_LEVEL_UNFILLED_IMPRESSIONS("TOTAL_INVENTORY_LEVEL_UNFILLED_IMPRESSIONS"),

    /**
     * 
     *                 The number of control (unoptimized) impressions delivered for an ad for
     *                 which the optimization feature has been enabled.
     *                 <p>Corresponds to "Control impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_CONTROL_IMPRESSIONS("OPTIMIZATION_CONTROL_IMPRESSIONS"),

    /**
     * 
     *                 Number of clicks resulting from the delivery of control (unoptimized)
     *                 impressions for an ad for which the optimization feature has been enabled.
     *                 <p>Corresponds to "Control clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_CONTROL_CLICKS("OPTIMIZATION_CONTROL_CLICKS"),

    /**
     * 
     *                 The CTR for control (unoptimized) impressions for an order for which the
     *                 optimization feature has been enabled.
     *                 <p>Corresponds to "Control CTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_CONTROL_CTR("OPTIMIZATION_CONTROL_CTR"),

    /**
     * 
     *                 Number of optimized impressions delivered for an ad for which the
     *                 optimization feature has been enabled.
     *                 <p>Corresponds to "Optimized impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_OPTIMIZED_IMPRESSIONS("OPTIMIZATION_OPTIMIZED_IMPRESSIONS"),

    /**
     * 
     *                 Number of clicks resulting from the delivery of optimized impressions for
     *                 an ad for which the optimization feature has been enabled.
     *                 <p>Corresponds to "Optimized clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_OPTIMIZED_CLICKS("OPTIMIZATION_OPTIMIZED_CLICKS"),

    /**
     * 
     *                 Number of non-optimized impressions delivered for an ad for which the
     *                 optimization feature has been enabled.
     *                 <p>Corresponds to "Non-optimized impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_NON_OPTIMIZED_IMPRESSIONS("OPTIMIZATION_NON_OPTIMIZED_IMPRESSIONS"),

    /**
     * 
     *                 Number of clicks resulting from the delivery of non-optimized impressions for
     *                 an ad for which the optimization feature has been enabled.
     *                 <p>Corresponds to "Non-optimized clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_NON_OPTIMIZED_CLICKS("OPTIMIZATION_NON_OPTIMIZED_CLICKS"),

    /**
     * 
     *                 Number of extra clicks resulting from the delivery of optimized impressions
     *                 for an ad for which the optimization feature has been enabled.
     *                 <p>Corresponds to "Extra clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_EXTRA_CLICKS("OPTIMIZATION_EXTRA_CLICKS"),

    /**
     * 
     *                 The CTR for optimized impressions for an ad for which the optimization
     *                 feature has been enabled.
     *                 <p>Corresponds to "Optimized CTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_OPTIMIZED_CTR("OPTIMIZATION_OPTIMIZED_CTR"),

    /**
     * 
     *                 The percentage by which optimized CTRs are greater than the unoptimized
     *                 CTRs. This is calculated as (({@link Column#OPTIMIZATION_OPTIMIZED_CTR}/
     *                 {@link Column#OPTIMIZATION_CONTROL_CTR}) - 1) * 100 for an ad for which the
     *                 optimization feature has been enabled.
     *                 <p>Corresponds to "Lift" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_LIFT("OPTIMIZATION_LIFT"),

    /**
     * 
     *                 The line item coverage measures how often the traffic was sent for
     *                 optimization.
     *                 <p>Corresponds to "Percent optimized" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_COVERAGE("OPTIMIZATION_COVERAGE"),

    /**
     * 
     *                 The number of impressions that were behind schedule at the time of their delivery.
     *                 <p>Corresponds to "Impressions that are behind schedule" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_BEHIND_SCHEDULE_IMPRESSIONS("OPTIMIZATION_BEHIND_SCHEDULE_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions that did not have any clicks recorded in the recent past.
     *                 <p>Corresponds to "Impressions with no clicks recorded" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_NO_CLICKS_RECORDED_IMPRESSIONS("OPTIMIZATION_NO_CLICKS_RECORDED_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions that were delivered as sponsorship items.
     *                 <p>Corresponds to "Sponsorship impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_SPONSORSHIP_IMPRESSIONS("OPTIMIZATION_SPONSORSHIP_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions that were set to deliver as fast as possible.
     *                 <p>Corresponds to "Impressions serving as fast as possible" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_AS_FAST_AS_POSSIBLE_IMPRESSIONS("OPTIMIZATION_AS_FAST_AS_POSSIBLE_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions that have no absolute lifetime delivery goals.
     *                 <p>Corresponds to "Impressions with no lifetime goal" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_NO_ABSOLUTE_LIFETIME_GOAL_IMPRESSIONS("OPTIMIZATION_NO_ABSOLUTE_LIFETIME_GOAL_IMPRESSIONS"),

    /**
     * 
     *                 Total revenue resulting from the delivery of control (unoptimized)
     *                 impressions for an ad for which the optimization feature has been enabled.
     *                 <p>Corresponds to "Control revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_CONTROL_REVENUE("OPTIMIZATION_CONTROL_REVENUE"),

    /**
     * 
     *                 Total revenue resulting from the delivery of optimized impressions for
     *                 an ad for which the optimization feature has been enabled.
     *                 <p>Corresponds to "Optimized revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_OPTIMIZED_REVENUE("OPTIMIZATION_OPTIMIZED_REVENUE"),

    /**
     * 
     *                 Estimated cost-per-thousand-impressions (eCPM) of control (unoptimized)
     *                 impressions for an ad for which the optimization feature has been enabled.
     *                 <p>Corresponds to "Control eCPM" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_CONTROL_ECPM("OPTIMIZATION_CONTROL_ECPM"),

    /**
     * 
     *                 Estimated cost-per-thousand-impressions (eCPM) of optimized
     *                 impressions for an ad for which the optimization feature has been enabled.
     *                 <p>Corresponds to "Optimized eCPM" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_OPTIMIZED_ECPM("OPTIMIZATION_OPTIMIZED_ECPM"),

    /**
     * 
     *                 Freed-up impressions as a result of optimization.
     *                 <p>Corresponds to "Freed-up impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_FREED_UP_IMPRESSIONS("OPTIMIZATION_FREED_UP_IMPRESSIONS"),

    /**
     * 
     *                 Relative change in eCPM as a result of optimization.
     *                 <p>Corresponds to "eCPM lift" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    OPTIMIZATION_ECPM_LIFT("OPTIMIZATION_ECPM_LIFT"),

    /**
     * 
     *                 <p>Corresponds to "Average impressions/unique visitor" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    UNIQUE_REACH_FREQUENCY("UNIQUE_REACH_FREQUENCY"),

    /**
     * 
     *                 <p>Corresponds to "Total reach impressions" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    UNIQUE_REACH_IMPRESSIONS("UNIQUE_REACH_IMPRESSIONS"),

    /**
     * 
     *                 <p>Corresponds to "Total unique visitors" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    UNIQUE_REACH("UNIQUE_REACH"),

    /**
     * 
     *                 The number of people in the given demographic bucket.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    GRP_POPULATION("GRP_POPULATION"),

    /**
     * 
     *                 The number of unique users reached in the given demographic bucket.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    GRP_UNIQUE_AUDIENCE("GRP_UNIQUE_AUDIENCE"),

    /**
     * 
     *                 Percentage of the number of unique users reached in the given demographic bucket (out of the
     *                 number of unique users reached in all demographics).
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    GRP_UNIQUE_AUDIENCE_SHARE("GRP_UNIQUE_AUDIENCE_SHARE"),

    /**
     * 
     *                 The number of impressions in the given demographic bucket.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    GRP_AUDIENCE_IMPRESSIONS("GRP_AUDIENCE_IMPRESSIONS"),

    /**
     * 
     *                 Percentage of the number of impressions in the given demographic bucket (out of the number of
     *                 impressions in all demographics).
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    GRP_AUDIENCE_IMPRESSIONS_SHARE("GRP_AUDIENCE_IMPRESSIONS_SHARE"),

    /**
     * 
     *                 The audience reach calculated as {@link #GRP_UNIQUE_AUDIENCE} / {@link #GRP_POPULATION}.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    GRP_AUDIENCE_REACH("GRP_AUDIENCE_REACH"),

    /**
     * 
     *                 The audience average frequency calculated as {@link #GRP_AUDIENCE_IMPRESSIONS} / {@link
     *                 #GRP_UNIQUE_AUDIENCE}.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    GRP_AUDIENCE_AVERAGE_FREQUENCY("GRP_AUDIENCE_AVERAGE_FREQUENCY"),

    /**
     * 
     *                 The gross rating points (GRP) calculated as {@link #GRP_AUDIENCE_REACH} * {@link
     *                 #GRP_AUDIENCE_AVERAGE_FREQUENCY} * 100.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    GRP_GROSS_RATING_POINTS("GRP_GROSS_RATING_POINTS"),

    /**
     * 
     *                 The number of impressions for a particular SDK mediation creative.
     *                 <p>Corresponds to "SDK mediation creative impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    SDK_MEDIATION_CREATIVE_IMPRESSIONS("SDK_MEDIATION_CREATIVE_IMPRESSIONS"),

    /**
     * 
     *                 The number of clicks for a particular SDK mediation creative.
     *                 <p>Corresponds to "SDK mediation creative clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    SDK_MEDIATION_CREATIVE_CLICKS("SDK_MEDIATION_CREATIVE_CLICKS"),

    /**
     * 
     *                 The number of forecasted impressions for future sell-through reports.
     *                 
     *                 <p>This metric is available for the next 90 days with a daily break down and for the next 12
     *                 months with a monthly break down.
     *                 <p>Corresponds to "Forecasted impressions" in the Ad Manager UI. Compatible with the "Future sell-through" report type.</p>
     *               
     * 
     */
    SELL_THROUGH_FORECASTED_IMPRESSIONS("SELL_THROUGH_FORECASTED_IMPRESSIONS"),

    /**
     * 
     *                 The number of available impressions for future sell-through reports.
     *                 
     *                 <p>This metric is available for the next 90 days with a daily break down
     *                 and for the next 12 months with a monthly break down.
     *                 <p>Corresponds to "Available impressions" in the Ad Manager UI. Compatible with the "Future sell-through" report type.</p>
     *               
     * 
     */
    SELL_THROUGH_AVAILABLE_IMPRESSIONS("SELL_THROUGH_AVAILABLE_IMPRESSIONS"),

    /**
     * 
     *                 The number of reserved impressions for future sell-through reports.
     *                 
     *                 <p>This metric is available for the next 90 days with a daily break down
     *                 and for the next 12 months with a monthly break down.
     *                 <p>Corresponds to "Reserved impressions" in the Ad Manager UI. Compatible with the "Future sell-through" report type.</p>
     *               
     * 
     */
    SELL_THROUGH_RESERVED_IMPRESSIONS("SELL_THROUGH_RESERVED_IMPRESSIONS"),

    /**
     * 
     *                 The sell-through rate for impressions for future sell-through reports.
     *                 
     *                 <p>This metric is available for the next 90 days with a daily break down
     *                 and for the next 12 months with a monthly break down.
     *                 <p>Corresponds to "Sell-through rate" in the Ad Manager UI. Compatible with the "Future sell-through" report type.</p>
     *               
     * 
     */
    SELL_THROUGH_SELL_THROUGH_RATE("SELL_THROUGH_SELL_THROUGH_RATE"),

    /**
     * 
     *                 The total number of times a backup image is served in place of a rich media ad.
     *                 <p>Corresponds to "Backup image impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_BACKUP_IMAGES("RICH_MEDIA_BACKUP_IMAGES"),

    /**
     * 
     *                 The amount of time(seconds) that each rich media ad is displayed to users.
     *                 <p>Corresponds to "Total display time" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_DISPLAY_TIME("RICH_MEDIA_DISPLAY_TIME"),

    /**
     * 
     *                 The average amount of time(seconds) that each rich media ad is displayed to users.
     *                 <p>Corresponds to "Average display time" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_AVERAGE_DISPLAY_TIME("RICH_MEDIA_AVERAGE_DISPLAY_TIME"),

    /**
     * 
     *                 The number of times an expanding ad was expanded.
     *                 <p>Corresponds to "Total expansions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_EXPANSIONS("RICH_MEDIA_EXPANSIONS"),

    /**
     * 
     *                 The average amount of time(seconds) that an expanding ad is viewed in an expanded state.
     *                 <p>Corresponds to "Average expanding time" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_EXPANDING_TIME("RICH_MEDIA_EXPANDING_TIME"),

    /**
     * 
     *                 The average amount of time(seconds) that a user interacts with a rich media ad.
     *                 <p>Corresponds to "Interaction time" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_INTERACTION_TIME("RICH_MEDIA_INTERACTION_TIME"),

    /**
     * 
     *                 The number of times that a user interacts with a rich media ad.
     *                 <p>Corresponds to "Total interactions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_INTERACTION_COUNT("RICH_MEDIA_INTERACTION_COUNT"),

    /**
     * 
     *                 The ratio of rich media ad interactions to the number of times the ad was displayed.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "Interaction rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_INTERACTION_RATE("RICH_MEDIA_INTERACTION_RATE"),

    /**
     * 
     *                 The average amount of time(seconds) that a user interacts with a rich media ad.
     *                 <p>Corresponds to "Average interaction time" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_AVERAGE_INTERACTION_TIME("RICH_MEDIA_AVERAGE_INTERACTION_TIME"),

    /**
     * 
     *                 The number of impressions where a user interacted with a rich media ad.
     *                 <p>Corresponds to "Interactive impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_INTERACTION_IMPRESSIONS("RICH_MEDIA_INTERACTION_IMPRESSIONS"),

    /**
     * 
     *                 The number of times that a user manually closes a floating, expanding,
     *                 in-page with overlay, or in-page with floating ad.
     *                 <p>Corresponds to "Manual closes" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_MANUAL_CLOSES("RICH_MEDIA_MANUAL_CLOSES"),

    /**
     * 
     *                 A metric that measures an impression only once when a user opens an ad in full screen mode.
     *                 <p>Corresponds to "Full-screen impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_FULL_SCREEN_IMPRESSIONS("RICH_MEDIA_FULL_SCREEN_IMPRESSIONS"),

    /**
     * 
     *                 The number of times a user clicked on the graphical controls of a video player.
     *                 <p>Corresponds to "Total video interactions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_INTERACTIONS("RICH_MEDIA_VIDEO_INTERACTIONS"),

    /**
     * 
     *                 The ratio of video interactions to video plays.
     *                 Represented as a percentage.
     *                 <p>Corresponds to "Video interaction rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_INTERACTION_RATE("RICH_MEDIA_VIDEO_INTERACTION_RATE"),

    /**
     * 
     *                 The number of times a rich media video was muted.
     *                 <p>Corresponds to "Mute" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_MUTES("RICH_MEDIA_VIDEO_MUTES"),

    /**
     * 
     *                 The number of times a rich media video was paused.
     *                 <p>Corresponds to "Pause" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_PAUSES("RICH_MEDIA_VIDEO_PAUSES"),

    /**
     * 
     *                 The number of times a rich media video was played.
     *                 <p>Corresponds to "Plays" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_PLAYES("RICH_MEDIA_VIDEO_PLAYES"),

    /**
     * 
     *                 The number of times a rich media video was played upto midpoint.
     *                 <p>Corresponds to "Midpoint" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_MIDPOINTS("RICH_MEDIA_VIDEO_MIDPOINTS"),

    /**
     * 
     *                 The number of times a rich media video was fully played.
     *                 <p>Corresponds to "Complete" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_COMPLETES("RICH_MEDIA_VIDEO_COMPLETES"),

    /**
     * 
     *                 The number of times a rich media video was restarted.
     *                 <p>Corresponds to "Replays" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_REPLAYS("RICH_MEDIA_VIDEO_REPLAYS"),

    /**
     * 
     *                 The number of times a rich media video was stopped.
     *                 <p>Corresponds to "Stops" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_STOPS("RICH_MEDIA_VIDEO_STOPS"),

    /**
     * 
     *                 The number of times a rich media video was unmuted.
     *                 <p>Corresponds to "Unmute" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_UNMUTES("RICH_MEDIA_VIDEO_UNMUTES"),

    /**
     * 
     *                 The average amount of time(seconds) that a rich media video was viewed per view.
     *                 <p>Corresponds to "Average view time" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_VIEW_TIME("RICH_MEDIA_VIDEO_VIEW_TIME"),

    /**
     * 
     *                 The percentage of a video watched by a user.
     *                 <p>Corresponds to "View rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_VIDEO_VIEW_RATE("RICH_MEDIA_VIDEO_VIEW_RATE"),

    /**
     * 
     *                 The amount of time (seconds) that a user interacts with a rich media ad.
     *                 <p>Corresponds to "Custom event - time" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_CUSTOM_EVENT_TIME("RICH_MEDIA_CUSTOM_EVENT_TIME"),

    /**
     * 
     *                 The number of times a user views and interacts with a specified part of a rich media ad.
     *                 <p>Corresponds to "Custom event - count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    RICH_MEDIA_CUSTOM_EVENT_COUNT("RICH_MEDIA_CUSTOM_EVENT_COUNT"),

    /**
     * 
     *                 The number of impressions where the video was played.
     *                 <p>Corresponds to "Start" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_START("VIDEO_VIEWERSHIP_START"),

    /**
     * 
     *                 The number of times the video played to 25% of its length.
     *                 <p>Corresponds to "First quartile" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_FIRST_QUARTILE("VIDEO_VIEWERSHIP_FIRST_QUARTILE"),

    /**
     * 
     *                 The number of times the video reached its midpoint during play.
     *                 <p>Corresponds to "Midpoint" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_MIDPOINT("VIDEO_VIEWERSHIP_MIDPOINT"),

    /**
     * 
     *                 The number of times the video played to 75% of its length.
     *                 <p>Corresponds to "Third quartile" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_THIRD_QUARTILE("VIDEO_VIEWERSHIP_THIRD_QUARTILE"),

    /**
     * 
     *                 The number of times the video played to completion.
     *                 <p>Corresponds to "Complete" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_COMPLETE("VIDEO_VIEWERSHIP_COMPLETE"),

    /**
     * 
     *                 Average percentage of the video watched by users.
     *                 <p>Corresponds to "Average view rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_AVERAGE_VIEW_RATE("VIDEO_VIEWERSHIP_AVERAGE_VIEW_RATE"),

    /**
     * 
     *                 Average time(seconds) users watched the video.
     *                 <p>Corresponds to "Average view time" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_AVERAGE_VIEW_TIME("VIDEO_VIEWERSHIP_AVERAGE_VIEW_TIME"),

    /**
     * 
     *                 Percentage of times the video played to the end.
     *                 <p>Corresponds to "Completion rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_COMPLETION_RATE("VIDEO_VIEWERSHIP_COMPLETION_RATE"),

    /**
     * 
     *                 The number of times an error occurred, such as a VAST redirect error, a video playback error,
     *                 or an invalid response error.
     *                 <p>Corresponds to "Total error count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_TOTAL_ERROR_COUNT("VIDEO_VIEWERSHIP_TOTAL_ERROR_COUNT"),

    /**
     * 
     *                 Duration of the video creative.
     *                 <p>Corresponds to "Video length" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_VIDEO_LENGTH("VIDEO_VIEWERSHIP_VIDEO_LENGTH"),

    /**
     * 
     *                 The number of times a skip button is shown in video.
     *                 <p>Corresponds to "Skip button shown" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_SKIP_BUTTON_SHOWN("VIDEO_VIEWERSHIP_SKIP_BUTTON_SHOWN"),

    /**
     * 
     *                 The number of engaged views i.e. ad is viewed to completion
     *                 or for 30s, whichever comes first.
     *                 <p>Corresponds to "Engaged view" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_ENGAGED_VIEW("VIDEO_VIEWERSHIP_ENGAGED_VIEW"),

    /**
     * 
     *                 View-through rate represented as a percentage.
     *                 <p>Corresponds to "View-through rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_VIEW_THROUGH_RATE("VIDEO_VIEWERSHIP_VIEW_THROUGH_RATE"),

    /**
     * 
     *                 Number of times that the publisher specified a video ad played automatically.
     *                 <p>Corresponds to "Auto-plays" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_AUTO_PLAYS("VIDEO_VIEWERSHIP_AUTO_PLAYS"),

    /**
     * 
     *                 Number of times that the publisher specified a video ad was clicked to play.
     *                 <p>Corresponds to "Click-to-plays" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_CLICK_TO_PLAYS("VIDEO_VIEWERSHIP_CLICK_TO_PLAYS"),

    /**
     * 
     *                 Error rate is the percentage of video error count from (error count + total impressions).
     *                 <p>Corresponds to "Total error rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_VIEWERSHIP_TOTAL_ERROR_RATE("VIDEO_VIEWERSHIP_TOTAL_ERROR_RATE"),

    /**
     * 
     *                 Number of VAST video errors of type 100.
     *                 <p>Corresponds to "VAST error 100 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_100_COUNT("VIDEO_ERRORS_VAST_ERROR_100_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 101.
     *                 <p>Corresponds to "VAST error 101 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_101_COUNT("VIDEO_ERRORS_VAST_ERROR_101_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 102.
     *                 <p>Corresponds to "VAST error 102 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_102_COUNT("VIDEO_ERRORS_VAST_ERROR_102_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 200.
     *                 <p>Corresponds to "VAST error 200 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_200_COUNT("VIDEO_ERRORS_VAST_ERROR_200_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 201.
     *                 <p>Corresponds to "VAST error 201 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_201_COUNT("VIDEO_ERRORS_VAST_ERROR_201_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 202.
     *                 <p>Corresponds to "VAST error 202 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_202_COUNT("VIDEO_ERRORS_VAST_ERROR_202_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 203.
     *                 <p>Corresponds to "VAST error 203 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_203_COUNT("VIDEO_ERRORS_VAST_ERROR_203_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 300.
     *                 <p>Corresponds to "VAST error 300 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_300_COUNT("VIDEO_ERRORS_VAST_ERROR_300_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 301.
     *                 <p>Corresponds to "VAST error 301 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_301_COUNT("VIDEO_ERRORS_VAST_ERROR_301_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 302.
     *                 <p>Corresponds to "VAST error 302 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_302_COUNT("VIDEO_ERRORS_VAST_ERROR_302_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 303.
     *                 <p>Corresponds to "VAST error 303 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_303_COUNT("VIDEO_ERRORS_VAST_ERROR_303_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 400.
     *                 <p>Corresponds to "VAST error 400 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_400_COUNT("VIDEO_ERRORS_VAST_ERROR_400_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 401.
     *                 <p>Corresponds to "VAST error 401 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_401_COUNT("VIDEO_ERRORS_VAST_ERROR_401_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 402.
     *                 <p>Corresponds to "VAST error 402 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_402_COUNT("VIDEO_ERRORS_VAST_ERROR_402_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 403.
     *                 <p>Corresponds to "VAST error 403 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_403_COUNT("VIDEO_ERRORS_VAST_ERROR_403_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 405.
     *                 <p>Corresponds to "VAST error 405 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_405_COUNT("VIDEO_ERRORS_VAST_ERROR_405_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 500.
     *                 <p>Corresponds to "VAST error 500 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_500_COUNT("VIDEO_ERRORS_VAST_ERROR_500_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 501.
     *                 <p>Corresponds to "VAST error 501 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_501_COUNT("VIDEO_ERRORS_VAST_ERROR_501_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 502.
     *                 <p>Corresponds to "VAST error 502 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_502_COUNT("VIDEO_ERRORS_VAST_ERROR_502_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 503.
     *                 <p>Corresponds to "VAST error 503 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_503_COUNT("VIDEO_ERRORS_VAST_ERROR_503_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 600.
     *                 <p>Corresponds to "VAST error 600 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_600_COUNT("VIDEO_ERRORS_VAST_ERROR_600_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 601.
     *                 <p>Corresponds to "VAST error 601 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_601_COUNT("VIDEO_ERRORS_VAST_ERROR_601_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 602.
     *                 <p>Corresponds to "VAST error 602 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_602_COUNT("VIDEO_ERRORS_VAST_ERROR_602_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 603.
     *                 <p>Corresponds to "VAST error 603 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_603_COUNT("VIDEO_ERRORS_VAST_ERROR_603_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 604.
     *                 <p>Corresponds to "VAST error 604 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_604_COUNT("VIDEO_ERRORS_VAST_ERROR_604_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 900.
     *                 <p>Corresponds to "VAST error 900 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_900_COUNT("VIDEO_ERRORS_VAST_ERROR_900_COUNT"),

    /**
     * 
     *                 Number of VAST video errors of type 901.
     *                 <p>Corresponds to "VAST error 901 count" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_ERRORS_VAST_ERROR_901_COUNT("VIDEO_ERRORS_VAST_ERROR_901_COUNT"),

    /**
     * 
     *                 Video interaction event: The number of times user paused ad clip.
     *                 <p>Corresponds to "Pause" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_PAUSE("VIDEO_INTERACTION_PAUSE"),

    /**
     * 
     *                 Video interaction event: The number of times the user unpaused the video.
     *                 <p>Corresponds to "Resume" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_RESUME("VIDEO_INTERACTION_RESUME"),

    /**
     * 
     *                 Video interaction event: The number of times a user rewinds the video.
     *                 <p>Corresponds to "Rewind" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_REWIND("VIDEO_INTERACTION_REWIND"),

    /**
     * 
     *                 Video interaction event: The number of times video player was in mute state during play
     *                 of ad clip.
     *                 <p>Corresponds to "Mute" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_MUTE("VIDEO_INTERACTION_MUTE"),

    /**
     * 
     *                 Video interaction event: The number of times a user unmutes the video.
     *                 <p>Corresponds to "Unmute" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_UNMUTE("VIDEO_INTERACTION_UNMUTE"),

    /**
     * 
     *                 Video interaction event: The number of times a user collapses a video,
     *                 either to its original size or to a different size.
     *                 <p>Corresponds to "Collapse" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_COLLAPSE("VIDEO_INTERACTION_COLLAPSE"),

    /**
     * 
     *                 Video interaction event: The number of times a user expands a video.
     *                 <p>Corresponds to "Expand" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_EXPAND("VIDEO_INTERACTION_EXPAND"),

    /**
     * 
     *                 Video interaction event: The number of times ad clip played in full screen mode.
     *                 <p>Corresponds to "Full screen" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_FULL_SCREEN("VIDEO_INTERACTION_FULL_SCREEN"),

    /**
     * 
     *                 Video interaction event: The number of user interactions with a video, on average,
     *                 such as pause, full screen, mute, etc.
     *                 <p>Corresponds to "Average interaction rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_AVERAGE_INTERACTION_RATE("VIDEO_INTERACTION_AVERAGE_INTERACTION_RATE"),

    /**
     * 
     *                 Video interaction event: The number of times a skippable video is skipped.
     *                 <p>Corresponds to "Video skipped" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_INTERACTION_VIDEO_SKIPS("VIDEO_INTERACTION_VIDEO_SKIPS"),

    /**
     * 
     *                 The number of control starts.
     *                 <p>Corresponds to "Control starts" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_STARTS("VIDEO_OPTIMIZATION_CONTROL_STARTS"),

    /**
     * 
     *                 The number of optimized starts.
     *                 <p>Corresponds to "Optimized starts" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_STARTS("VIDEO_OPTIMIZATION_OPTIMIZED_STARTS"),

    /**
     * 
     *                 The number of control completes.
     *                 <p>Corresponds to "Control completes" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_COMPLETES("VIDEO_OPTIMIZATION_CONTROL_COMPLETES"),

    /**
     * 
     *                 The number of optimized completes.
     *                 <p>Corresponds to "Optimized completes" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETES("VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETES"),

    /**
     * 
     *                 The rate of control completions.
     *                 <p>Corresponds to "Control completion rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_COMPLETION_RATE("VIDEO_OPTIMIZATION_CONTROL_COMPLETION_RATE"),

    /**
     * 
     *                 The rate of optimized completions.
     *                 <p>Corresponds to "Optimized completion rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETION_RATE("VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETION_RATE"),

    /**
     * 
     *                 The percentage by which optimized completion rate is greater than the unoptimized completion
     *                 rate. This is calculated as (( {@link Column#VIDEO_OPTIMIZATION_OPTIMIZED_COMPLETION_RATE}/
     *                 {@link Column#VIDEO_OPTIMIZATION_CONTROL_COMPLETION_RATE}) - 1) * 100 for an ad for which the
     *                 optimization feature has been enabled.
     *                 <p>Corresponds to "Completion rate lift" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_COMPLETION_RATE_LIFT("VIDEO_OPTIMIZATION_COMPLETION_RATE_LIFT"),

    /**
     * 
     *                 The number of control skip buttons shown.
     *                 <p>Corresponds to "Control skip button shown" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_SKIP_BUTTON_SHOWN("VIDEO_OPTIMIZATION_CONTROL_SKIP_BUTTON_SHOWN"),

    /**
     * 
     *                 The number of optimized skip buttons shown.
     *                 <p>Corresponds to "Optimized skip button shown" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_SKIP_BUTTON_SHOWN("VIDEO_OPTIMIZATION_OPTIMIZED_SKIP_BUTTON_SHOWN"),

    /**
     * 
     *                 The number of control engaged views.
     *                 <p>Corresponds to "Control engaged view" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_ENGAGED_VIEW("VIDEO_OPTIMIZATION_CONTROL_ENGAGED_VIEW"),

    /**
     * 
     *                 The number of optimized engaged views.
     *                 <p>Corresponds to "Optimized engaged view" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_ENGAGED_VIEW("VIDEO_OPTIMIZATION_OPTIMIZED_ENGAGED_VIEW"),

    /**
     * 
     *                 The control view-through rate.
     *                 <p>Corresponds to "Control view-through rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_CONTROL_VIEW_THROUGH_RATE("VIDEO_OPTIMIZATION_CONTROL_VIEW_THROUGH_RATE"),

    /**
     * 
     *                 The optimized view-through rate.
     *                 <p>Corresponds to "Optimized view-through rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_OPTIMIZED_VIEW_THROUGH_RATE("VIDEO_OPTIMIZATION_OPTIMIZED_VIEW_THROUGH_RATE"),

    /**
     * 
     *                 The percentage by which optimized view-through rate is greater than the unoptimized
     *                 view-through rate. This is calculated as (( {@link
     *                 Column#VIDEO_OPTIMIZATION_OPTIMIZED_VIEW_THROUGH_RATE}/ {@link
     *                 Column#VIDEO_OPTIMIZATION_CONTROL_VIEW_THROUGH_RATE}) - 1) * 100 for an ad for which the
     *                 optimization feature has been enabled.
     *                 <p>Corresponds to "View-through rate lift" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIDEO_OPTIMIZATION_VIEW_THROUGH_RATE_LIFT("VIDEO_OPTIMIZATION_VIEW_THROUGH_RATE_LIFT"),

    /**
     * 
     *                 The total number of impressions viewed on the user's screen.
     *                 <p>Corresponds to "Total Active View viewable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS("TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"),

    /**
     * 
     *                 The total number of impressions that were sampled and measured by active view.
     *                 <p>Corresponds to "Total Active View measurable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS("TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of total impressions viewed on the user's screen (out of the total impressions
     *                 measurable by active view).
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE("TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 Total number of impressions that were eligible to measure viewability.
     *                 <p>Corresponds to "Total Active View eligible impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS("TOTAL_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of total impressions that were measurable by active view (out of all the total
     *                 impressions sampled for active view).
     *                 <p>Corresponds to "Total Active View % measurable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE("TOTAL_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 Active View total average time in seconds that specific impressions are reported as being
     *                 viewable.
     *                 <p>Corresponds to "Total Active View Average Viewable Time (seconds)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME("TOTAL_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"),

    /**
     * 
     *                 The number of impressions delivered by the ad server viewed on the user's screen.
     *                 <p>Corresponds to "Ad server Active View viewable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS("AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions delivered by the ad server that were sampled, and measurable by
     *                 active view.
     *                 <p>Corresponds to "Ad server Active View measurable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS("AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of impressions delivered by the ad server viewed on the user's screen (out of
     *                 the ad server impressions measurable by active view).
     *                 <p>Corresponds to "Ad server Active View % viewable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE("AD_SERVER_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 Total number of impressions delivered by the ad server that were eligible to measure
     *                 viewability.
     *                 <p>Corresponds to "Ad server Active View eligible impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS("AD_SERVER_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of impressions delivered by the ad server that were measurable by active view (
     *                 out of all the ad server impressions sampled for active view).
     *                 <p>Corresponds to "Ad server Active View % measurable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE("AD_SERVER_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 Active View ad server revenue.
     *                 <p>Corresponds to "Ad Server Active View Revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_REVENUE("AD_SERVER_ACTIVE_VIEW_REVENUE"),

    /**
     * 
     *                 Active View ad server average time in seconds that specific impressions are reported as being
     *                 viewable.
     *                 <p>Corresponds to "Ad Server Active View Average Viewable Time (seconds)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_SERVER_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME("AD_SERVER_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"),

    /**
     * 
     *                 The number of impressions delivered by AdSense viewed on the user's screen,
     *                 <p>Corresponds to "AdSense Active View viewable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS("ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions delivered by AdSense that were sampled, and measurable by active
     *                 view.
     *                 <p>Corresponds to "AdSense Active View measurable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS("ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of impressions delivered by AdSense viewed on the user's screen (out of AdSense
     *                 impressions measurable by active view).
     *                 <p>Corresponds to "AdSense Active View % viewable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE("ADSENSE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 Total number of impressions delivered by AdSense that were eligible to measure viewability.
     *                 <p>Corresponds to "AdSense Active View eligible impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS("ADSENSE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of impressions delivered by AdSense that were measurable by active view ( out of
     *                 all AdSense impressions sampled for active view).
     *                 <p>Corresponds to "AdSense Active View % measurable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE("ADSENSE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 Active View AdSense revenue.
     *                 <p>Corresponds to "AdSense Active View Revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_REVENUE("ADSENSE_ACTIVE_VIEW_REVENUE"),

    /**
     * 
     *                 Active View AdSense average time in seconds that specific impressions are reported as being
     *                 viewable.
     *                 <p>Corresponds to "AdSense Active View Average Viewable Time (seconds)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    ADSENSE_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME("ADSENSE_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"),

    /**
     * 
     *                 The number of impressions delivered by Ad Exchange viewed on the user's screen,
     *                 <p>Corresponds to "Ad Exchange Active View viewable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS("AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions delivered by Ad Exchange that were sampled, and measurable by active
     *                 view.
     *                 <p>Corresponds to "Ad Exchange Active View measurable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS("AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of impressions delivered by Ad Exchange viewed on the user's screen (out of Ad
     *                 Exchange impressions measurable by active view).
     *                 <p>Corresponds to "Ad Exchange Active View % viewable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE("AD_EXCHANGE_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 Total number of impressions delivered by Ad Exchange that were eligible to measure viewability.
     *                 <p>Corresponds to "Ad Exchange Active View eligible impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS("AD_EXCHANGE_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of impressions delivered by Ad Exchange that were measurable by active view (
     *                 out of all Ad Exchange impressions sampled for active view).
     *                 <p>Corresponds to "Ad Exchange Active View % measurable impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE("AD_EXCHANGE_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 Active View AdExchange revenue.
     *                 <p>Corresponds to "Ad Exchange Active View Revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_REVENUE("AD_EXCHANGE_ACTIVE_VIEW_REVENUE"),

    /**
     * 
     *                 Active View AdExchange average time in seconds that specific impressions are reported as being
     *                 viewable.
     *                 <p>Corresponds to "Ad Exchange Active View Average Viewable Time (seconds)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    AD_EXCHANGE_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME("AD_EXCHANGE_ACTIVE_VIEW_AVERAGE_VIEWABLE_TIME"),

    /**
     * 
     *                 Active View total revenue.
     *                 <p>Corresponds to "Total Active View Revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_ACTIVE_VIEW_REVENUE("TOTAL_ACTIVE_VIEW_REVENUE"),

    /**
     * 
     *                 Number of view-through conversions.
     *               
     * 
     */
    VIEW_THROUGH_CONVERSIONS("VIEW_THROUGH_CONVERSIONS"),

    /**
     * 
     *                 Number of view-through conversions per thousand impressions.
     *                 <p>Corresponds to "Conversions per thousand impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CONVERSIONS_PER_THOUSAND_IMPRESSIONS("CONVERSIONS_PER_THOUSAND_IMPRESSIONS"),

    /**
     * 
     *                 Number of click-through conversions.
     *                 <p>Corresponds to "Click-through conversions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CLICK_THROUGH_CONVERSIONS("CLICK_THROUGH_CONVERSIONS"),

    /**
     * 
     *                 Number of click-through conversions per click.
     *                 <p>Corresponds to "Conversions per click" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CONVERSIONS_PER_CLICK("CONVERSIONS_PER_CLICK"),

    /**
     * 
     *                 Revenue for view-through conversions.
     *                 <p>Corresponds to "Advertiser view-through sales" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    VIEW_THROUGH_REVENUE("VIEW_THROUGH_REVENUE"),

    /**
     * 
     *                 Revenue for click-through conversions.
     *                 <p>Corresponds to "Advertiser click-through sales" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    CLICK_THROUGH_REVENUE("CLICK_THROUGH_REVENUE"),

    /**
     * 
     *                 Total number of conversions.
     *                 <p>Corresponds to "Total conversions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_CONVERSIONS("TOTAL_CONVERSIONS"),

    /**
     * 
     *                 Total revenue for conversions.
     *                 <p>Corresponds to "Total advertiser sales" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    TOTAL_CONVERSION_REVENUE("TOTAL_CONVERSION_REVENUE"),

    /**
     * 
     *                 The number of impressions sent to Ad Exchange / AdSense, regardless of whether they
     *                 won or lost (total number of dynamic allocation impressions).
     *                 <p>Corresponds to "Impressions competing" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_COMPETING_TOTAL("DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_COMPETING_TOTAL"),

    /**
     * 
     *                 The number of unfilled queries that attempted dynamic allocation by Ad Exchange / AdSense.
     *                 <p>Corresponds to "Unfilled competing impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_UNFILLED_IMPRESSIONS_COMPETING("DYNAMIC_ALLOCATION_OPPORTUNITY_UNFILLED_IMPRESSIONS_COMPETING"),

    /**
     * 
     *                 The number of Ad Exchange / AdSense and Ad Manager impressions.
     *                 <p>Corresponds to "Eligible impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_ELIGIBLE_IMPRESSIONS_TOTAL("DYNAMIC_ALLOCATION_OPPORTUNITY_ELIGIBLE_IMPRESSIONS_TOTAL"),

    /**
     * 
     *                 The difference between eligible impressions and competing impressions in dynamic allocation.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_TOTAL("DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_TOTAL"),

    /**
     * 
     *                 The percentage of eligible impressions that are not competing in dynamic allocation.
     *                 <p>Corresponds to "Impressions not competing (%)" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_PERCENT_TOTAL("DYNAMIC_ALLOCATION_OPPORTUNITY_IMPRESSIONS_NOT_COMPETING_PERCENT_TOTAL"),

    /**
     * 
     *                 The percent of eligible impressions participating in dynamic allocation.
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_SATURATION_RATE_TOTAL("DYNAMIC_ALLOCATION_OPPORTUNITY_SATURATION_RATE_TOTAL"),

    /**
     * 
     *                 The percent of total dynamic allocation queries that won.
     *                 <p>Corresponds to "Dynamic allocation match rate" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    DYNAMIC_ALLOCATION_OPPORTUNITY_MATCH_RATE_TOTAL("DYNAMIC_ALLOCATION_OPPORTUNITY_MATCH_RATE_TOTAL"),

    /**
     * 
     *                 The number of invoiced impressions.
     *                 <p>Corresponds to "Invoiced impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    INVOICED_IMPRESSIONS("INVOICED_IMPRESSIONS"),

    /**
     * 
     *                 The number of invoiced unfilled impressions.
     *                 <p>Corresponds to "Invoiced unfilled impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    INVOICED_UNFILLED_IMPRESSIONS("INVOICED_UNFILLED_IMPRESSIONS"),

    /**
     * 
     *                 The total number of impressions tracked for Nielsen Digital Ad Ratings measurement.
     *                 <p>Corresponds to "Impressions" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IMPRESSIONS("NIELSEN_IMPRESSIONS"),

    /**
     * 
     *                 The total number of impressions for in-target demographic tracked for Nielsen Digital Ad
     *                 Ratings measurement.
     *                 <p>Corresponds to "In-target impressions" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_IMPRESSIONS("NIELSEN_IN_TARGET_IMPRESSIONS"),

    /**
     * 
     *                 The population in the demographic.
     *                 <p>Corresponds to "Population base" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_POPULATION_BASE("NIELSEN_POPULATION_BASE"),

    /**
     * 
     *                 The total population for all in-target demographics.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_POPULATION_BASE("NIELSEN_IN_TARGET_POPULATION_BASE"),

    /**
     * 
     *                 The total number of different people within the selected demographic who were reached.
     *                 <p>Corresponds to "Unique audience" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_UNIQUE_AUDIENCE("NIELSEN_UNIQUE_AUDIENCE"),

    /**
     * 
     *                 The total number of different people within all in-target demographics who were reached.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_UNIQUE_AUDIENCE("NIELSEN_IN_TARGET_UNIQUE_AUDIENCE"),

    /**
     * 
     *                 The unique audience reached as a percentage of the population base.
     *                 <p>Corresponds to "% audience reach" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_PERCENT_AUDIENCE_REACH("NIELSEN_PERCENT_AUDIENCE_REACH"),

    /**
     * 
     *                 The unique audience reached as a percentage of the population base for all in-target
     *                 demographics.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_PERCENT_AUDIENCE_REACH("NIELSEN_IN_TARGET_PERCENT_AUDIENCE_REACH"),

    /**
     * 
     *                 The average number of times that a person within the target audience sees an advertisement.
     *                 <p>Corresponds to "Average frequency" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_AVERAGE_FREQUENCY("NIELSEN_AVERAGE_FREQUENCY"),

    /**
     * 
     *                 The average number of times that a person within the target audience sees an advertisement
     *                 for all in-target demographics.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_AVERAGE_FREQUENCY("NIELSEN_IN_TARGET_AVERAGE_FREQUENCY"),

    /**
     * 
     *                 The unit of audience volume, which is based on the percentage of the reached target audience
     *                 population multiplied by the average frequency.
     *                 <p>Corresponds to "Gross rating points" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_GROSS_RATING_POINTS("NIELSEN_GROSS_RATING_POINTS"),

    /**
     * 
     *                 The unit of audience volume, which is based on the percentage of the reached target audience
     *                 population multiplied by the average frequency, for all in-target demographics.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_GROSS_RATING_POINTS("NIELSEN_IN_TARGET_GROSS_RATING_POINTS"),

    /**
     * 
     *                 The share of impressions that reached the target demographic.
     *                 <p>Corresponds to "% impression share" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_PERCENT_IMPRESSIONS_SHARE("NIELSEN_PERCENT_IMPRESSIONS_SHARE"),

    /**
     * 
     *                 The share of impressions that reached all in-target demographics.
     *                 <p>Corresponds to "In-target % impression share" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_PERCENT_IMPRESSIONS_SHARE("NIELSEN_IN_TARGET_PERCENT_IMPRESSIONS_SHARE"),

    /**
     * 
     *                 The share of the total population represented by the population base.
     *                 <p>Corresponds to "% population share" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_PERCENT_POPULATION_SHARE("NIELSEN_PERCENT_POPULATION_SHARE"),

    /**
     * 
     *                 The share of the total population for all in-target demographics represented by the
     *                 population base.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_PERCENT_POPULATION_SHARE("NIELSEN_IN_TARGET_PERCENT_POPULATION_SHARE"),

    /**
     * 
     *                 The share of the unique audience in the demographic.
     *                 <p>Corresponds to "% audience share" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_PERCENT_AUDIENCE_SHARE("NIELSEN_PERCENT_AUDIENCE_SHARE"),

    /**
     * 
     *                 The share of the unique audience for all in-target demographics.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_PERCENT_AUDIENCE_SHARE("NIELSEN_IN_TARGET_PERCENT_AUDIENCE_SHARE"),

    /**
     * 
     *                 The relative unique audience in the demographic compared with its share of the overall
     *                 population.
     *                 <p>Corresponds to "Audience index" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_AUDIENCE_INDEX("NIELSEN_AUDIENCE_INDEX"),

    /**
     * 
     *                 The relative unique audience for all in-target demographics compared with its share of the
     *                 overall population.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_AUDIENCE_INDEX("NIELSEN_IN_TARGET_AUDIENCE_INDEX"),

    /**
     * 
     *                 The relative impressions per person in the demographic compared with the impressions per person
     *                 for the overall population.
     *                 <p>Corresponds to "Impressions index" in the Ad Manager UI. Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IMPRESSIONS_INDEX("NIELSEN_IMPRESSIONS_INDEX"),

    /**
     * 
     *                 The relative impressions per person for all in-target demographics compared with the
     *                 impressions per person for the overall population.
     *                 <p>Compatible with the "Reach" report type.</p>
     *               
     * 
     */
    NIELSEN_IN_TARGET_IMPRESSIONS_INDEX("NIELSEN_IN_TARGET_IMPRESSIONS_INDEX"),

    /**
     * 
     *                 Number of impressions delivered.
     *                 <p>Corresponds to "Impressions" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_IMPRESSIONS("DP_IMPRESSIONS"),

    /**
     * 
     *                 Number of clicks delivered
     *                 <p>Corresponds to "Clicks" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_CLICKS("DP_CLICKS"),

    /**
     * 
     *                 Number of requests.
     *                 <p>Corresponds to "Queries" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_QUERIES("DP_QUERIES"),

    /**
     * 
     *                 Number of requests where a buyer was matched with the Ad request.
     *                 <p>Corresponds to "Matched queries" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_MATCHED_QUERIES("DP_MATCHED_QUERIES"),

    /**
     * 
     *                 The revenue earned, calculated in publisher currency, for the ads delivered.
     *                 <p>Corresponds to "Cost" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_COST("DP_COST"),

    /**
     * 
     *                 The average estimated cost-per-thousand-impressions earned from ads delivered.
     *                 <p>Corresponds to "Total Average eCPM" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_ECPM("DP_ECPM"),

    /**
     * 
     *                 Total number of impressions delivered by the ad server that were eligible to measure
     *                 viewability.
     *                 <p>Corresponds to "Total Active View eligible impressions" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS("DP_ACTIVE_VIEW_ELIGIBLE_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions delivered that were sampled and measurable by active view.
     *                 <p>Corresponds to "Total Active View measurable impressions" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS("DP_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS"),

    /**
     * 
     *                 The number of impressions delivered that were viewed on the user's screen.
     *                 <p>Corresponds to "Total Active View viewable impressions" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS("DP_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS"),

    /**
     * 
     *                 The percentage of impressions delivered that were measurable by active view (out of all the
     *                 impressions sampled for active view).
     *                 <p>Corresponds to "Total Active View % measurable impressions" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE("DP_ACTIVE_VIEW_MEASURABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 The percentage of impressions delivered thar were viewed on the user's screen (out of the
     *                 impressions measurable by active view).
     *                 <p>Corresponds to "Total Active View % viewable impressions" in the Ad Manager UI. Compatible with the "Ad Connector" report type.</p>
     *               
     * 
     */
    DP_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE("DP_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE"),

    /**
     * 
     *                 The host impressions in the partner management.
     *                 <p>Corresponds to "Host impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_HOST_IMPRESSIONS("PARTNER_MANAGEMENT_HOST_IMPRESSIONS"),

    /**
     * 
     *                 The host clicks in the partner management.
     *                 <p>Corresponds to "Host clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_HOST_CLICKS("PARTNER_MANAGEMENT_HOST_CLICKS"),

    /**
     * 
     *                 The host CTR in the partner management.
     *                 <p>Corresponds to "Host CTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_HOST_CTR("PARTNER_MANAGEMENT_HOST_CTR"),

    /**
     * 
     *                 The unfilled impressions in the partner management.
     *                 <p>Corresponds to "Unfilled impressions" in the Ad Manager UI. Compatible with any of the following report types: Historical, Partner finance.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_UNFILLED_IMPRESSIONS("PARTNER_MANAGEMENT_UNFILLED_IMPRESSIONS"),

    /**
     * 
     *                 The partner impressions in the partner management.
     *                 <p>Corresponds to "Partner impressions" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_PARTNER_IMPRESSIONS("PARTNER_MANAGEMENT_PARTNER_IMPRESSIONS"),

    /**
     * 
     *                 The partner clicks in the partner management.
     *                 <p>Corresponds to "Partner clicks" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_PARTNER_CLICKS("PARTNER_MANAGEMENT_PARTNER_CLICKS"),

    /**
     * 
     *                 The partner CTR in the partner management.
     *                 <p>Corresponds to "Partner CTR" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_PARTNER_CTR("PARTNER_MANAGEMENT_PARTNER_CTR"),

    /**
     * 
     *                 The gross revenue in the partner management.
     *                 <p>Corresponds to "Gross revenue" in the Ad Manager UI. Compatible with the "Historical" report type.</p>
     *               
     * 
     */
    PARTNER_MANAGEMENT_GROSS_REVENUE("PARTNER_MANAGEMENT_GROSS_REVENUE"),

    /**
     * 
     *                 Monthly host impressions for partner finance reports.
     *                 <p>Corresponds to "Host impressions" in the Ad Manager UI. Compatible with the "Partner finance" report type.</p>
     *               
     * 
     */
    PARTNER_FINANCE_HOST_IMPRESSIONS("PARTNER_FINANCE_HOST_IMPRESSIONS"),

    /**
     * 
     *                 Monthly host revenue for partner finance reports.
     *                 <p>Corresponds to "Host revenue" in the Ad Manager UI. Compatible with the "Partner finance" report type.</p>
     *               
     * 
     */
    PARTNER_FINANCE_HOST_REVENUE("PARTNER_FINANCE_HOST_REVENUE"),

    /**
     * 
     *                 Monthly host eCPM for partner finance reports.
     *                 <p>Corresponds to "Host eCPM" in the Ad Manager UI. Compatible with the "Partner finance" report type.</p>
     *               
     * 
     */
    PARTNER_FINANCE_HOST_ECPM("PARTNER_FINANCE_HOST_ECPM"),

    /**
     * 
     *                 Monthly partner revenue for partner finance reports.
     *                 <p>Corresponds to "Partner revenue" in the Ad Manager UI. Compatible with the "Partner finance" report type.</p>
     *               
     * 
     */
    PARTNER_FINANCE_PARTNER_REVENUE("PARTNER_FINANCE_PARTNER_REVENUE"),

    /**
     * 
     *                 Monthly partner eCPM for partner finance reports.
     *                 <p>Corresponds to "Partner eCPM" in the Ad Manager UI. Compatible with the "Partner finance" report type.</p>
     *               
     * 
     */
    PARTNER_FINANCE_PARTNER_ECPM("PARTNER_FINANCE_PARTNER_ECPM"),

    /**
     * 
     *                 Monthly gross revenue for partner finance reports.
     *                 <p>Corresponds to "Gross revenue" in the Ad Manager UI. Compatible with the "Partner finance" report type.</p>
     *               
     * 
     */
    PARTNER_FINANCE_GROSS_REVENUE("PARTNER_FINANCE_GROSS_REVENUE");
    private final String value;

    Column(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Column fromValue(String v) {
        for (Column c: Column.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
