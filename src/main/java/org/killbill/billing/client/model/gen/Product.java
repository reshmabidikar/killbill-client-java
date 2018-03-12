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
import org.killbill.billing.client.model.gen.Plan;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class Product extends KillBillObject {

    private String type = null;

    private String name = null;

    private String prettyName = null;

    private List<Plan> plans = null;

    private List<String> included = null;

    private List<String> available = null;

    public Product type(String type) {
        this.type = type;
        return this;
    }

    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Product name(String name) {
        this.name = name;
        return this;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product prettyName(String prettyName) {
        this.prettyName = prettyName;
        return this;
    }

    
    public String getPrettyName() {
        return prettyName;
    }

    public void setPrettyName(String prettyName) {
        this.prettyName = prettyName;
    }

    public Product plans(List<Plan> plans) {
        this.plans = plans;
        return this;
    }

    public Product addPlansItem(Plan plansItem) {
        if (this.plans == null) {
            this.plans = new ArrayList<Plan>();
        }
        this.plans.add(plansItem);
        return this;
    }

    
    public List<Plan> getPlans() {
        return plans;
    }

    public void setPlans(List<Plan> plans) {
        this.plans = plans;
    }

    public Product included(List<String> included) {
        this.included = included;
        return this;
    }

    public Product addIncludedItem(String includedItem) {
        if (this.included == null) {
            this.included = new ArrayList<String>();
        }
        this.included.add(includedItem);
        return this;
    }

    
    public List<String> getIncluded() {
        return included;
    }

    public void setIncluded(List<String> included) {
        this.included = included;
    }

    public Product available(List<String> available) {
        this.available = available;
        return this;
    }

    public Product addAvailableItem(String availableItem) {
        if (this.available == null) {
            this.available = new ArrayList<String>();
        }
        this.available.add(availableItem);
        return this;
    }

    
    public List<String> getAvailable() {
        return available;
    }

    public void setAvailable(List<String> available) {
        this.available = available;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(this.type, product.type) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.prettyName, product.prettyName) &&
        Objects.equals(this.plans, product.plans) &&
        Objects.equals(this.included, product.included) &&
        Objects.equals(this.available, product.available);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, prettyName, plans, included, available);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Product {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    prettyName: ").append(toIndentedString(prettyName)).append("\n");
        sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
        sb.append("    included: ").append(toIndentedString(included)).append("\n");
        sb.append("    available: ").append(toIndentedString(available)).append("\n");
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

