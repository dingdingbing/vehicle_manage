package com.igeek.pojo.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FuelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FuelExample() {
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

        public Criteria andRegistrationnumberIsNull() {
            addCriterion("registrationNumber is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberIsNotNull() {
            addCriterion("registrationNumber is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberEqualTo(Integer value) {
            addCriterion("registrationNumber =", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberNotEqualTo(Integer value) {
            addCriterion("registrationNumber <>", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberGreaterThan(Integer value) {
            addCriterion("registrationNumber >", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("registrationNumber >=", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberLessThan(Integer value) {
            addCriterion("registrationNumber <", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberLessThanOrEqualTo(Integer value) {
            addCriterion("registrationNumber <=", value, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberIn(List<Integer> values) {
            addCriterion("registrationNumber in", values, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberNotIn(List<Integer> values) {
            addCriterion("registrationNumber not in", values, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberBetween(Integer value1, Integer value2) {
            addCriterion("registrationNumber between", value1, value2, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("registrationNumber not between", value1, value2, "registrationnumber");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNull() {
            addCriterion("applicant is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNotNull() {
            addCriterion("applicant is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantEqualTo(String value) {
            addCriterion("applicant =", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotEqualTo(String value) {
            addCriterion("applicant <>", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThan(String value) {
            addCriterion("applicant >", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThanOrEqualTo(String value) {
            addCriterion("applicant >=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThan(String value) {
            addCriterion("applicant <", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThanOrEqualTo(String value) {
            addCriterion("applicant <=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLike(String value) {
            addCriterion("applicant like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotLike(String value) {
            addCriterion("applicant not like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantIn(List<String> values) {
            addCriterion("applicant in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotIn(List<String> values) {
            addCriterion("applicant not in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantBetween(String value1, String value2) {
            addCriterion("applicant between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotBetween(String value1, String value2) {
            addCriterion("applicant not between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicationdateIsNull() {
            addCriterion("applicationDate is null");
            return (Criteria) this;
        }

        public Criteria andApplicationdateIsNotNull() {
            addCriterion("applicationDate is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationdateEqualTo(Date value) {
            addCriterionForJDBCDate("applicationDate =", value, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("applicationDate <>", value, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateGreaterThan(Date value) {
            addCriterionForJDBCDate("applicationDate >", value, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applicationDate >=", value, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateLessThan(Date value) {
            addCriterionForJDBCDate("applicationDate <", value, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applicationDate <=", value, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateIn(List<Date> values) {
            addCriterionForJDBCDate("applicationDate in", values, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("applicationDate not in", values, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applicationDate between", value1, value2, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applicationDate not between", value1, value2, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andCarbrandIsNull() {
            addCriterion("carBrand is null");
            return (Criteria) this;
        }

        public Criteria andCarbrandIsNotNull() {
            addCriterion("carBrand is not null");
            return (Criteria) this;
        }

        public Criteria andCarbrandEqualTo(String value) {
            addCriterion("carBrand =", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotEqualTo(String value) {
            addCriterion("carBrand <>", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandGreaterThan(String value) {
            addCriterion("carBrand >", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandGreaterThanOrEqualTo(String value) {
            addCriterion("carBrand >=", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandLessThan(String value) {
            addCriterion("carBrand <", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandLessThanOrEqualTo(String value) {
            addCriterion("carBrand <=", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandLike(String value) {
            addCriterion("carBrand like", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotLike(String value) {
            addCriterion("carBrand not like", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandIn(List<String> values) {
            addCriterion("carBrand in", values, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotIn(List<String> values) {
            addCriterion("carBrand not in", values, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandBetween(String value1, String value2) {
            addCriterion("carBrand between", value1, value2, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotBetween(String value1, String value2) {
            addCriterion("carBrand not between", value1, value2, "carbrand");
            return (Criteria) this;
        }

        public Criteria andRefuelingdateIsNull() {
            addCriterion("refuelingDate is null");
            return (Criteria) this;
        }

        public Criteria andRefuelingdateIsNotNull() {
            addCriterion("refuelingDate is not null");
            return (Criteria) this;
        }

        public Criteria andRefuelingdateEqualTo(Date value) {
            addCriterionForJDBCDate("refuelingDate =", value, "refuelingdate");
            return (Criteria) this;
        }

        public Criteria andRefuelingdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("refuelingDate <>", value, "refuelingdate");
            return (Criteria) this;
        }

        public Criteria andRefuelingdateGreaterThan(Date value) {
            addCriterionForJDBCDate("refuelingDate >", value, "refuelingdate");
            return (Criteria) this;
        }

        public Criteria andRefuelingdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("refuelingDate >=", value, "refuelingdate");
            return (Criteria) this;
        }

        public Criteria andRefuelingdateLessThan(Date value) {
            addCriterionForJDBCDate("refuelingDate <", value, "refuelingdate");
            return (Criteria) this;
        }

        public Criteria andRefuelingdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("refuelingDate <=", value, "refuelingdate");
            return (Criteria) this;
        }

        public Criteria andRefuelingdateIn(List<Date> values) {
            addCriterionForJDBCDate("refuelingDate in", values, "refuelingdate");
            return (Criteria) this;
        }

        public Criteria andRefuelingdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("refuelingDate not in", values, "refuelingdate");
            return (Criteria) this;
        }

        public Criteria andRefuelingdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("refuelingDate between", value1, value2, "refuelingdate");
            return (Criteria) this;
        }

        public Criteria andRefuelingdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("refuelingDate not between", value1, value2, "refuelingdate");
            return (Criteria) this;
        }

        public Criteria andRefuelingcapacityIsNull() {
            addCriterion("refuelingCapacity is null");
            return (Criteria) this;
        }

        public Criteria andRefuelingcapacityIsNotNull() {
            addCriterion("refuelingCapacity is not null");
            return (Criteria) this;
        }

        public Criteria andRefuelingcapacityEqualTo(BigDecimal value) {
            addCriterion("refuelingCapacity =", value, "refuelingcapacity");
            return (Criteria) this;
        }

        public Criteria andRefuelingcapacityNotEqualTo(BigDecimal value) {
            addCriterion("refuelingCapacity <>", value, "refuelingcapacity");
            return (Criteria) this;
        }

        public Criteria andRefuelingcapacityGreaterThan(BigDecimal value) {
            addCriterion("refuelingCapacity >", value, "refuelingcapacity");
            return (Criteria) this;
        }

        public Criteria andRefuelingcapacityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refuelingCapacity >=", value, "refuelingcapacity");
            return (Criteria) this;
        }

        public Criteria andRefuelingcapacityLessThan(BigDecimal value) {
            addCriterion("refuelingCapacity <", value, "refuelingcapacity");
            return (Criteria) this;
        }

        public Criteria andRefuelingcapacityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refuelingCapacity <=", value, "refuelingcapacity");
            return (Criteria) this;
        }

        public Criteria andRefuelingcapacityIn(List<BigDecimal> values) {
            addCriterion("refuelingCapacity in", values, "refuelingcapacity");
            return (Criteria) this;
        }

        public Criteria andRefuelingcapacityNotIn(List<BigDecimal> values) {
            addCriterion("refuelingCapacity not in", values, "refuelingcapacity");
            return (Criteria) this;
        }

        public Criteria andRefuelingcapacityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refuelingCapacity between", value1, value2, "refuelingcapacity");
            return (Criteria) this;
        }

        public Criteria andRefuelingcapacityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refuelingCapacity not between", value1, value2, "refuelingcapacity");
            return (Criteria) this;
        }

        public Criteria andFuelamountIsNull() {
            addCriterion("fuelAmount is null");
            return (Criteria) this;
        }

        public Criteria andFuelamountIsNotNull() {
            addCriterion("fuelAmount is not null");
            return (Criteria) this;
        }

        public Criteria andFuelamountEqualTo(BigDecimal value) {
            addCriterion("fuelAmount =", value, "fuelamount");
            return (Criteria) this;
        }

        public Criteria andFuelamountNotEqualTo(BigDecimal value) {
            addCriterion("fuelAmount <>", value, "fuelamount");
            return (Criteria) this;
        }

        public Criteria andFuelamountGreaterThan(BigDecimal value) {
            addCriterion("fuelAmount >", value, "fuelamount");
            return (Criteria) this;
        }

        public Criteria andFuelamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fuelAmount >=", value, "fuelamount");
            return (Criteria) this;
        }

        public Criteria andFuelamountLessThan(BigDecimal value) {
            addCriterion("fuelAmount <", value, "fuelamount");
            return (Criteria) this;
        }

        public Criteria andFuelamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fuelAmount <=", value, "fuelamount");
            return (Criteria) this;
        }

        public Criteria andFuelamountIn(List<BigDecimal> values) {
            addCriterion("fuelAmount in", values, "fuelamount");
            return (Criteria) this;
        }

        public Criteria andFuelamountNotIn(List<BigDecimal> values) {
            addCriterion("fuelAmount not in", values, "fuelamount");
            return (Criteria) this;
        }

        public Criteria andFuelamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuelAmount between", value1, value2, "fuelamount");
            return (Criteria) this;
        }

        public Criteria andFuelamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuelAmount not between", value1, value2, "fuelamount");
            return (Criteria) this;
        }

        public Criteria andChargepersonIsNull() {
            addCriterion("chargePerson is null");
            return (Criteria) this;
        }

        public Criteria andChargepersonIsNotNull() {
            addCriterion("chargePerson is not null");
            return (Criteria) this;
        }

        public Criteria andChargepersonEqualTo(String value) {
            addCriterion("chargePerson =", value, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonNotEqualTo(String value) {
            addCriterion("chargePerson <>", value, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonGreaterThan(String value) {
            addCriterion("chargePerson >", value, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonGreaterThanOrEqualTo(String value) {
            addCriterion("chargePerson >=", value, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonLessThan(String value) {
            addCriterion("chargePerson <", value, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonLessThanOrEqualTo(String value) {
            addCriterion("chargePerson <=", value, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonLike(String value) {
            addCriterion("chargePerson like", value, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonNotLike(String value) {
            addCriterion("chargePerson not like", value, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonIn(List<String> values) {
            addCriterion("chargePerson in", values, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonNotIn(List<String> values) {
            addCriterion("chargePerson not in", values, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonBetween(String value1, String value2) {
            addCriterion("chargePerson between", value1, value2, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andChargepersonNotBetween(String value1, String value2) {
            addCriterion("chargePerson not between", value1, value2, "chargeperson");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andVoucherIsNull() {
            addCriterion("voucher is null");
            return (Criteria) this;
        }

        public Criteria andVoucherIsNotNull() {
            addCriterion("voucher is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherEqualTo(String value) {
            addCriterion("voucher =", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherNotEqualTo(String value) {
            addCriterion("voucher <>", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherGreaterThan(String value) {
            addCriterion("voucher >", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherGreaterThanOrEqualTo(String value) {
            addCriterion("voucher >=", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherLessThan(String value) {
            addCriterion("voucher <", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherLessThanOrEqualTo(String value) {
            addCriterion("voucher <=", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherLike(String value) {
            addCriterion("voucher like", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherNotLike(String value) {
            addCriterion("voucher not like", value, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherIn(List<String> values) {
            addCriterion("voucher in", values, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherNotIn(List<String> values) {
            addCriterion("voucher not in", values, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherBetween(String value1, String value2) {
            addCriterion("voucher between", value1, value2, "voucher");
            return (Criteria) this;
        }

        public Criteria andVoucherNotBetween(String value1, String value2) {
            addCriterion("voucher not between", value1, value2, "voucher");
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