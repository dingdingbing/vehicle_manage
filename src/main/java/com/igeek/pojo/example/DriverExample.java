package com.igeek.pojo.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DriverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DriverExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDriveridIsNull() {
            addCriterion("driverId is null");
            return (Criteria) this;
        }

        public Criteria andDriveridIsNotNull() {
            addCriterion("driverId is not null");
            return (Criteria) this;
        }

        public Criteria andDriveridEqualTo(Integer value) {
            addCriterion("driverId =", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotEqualTo(Integer value) {
            addCriterion("driverId <>", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridGreaterThan(Integer value) {
            addCriterion("driverId >", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridGreaterThanOrEqualTo(Integer value) {
            addCriterion("driverId >=", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridLessThan(Integer value) {
            addCriterion("driverId <", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridLessThanOrEqualTo(Integer value) {
            addCriterion("driverId <=", value, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridIn(List<Integer> values) {
            addCriterion("driverId in", values, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotIn(List<Integer> values) {
            addCriterion("driverId not in", values, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridBetween(Integer value1, Integer value2) {
            addCriterion("driverId between", value1, value2, "driverid");
            return (Criteria) this;
        }

        public Criteria andDriveridNotBetween(Integer value1, Integer value2) {
            addCriterion("driverId not between", value1, value2, "driverid");
            return (Criteria) this;
        }

        public Criteria andDrivernameIsNull() {
            addCriterion("driverName is null");
            return (Criteria) this;
        }

        public Criteria andDrivernameIsNotNull() {
            addCriterion("driverName is not null");
            return (Criteria) this;
        }

        public Criteria andDrivernameEqualTo(String value) {
            addCriterion("driverName =", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotEqualTo(String value) {
            addCriterion("driverName <>", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameGreaterThan(String value) {
            addCriterion("driverName >", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameGreaterThanOrEqualTo(String value) {
            addCriterion("driverName >=", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLessThan(String value) {
            addCriterion("driverName <", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLessThanOrEqualTo(String value) {
            addCriterion("driverName <=", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLike(String value) {
            addCriterion("driverName like", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotLike(String value) {
            addCriterion("driverName not like", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameIn(List<String> values) {
            addCriterion("driverName in", values, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotIn(List<String> values) {
            addCriterion("driverName not in", values, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameBetween(String value1, String value2) {
            addCriterion("driverName between", value1, value2, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotBetween(String value1, String value2) {
            addCriterion("driverName not between", value1, value2, "drivername");
            return (Criteria) this;
        }

        public Criteria andDriverageIsNull() {
            addCriterion("driverAge is null");
            return (Criteria) this;
        }

        public Criteria andDriverageIsNotNull() {
            addCriterion("driverAge is not null");
            return (Criteria) this;
        }

        public Criteria andDriverageEqualTo(Integer value) {
            addCriterion("driverAge =", value, "driverage");
            return (Criteria) this;
        }

        public Criteria andDriverageNotEqualTo(Integer value) {
            addCriterion("driverAge <>", value, "driverage");
            return (Criteria) this;
        }

        public Criteria andDriverageGreaterThan(Integer value) {
            addCriterion("driverAge >", value, "driverage");
            return (Criteria) this;
        }

        public Criteria andDriverageGreaterThanOrEqualTo(Integer value) {
            addCriterion("driverAge >=", value, "driverage");
            return (Criteria) this;
        }

        public Criteria andDriverageLessThan(Integer value) {
            addCriterion("driverAge <", value, "driverage");
            return (Criteria) this;
        }

        public Criteria andDriverageLessThanOrEqualTo(Integer value) {
            addCriterion("driverAge <=", value, "driverage");
            return (Criteria) this;
        }

        public Criteria andDriverageIn(List<Integer> values) {
            addCriterion("driverAge in", values, "driverage");
            return (Criteria) this;
        }

        public Criteria andDriverageNotIn(List<Integer> values) {
            addCriterion("driverAge not in", values, "driverage");
            return (Criteria) this;
        }

        public Criteria andDriverageBetween(Integer value1, Integer value2) {
            addCriterion("driverAge between", value1, value2, "driverage");
            return (Criteria) this;
        }

        public Criteria andDriverageNotBetween(Integer value1, Integer value2) {
            addCriterion("driverAge not between", value1, value2, "driverage");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNull() {
            addCriterion("license is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("license is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(String value) {
            addCriterion("license =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(String value) {
            addCriterion("license <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(String value) {
            addCriterion("license >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("license >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(String value) {
            addCriterion("license <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value) {
            addCriterion("license <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLike(String value) {
            addCriterion("license like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotLike(String value) {
            addCriterion("license not like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<String> values) {
            addCriterion("license in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<String> values) {
            addCriterion("license not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(String value1, String value2) {
            addCriterion("license between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2) {
            addCriterion("license not between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andDrivingageIsNull() {
            addCriterion("drivingAge is null");
            return (Criteria) this;
        }

        public Criteria andDrivingageIsNotNull() {
            addCriterion("drivingAge is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingageEqualTo(Integer value) {
            addCriterion("drivingAge =", value, "drivingage");
            return (Criteria) this;
        }

        public Criteria andDrivingageNotEqualTo(Integer value) {
            addCriterion("drivingAge <>", value, "drivingage");
            return (Criteria) this;
        }

        public Criteria andDrivingageGreaterThan(Integer value) {
            addCriterion("drivingAge >", value, "drivingage");
            return (Criteria) this;
        }

        public Criteria andDrivingageGreaterThanOrEqualTo(Integer value) {
            addCriterion("drivingAge >=", value, "drivingage");
            return (Criteria) this;
        }

        public Criteria andDrivingageLessThan(Integer value) {
            addCriterion("drivingAge <", value, "drivingage");
            return (Criteria) this;
        }

        public Criteria andDrivingageLessThanOrEqualTo(Integer value) {
            addCriterion("drivingAge <=", value, "drivingage");
            return (Criteria) this;
        }

        public Criteria andDrivingageIn(List<Integer> values) {
            addCriterion("drivingAge in", values, "drivingage");
            return (Criteria) this;
        }

        public Criteria andDrivingageNotIn(List<Integer> values) {
            addCriterion("drivingAge not in", values, "drivingage");
            return (Criteria) this;
        }

        public Criteria andDrivingageBetween(Integer value1, Integer value2) {
            addCriterion("drivingAge between", value1, value2, "drivingage");
            return (Criteria) this;
        }

        public Criteria andDrivingageNotBetween(Integer value1, Integer value2) {
            addCriterion("drivingAge not between", value1, value2, "drivingage");
            return (Criteria) this;
        }

        public Criteria andAssessmentIsNull() {
            addCriterion("assessment is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentIsNotNull() {
            addCriterion("assessment is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentEqualTo(String value) {
            addCriterion("assessment =", value, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentNotEqualTo(String value) {
            addCriterion("assessment <>", value, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentGreaterThan(String value) {
            addCriterion("assessment >", value, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentGreaterThanOrEqualTo(String value) {
            addCriterion("assessment >=", value, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentLessThan(String value) {
            addCriterion("assessment <", value, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentLessThanOrEqualTo(String value) {
            addCriterion("assessment <=", value, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentLike(String value) {
            addCriterion("assessment like", value, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentNotLike(String value) {
            addCriterion("assessment not like", value, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentIn(List<String> values) {
            addCriterion("assessment in", values, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentNotIn(List<String> values) {
            addCriterion("assessment not in", values, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentBetween(String value1, String value2) {
            addCriterion("assessment between", value1, value2, "assessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentNotBetween(String value1, String value2) {
            addCriterion("assessment not between", value1, value2, "assessment");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andSfzzmIsNull() {
            addCriterion("sfzzm is null");
            return (Criteria) this;
        }

        public Criteria andSfzzmIsNotNull() {
            addCriterion("sfzzm is not null");
            return (Criteria) this;
        }

        public Criteria andSfzzmEqualTo(String value) {
            addCriterion("sfzzm =", value, "sfzzm");
            return (Criteria) this;
        }

        public Criteria andSfzzmNotEqualTo(String value) {
            addCriterion("sfzzm <>", value, "sfzzm");
            return (Criteria) this;
        }

        public Criteria andSfzzmGreaterThan(String value) {
            addCriterion("sfzzm >", value, "sfzzm");
            return (Criteria) this;
        }

        public Criteria andSfzzmGreaterThanOrEqualTo(String value) {
            addCriterion("sfzzm >=", value, "sfzzm");
            return (Criteria) this;
        }

        public Criteria andSfzzmLessThan(String value) {
            addCriterion("sfzzm <", value, "sfzzm");
            return (Criteria) this;
        }

        public Criteria andSfzzmLessThanOrEqualTo(String value) {
            addCriterion("sfzzm <=", value, "sfzzm");
            return (Criteria) this;
        }

        public Criteria andSfzzmLike(String value) {
            addCriterion("sfzzm like", value, "sfzzm");
            return (Criteria) this;
        }

        public Criteria andSfzzmNotLike(String value) {
            addCriterion("sfzzm not like", value, "sfzzm");
            return (Criteria) this;
        }

        public Criteria andSfzzmIn(List<String> values) {
            addCriterion("sfzzm in", values, "sfzzm");
            return (Criteria) this;
        }

        public Criteria andSfzzmNotIn(List<String> values) {
            addCriterion("sfzzm not in", values, "sfzzm");
            return (Criteria) this;
        }

        public Criteria andSfzzmBetween(String value1, String value2) {
            addCriterion("sfzzm between", value1, value2, "sfzzm");
            return (Criteria) this;
        }

        public Criteria andSfzzmNotBetween(String value1, String value2) {
            addCriterion("sfzzm not between", value1, value2, "sfzzm");
            return (Criteria) this;
        }

        public Criteria andSfzfmIsNull() {
            addCriterion("sfzfm is null");
            return (Criteria) this;
        }

        public Criteria andSfzfmIsNotNull() {
            addCriterion("sfzfm is not null");
            return (Criteria) this;
        }

        public Criteria andSfzfmEqualTo(String value) {
            addCriterion("sfzfm =", value, "sfzfm");
            return (Criteria) this;
        }

        public Criteria andSfzfmNotEqualTo(String value) {
            addCriterion("sfzfm <>", value, "sfzfm");
            return (Criteria) this;
        }

        public Criteria andSfzfmGreaterThan(String value) {
            addCriterion("sfzfm >", value, "sfzfm");
            return (Criteria) this;
        }

        public Criteria andSfzfmGreaterThanOrEqualTo(String value) {
            addCriterion("sfzfm >=", value, "sfzfm");
            return (Criteria) this;
        }

        public Criteria andSfzfmLessThan(String value) {
            addCriterion("sfzfm <", value, "sfzfm");
            return (Criteria) this;
        }

        public Criteria andSfzfmLessThanOrEqualTo(String value) {
            addCriterion("sfzfm <=", value, "sfzfm");
            return (Criteria) this;
        }

        public Criteria andSfzfmLike(String value) {
            addCriterion("sfzfm like", value, "sfzfm");
            return (Criteria) this;
        }

        public Criteria andSfzfmNotLike(String value) {
            addCriterion("sfzfm not like", value, "sfzfm");
            return (Criteria) this;
        }

        public Criteria andSfzfmIn(List<String> values) {
            addCriterion("sfzfm in", values, "sfzfm");
            return (Criteria) this;
        }

        public Criteria andSfzfmNotIn(List<String> values) {
            addCriterion("sfzfm not in", values, "sfzfm");
            return (Criteria) this;
        }

        public Criteria andSfzfmBetween(String value1, String value2) {
            addCriterion("sfzfm between", value1, value2, "sfzfm");
            return (Criteria) this;
        }

        public Criteria andSfzfmNotBetween(String value1, String value2) {
            addCriterion("sfzfm not between", value1, value2, "sfzfm");
            return (Criteria) this;
        }

        public Criteria andJszzmIsNull() {
            addCriterion("jszzm is null");
            return (Criteria) this;
        }

        public Criteria andJszzmIsNotNull() {
            addCriterion("jszzm is not null");
            return (Criteria) this;
        }

        public Criteria andJszzmEqualTo(String value) {
            addCriterion("jszzm =", value, "jszzm");
            return (Criteria) this;
        }

        public Criteria andJszzmNotEqualTo(String value) {
            addCriterion("jszzm <>", value, "jszzm");
            return (Criteria) this;
        }

        public Criteria andJszzmGreaterThan(String value) {
            addCriterion("jszzm >", value, "jszzm");
            return (Criteria) this;
        }

        public Criteria andJszzmGreaterThanOrEqualTo(String value) {
            addCriterion("jszzm >=", value, "jszzm");
            return (Criteria) this;
        }

        public Criteria andJszzmLessThan(String value) {
            addCriterion("jszzm <", value, "jszzm");
            return (Criteria) this;
        }

        public Criteria andJszzmLessThanOrEqualTo(String value) {
            addCriterion("jszzm <=", value, "jszzm");
            return (Criteria) this;
        }

        public Criteria andJszzmLike(String value) {
            addCriterion("jszzm like", value, "jszzm");
            return (Criteria) this;
        }

        public Criteria andJszzmNotLike(String value) {
            addCriterion("jszzm not like", value, "jszzm");
            return (Criteria) this;
        }

        public Criteria andJszzmIn(List<String> values) {
            addCriterion("jszzm in", values, "jszzm");
            return (Criteria) this;
        }

        public Criteria andJszzmNotIn(List<String> values) {
            addCriterion("jszzm not in", values, "jszzm");
            return (Criteria) this;
        }

        public Criteria andJszzmBetween(String value1, String value2) {
            addCriterion("jszzm between", value1, value2, "jszzm");
            return (Criteria) this;
        }

        public Criteria andJszzmNotBetween(String value1, String value2) {
            addCriterion("jszzm not between", value1, value2, "jszzm");
            return (Criteria) this;
        }

        public Criteria andJszfmIsNull() {
            addCriterion("jszfm is null");
            return (Criteria) this;
        }

        public Criteria andJszfmIsNotNull() {
            addCriterion("jszfm is not null");
            return (Criteria) this;
        }

        public Criteria andJszfmEqualTo(String value) {
            addCriterion("jszfm =", value, "jszfm");
            return (Criteria) this;
        }

        public Criteria andJszfmNotEqualTo(String value) {
            addCriterion("jszfm <>", value, "jszfm");
            return (Criteria) this;
        }

        public Criteria andJszfmGreaterThan(String value) {
            addCriterion("jszfm >", value, "jszfm");
            return (Criteria) this;
        }

        public Criteria andJszfmGreaterThanOrEqualTo(String value) {
            addCriterion("jszfm >=", value, "jszfm");
            return (Criteria) this;
        }

        public Criteria andJszfmLessThan(String value) {
            addCriterion("jszfm <", value, "jszfm");
            return (Criteria) this;
        }

        public Criteria andJszfmLessThanOrEqualTo(String value) {
            addCriterion("jszfm <=", value, "jszfm");
            return (Criteria) this;
        }

        public Criteria andJszfmLike(String value) {
            addCriterion("jszfm like", value, "jszfm");
            return (Criteria) this;
        }

        public Criteria andJszfmNotLike(String value) {
            addCriterion("jszfm not like", value, "jszfm");
            return (Criteria) this;
        }

        public Criteria andJszfmIn(List<String> values) {
            addCriterion("jszfm in", values, "jszfm");
            return (Criteria) this;
        }

        public Criteria andJszfmNotIn(List<String> values) {
            addCriterion("jszfm not in", values, "jszfm");
            return (Criteria) this;
        }

        public Criteria andJszfmBetween(String value1, String value2) {
            addCriterion("jszfm between", value1, value2, "jszfm");
            return (Criteria) this;
        }

        public Criteria andJszfmNotBetween(String value1, String value2) {
            addCriterion("jszfm not between", value1, value2, "jszfm");
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