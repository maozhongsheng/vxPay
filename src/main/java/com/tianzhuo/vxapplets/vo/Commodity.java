package com.tianzhuo.vxapplets.vo;

import java.io.Serializable;
import java.util.Date;

public class Commodity implements Serializable {
    private Long id;

    private String commodity_name;

    private String original_amount;

    private String discount_amount;

    private Date create_time;

    private Integer is_deletes;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommodity_name() {
        return commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name;
    }

    public String getOriginal_amount() {
        return original_amount;
    }

    public void setOriginal_amount(String original_amount) {
        this.original_amount = original_amount;
    }

    public String getDiscount_amount() {
        return discount_amount;
    }

    public void setDiscount_amount(String discount_amount) {
        this.discount_amount = discount_amount;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getIs_deletes() {
        return is_deletes;
    }

    public void setIs_deletes(Integer is_deletes) {
        this.is_deletes = is_deletes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", commodity_name=").append(commodity_name);
        sb.append(", original_amount=").append(original_amount);
        sb.append(", discount_amount=").append(discount_amount);
        sb.append(", create_time=").append(create_time);
        sb.append(", is_deletes=").append(is_deletes);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Commodity other = (Commodity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCommodity_name() == null ? other.getCommodity_name() == null : this.getCommodity_name().equals(other.getCommodity_name()))
            && (this.getOriginal_amount() == null ? other.getOriginal_amount() == null : this.getOriginal_amount().equals(other.getOriginal_amount()))
            && (this.getDiscount_amount() == null ? other.getDiscount_amount() == null : this.getDiscount_amount().equals(other.getDiscount_amount()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getIs_deletes() == null ? other.getIs_deletes() == null : this.getIs_deletes().equals(other.getIs_deletes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCommodity_name() == null) ? 0 : getCommodity_name().hashCode());
        result = prime * result + ((getOriginal_amount() == null) ? 0 : getOriginal_amount().hashCode());
        result = prime * result + ((getDiscount_amount() == null) ? 0 : getDiscount_amount().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getIs_deletes() == null) ? 0 : getIs_deletes().hashCode());
        return result;
    }
}