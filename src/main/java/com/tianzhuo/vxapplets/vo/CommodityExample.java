package com.tianzhuo.vxapplets.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityExample() {
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

        public Criteria andCommodity_nameIsNull() {
            addCriterion("commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodity_nameIsNotNull() {
            addCriterion("commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodity_nameEqualTo(String value) {
            addCriterion("commodity_name =", value, "commodity_name");
            return (Criteria) this;
        }

        public Criteria andCommodity_nameNotEqualTo(String value) {
            addCriterion("commodity_name <>", value, "commodity_name");
            return (Criteria) this;
        }

        public Criteria andCommodity_nameGreaterThan(String value) {
            addCriterion("commodity_name >", value, "commodity_name");
            return (Criteria) this;
        }

        public Criteria andCommodity_nameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_name >=", value, "commodity_name");
            return (Criteria) this;
        }

        public Criteria andCommodity_nameLessThan(String value) {
            addCriterion("commodity_name <", value, "commodity_name");
            return (Criteria) this;
        }

        public Criteria andCommodity_nameLessThanOrEqualTo(String value) {
            addCriterion("commodity_name <=", value, "commodity_name");
            return (Criteria) this;
        }

        public Criteria andCommodity_nameLike(String value) {
            addCriterion("commodity_name like", value, "commodity_name");
            return (Criteria) this;
        }

        public Criteria andCommodity_nameNotLike(String value) {
            addCriterion("commodity_name not like", value, "commodity_name");
            return (Criteria) this;
        }

        public Criteria andCommodity_nameIn(List<String> values) {
            addCriterion("commodity_name in", values, "commodity_name");
            return (Criteria) this;
        }

        public Criteria andCommodity_nameNotIn(List<String> values) {
            addCriterion("commodity_name not in", values, "commodity_name");
            return (Criteria) this;
        }

        public Criteria andCommodity_nameBetween(String value1, String value2) {
            addCriterion("commodity_name between", value1, value2, "commodity_name");
            return (Criteria) this;
        }

        public Criteria andCommodity_nameNotBetween(String value1, String value2) {
            addCriterion("commodity_name not between", value1, value2, "commodity_name");
            return (Criteria) this;
        }

        public Criteria andOriginal_amountIsNull() {
            addCriterion("original_amount is null");
            return (Criteria) this;
        }

        public Criteria andOriginal_amountIsNotNull() {
            addCriterion("original_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOriginal_amountEqualTo(String value) {
            addCriterion("original_amount =", value, "original_amount");
            return (Criteria) this;
        }

        public Criteria andOriginal_amountNotEqualTo(String value) {
            addCriterion("original_amount <>", value, "original_amount");
            return (Criteria) this;
        }

        public Criteria andOriginal_amountGreaterThan(String value) {
            addCriterion("original_amount >", value, "original_amount");
            return (Criteria) this;
        }

        public Criteria andOriginal_amountGreaterThanOrEqualTo(String value) {
            addCriterion("original_amount >=", value, "original_amount");
            return (Criteria) this;
        }

        public Criteria andOriginal_amountLessThan(String value) {
            addCriterion("original_amount <", value, "original_amount");
            return (Criteria) this;
        }

        public Criteria andOriginal_amountLessThanOrEqualTo(String value) {
            addCriterion("original_amount <=", value, "original_amount");
            return (Criteria) this;
        }

        public Criteria andOriginal_amountLike(String value) {
            addCriterion("original_amount like", value, "original_amount");
            return (Criteria) this;
        }

        public Criteria andOriginal_amountNotLike(String value) {
            addCriterion("original_amount not like", value, "original_amount");
            return (Criteria) this;
        }

        public Criteria andOriginal_amountIn(List<String> values) {
            addCriterion("original_amount in", values, "original_amount");
            return (Criteria) this;
        }

        public Criteria andOriginal_amountNotIn(List<String> values) {
            addCriterion("original_amount not in", values, "original_amount");
            return (Criteria) this;
        }

        public Criteria andOriginal_amountBetween(String value1, String value2) {
            addCriterion("original_amount between", value1, value2, "original_amount");
            return (Criteria) this;
        }

        public Criteria andOriginal_amountNotBetween(String value1, String value2) {
            addCriterion("original_amount not between", value1, value2, "original_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountEqualTo(String value) {
            addCriterion("discount_amount =", value, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountNotEqualTo(String value) {
            addCriterion("discount_amount <>", value, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountGreaterThan(String value) {
            addCriterion("discount_amount >", value, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountGreaterThanOrEqualTo(String value) {
            addCriterion("discount_amount >=", value, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountLessThan(String value) {
            addCriterion("discount_amount <", value, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountLessThanOrEqualTo(String value) {
            addCriterion("discount_amount <=", value, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountLike(String value) {
            addCriterion("discount_amount like", value, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountNotLike(String value) {
            addCriterion("discount_amount not like", value, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountIn(List<String> values) {
            addCriterion("discount_amount in", values, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountNotIn(List<String> values) {
            addCriterion("discount_amount not in", values, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountBetween(String value1, String value2) {
            addCriterion("discount_amount between", value1, value2, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andDiscount_amountNotBetween(String value1, String value2) {
            addCriterion("discount_amount not between", value1, value2, "discount_amount");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andIs_deletesIsNull() {
            addCriterion("is_deletes is null");
            return (Criteria) this;
        }

        public Criteria andIs_deletesIsNotNull() {
            addCriterion("is_deletes is not null");
            return (Criteria) this;
        }

        public Criteria andIs_deletesEqualTo(Integer value) {
            addCriterion("is_deletes =", value, "is_deletes");
            return (Criteria) this;
        }

        public Criteria andIs_deletesNotEqualTo(Integer value) {
            addCriterion("is_deletes <>", value, "is_deletes");
            return (Criteria) this;
        }

        public Criteria andIs_deletesGreaterThan(Integer value) {
            addCriterion("is_deletes >", value, "is_deletes");
            return (Criteria) this;
        }

        public Criteria andIs_deletesGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deletes >=", value, "is_deletes");
            return (Criteria) this;
        }

        public Criteria andIs_deletesLessThan(Integer value) {
            addCriterion("is_deletes <", value, "is_deletes");
            return (Criteria) this;
        }

        public Criteria andIs_deletesLessThanOrEqualTo(Integer value) {
            addCriterion("is_deletes <=", value, "is_deletes");
            return (Criteria) this;
        }

        public Criteria andIs_deletesIn(List<Integer> values) {
            addCriterion("is_deletes in", values, "is_deletes");
            return (Criteria) this;
        }

        public Criteria andIs_deletesNotIn(List<Integer> values) {
            addCriterion("is_deletes not in", values, "is_deletes");
            return (Criteria) this;
        }

        public Criteria andIs_deletesBetween(Integer value1, Integer value2) {
            addCriterion("is_deletes between", value1, value2, "is_deletes");
            return (Criteria) this;
        }

        public Criteria andIs_deletesNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deletes not between", value1, value2, "is_deletes");
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