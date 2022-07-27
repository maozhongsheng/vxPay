package com.tianzhuo.vxapplets.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppletsOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppletsOrderExample() {
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

        public Criteria andOrder_numberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrder_numberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_numberEqualTo(String value) {
            addCriterion("order_number =", value, "order_number");
            return (Criteria) this;
        }

        public Criteria andOrder_numberNotEqualTo(String value) {
            addCriterion("order_number <>", value, "order_number");
            return (Criteria) this;
        }

        public Criteria andOrder_numberGreaterThan(String value) {
            addCriterion("order_number >", value, "order_number");
            return (Criteria) this;
        }

        public Criteria andOrder_numberGreaterThanOrEqualTo(String value) {
            addCriterion("order_number >=", value, "order_number");
            return (Criteria) this;
        }

        public Criteria andOrder_numberLessThan(String value) {
            addCriterion("order_number <", value, "order_number");
            return (Criteria) this;
        }

        public Criteria andOrder_numberLessThanOrEqualTo(String value) {
            addCriterion("order_number <=", value, "order_number");
            return (Criteria) this;
        }

        public Criteria andOrder_numberLike(String value) {
            addCriterion("order_number like", value, "order_number");
            return (Criteria) this;
        }

        public Criteria andOrder_numberNotLike(String value) {
            addCriterion("order_number not like", value, "order_number");
            return (Criteria) this;
        }

        public Criteria andOrder_numberIn(List<String> values) {
            addCriterion("order_number in", values, "order_number");
            return (Criteria) this;
        }

        public Criteria andOrder_numberNotIn(List<String> values) {
            addCriterion("order_number not in", values, "order_number");
            return (Criteria) this;
        }

        public Criteria andOrder_numberBetween(String value1, String value2) {
            addCriterion("order_number between", value1, value2, "order_number");
            return (Criteria) this;
        }

        public Criteria andOrder_numberNotBetween(String value1, String value2) {
            addCriterion("order_number not between", value1, value2, "order_number");
            return (Criteria) this;
        }

        public Criteria andOrder_descriptionIsNull() {
            addCriterion("order_description is null");
            return (Criteria) this;
        }

        public Criteria andOrder_descriptionIsNotNull() {
            addCriterion("order_description is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_descriptionEqualTo(String value) {
            addCriterion("order_description =", value, "order_description");
            return (Criteria) this;
        }

        public Criteria andOrder_descriptionNotEqualTo(String value) {
            addCriterion("order_description <>", value, "order_description");
            return (Criteria) this;
        }

        public Criteria andOrder_descriptionGreaterThan(String value) {
            addCriterion("order_description >", value, "order_description");
            return (Criteria) this;
        }

        public Criteria andOrder_descriptionGreaterThanOrEqualTo(String value) {
            addCriterion("order_description >=", value, "order_description");
            return (Criteria) this;
        }

        public Criteria andOrder_descriptionLessThan(String value) {
            addCriterion("order_description <", value, "order_description");
            return (Criteria) this;
        }

        public Criteria andOrder_descriptionLessThanOrEqualTo(String value) {
            addCriterion("order_description <=", value, "order_description");
            return (Criteria) this;
        }

        public Criteria andOrder_descriptionLike(String value) {
            addCriterion("order_description like", value, "order_description");
            return (Criteria) this;
        }

        public Criteria andOrder_descriptionNotLike(String value) {
            addCriterion("order_description not like", value, "order_description");
            return (Criteria) this;
        }

        public Criteria andOrder_descriptionIn(List<String> values) {
            addCriterion("order_description in", values, "order_description");
            return (Criteria) this;
        }

        public Criteria andOrder_descriptionNotIn(List<String> values) {
            addCriterion("order_description not in", values, "order_description");
            return (Criteria) this;
        }

        public Criteria andOrder_descriptionBetween(String value1, String value2) {
            addCriterion("order_description between", value1, value2, "order_description");
            return (Criteria) this;
        }

        public Criteria andOrder_descriptionNotBetween(String value1, String value2) {
            addCriterion("order_description not between", value1, value2, "order_description");
            return (Criteria) this;
        }

        public Criteria andOrder_nameIsNull() {
            addCriterion("order_name is null");
            return (Criteria) this;
        }

        public Criteria andOrder_nameIsNotNull() {
            addCriterion("order_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_nameEqualTo(String value) {
            addCriterion("order_name =", value, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameNotEqualTo(String value) {
            addCriterion("order_name <>", value, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameGreaterThan(String value) {
            addCriterion("order_name >", value, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameGreaterThanOrEqualTo(String value) {
            addCriterion("order_name >=", value, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameLessThan(String value) {
            addCriterion("order_name <", value, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameLessThanOrEqualTo(String value) {
            addCriterion("order_name <=", value, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameLike(String value) {
            addCriterion("order_name like", value, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameNotLike(String value) {
            addCriterion("order_name not like", value, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameIn(List<String> values) {
            addCriterion("order_name in", values, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameNotIn(List<String> values) {
            addCriterion("order_name not in", values, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameBetween(String value1, String value2) {
            addCriterion("order_name between", value1, value2, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_nameNotBetween(String value1, String value2) {
            addCriterion("order_name not between", value1, value2, "order_name");
            return (Criteria) this;
        }

        public Criteria andOrder_timeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrder_timeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_timeEqualTo(Date value) {
            addCriterion("order_time =", value, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeGreaterThan(Date value) {
            addCriterion("order_time >", value, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeLessThan(Date value) {
            addCriterion("order_time <", value, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeIn(List<Date> values) {
            addCriterion("order_time in", values, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "order_time");
            return (Criteria) this;
        }

        public Criteria andOrder_timeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "order_time");
            return (Criteria) this;
        }

        public Criteria andNext_personIsNull() {
            addCriterion("next_person is null");
            return (Criteria) this;
        }

        public Criteria andNext_personIsNotNull() {
            addCriterion("next_person is not null");
            return (Criteria) this;
        }

        public Criteria andNext_personEqualTo(String value) {
            addCriterion("next_person =", value, "next_person");
            return (Criteria) this;
        }

        public Criteria andNext_personNotEqualTo(String value) {
            addCriterion("next_person <>", value, "next_person");
            return (Criteria) this;
        }

        public Criteria andNext_personGreaterThan(String value) {
            addCriterion("next_person >", value, "next_person");
            return (Criteria) this;
        }

        public Criteria andNext_personGreaterThanOrEqualTo(String value) {
            addCriterion("next_person >=", value, "next_person");
            return (Criteria) this;
        }

        public Criteria andNext_personLessThan(String value) {
            addCriterion("next_person <", value, "next_person");
            return (Criteria) this;
        }

        public Criteria andNext_personLessThanOrEqualTo(String value) {
            addCriterion("next_person <=", value, "next_person");
            return (Criteria) this;
        }

        public Criteria andNext_personLike(String value) {
            addCriterion("next_person like", value, "next_person");
            return (Criteria) this;
        }

        public Criteria andNext_personNotLike(String value) {
            addCriterion("next_person not like", value, "next_person");
            return (Criteria) this;
        }

        public Criteria andNext_personIn(List<String> values) {
            addCriterion("next_person in", values, "next_person");
            return (Criteria) this;
        }

        public Criteria andNext_personNotIn(List<String> values) {
            addCriterion("next_person not in", values, "next_person");
            return (Criteria) this;
        }

        public Criteria andNext_personBetween(String value1, String value2) {
            addCriterion("next_person between", value1, value2, "next_person");
            return (Criteria) this;
        }

        public Criteria andNext_personNotBetween(String value1, String value2) {
            addCriterion("next_person not between", value1, value2, "next_person");
            return (Criteria) this;
        }

        public Criteria andOrder_stateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrder_stateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_stateEqualTo(Integer value) {
            addCriterion("order_state =", value, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateNotEqualTo(Integer value) {
            addCriterion("order_state <>", value, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateGreaterThan(Integer value) {
            addCriterion("order_state >", value, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_state >=", value, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateLessThan(Integer value) {
            addCriterion("order_state <", value, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateLessThanOrEqualTo(Integer value) {
            addCriterion("order_state <=", value, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateIn(List<Integer> values) {
            addCriterion("order_state in", values, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateNotIn(List<Integer> values) {
            addCriterion("order_state not in", values, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateBetween(Integer value1, Integer value2) {
            addCriterion("order_state between", value1, value2, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_state not between", value1, value2, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyIsNull() {
            addCriterion("order_money is null");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyIsNotNull() {
            addCriterion("order_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyEqualTo(Integer value) {
            addCriterion("order_money =", value, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyNotEqualTo(Integer value) {
            addCriterion("order_money <>", value, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyGreaterThan(Integer value) {
            addCriterion("order_money >", value, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_money >=", value, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyLessThan(Integer value) {
            addCriterion("order_money <", value, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyLessThanOrEqualTo(Integer value) {
            addCriterion("order_money <=", value, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyIn(List<Integer> values) {
            addCriterion("order_money in", values, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyNotIn(List<Integer> values) {
            addCriterion("order_money not in", values, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyBetween(Integer value1, Integer value2) {
            addCriterion("order_money between", value1, value2, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyNotBetween(Integer value1, Integer value2) {
            addCriterion("order_money not between", value1, value2, "order_money");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("openId is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("openId is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("openId =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("openId <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("openId >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("openId >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("openId <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("openId <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("openId like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("openId not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("openId in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("openId not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("openId between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("openId not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andCommodity_idIsNull() {
            addCriterion("commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodity_idIsNotNull() {
            addCriterion("commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodity_idEqualTo(Integer value) {
            addCriterion("commodity_id =", value, "commodity_id");
            return (Criteria) this;
        }

        public Criteria andCommodity_idNotEqualTo(Integer value) {
            addCriterion("commodity_id <>", value, "commodity_id");
            return (Criteria) this;
        }

        public Criteria andCommodity_idGreaterThan(Integer value) {
            addCriterion("commodity_id >", value, "commodity_id");
            return (Criteria) this;
        }

        public Criteria andCommodity_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_id >=", value, "commodity_id");
            return (Criteria) this;
        }

        public Criteria andCommodity_idLessThan(Integer value) {
            addCriterion("commodity_id <", value, "commodity_id");
            return (Criteria) this;
        }

        public Criteria andCommodity_idLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_id <=", value, "commodity_id");
            return (Criteria) this;
        }

        public Criteria andCommodity_idIn(List<Integer> values) {
            addCriterion("commodity_id in", values, "commodity_id");
            return (Criteria) this;
        }

        public Criteria andCommodity_idNotIn(List<Integer> values) {
            addCriterion("commodity_id not in", values, "commodity_id");
            return (Criteria) this;
        }

        public Criteria andCommodity_idBetween(Integer value1, Integer value2) {
            addCriterion("commodity_id between", value1, value2, "commodity_id");
            return (Criteria) this;
        }

        public Criteria andCommodity_idNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_id not between", value1, value2, "commodity_id");
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