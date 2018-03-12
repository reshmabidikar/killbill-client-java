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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.joda.time.LocalDate;
import org.killbill.billing.client.model.gen.InvoiceItem;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class InvoiceItem extends KillBillObject {

    private UUID invoiceItemId = null;

    private UUID invoiceId = null;

    private UUID linkedInvoiceItemId = null;

    private UUID accountId = null;

    private UUID childAccountId = null;

    private UUID bundleId = null;

    private UUID subscriptionId = null;

    private String planName = null;

    private String phaseName = null;

    private String usageName = null;

    private String prettyPlanName = null;

    private String prettyPhaseName = null;

    private String prettyUsageName = null;

    private String itemType = null;

    private String description = null;

    private LocalDate startDate = null;

    private LocalDate endDate = null;

    private BigDecimal amount = null;

    private BigDecimal rate = null;

    private String currency = null;

    private Integer quantity = null;

    private String itemDetails = null;

    private List<InvoiceItem> childItems = null;

    public InvoiceItem invoiceItemId(UUID invoiceItemId) {
        this.invoiceItemId = invoiceItemId;
        return this;
    }

    
    public UUID getInvoiceItemId() {
        return invoiceItemId;
    }

    public void setInvoiceItemId(UUID invoiceItemId) {
        this.invoiceItemId = invoiceItemId;
    }

    public InvoiceItem invoiceId(UUID invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }

    
    public UUID getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(UUID invoiceId) {
        this.invoiceId = invoiceId;
    }

    public InvoiceItem linkedInvoiceItemId(UUID linkedInvoiceItemId) {
        this.linkedInvoiceItemId = linkedInvoiceItemId;
        return this;
    }

    
    public UUID getLinkedInvoiceItemId() {
        return linkedInvoiceItemId;
    }

    public void setLinkedInvoiceItemId(UUID linkedInvoiceItemId) {
        this.linkedInvoiceItemId = linkedInvoiceItemId;
    }

    public InvoiceItem accountId(UUID accountId) {
        this.accountId = accountId;
        return this;
    }

    
    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public InvoiceItem childAccountId(UUID childAccountId) {
        this.childAccountId = childAccountId;
        return this;
    }

    
    public UUID getChildAccountId() {
        return childAccountId;
    }

    public void setChildAccountId(UUID childAccountId) {
        this.childAccountId = childAccountId;
    }

    public InvoiceItem bundleId(UUID bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    
    public UUID getBundleId() {
        return bundleId;
    }

    public void setBundleId(UUID bundleId) {
        this.bundleId = bundleId;
    }

    public InvoiceItem subscriptionId(UUID subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    
    public UUID getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(UUID subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public InvoiceItem planName(String planName) {
        this.planName = planName;
        return this;
    }

    
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public InvoiceItem phaseName(String phaseName) {
        this.phaseName = phaseName;
        return this;
    }

    
    public String getPhaseName() {
        return phaseName;
    }

    public void setPhaseName(String phaseName) {
        this.phaseName = phaseName;
    }

    public InvoiceItem usageName(String usageName) {
        this.usageName = usageName;
        return this;
    }

    
    public String getUsageName() {
        return usageName;
    }

    public void setUsageName(String usageName) {
        this.usageName = usageName;
    }

    public InvoiceItem prettyPlanName(String prettyPlanName) {
        this.prettyPlanName = prettyPlanName;
        return this;
    }

    
    public String getPrettyPlanName() {
        return prettyPlanName;
    }

    public void setPrettyPlanName(String prettyPlanName) {
        this.prettyPlanName = prettyPlanName;
    }

    public InvoiceItem prettyPhaseName(String prettyPhaseName) {
        this.prettyPhaseName = prettyPhaseName;
        return this;
    }

    
    public String getPrettyPhaseName() {
        return prettyPhaseName;
    }

    public void setPrettyPhaseName(String prettyPhaseName) {
        this.prettyPhaseName = prettyPhaseName;
    }

    public InvoiceItem prettyUsageName(String prettyUsageName) {
        this.prettyUsageName = prettyUsageName;
        return this;
    }

    
    public String getPrettyUsageName() {
        return prettyUsageName;
    }

    public void setPrettyUsageName(String prettyUsageName) {
        this.prettyUsageName = prettyUsageName;
    }

    public InvoiceItem itemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public InvoiceItem description(String description) {
        this.description = description;
        return this;
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InvoiceItem startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public InvoiceItem endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public InvoiceItem amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public InvoiceItem rate(BigDecimal rate) {
        this.rate = rate;
        return this;
    }

    
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public InvoiceItem currency(String currency) {
        this.currency = currency;
        return this;
    }

    
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public InvoiceItem quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public InvoiceItem itemDetails(String itemDetails) {
        this.itemDetails = itemDetails;
        return this;
    }

    
    public String getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(String itemDetails) {
        this.itemDetails = itemDetails;
    }

    public InvoiceItem childItems(List<InvoiceItem> childItems) {
        this.childItems = childItems;
        return this;
    }

    public InvoiceItem addChildItemsItem(InvoiceItem childItemsItem) {
        if (this.childItems == null) {
            this.childItems = new ArrayList<InvoiceItem>();
        }
        this.childItems.add(childItemsItem);
        return this;
    }

    
    public List<InvoiceItem> getChildItems() {
        return childItems;
    }

    public void setChildItems(List<InvoiceItem> childItems) {
        this.childItems = childItems;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvoiceItem invoiceItem = (InvoiceItem) o;
        return Objects.equals(this.invoiceItemId, invoiceItem.invoiceItemId) &&
        Objects.equals(this.invoiceId, invoiceItem.invoiceId) &&
        Objects.equals(this.linkedInvoiceItemId, invoiceItem.linkedInvoiceItemId) &&
        Objects.equals(this.accountId, invoiceItem.accountId) &&
        Objects.equals(this.childAccountId, invoiceItem.childAccountId) &&
        Objects.equals(this.bundleId, invoiceItem.bundleId) &&
        Objects.equals(this.subscriptionId, invoiceItem.subscriptionId) &&
        Objects.equals(this.planName, invoiceItem.planName) &&
        Objects.equals(this.phaseName, invoiceItem.phaseName) &&
        Objects.equals(this.usageName, invoiceItem.usageName) &&
        Objects.equals(this.prettyPlanName, invoiceItem.prettyPlanName) &&
        Objects.equals(this.prettyPhaseName, invoiceItem.prettyPhaseName) &&
        Objects.equals(this.prettyUsageName, invoiceItem.prettyUsageName) &&
        Objects.equals(this.itemType, invoiceItem.itemType) &&
        Objects.equals(this.description, invoiceItem.description) &&
        Objects.equals(this.startDate, invoiceItem.startDate) &&
        Objects.equals(this.endDate, invoiceItem.endDate) &&
        Objects.equals(this.amount, invoiceItem.amount) &&
        Objects.equals(this.rate, invoiceItem.rate) &&
        Objects.equals(this.currency, invoiceItem.currency) &&
        Objects.equals(this.quantity, invoiceItem.quantity) &&
        Objects.equals(this.itemDetails, invoiceItem.itemDetails) &&
        Objects.equals(this.childItems, invoiceItem.childItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceItemId, invoiceId, linkedInvoiceItemId, accountId, childAccountId, bundleId, subscriptionId, planName, phaseName, usageName, prettyPlanName, prettyPhaseName, prettyUsageName, itemType, description, startDate, endDate, amount, rate, currency, quantity, itemDetails, childItems);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvoiceItem {\n");
        
        sb.append("    invoiceItemId: ").append(toIndentedString(invoiceItemId)).append("\n");
        sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
        sb.append("    linkedInvoiceItemId: ").append(toIndentedString(linkedInvoiceItemId)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    childAccountId: ").append(toIndentedString(childAccountId)).append("\n");
        sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
        sb.append("    phaseName: ").append(toIndentedString(phaseName)).append("\n");
        sb.append("    usageName: ").append(toIndentedString(usageName)).append("\n");
        sb.append("    prettyPlanName: ").append(toIndentedString(prettyPlanName)).append("\n");
        sb.append("    prettyPhaseName: ").append(toIndentedString(prettyPhaseName)).append("\n");
        sb.append("    prettyUsageName: ").append(toIndentedString(prettyUsageName)).append("\n");
        sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    itemDetails: ").append(toIndentedString(itemDetails)).append("\n");
        sb.append("    childItems: ").append(toIndentedString(childItems)).append("\n");
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

