/*
 * Copyright 2014-2018 Groupon, Inc
 * Copyright 2014-2018 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import org.killbill.billing.catalog.api.BillingMode;
import org.killbill.billing.catalog.api.TierBlockPolicy;
import org.killbill.billing.catalog.api.UsageType;
import org.killbill.billing.client.model.gen.TierPriceOverride;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class UsagePriceOverride {

    private String usageName = null;

    private UsageType usageType = null;

    private BillingMode billingMode = null;

    private TierBlockPolicy tierBlockPolicy = null;

    private List<TierPriceOverride> tierPriceOverrides = null;


    public UsagePriceOverride() {
    }

    public UsagePriceOverride(final String usageName,
                     final UsageType usageType,
                     final BillingMode billingMode,
                     final TierBlockPolicy tierBlockPolicy,
                     final List<TierPriceOverride> tierPriceOverrides) {
        this.usageName = usageName;
        this.usageType = usageType;
        this.billingMode = billingMode;
        this.tierBlockPolicy = tierBlockPolicy;
        this.tierPriceOverrides = tierPriceOverrides;

    }


    public UsagePriceOverride setUsageName(final String usageName) {
        this.usageName = usageName;
        return this;
    }

    public String getUsageName() {
        return usageName;
    }

    public UsagePriceOverride setUsageType(final UsageType usageType) {
        this.usageType = usageType;
        return this;
    }

    public UsageType getUsageType() {
        return usageType;
    }

    public UsagePriceOverride setBillingMode(final BillingMode billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    public BillingMode getBillingMode() {
        return billingMode;
    }

    public UsagePriceOverride setTierBlockPolicy(final TierBlockPolicy tierBlockPolicy) {
        this.tierBlockPolicy = tierBlockPolicy;
        return this;
    }

    public TierBlockPolicy getTierBlockPolicy() {
        return tierBlockPolicy;
    }

    public UsagePriceOverride setTierPriceOverrides(final List<TierPriceOverride> tierPriceOverrides) {
        this.tierPriceOverrides = tierPriceOverrides;
        return this;
    }

    public UsagePriceOverride addTierPriceOverridesItem(final TierPriceOverride tierPriceOverridesItem) {
        if (this.tierPriceOverrides == null) {
            this.tierPriceOverrides = new ArrayList<TierPriceOverride>();
        }
        this.tierPriceOverrides.add(tierPriceOverridesItem);
        return this;
    }

    public List<TierPriceOverride> getTierPriceOverrides() {
        return tierPriceOverrides;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsagePriceOverride usagePriceOverride = (UsagePriceOverride) o;
        return Objects.equals(this.usageName, usagePriceOverride.usageName) &&
        Objects.equals(this.usageType, usagePriceOverride.usageType) &&
        Objects.equals(this.billingMode, usagePriceOverride.billingMode) &&
        Objects.equals(this.tierBlockPolicy, usagePriceOverride.tierBlockPolicy) &&
        Objects.equals(this.tierPriceOverrides, usagePriceOverride.tierPriceOverrides);

    }

    @Override
    public int hashCode() {
        return Objects.hash(usageName,
                            usageType,
                            billingMode,
                            tierBlockPolicy,
                            tierPriceOverrides);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsagePriceOverride {\n");
        
        sb.append("    usageName: ").append(toIndentedString(usageName)).append("\n");
        sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    tierBlockPolicy: ").append(toIndentedString(tierBlockPolicy)).append("\n");
        sb.append("    tierPriceOverrides: ").append(toIndentedString(tierPriceOverrides)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
