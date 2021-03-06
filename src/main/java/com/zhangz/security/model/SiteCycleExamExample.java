package com.zhangz.security.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SiteCycleExamExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public SiteCycleExamExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andSiteCycleExamIdIsNull() {
            addCriterion("site_cycle_exam_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamIdIsNotNull() {
            addCriterion("site_cycle_exam_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamIdEqualTo(String value) {
            addCriterion("site_cycle_exam_id =", value, "siteCycleExamId");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamIdNotEqualTo(String value) {
            addCriterion("site_cycle_exam_id <>", value, "siteCycleExamId");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamIdGreaterThan(String value) {
            addCriterion("site_cycle_exam_id >", value, "siteCycleExamId");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamIdGreaterThanOrEqualTo(String value) {
            addCriterion("site_cycle_exam_id >=", value, "siteCycleExamId");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamIdLessThan(String value) {
            addCriterion("site_cycle_exam_id <", value, "siteCycleExamId");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamIdLessThanOrEqualTo(String value) {
            addCriterion("site_cycle_exam_id <=", value, "siteCycleExamId");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamIdLike(String value) {
            addCriterion("site_cycle_exam_id like", value, "siteCycleExamId");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamIdNotLike(String value) {
            addCriterion("site_cycle_exam_id not like", value, "siteCycleExamId");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamIdIn(List<String> values) {
            addCriterion("site_cycle_exam_id in", values, "siteCycleExamId");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamIdNotIn(List<String> values) {
            addCriterion("site_cycle_exam_id not in", values, "siteCycleExamId");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamIdBetween(String value1, String value2) {
            addCriterion("site_cycle_exam_id between", value1, value2, "siteCycleExamId");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamIdNotBetween(String value1, String value2) {
            addCriterion("site_cycle_exam_id not between", value1, value2, "siteCycleExamId");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamNameIsNull() {
            addCriterion("site_cycle_exam_name is null");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamNameIsNotNull() {
            addCriterion("site_cycle_exam_name is not null");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamNameEqualTo(String value) {
            addCriterion("site_cycle_exam_name =", value, "siteCycleExamName");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamNameNotEqualTo(String value) {
            addCriterion("site_cycle_exam_name <>", value, "siteCycleExamName");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamNameGreaterThan(String value) {
            addCriterion("site_cycle_exam_name >", value, "siteCycleExamName");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamNameGreaterThanOrEqualTo(String value) {
            addCriterion("site_cycle_exam_name >=", value, "siteCycleExamName");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamNameLessThan(String value) {
            addCriterion("site_cycle_exam_name <", value, "siteCycleExamName");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamNameLessThanOrEqualTo(String value) {
            addCriterion("site_cycle_exam_name <=", value, "siteCycleExamName");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamNameLike(String value) {
            addCriterion("site_cycle_exam_name like", value, "siteCycleExamName");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamNameNotLike(String value) {
            addCriterion("site_cycle_exam_name not like", value, "siteCycleExamName");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamNameIn(List<String> values) {
            addCriterion("site_cycle_exam_name in", values, "siteCycleExamName");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamNameNotIn(List<String> values) {
            addCriterion("site_cycle_exam_name not in", values, "siteCycleExamName");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamNameBetween(String value1, String value2) {
            addCriterion("site_cycle_exam_name between", value1, value2, "siteCycleExamName");
            return (Criteria) this;
        }

        public Criteria andSiteCycleExamNameNotBetween(String value1, String value2) {
            addCriterion("site_cycle_exam_name not between", value1, value2, "siteCycleExamName");
            return (Criteria) this;
        }

        public Criteria andExamDateIsNull() {
            addCriterion("exam_date is null");
            return (Criteria) this;
        }

        public Criteria andExamDateIsNotNull() {
            addCriterion("exam_date is not null");
            return (Criteria) this;
        }

        public Criteria andExamDateEqualTo(Date value) {
            addCriterion("exam_date =", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotEqualTo(Date value) {
            addCriterion("exam_date <>", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateGreaterThan(Date value) {
            addCriterion("exam_date >", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateGreaterThanOrEqualTo(Date value) {
            addCriterion("exam_date >=", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateLessThan(Date value) {
            addCriterion("exam_date <", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateLessThanOrEqualTo(Date value) {
            addCriterion("exam_date <=", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateIn(List<Date> values) {
            addCriterion("exam_date in", values, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotIn(List<Date> values) {
            addCriterion("exam_date not in", values, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateBetween(Date value1, Date value2) {
            addCriterion("exam_date between", value1, value2, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotBetween(Date value1, Date value2) {
            addCriterion("exam_date not between", value1, value2, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamStatusIsNull() {
            addCriterion("exam_status is null");
            return (Criteria) this;
        }

        public Criteria andExamStatusIsNotNull() {
            addCriterion("exam_status is not null");
            return (Criteria) this;
        }

        public Criteria andExamStatusEqualTo(String value) {
            addCriterion("exam_status =", value, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusNotEqualTo(String value) {
            addCriterion("exam_status <>", value, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusGreaterThan(String value) {
            addCriterion("exam_status >", value, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusGreaterThanOrEqualTo(String value) {
            addCriterion("exam_status >=", value, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusLessThan(String value) {
            addCriterion("exam_status <", value, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusLessThanOrEqualTo(String value) {
            addCriterion("exam_status <=", value, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusLike(String value) {
            addCriterion("exam_status like", value, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusNotLike(String value) {
            addCriterion("exam_status not like", value, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusIn(List<String> values) {
            addCriterion("exam_status in", values, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusNotIn(List<String> values) {
            addCriterion("exam_status not in", values, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusBetween(String value1, String value2) {
            addCriterion("exam_status between", value1, value2, "examStatus");
            return (Criteria) this;
        }

        public Criteria andExamStatusNotBetween(String value1, String value2) {
            addCriterion("exam_status not between", value1, value2, "examStatus");
            return (Criteria) this;
        }

        public Criteria andVerifierIsNull() {
            addCriterion("verifier is null");
            return (Criteria) this;
        }

        public Criteria andVerifierIsNotNull() {
            addCriterion("verifier is not null");
            return (Criteria) this;
        }

        public Criteria andVerifierEqualTo(String value) {
            addCriterion("verifier =", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotEqualTo(String value) {
            addCriterion("verifier <>", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierGreaterThan(String value) {
            addCriterion("verifier >", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierGreaterThanOrEqualTo(String value) {
            addCriterion("verifier >=", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLessThan(String value) {
            addCriterion("verifier <", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLessThanOrEqualTo(String value) {
            addCriterion("verifier <=", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLike(String value) {
            addCriterion("verifier like", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotLike(String value) {
            addCriterion("verifier not like", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierIn(List<String> values) {
            addCriterion("verifier in", values, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotIn(List<String> values) {
            addCriterion("verifier not in", values, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierBetween(String value1, String value2) {
            addCriterion("verifier between", value1, value2, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotBetween(String value1, String value2) {
            addCriterion("verifier not between", value1, value2, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNameIsNull() {
            addCriterion("verifier_name is null");
            return (Criteria) this;
        }

        public Criteria andVerifierNameIsNotNull() {
            addCriterion("verifier_name is not null");
            return (Criteria) this;
        }

        public Criteria andVerifierNameEqualTo(String value) {
            addCriterion("verifier_name =", value, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameNotEqualTo(String value) {
            addCriterion("verifier_name <>", value, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameGreaterThan(String value) {
            addCriterion("verifier_name >", value, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameGreaterThanOrEqualTo(String value) {
            addCriterion("verifier_name >=", value, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameLessThan(String value) {
            addCriterion("verifier_name <", value, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameLessThanOrEqualTo(String value) {
            addCriterion("verifier_name <=", value, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameLike(String value) {
            addCriterion("verifier_name like", value, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameNotLike(String value) {
            addCriterion("verifier_name not like", value, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameIn(List<String> values) {
            addCriterion("verifier_name in", values, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameNotIn(List<String> values) {
            addCriterion("verifier_name not in", values, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameBetween(String value1, String value2) {
            addCriterion("verifier_name between", value1, value2, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameNotBetween(String value1, String value2) {
            addCriterion("verifier_name not between", value1, value2, "verifierName");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(String value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(String value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(String value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(String value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(String value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(String value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLike(String value) {
            addCriterion("site_id like", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotLike(String value) {
            addCriterion("site_id not like", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<String> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<String> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(String value1, String value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(String value1, String value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNull() {
            addCriterion("site_name is null");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNotNull() {
            addCriterion("site_name is not null");
            return (Criteria) this;
        }

        public Criteria andSiteNameEqualTo(String value) {
            addCriterion("site_name =", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotEqualTo(String value) {
            addCriterion("site_name <>", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThan(String value) {
            addCriterion("site_name >", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("site_name >=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThan(String value) {
            addCriterion("site_name <", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThanOrEqualTo(String value) {
            addCriterion("site_name <=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLike(String value) {
            addCriterion("site_name like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotLike(String value) {
            addCriterion("site_name not like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameIn(List<String> values) {
            addCriterion("site_name in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotIn(List<String> values) {
            addCriterion("site_name not in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameBetween(String value1, String value2) {
            addCriterion("site_name between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotBetween(String value1, String value2) {
            addCriterion("site_name not between", value1, value2, "siteName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sitecycleexam
     *
     * @mbg.generated do_not_delete_during_merge Sat Apr 25 10:03:36 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sitecycleexam
     *
     * @mbg.generated Sat Apr 25 10:03:36 CST 2020
     */
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