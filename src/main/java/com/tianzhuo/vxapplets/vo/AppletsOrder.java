package com.tianzhuo.vxapplets.vo;

import java.io.Serializable;
import java.util.Date;

public class AppletsOrder implements Serializable {
    private Long id;

    private String order_number;

    private String order_description;

    private String order_name;

    private Date order_time;

    private String next_person;

    private Integer order_state;

    private Integer order_money;

    private String openId;

    private Integer commodity_id;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getOrder_description() {
        return order_description;
    }

    public void setOrder_description(String order_description) {
        this.order_description = order_description;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public String getNext_person() {
        return next_person;
    }

    public void setNext_person(String next_person) {
        this.next_person = next_person;
    }

    public Integer getOrder_state() {
        return order_state;
    }

    public void setOrder_state(Integer order_state) {
        this.order_state = order_state;
    }

    public Integer getOrder_money() {
        return order_money;
    }

    public void setOrder_money(Integer order_money) {
        this.order_money = order_money;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(Integer commodity_id) {
        this.commodity_id = commodity_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", order_number=").append(order_number);
        sb.append(", order_description=").append(order_description);
        sb.append(", order_name=").append(order_name);
        sb.append(", order_time=").append(order_time);
        sb.append(", next_person=").append(next_person);
        sb.append(", order_state=").append(order_state);
        sb.append(", order_money=").append(order_money);
        sb.append(", openId=").append(openId);
        sb.append(", commodity_id=").append(commodity_id);
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
        AppletsOrder other = (AppletsOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrder_number() == null ? other.getOrder_number() == null : this.getOrder_number().equals(other.getOrder_number()))
            && (this.getOrder_description() == null ? other.getOrder_description() == null : this.getOrder_description().equals(other.getOrder_description()))
            && (this.getOrder_name() == null ? other.getOrder_name() == null : this.getOrder_name().equals(other.getOrder_name()))
            && (this.getOrder_time() == null ? other.getOrder_time() == null : this.getOrder_time().equals(other.getOrder_time()))
            && (this.getNext_person() == null ? other.getNext_person() == null : this.getNext_person().equals(other.getNext_person()))
            && (this.getOrder_state() == null ? other.getOrder_state() == null : this.getOrder_state().equals(other.getOrder_state()))
            && (this.getOrder_money() == null ? other.getOrder_money() == null : this.getOrder_money().equals(other.getOrder_money()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getCommodity_id() == null ? other.getCommodity_id() == null : this.getCommodity_id().equals(other.getCommodity_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrder_number() == null) ? 0 : getOrder_number().hashCode());
        result = prime * result + ((getOrder_description() == null) ? 0 : getOrder_description().hashCode());
        result = prime * result + ((getOrder_name() == null) ? 0 : getOrder_name().hashCode());
        result = prime * result + ((getOrder_time() == null) ? 0 : getOrder_time().hashCode());
        result = prime * result + ((getNext_person() == null) ? 0 : getNext_person().hashCode());
        result = prime * result + ((getOrder_state() == null) ? 0 : getOrder_state().hashCode());
        result = prime * result + ((getOrder_money() == null) ? 0 : getOrder_money().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getCommodity_id() == null) ? 0 : getCommodity_id().hashCode());
        return result;
    }
}