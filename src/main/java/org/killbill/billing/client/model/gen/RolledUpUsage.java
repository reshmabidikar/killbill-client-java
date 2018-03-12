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
import java.util.UUID;
import org.joda.time.LocalDate;
import org.killbill.billing.client.model.gen.RolledUpUnit;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class RolledUpUsage extends KillBillObject {

    private UUID subscriptionId = null;

    private LocalDate startDate = null;

    private LocalDate endDate = null;

    private List<RolledUpUnit> rolledUpUnits = null;

    public RolledUpUsage subscriptionId(UUID subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    
    public UUID getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(UUID subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public RolledUpUsage startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public RolledUpUsage endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public RolledUpUsage rolledUpUnits(List<RolledUpUnit> rolledUpUnits) {
        this.rolledUpUnits = rolledUpUnits;
        return this;
    }

    public RolledUpUsage addRolledUpUnitsItem(RolledUpUnit rolledUpUnitsItem) {
        if (this.rolledUpUnits == null) {
            this.rolledUpUnits = new ArrayList<RolledUpUnit>();
        }
        this.rolledUpUnits.add(rolledUpUnitsItem);
        return this;
    }

    
    public List<RolledUpUnit> getRolledUpUnits() {
        return rolledUpUnits;
    }

    public void setRolledUpUnits(List<RolledUpUnit> rolledUpUnits) {
        this.rolledUpUnits = rolledUpUnits;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RolledUpUsage rolledUpUsage = (RolledUpUsage) o;
        return Objects.equals(this.subscriptionId, rolledUpUsage.subscriptionId) &&
        Objects.equals(this.startDate, rolledUpUsage.startDate) &&
        Objects.equals(this.endDate, rolledUpUsage.endDate) &&
        Objects.equals(this.rolledUpUnits, rolledUpUsage.rolledUpUnits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionId, startDate, endDate, rolledUpUnits);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RolledUpUsage {\n");
        
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    rolledUpUnits: ").append(toIndentedString(rolledUpUnits)).append("\n");
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

