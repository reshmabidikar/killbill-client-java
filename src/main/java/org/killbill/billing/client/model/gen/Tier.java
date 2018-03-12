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
import org.killbill.billing.client.model.gen.Limit;
import org.killbill.billing.client.model.gen.Price;
import org.killbill.billing.client.model.gen.TieredBlock;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class Tier extends KillBillObject {

    private List<Limit> limits = null;

    private List<Price> fixedPrice = null;

    private List<Price> recurringPrice = null;

    private List<TieredBlock> blocks = null;

    public Tier limits(List<Limit> limits) {
        this.limits = limits;
        return this;
    }

    public Tier addLimitsItem(Limit limitsItem) {
        if (this.limits == null) {
            this.limits = new ArrayList<Limit>();
        }
        this.limits.add(limitsItem);
        return this;
    }

    
    public List<Limit> getLimits() {
        return limits;
    }

    public void setLimits(List<Limit> limits) {
        this.limits = limits;
    }

    public Tier fixedPrice(List<Price> fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    public Tier addFixedPriceItem(Price fixedPriceItem) {
        if (this.fixedPrice == null) {
            this.fixedPrice = new ArrayList<Price>();
        }
        this.fixedPrice.add(fixedPriceItem);
        return this;
    }

    
    public List<Price> getFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(List<Price> fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    public Tier recurringPrice(List<Price> recurringPrice) {
        this.recurringPrice = recurringPrice;
        return this;
    }

    public Tier addRecurringPriceItem(Price recurringPriceItem) {
        if (this.recurringPrice == null) {
            this.recurringPrice = new ArrayList<Price>();
        }
        this.recurringPrice.add(recurringPriceItem);
        return this;
    }

    
    public List<Price> getRecurringPrice() {
        return recurringPrice;
    }

    public void setRecurringPrice(List<Price> recurringPrice) {
        this.recurringPrice = recurringPrice;
    }

    public Tier blocks(List<TieredBlock> blocks) {
        this.blocks = blocks;
        return this;
    }

    public Tier addBlocksItem(TieredBlock blocksItem) {
        if (this.blocks == null) {
            this.blocks = new ArrayList<TieredBlock>();
        }
        this.blocks.add(blocksItem);
        return this;
    }

    
    public List<TieredBlock> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<TieredBlock> blocks) {
        this.blocks = blocks;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tier tier = (Tier) o;
        return Objects.equals(this.limits, tier.limits) &&
        Objects.equals(this.fixedPrice, tier.fixedPrice) &&
        Objects.equals(this.recurringPrice, tier.recurringPrice) &&
        Objects.equals(this.blocks, tier.blocks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limits, fixedPrice, recurringPrice, blocks);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tier {\n");
        
        sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
        sb.append("    fixedPrice: ").append(toIndentedString(fixedPrice)).append("\n");
        sb.append("    recurringPrice: ").append(toIndentedString(recurringPrice)).append("\n");
        sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
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

