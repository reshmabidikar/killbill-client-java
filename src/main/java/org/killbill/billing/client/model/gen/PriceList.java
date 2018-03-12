/*
 * Kill Bill
 * Kill Bill is an open-source billing and payments platform
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class PriceList extends KillBillObject {

    private String name = null;

    private List<String> plans = null;

    public PriceList name(String name) {
        this.name = name;
        return this;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PriceList plans(List<String> plans) {
        this.plans = plans;
        return this;
    }

    public PriceList addPlansItem(String plansItem) {
        if (this.plans == null) {
            this.plans = new ArrayList<String>();
        }
        this.plans.add(plansItem);
        return this;
    }

    
    public List<String> getPlans() {
        return plans;
    }

    public void setPlans(List<String> plans) {
        this.plans = plans;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PriceList priceList = (PriceList) o;
        return Objects.equals(this.name, priceList.name) &&
        Objects.equals(this.plans, priceList.plans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, plans);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PriceList {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
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

