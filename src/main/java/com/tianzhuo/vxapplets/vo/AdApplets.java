package com.tianzhuo.vxapplets.vo;

import java.io.Serializable;
import java.util.Date;

public class AdApplets implements Serializable {
    private Long id;

    private String openid;

    private String iphone;

    private String wechat_name;

    private String wechat_url;

    private Integer type;

    private Integer pv;

    private Integer payment;

    private Date creat_time;

    private Integer is_delete;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getWechat_name() {
        return wechat_name;
    }

    public void setWechat_name(String wechat_name) {
        this.wechat_name = wechat_name;
    }

    public String getWechat_url() {
        return wechat_url;
    }

    public void setWechat_url(String wechat_url) {
        this.wechat_url = wechat_url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Date getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(Date creat_time) {
        this.creat_time = creat_time;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", openid=").append(openid);
        sb.append(", iphone=").append(iphone);
        sb.append(", wechat_name=").append(wechat_name);
        sb.append(", wechat_url=").append(wechat_url);
        sb.append(", type=").append(type);
        sb.append(", pv=").append(pv);
        sb.append(", payment=").append(payment);
        sb.append(", creat_time=").append(creat_time);
        sb.append(", is_delete=").append(is_delete);
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
        AdApplets other = (AdApplets) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getIphone() == null ? other.getIphone() == null : this.getIphone().equals(other.getIphone()))
            && (this.getWechat_name() == null ? other.getWechat_name() == null : this.getWechat_name().equals(other.getWechat_name()))
            && (this.getWechat_url() == null ? other.getWechat_url() == null : this.getWechat_url().equals(other.getWechat_url()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPv() == null ? other.getPv() == null : this.getPv().equals(other.getPv()))
            && (this.getPayment() == null ? other.getPayment() == null : this.getPayment().equals(other.getPayment()))
            && (this.getCreat_time() == null ? other.getCreat_time() == null : this.getCreat_time().equals(other.getCreat_time()))
            && (this.getIs_delete() == null ? other.getIs_delete() == null : this.getIs_delete().equals(other.getIs_delete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getIphone() == null) ? 0 : getIphone().hashCode());
        result = prime * result + ((getWechat_name() == null) ? 0 : getWechat_name().hashCode());
        result = prime * result + ((getWechat_url() == null) ? 0 : getWechat_url().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPv() == null) ? 0 : getPv().hashCode());
        result = prime * result + ((getPayment() == null) ? 0 : getPayment().hashCode());
        result = prime * result + ((getCreat_time() == null) ? 0 : getCreat_time().hashCode());
        result = prime * result + ((getIs_delete() == null) ? 0 : getIs_delete().hashCode());
        return result;
    }
}