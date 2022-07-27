package com.tianzhuo.vxapplets.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdAppletsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdAppletsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andIphoneIsNull() {
            addCriterion("iphone is null");
            return (Criteria) this;
        }

        public Criteria andIphoneIsNotNull() {
            addCriterion("iphone is not null");
            return (Criteria) this;
        }

        public Criteria andIphoneEqualTo(String value) {
            addCriterion("iphone =", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneNotEqualTo(String value) {
            addCriterion("iphone <>", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneGreaterThan(String value) {
            addCriterion("iphone >", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneGreaterThanOrEqualTo(String value) {
            addCriterion("iphone >=", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneLessThan(String value) {
            addCriterion("iphone <", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneLessThanOrEqualTo(String value) {
            addCriterion("iphone <=", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneLike(String value) {
            addCriterion("iphone like", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneNotLike(String value) {
            addCriterion("iphone not like", value, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneIn(List<String> values) {
            addCriterion("iphone in", values, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneNotIn(List<String> values) {
            addCriterion("iphone not in", values, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneBetween(String value1, String value2) {
            addCriterion("iphone between", value1, value2, "iphone");
            return (Criteria) this;
        }

        public Criteria andIphoneNotBetween(String value1, String value2) {
            addCriterion("iphone not between", value1, value2, "iphone");
            return (Criteria) this;
        }

        public Criteria andWechat_nameIsNull() {
            addCriterion("wechat_name is null");
            return (Criteria) this;
        }

        public Criteria andWechat_nameIsNotNull() {
            addCriterion("wechat_name is not null");
            return (Criteria) this;
        }

        public Criteria andWechat_nameEqualTo(String value) {
            addCriterion("wechat_name =", value, "wechat_name");
            return (Criteria) this;
        }

        public Criteria andWechat_nameNotEqualTo(String value) {
            addCriterion("wechat_name <>", value, "wechat_name");
            return (Criteria) this;
        }

        public Criteria andWechat_nameGreaterThan(String value) {
            addCriterion("wechat_name >", value, "wechat_name");
            return (Criteria) this;
        }

        public Criteria andWechat_nameGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_name >=", value, "wechat_name");
            return (Criteria) this;
        }

        public Criteria andWechat_nameLessThan(String value) {
            addCriterion("wechat_name <", value, "wechat_name");
            return (Criteria) this;
        }

        public Criteria andWechat_nameLessThanOrEqualTo(String value) {
            addCriterion("wechat_name <=", value, "wechat_name");
            return (Criteria) this;
        }

        public Criteria andWechat_nameLike(String value) {
            addCriterion("wechat_name like", value, "wechat_name");
            return (Criteria) this;
        }

        public Criteria andWechat_nameNotLike(String value) {
            addCriterion("wechat_name not like", value, "wechat_name");
            return (Criteria) this;
        }

        public Criteria andWechat_nameIn(List<String> values) {
            addCriterion("wechat_name in", values, "wechat_name");
            return (Criteria) this;
        }

        public Criteria andWechat_nameNotIn(List<String> values) {
            addCriterion("wechat_name not in", values, "wechat_name");
            return (Criteria) this;
        }

        public Criteria andWechat_nameBetween(String value1, String value2) {
            addCriterion("wechat_name between", value1, value2, "wechat_name");
            return (Criteria) this;
        }

        public Criteria andWechat_nameNotBetween(String value1, String value2) {
            addCriterion("wechat_name not between", value1, value2, "wechat_name");
            return (Criteria) this;
        }

        public Criteria andWechat_urlIsNull() {
            addCriterion("wechat_url is null");
            return (Criteria) this;
        }

        public Criteria andWechat_urlIsNotNull() {
            addCriterion("wechat_url is not null");
            return (Criteria) this;
        }

        public Criteria andWechat_urlEqualTo(String value) {
            addCriterion("wechat_url =", value, "wechat_url");
            return (Criteria) this;
        }

        public Criteria andWechat_urlNotEqualTo(String value) {
            addCriterion("wechat_url <>", value, "wechat_url");
            return (Criteria) this;
        }

        public Criteria andWechat_urlGreaterThan(String value) {
            addCriterion("wechat_url >", value, "wechat_url");
            return (Criteria) this;
        }

        public Criteria andWechat_urlGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_url >=", value, "wechat_url");
            return (Criteria) this;
        }

        public Criteria andWechat_urlLessThan(String value) {
            addCriterion("wechat_url <", value, "wechat_url");
            return (Criteria) this;
        }

        public Criteria andWechat_urlLessThanOrEqualTo(String value) {
            addCriterion("wechat_url <=", value, "wechat_url");
            return (Criteria) this;
        }

        public Criteria andWechat_urlLike(String value) {
            addCriterion("wechat_url like", value, "wechat_url");
            return (Criteria) this;
        }

        public Criteria andWechat_urlNotLike(String value) {
            addCriterion("wechat_url not like", value, "wechat_url");
            return (Criteria) this;
        }

        public Criteria andWechat_urlIn(List<String> values) {
            addCriterion("wechat_url in", values, "wechat_url");
            return (Criteria) this;
        }

        public Criteria andWechat_urlNotIn(List<String> values) {
            addCriterion("wechat_url not in", values, "wechat_url");
            return (Criteria) this;
        }

        public Criteria andWechat_urlBetween(String value1, String value2) {
            addCriterion("wechat_url between", value1, value2, "wechat_url");
            return (Criteria) this;
        }

        public Criteria andWechat_urlNotBetween(String value1, String value2) {
            addCriterion("wechat_url not between", value1, value2, "wechat_url");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPvIsNull() {
            addCriterion("pv is null");
            return (Criteria) this;
        }

        public Criteria andPvIsNotNull() {
            addCriterion("pv is not null");
            return (Criteria) this;
        }

        public Criteria andPvEqualTo(Integer value) {
            addCriterion("pv =", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotEqualTo(Integer value) {
            addCriterion("pv <>", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThan(Integer value) {
            addCriterion("pv >", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThanOrEqualTo(Integer value) {
            addCriterion("pv >=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThan(Integer value) {
            addCriterion("pv <", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThanOrEqualTo(Integer value) {
            addCriterion("pv <=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvIn(List<Integer> values) {
            addCriterion("pv in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotIn(List<Integer> values) {
            addCriterion("pv not in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvBetween(Integer value1, Integer value2) {
            addCriterion("pv between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotBetween(Integer value1, Integer value2) {
            addCriterion("pv not between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(Integer value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(Integer value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(Integer value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(Integer value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<Integer> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<Integer> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(Integer value1, Integer value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andCreat_timeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreat_timeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreat_timeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeLessThan(Date value) {
            addCriterion("creat_time <", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creat_time");
            return (Criteria) this;
        }

        public Criteria andCreat_timeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creat_time");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIs_deleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "is_delete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}