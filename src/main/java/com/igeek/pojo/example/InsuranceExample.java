package com.igeek.pojo.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InsuranceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InsuranceExample() {
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

        public Criteria andInsurancenoIsNull() {
            addCriterion("insuranceNo is null");
            return (Criteria) this;
        }

        public Criteria andInsurancenoIsNotNull() {
            addCriterion("insuranceNo is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancenoEqualTo(Integer value) {
            addCriterion("insuranceNo =", value, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoNotEqualTo(Integer value) {
            addCriterion("insuranceNo <>", value, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoGreaterThan(Integer value) {
            addCriterion("insuranceNo >", value, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("insuranceNo >=", value, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoLessThan(Integer value) {
            addCriterion("insuranceNo <", value, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoLessThanOrEqualTo(Integer value) {
            addCriterion("insuranceNo <=", value, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoIn(List<Integer> values) {
            addCriterion("insuranceNo in", values, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoNotIn(List<Integer> values) {
            addCriterion("insuranceNo not in", values, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoBetween(Integer value1, Integer value2) {
            addCriterion("insuranceNo between", value1, value2, "insuranceno");
            return (Criteria) this;
        }

        public Criteria andInsurancenoNotBetween(Integer value1, Integer value2) {
            addCriterion("insuranceNo not between", value1, value2, "insuranceno");
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

        public Criteria andThemeIsNull() {
            addCriterion("theme is null");
            return (Criteria) this;
        }

        public Criteria andThemeIsNotNull() {
            addCriterion("theme is not null");
            return (Criteria) this;
        }

        public Criteria andThemeEqualTo(String value) {
            addCriterion("theme =", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotEqualTo(String value) {
            addCriterion("theme <>", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThan(String value) {
            addCriterion("theme >", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThanOrEqualTo(String value) {
            addCriterion("theme >=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThan(String value) {
            addCriterion("theme <", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThanOrEqualTo(String value) {
            addCriterion("theme <=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLike(String value) {
            addCriterion("theme like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotLike(String value) {
            addCriterion("theme not like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeIn(List<String> values) {
            addCriterion("theme in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotIn(List<String> values) {
            addCriterion("theme not in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeBetween(String value1, String value2) {
            addCriterion("theme between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotBetween(String value1, String value2) {
            addCriterion("theme not between", value1, value2, "theme");
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

        public Criteria andFirstinsurancepremiumIsNull() {
            addCriterion("firstInsurancePremium is null");
            return (Criteria) this;
        }

        public Criteria andFirstinsurancepremiumIsNotNull() {
            addCriterion("firstInsurancePremium is not null");
            return (Criteria) this;
        }

        public Criteria andFirstinsurancepremiumEqualTo(Integer value) {
            addCriterion("firstInsurancePremium =", value, "firstinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFirstinsurancepremiumNotEqualTo(Integer value) {
            addCriterion("firstInsurancePremium <>", value, "firstinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFirstinsurancepremiumGreaterThan(Integer value) {
            addCriterion("firstInsurancePremium >", value, "firstinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFirstinsurancepremiumGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstInsurancePremium >=", value, "firstinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFirstinsurancepremiumLessThan(Integer value) {
            addCriterion("firstInsurancePremium <", value, "firstinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFirstinsurancepremiumLessThanOrEqualTo(Integer value) {
            addCriterion("firstInsurancePremium <=", value, "firstinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFirstinsurancepremiumIn(List<Integer> values) {
            addCriterion("firstInsurancePremium in", values, "firstinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFirstinsurancepremiumNotIn(List<Integer> values) {
            addCriterion("firstInsurancePremium not in", values, "firstinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFirstinsurancepremiumBetween(Integer value1, Integer value2) {
            addCriterion("firstInsurancePremium between", value1, value2, "firstinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFirstinsurancepremiumNotBetween(Integer value1, Integer value2) {
            addCriterion("firstInsurancePremium not between", value1, value2, "firstinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceamountIsNull() {
            addCriterion("firstInsuranceAmount is null");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceamountIsNotNull() {
            addCriterion("firstInsuranceAmount is not null");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceamountEqualTo(Integer value) {
            addCriterion("firstInsuranceAmount =", value, "firstinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceamountNotEqualTo(Integer value) {
            addCriterion("firstInsuranceAmount <>", value, "firstinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceamountGreaterThan(Integer value) {
            addCriterion("firstInsuranceAmount >", value, "firstinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstInsuranceAmount >=", value, "firstinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceamountLessThan(Integer value) {
            addCriterion("firstInsuranceAmount <", value, "firstinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceamountLessThanOrEqualTo(Integer value) {
            addCriterion("firstInsuranceAmount <=", value, "firstinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceamountIn(List<Integer> values) {
            addCriterion("firstInsuranceAmount in", values, "firstinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceamountNotIn(List<Integer> values) {
            addCriterion("firstInsuranceAmount not in", values, "firstinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceamountBetween(Integer value1, Integer value2) {
            addCriterion("firstInsuranceAmount between", value1, value2, "firstinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceamountNotBetween(Integer value1, Integer value2) {
            addCriterion("firstInsuranceAmount not between", value1, value2, "firstinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceremarksIsNull() {
            addCriterion("firstInsuranceRemarks is null");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceremarksIsNotNull() {
            addCriterion("firstInsuranceRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceremarksEqualTo(String value) {
            addCriterion("firstInsuranceRemarks =", value, "firstinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceremarksNotEqualTo(String value) {
            addCriterion("firstInsuranceRemarks <>", value, "firstinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceremarksGreaterThan(String value) {
            addCriterion("firstInsuranceRemarks >", value, "firstinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceremarksGreaterThanOrEqualTo(String value) {
            addCriterion("firstInsuranceRemarks >=", value, "firstinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceremarksLessThan(String value) {
            addCriterion("firstInsuranceRemarks <", value, "firstinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceremarksLessThanOrEqualTo(String value) {
            addCriterion("firstInsuranceRemarks <=", value, "firstinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceremarksLike(String value) {
            addCriterion("firstInsuranceRemarks like", value, "firstinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceremarksNotLike(String value) {
            addCriterion("firstInsuranceRemarks not like", value, "firstinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceremarksIn(List<String> values) {
            addCriterion("firstInsuranceRemarks in", values, "firstinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceremarksNotIn(List<String> values) {
            addCriterion("firstInsuranceRemarks not in", values, "firstinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceremarksBetween(String value1, String value2) {
            addCriterion("firstInsuranceRemarks between", value1, value2, "firstinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFirstinsuranceremarksNotBetween(String value1, String value2) {
            addCriterion("firstInsuranceRemarks not between", value1, value2, "firstinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSecondinsurancepremiumIsNull() {
            addCriterion("secondInsurancePremium is null");
            return (Criteria) this;
        }

        public Criteria andSecondinsurancepremiumIsNotNull() {
            addCriterion("secondInsurancePremium is not null");
            return (Criteria) this;
        }

        public Criteria andSecondinsurancepremiumEqualTo(Integer value) {
            addCriterion("secondInsurancePremium =", value, "secondinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSecondinsurancepremiumNotEqualTo(Integer value) {
            addCriterion("secondInsurancePremium <>", value, "secondinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSecondinsurancepremiumGreaterThan(Integer value) {
            addCriterion("secondInsurancePremium >", value, "secondinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSecondinsurancepremiumGreaterThanOrEqualTo(Integer value) {
            addCriterion("secondInsurancePremium >=", value, "secondinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSecondinsurancepremiumLessThan(Integer value) {
            addCriterion("secondInsurancePremium <", value, "secondinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSecondinsurancepremiumLessThanOrEqualTo(Integer value) {
            addCriterion("secondInsurancePremium <=", value, "secondinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSecondinsurancepremiumIn(List<Integer> values) {
            addCriterion("secondInsurancePremium in", values, "secondinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSecondinsurancepremiumNotIn(List<Integer> values) {
            addCriterion("secondInsurancePremium not in", values, "secondinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSecondinsurancepremiumBetween(Integer value1, Integer value2) {
            addCriterion("secondInsurancePremium between", value1, value2, "secondinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSecondinsurancepremiumNotBetween(Integer value1, Integer value2) {
            addCriterion("secondInsurancePremium not between", value1, value2, "secondinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceamountIsNull() {
            addCriterion("secondInsuranceAmount is null");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceamountIsNotNull() {
            addCriterion("secondInsuranceAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceamountEqualTo(Integer value) {
            addCriterion("secondInsuranceAmount =", value, "secondinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceamountNotEqualTo(Integer value) {
            addCriterion("secondInsuranceAmount <>", value, "secondinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceamountGreaterThan(Integer value) {
            addCriterion("secondInsuranceAmount >", value, "secondinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("secondInsuranceAmount >=", value, "secondinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceamountLessThan(Integer value) {
            addCriterion("secondInsuranceAmount <", value, "secondinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceamountLessThanOrEqualTo(Integer value) {
            addCriterion("secondInsuranceAmount <=", value, "secondinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceamountIn(List<Integer> values) {
            addCriterion("secondInsuranceAmount in", values, "secondinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceamountNotIn(List<Integer> values) {
            addCriterion("secondInsuranceAmount not in", values, "secondinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceamountBetween(Integer value1, Integer value2) {
            addCriterion("secondInsuranceAmount between", value1, value2, "secondinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceamountNotBetween(Integer value1, Integer value2) {
            addCriterion("secondInsuranceAmount not between", value1, value2, "secondinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceremarksIsNull() {
            addCriterion("secondInsuranceRemarks is null");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceremarksIsNotNull() {
            addCriterion("secondInsuranceRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceremarksEqualTo(String value) {
            addCriterion("secondInsuranceRemarks =", value, "secondinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceremarksNotEqualTo(String value) {
            addCriterion("secondInsuranceRemarks <>", value, "secondinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceremarksGreaterThan(String value) {
            addCriterion("secondInsuranceRemarks >", value, "secondinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceremarksGreaterThanOrEqualTo(String value) {
            addCriterion("secondInsuranceRemarks >=", value, "secondinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceremarksLessThan(String value) {
            addCriterion("secondInsuranceRemarks <", value, "secondinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceremarksLessThanOrEqualTo(String value) {
            addCriterion("secondInsuranceRemarks <=", value, "secondinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceremarksLike(String value) {
            addCriterion("secondInsuranceRemarks like", value, "secondinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceremarksNotLike(String value) {
            addCriterion("secondInsuranceRemarks not like", value, "secondinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceremarksIn(List<String> values) {
            addCriterion("secondInsuranceRemarks in", values, "secondinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceremarksNotIn(List<String> values) {
            addCriterion("secondInsuranceRemarks not in", values, "secondinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceremarksBetween(String value1, String value2) {
            addCriterion("secondInsuranceRemarks between", value1, value2, "secondinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSecondinsuranceremarksNotBetween(String value1, String value2) {
            addCriterion("secondInsuranceRemarks not between", value1, value2, "secondinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andThirdinsurancepremiumIsNull() {
            addCriterion("thirdInsurancePremium is null");
            return (Criteria) this;
        }

        public Criteria andThirdinsurancepremiumIsNotNull() {
            addCriterion("thirdInsurancePremium is not null");
            return (Criteria) this;
        }

        public Criteria andThirdinsurancepremiumEqualTo(Integer value) {
            addCriterion("thirdInsurancePremium =", value, "thirdinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andThirdinsurancepremiumNotEqualTo(Integer value) {
            addCriterion("thirdInsurancePremium <>", value, "thirdinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andThirdinsurancepremiumGreaterThan(Integer value) {
            addCriterion("thirdInsurancePremium >", value, "thirdinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andThirdinsurancepremiumGreaterThanOrEqualTo(Integer value) {
            addCriterion("thirdInsurancePremium >=", value, "thirdinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andThirdinsurancepremiumLessThan(Integer value) {
            addCriterion("thirdInsurancePremium <", value, "thirdinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andThirdinsurancepremiumLessThanOrEqualTo(Integer value) {
            addCriterion("thirdInsurancePremium <=", value, "thirdinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andThirdinsurancepremiumIn(List<Integer> values) {
            addCriterion("thirdInsurancePremium in", values, "thirdinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andThirdinsurancepremiumNotIn(List<Integer> values) {
            addCriterion("thirdInsurancePremium not in", values, "thirdinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andThirdinsurancepremiumBetween(Integer value1, Integer value2) {
            addCriterion("thirdInsurancePremium between", value1, value2, "thirdinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andThirdinsurancepremiumNotBetween(Integer value1, Integer value2) {
            addCriterion("thirdInsurancePremium not between", value1, value2, "thirdinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceamountIsNull() {
            addCriterion("thirdInsuranceAmount is null");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceamountIsNotNull() {
            addCriterion("thirdInsuranceAmount is not null");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceamountEqualTo(Integer value) {
            addCriterion("thirdInsuranceAmount =", value, "thirdinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceamountNotEqualTo(Integer value) {
            addCriterion("thirdInsuranceAmount <>", value, "thirdinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceamountGreaterThan(Integer value) {
            addCriterion("thirdInsuranceAmount >", value, "thirdinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("thirdInsuranceAmount >=", value, "thirdinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceamountLessThan(Integer value) {
            addCriterion("thirdInsuranceAmount <", value, "thirdinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceamountLessThanOrEqualTo(Integer value) {
            addCriterion("thirdInsuranceAmount <=", value, "thirdinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceamountIn(List<Integer> values) {
            addCriterion("thirdInsuranceAmount in", values, "thirdinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceamountNotIn(List<Integer> values) {
            addCriterion("thirdInsuranceAmount not in", values, "thirdinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceamountBetween(Integer value1, Integer value2) {
            addCriterion("thirdInsuranceAmount between", value1, value2, "thirdinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceamountNotBetween(Integer value1, Integer value2) {
            addCriterion("thirdInsuranceAmount not between", value1, value2, "thirdinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceremarksIsNull() {
            addCriterion("thirdInsuranceRemarks is null");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceremarksIsNotNull() {
            addCriterion("thirdInsuranceRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceremarksEqualTo(String value) {
            addCriterion("thirdInsuranceRemarks =", value, "thirdinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceremarksNotEqualTo(String value) {
            addCriterion("thirdInsuranceRemarks <>", value, "thirdinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceremarksGreaterThan(String value) {
            addCriterion("thirdInsuranceRemarks >", value, "thirdinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceremarksGreaterThanOrEqualTo(String value) {
            addCriterion("thirdInsuranceRemarks >=", value, "thirdinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceremarksLessThan(String value) {
            addCriterion("thirdInsuranceRemarks <", value, "thirdinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceremarksLessThanOrEqualTo(String value) {
            addCriterion("thirdInsuranceRemarks <=", value, "thirdinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceremarksLike(String value) {
            addCriterion("thirdInsuranceRemarks like", value, "thirdinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceremarksNotLike(String value) {
            addCriterion("thirdInsuranceRemarks not like", value, "thirdinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceremarksIn(List<String> values) {
            addCriterion("thirdInsuranceRemarks in", values, "thirdinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceremarksNotIn(List<String> values) {
            addCriterion("thirdInsuranceRemarks not in", values, "thirdinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceremarksBetween(String value1, String value2) {
            addCriterion("thirdInsuranceRemarks between", value1, value2, "thirdinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andThirdinsuranceremarksNotBetween(String value1, String value2) {
            addCriterion("thirdInsuranceRemarks not between", value1, value2, "thirdinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFourthinsurancepremiumIsNull() {
            addCriterion("fourthInsurancePremium is null");
            return (Criteria) this;
        }

        public Criteria andFourthinsurancepremiumIsNotNull() {
            addCriterion("fourthInsurancePremium is not null");
            return (Criteria) this;
        }

        public Criteria andFourthinsurancepremiumEqualTo(Integer value) {
            addCriterion("fourthInsurancePremium =", value, "fourthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFourthinsurancepremiumNotEqualTo(Integer value) {
            addCriterion("fourthInsurancePremium <>", value, "fourthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFourthinsurancepremiumGreaterThan(Integer value) {
            addCriterion("fourthInsurancePremium >", value, "fourthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFourthinsurancepremiumGreaterThanOrEqualTo(Integer value) {
            addCriterion("fourthInsurancePremium >=", value, "fourthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFourthinsurancepremiumLessThan(Integer value) {
            addCriterion("fourthInsurancePremium <", value, "fourthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFourthinsurancepremiumLessThanOrEqualTo(Integer value) {
            addCriterion("fourthInsurancePremium <=", value, "fourthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFourthinsurancepremiumIn(List<Integer> values) {
            addCriterion("fourthInsurancePremium in", values, "fourthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFourthinsurancepremiumNotIn(List<Integer> values) {
            addCriterion("fourthInsurancePremium not in", values, "fourthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFourthinsurancepremiumBetween(Integer value1, Integer value2) {
            addCriterion("fourthInsurancePremium between", value1, value2, "fourthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFourthinsurancepremiumNotBetween(Integer value1, Integer value2) {
            addCriterion("fourthInsurancePremium not between", value1, value2, "fourthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceamountIsNull() {
            addCriterion("fourthInsuranceAmount is null");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceamountIsNotNull() {
            addCriterion("fourthInsuranceAmount is not null");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceamountEqualTo(Integer value) {
            addCriterion("fourthInsuranceAmount =", value, "fourthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceamountNotEqualTo(Integer value) {
            addCriterion("fourthInsuranceAmount <>", value, "fourthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceamountGreaterThan(Integer value) {
            addCriterion("fourthInsuranceAmount >", value, "fourthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fourthInsuranceAmount >=", value, "fourthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceamountLessThan(Integer value) {
            addCriterion("fourthInsuranceAmount <", value, "fourthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceamountLessThanOrEqualTo(Integer value) {
            addCriterion("fourthInsuranceAmount <=", value, "fourthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceamountIn(List<Integer> values) {
            addCriterion("fourthInsuranceAmount in", values, "fourthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceamountNotIn(List<Integer> values) {
            addCriterion("fourthInsuranceAmount not in", values, "fourthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceamountBetween(Integer value1, Integer value2) {
            addCriterion("fourthInsuranceAmount between", value1, value2, "fourthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceamountNotBetween(Integer value1, Integer value2) {
            addCriterion("fourthInsuranceAmount not between", value1, value2, "fourthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceremarksIsNull() {
            addCriterion("fourthInsuranceRemarks is null");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceremarksIsNotNull() {
            addCriterion("fourthInsuranceRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceremarksEqualTo(String value) {
            addCriterion("fourthInsuranceRemarks =", value, "fourthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceremarksNotEqualTo(String value) {
            addCriterion("fourthInsuranceRemarks <>", value, "fourthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceremarksGreaterThan(String value) {
            addCriterion("fourthInsuranceRemarks >", value, "fourthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceremarksGreaterThanOrEqualTo(String value) {
            addCriterion("fourthInsuranceRemarks >=", value, "fourthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceremarksLessThan(String value) {
            addCriterion("fourthInsuranceRemarks <", value, "fourthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceremarksLessThanOrEqualTo(String value) {
            addCriterion("fourthInsuranceRemarks <=", value, "fourthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceremarksLike(String value) {
            addCriterion("fourthInsuranceRemarks like", value, "fourthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceremarksNotLike(String value) {
            addCriterion("fourthInsuranceRemarks not like", value, "fourthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceremarksIn(List<String> values) {
            addCriterion("fourthInsuranceRemarks in", values, "fourthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceremarksNotIn(List<String> values) {
            addCriterion("fourthInsuranceRemarks not in", values, "fourthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceremarksBetween(String value1, String value2) {
            addCriterion("fourthInsuranceRemarks between", value1, value2, "fourthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFourthinsuranceremarksNotBetween(String value1, String value2) {
            addCriterion("fourthInsuranceRemarks not between", value1, value2, "fourthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFifthinsurancepremiumIsNull() {
            addCriterion("fifthInsurancePremium is null");
            return (Criteria) this;
        }

        public Criteria andFifthinsurancepremiumIsNotNull() {
            addCriterion("fifthInsurancePremium is not null");
            return (Criteria) this;
        }

        public Criteria andFifthinsurancepremiumEqualTo(Integer value) {
            addCriterion("fifthInsurancePremium =", value, "fifthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFifthinsurancepremiumNotEqualTo(Integer value) {
            addCriterion("fifthInsurancePremium <>", value, "fifthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFifthinsurancepremiumGreaterThan(Integer value) {
            addCriterion("fifthInsurancePremium >", value, "fifthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFifthinsurancepremiumGreaterThanOrEqualTo(Integer value) {
            addCriterion("fifthInsurancePremium >=", value, "fifthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFifthinsurancepremiumLessThan(Integer value) {
            addCriterion("fifthInsurancePremium <", value, "fifthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFifthinsurancepremiumLessThanOrEqualTo(Integer value) {
            addCriterion("fifthInsurancePremium <=", value, "fifthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFifthinsurancepremiumIn(List<Integer> values) {
            addCriterion("fifthInsurancePremium in", values, "fifthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFifthinsurancepremiumNotIn(List<Integer> values) {
            addCriterion("fifthInsurancePremium not in", values, "fifthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFifthinsurancepremiumBetween(Integer value1, Integer value2) {
            addCriterion("fifthInsurancePremium between", value1, value2, "fifthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFifthinsurancepremiumNotBetween(Integer value1, Integer value2) {
            addCriterion("fifthInsurancePremium not between", value1, value2, "fifthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceamountIsNull() {
            addCriterion("fifthInsuranceAmount is null");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceamountIsNotNull() {
            addCriterion("fifthInsuranceAmount is not null");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceamountEqualTo(Integer value) {
            addCriterion("fifthInsuranceAmount =", value, "fifthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceamountNotEqualTo(Integer value) {
            addCriterion("fifthInsuranceAmount <>", value, "fifthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceamountGreaterThan(Integer value) {
            addCriterion("fifthInsuranceAmount >", value, "fifthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fifthInsuranceAmount >=", value, "fifthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceamountLessThan(Integer value) {
            addCriterion("fifthInsuranceAmount <", value, "fifthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceamountLessThanOrEqualTo(Integer value) {
            addCriterion("fifthInsuranceAmount <=", value, "fifthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceamountIn(List<Integer> values) {
            addCriterion("fifthInsuranceAmount in", values, "fifthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceamountNotIn(List<Integer> values) {
            addCriterion("fifthInsuranceAmount not in", values, "fifthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceamountBetween(Integer value1, Integer value2) {
            addCriterion("fifthInsuranceAmount between", value1, value2, "fifthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceamountNotBetween(Integer value1, Integer value2) {
            addCriterion("fifthInsuranceAmount not between", value1, value2, "fifthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceremarksIsNull() {
            addCriterion("fifthInsuranceRemarks is null");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceremarksIsNotNull() {
            addCriterion("fifthInsuranceRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceremarksEqualTo(String value) {
            addCriterion("fifthInsuranceRemarks =", value, "fifthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceremarksNotEqualTo(String value) {
            addCriterion("fifthInsuranceRemarks <>", value, "fifthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceremarksGreaterThan(String value) {
            addCriterion("fifthInsuranceRemarks >", value, "fifthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceremarksGreaterThanOrEqualTo(String value) {
            addCriterion("fifthInsuranceRemarks >=", value, "fifthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceremarksLessThan(String value) {
            addCriterion("fifthInsuranceRemarks <", value, "fifthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceremarksLessThanOrEqualTo(String value) {
            addCriterion("fifthInsuranceRemarks <=", value, "fifthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceremarksLike(String value) {
            addCriterion("fifthInsuranceRemarks like", value, "fifthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceremarksNotLike(String value) {
            addCriterion("fifthInsuranceRemarks not like", value, "fifthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceremarksIn(List<String> values) {
            addCriterion("fifthInsuranceRemarks in", values, "fifthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceremarksNotIn(List<String> values) {
            addCriterion("fifthInsuranceRemarks not in", values, "fifthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceremarksBetween(String value1, String value2) {
            addCriterion("fifthInsuranceRemarks between", value1, value2, "fifthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andFifthinsuranceremarksNotBetween(String value1, String value2) {
            addCriterion("fifthInsuranceRemarks not between", value1, value2, "fifthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSixthinsurancepremiumIsNull() {
            addCriterion("sixthInsurancePremium is null");
            return (Criteria) this;
        }

        public Criteria andSixthinsurancepremiumIsNotNull() {
            addCriterion("sixthInsurancePremium is not null");
            return (Criteria) this;
        }

        public Criteria andSixthinsurancepremiumEqualTo(Integer value) {
            addCriterion("sixthInsurancePremium =", value, "sixthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSixthinsurancepremiumNotEqualTo(Integer value) {
            addCriterion("sixthInsurancePremium <>", value, "sixthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSixthinsurancepremiumGreaterThan(Integer value) {
            addCriterion("sixthInsurancePremium >", value, "sixthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSixthinsurancepremiumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sixthInsurancePremium >=", value, "sixthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSixthinsurancepremiumLessThan(Integer value) {
            addCriterion("sixthInsurancePremium <", value, "sixthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSixthinsurancepremiumLessThanOrEqualTo(Integer value) {
            addCriterion("sixthInsurancePremium <=", value, "sixthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSixthinsurancepremiumIn(List<Integer> values) {
            addCriterion("sixthInsurancePremium in", values, "sixthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSixthinsurancepremiumNotIn(List<Integer> values) {
            addCriterion("sixthInsurancePremium not in", values, "sixthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSixthinsurancepremiumBetween(Integer value1, Integer value2) {
            addCriterion("sixthInsurancePremium between", value1, value2, "sixthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSixthinsurancepremiumNotBetween(Integer value1, Integer value2) {
            addCriterion("sixthInsurancePremium not between", value1, value2, "sixthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceamountIsNull() {
            addCriterion("sixthInsuranceAmount is null");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceamountIsNotNull() {
            addCriterion("sixthInsuranceAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceamountEqualTo(Integer value) {
            addCriterion("sixthInsuranceAmount =", value, "sixthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceamountNotEqualTo(Integer value) {
            addCriterion("sixthInsuranceAmount <>", value, "sixthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceamountGreaterThan(Integer value) {
            addCriterion("sixthInsuranceAmount >", value, "sixthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sixthInsuranceAmount >=", value, "sixthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceamountLessThan(Integer value) {
            addCriterion("sixthInsuranceAmount <", value, "sixthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceamountLessThanOrEqualTo(Integer value) {
            addCriterion("sixthInsuranceAmount <=", value, "sixthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceamountIn(List<Integer> values) {
            addCriterion("sixthInsuranceAmount in", values, "sixthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceamountNotIn(List<Integer> values) {
            addCriterion("sixthInsuranceAmount not in", values, "sixthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceamountBetween(Integer value1, Integer value2) {
            addCriterion("sixthInsuranceAmount between", value1, value2, "sixthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceamountNotBetween(Integer value1, Integer value2) {
            addCriterion("sixthInsuranceAmount not between", value1, value2, "sixthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceremarksIsNull() {
            addCriterion("sixthInsuranceRemarks is null");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceremarksIsNotNull() {
            addCriterion("sixthInsuranceRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceremarksEqualTo(String value) {
            addCriterion("sixthInsuranceRemarks =", value, "sixthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceremarksNotEqualTo(String value) {
            addCriterion("sixthInsuranceRemarks <>", value, "sixthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceremarksGreaterThan(String value) {
            addCriterion("sixthInsuranceRemarks >", value, "sixthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceremarksGreaterThanOrEqualTo(String value) {
            addCriterion("sixthInsuranceRemarks >=", value, "sixthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceremarksLessThan(String value) {
            addCriterion("sixthInsuranceRemarks <", value, "sixthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceremarksLessThanOrEqualTo(String value) {
            addCriterion("sixthInsuranceRemarks <=", value, "sixthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceremarksLike(String value) {
            addCriterion("sixthInsuranceRemarks like", value, "sixthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceremarksNotLike(String value) {
            addCriterion("sixthInsuranceRemarks not like", value, "sixthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceremarksIn(List<String> values) {
            addCriterion("sixthInsuranceRemarks in", values, "sixthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceremarksNotIn(List<String> values) {
            addCriterion("sixthInsuranceRemarks not in", values, "sixthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceremarksBetween(String value1, String value2) {
            addCriterion("sixthInsuranceRemarks between", value1, value2, "sixthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSixthinsuranceremarksNotBetween(String value1, String value2) {
            addCriterion("sixthInsuranceRemarks not between", value1, value2, "sixthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSeventhinsurancepremiumIsNull() {
            addCriterion("seventhInsurancePremium is null");
            return (Criteria) this;
        }

        public Criteria andSeventhinsurancepremiumIsNotNull() {
            addCriterion("seventhInsurancePremium is not null");
            return (Criteria) this;
        }

        public Criteria andSeventhinsurancepremiumEqualTo(Integer value) {
            addCriterion("seventhInsurancePremium =", value, "seventhinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSeventhinsurancepremiumNotEqualTo(Integer value) {
            addCriterion("seventhInsurancePremium <>", value, "seventhinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSeventhinsurancepremiumGreaterThan(Integer value) {
            addCriterion("seventhInsurancePremium >", value, "seventhinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSeventhinsurancepremiumGreaterThanOrEqualTo(Integer value) {
            addCriterion("seventhInsurancePremium >=", value, "seventhinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSeventhinsurancepremiumLessThan(Integer value) {
            addCriterion("seventhInsurancePremium <", value, "seventhinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSeventhinsurancepremiumLessThanOrEqualTo(Integer value) {
            addCriterion("seventhInsurancePremium <=", value, "seventhinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSeventhinsurancepremiumIn(List<Integer> values) {
            addCriterion("seventhInsurancePremium in", values, "seventhinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSeventhinsurancepremiumNotIn(List<Integer> values) {
            addCriterion("seventhInsurancePremium not in", values, "seventhinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSeventhinsurancepremiumBetween(Integer value1, Integer value2) {
            addCriterion("seventhInsurancePremium between", value1, value2, "seventhinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSeventhinsurancepremiumNotBetween(Integer value1, Integer value2) {
            addCriterion("seventhInsurancePremium not between", value1, value2, "seventhinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceamountIsNull() {
            addCriterion("seventhInsuranceAmount is null");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceamountIsNotNull() {
            addCriterion("seventhInsuranceAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceamountEqualTo(Integer value) {
            addCriterion("seventhInsuranceAmount =", value, "seventhinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceamountNotEqualTo(Integer value) {
            addCriterion("seventhInsuranceAmount <>", value, "seventhinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceamountGreaterThan(Integer value) {
            addCriterion("seventhInsuranceAmount >", value, "seventhinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("seventhInsuranceAmount >=", value, "seventhinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceamountLessThan(Integer value) {
            addCriterion("seventhInsuranceAmount <", value, "seventhinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceamountLessThanOrEqualTo(Integer value) {
            addCriterion("seventhInsuranceAmount <=", value, "seventhinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceamountIn(List<Integer> values) {
            addCriterion("seventhInsuranceAmount in", values, "seventhinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceamountNotIn(List<Integer> values) {
            addCriterion("seventhInsuranceAmount not in", values, "seventhinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceamountBetween(Integer value1, Integer value2) {
            addCriterion("seventhInsuranceAmount between", value1, value2, "seventhinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceamountNotBetween(Integer value1, Integer value2) {
            addCriterion("seventhInsuranceAmount not between", value1, value2, "seventhinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceremarksIsNull() {
            addCriterion("seventhInsuranceRemarks is null");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceremarksIsNotNull() {
            addCriterion("seventhInsuranceRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceremarksEqualTo(String value) {
            addCriterion("seventhInsuranceRemarks =", value, "seventhinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceremarksNotEqualTo(String value) {
            addCriterion("seventhInsuranceRemarks <>", value, "seventhinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceremarksGreaterThan(String value) {
            addCriterion("seventhInsuranceRemarks >", value, "seventhinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceremarksGreaterThanOrEqualTo(String value) {
            addCriterion("seventhInsuranceRemarks >=", value, "seventhinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceremarksLessThan(String value) {
            addCriterion("seventhInsuranceRemarks <", value, "seventhinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceremarksLessThanOrEqualTo(String value) {
            addCriterion("seventhInsuranceRemarks <=", value, "seventhinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceremarksLike(String value) {
            addCriterion("seventhInsuranceRemarks like", value, "seventhinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceremarksNotLike(String value) {
            addCriterion("seventhInsuranceRemarks not like", value, "seventhinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceremarksIn(List<String> values) {
            addCriterion("seventhInsuranceRemarks in", values, "seventhinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceremarksNotIn(List<String> values) {
            addCriterion("seventhInsuranceRemarks not in", values, "seventhinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceremarksBetween(String value1, String value2) {
            addCriterion("seventhInsuranceRemarks between", value1, value2, "seventhinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andSeventhinsuranceremarksNotBetween(String value1, String value2) {
            addCriterion("seventhInsuranceRemarks not between", value1, value2, "seventhinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andEighthinsurancepremiumIsNull() {
            addCriterion("eighthInsurancePremium is null");
            return (Criteria) this;
        }

        public Criteria andEighthinsurancepremiumIsNotNull() {
            addCriterion("eighthInsurancePremium is not null");
            return (Criteria) this;
        }

        public Criteria andEighthinsurancepremiumEqualTo(Integer value) {
            addCriterion("eighthInsurancePremium =", value, "eighthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andEighthinsurancepremiumNotEqualTo(Integer value) {
            addCriterion("eighthInsurancePremium <>", value, "eighthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andEighthinsurancepremiumGreaterThan(Integer value) {
            addCriterion("eighthInsurancePremium >", value, "eighthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andEighthinsurancepremiumGreaterThanOrEqualTo(Integer value) {
            addCriterion("eighthInsurancePremium >=", value, "eighthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andEighthinsurancepremiumLessThan(Integer value) {
            addCriterion("eighthInsurancePremium <", value, "eighthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andEighthinsurancepremiumLessThanOrEqualTo(Integer value) {
            addCriterion("eighthInsurancePremium <=", value, "eighthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andEighthinsurancepremiumIn(List<Integer> values) {
            addCriterion("eighthInsurancePremium in", values, "eighthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andEighthinsurancepremiumNotIn(List<Integer> values) {
            addCriterion("eighthInsurancePremium not in", values, "eighthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andEighthinsurancepremiumBetween(Integer value1, Integer value2) {
            addCriterion("eighthInsurancePremium between", value1, value2, "eighthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andEighthinsurancepremiumNotBetween(Integer value1, Integer value2) {
            addCriterion("eighthInsurancePremium not between", value1, value2, "eighthinsurancepremium");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceamountIsNull() {
            addCriterion("eighthInsuranceAmount is null");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceamountIsNotNull() {
            addCriterion("eighthInsuranceAmount is not null");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceamountEqualTo(Integer value) {
            addCriterion("eighthInsuranceAmount =", value, "eighthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceamountNotEqualTo(Integer value) {
            addCriterion("eighthInsuranceAmount <>", value, "eighthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceamountGreaterThan(Integer value) {
            addCriterion("eighthInsuranceAmount >", value, "eighthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("eighthInsuranceAmount >=", value, "eighthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceamountLessThan(Integer value) {
            addCriterion("eighthInsuranceAmount <", value, "eighthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceamountLessThanOrEqualTo(Integer value) {
            addCriterion("eighthInsuranceAmount <=", value, "eighthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceamountIn(List<Integer> values) {
            addCriterion("eighthInsuranceAmount in", values, "eighthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceamountNotIn(List<Integer> values) {
            addCriterion("eighthInsuranceAmount not in", values, "eighthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceamountBetween(Integer value1, Integer value2) {
            addCriterion("eighthInsuranceAmount between", value1, value2, "eighthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceamountNotBetween(Integer value1, Integer value2) {
            addCriterion("eighthInsuranceAmount not between", value1, value2, "eighthinsuranceamount");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceremarksIsNull() {
            addCriterion("eighthInsuranceRemarks is null");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceremarksIsNotNull() {
            addCriterion("eighthInsuranceRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceremarksEqualTo(String value) {
            addCriterion("eighthInsuranceRemarks =", value, "eighthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceremarksNotEqualTo(String value) {
            addCriterion("eighthInsuranceRemarks <>", value, "eighthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceremarksGreaterThan(String value) {
            addCriterion("eighthInsuranceRemarks >", value, "eighthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceremarksGreaterThanOrEqualTo(String value) {
            addCriterion("eighthInsuranceRemarks >=", value, "eighthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceremarksLessThan(String value) {
            addCriterion("eighthInsuranceRemarks <", value, "eighthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceremarksLessThanOrEqualTo(String value) {
            addCriterion("eighthInsuranceRemarks <=", value, "eighthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceremarksLike(String value) {
            addCriterion("eighthInsuranceRemarks like", value, "eighthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceremarksNotLike(String value) {
            addCriterion("eighthInsuranceRemarks not like", value, "eighthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceremarksIn(List<String> values) {
            addCriterion("eighthInsuranceRemarks in", values, "eighthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceremarksNotIn(List<String> values) {
            addCriterion("eighthInsuranceRemarks not in", values, "eighthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceremarksBetween(String value1, String value2) {
            addCriterion("eighthInsuranceRemarks between", value1, value2, "eighthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andEighthinsuranceremarksNotBetween(String value1, String value2) {
            addCriterion("eighthInsuranceRemarks not between", value1, value2, "eighthinsuranceremarks");
            return (Criteria) this;
        }

        public Criteria andRepairshoppremiumIsNull() {
            addCriterion("repairShopPremium is null");
            return (Criteria) this;
        }

        public Criteria andRepairshoppremiumIsNotNull() {
            addCriterion("repairShopPremium is not null");
            return (Criteria) this;
        }

        public Criteria andRepairshoppremiumEqualTo(Integer value) {
            addCriterion("repairShopPremium =", value, "repairshoppremium");
            return (Criteria) this;
        }

        public Criteria andRepairshoppremiumNotEqualTo(Integer value) {
            addCriterion("repairShopPremium <>", value, "repairshoppremium");
            return (Criteria) this;
        }

        public Criteria andRepairshoppremiumGreaterThan(Integer value) {
            addCriterion("repairShopPremium >", value, "repairshoppremium");
            return (Criteria) this;
        }

        public Criteria andRepairshoppremiumGreaterThanOrEqualTo(Integer value) {
            addCriterion("repairShopPremium >=", value, "repairshoppremium");
            return (Criteria) this;
        }

        public Criteria andRepairshoppremiumLessThan(Integer value) {
            addCriterion("repairShopPremium <", value, "repairshoppremium");
            return (Criteria) this;
        }

        public Criteria andRepairshoppremiumLessThanOrEqualTo(Integer value) {
            addCriterion("repairShopPremium <=", value, "repairshoppremium");
            return (Criteria) this;
        }

        public Criteria andRepairshoppremiumIn(List<Integer> values) {
            addCriterion("repairShopPremium in", values, "repairshoppremium");
            return (Criteria) this;
        }

        public Criteria andRepairshoppremiumNotIn(List<Integer> values) {
            addCriterion("repairShopPremium not in", values, "repairshoppremium");
            return (Criteria) this;
        }

        public Criteria andRepairshoppremiumBetween(Integer value1, Integer value2) {
            addCriterion("repairShopPremium between", value1, value2, "repairshoppremium");
            return (Criteria) this;
        }

        public Criteria andRepairshoppremiumNotBetween(Integer value1, Integer value2) {
            addCriterion("repairShopPremium not between", value1, value2, "repairshoppremium");
            return (Criteria) this;
        }

        public Criteria andRepairshopamountIsNull() {
            addCriterion("repairShopAmount is null");
            return (Criteria) this;
        }

        public Criteria andRepairshopamountIsNotNull() {
            addCriterion("repairShopAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRepairshopamountEqualTo(Integer value) {
            addCriterion("repairShopAmount =", value, "repairshopamount");
            return (Criteria) this;
        }

        public Criteria andRepairshopamountNotEqualTo(Integer value) {
            addCriterion("repairShopAmount <>", value, "repairshopamount");
            return (Criteria) this;
        }

        public Criteria andRepairshopamountGreaterThan(Integer value) {
            addCriterion("repairShopAmount >", value, "repairshopamount");
            return (Criteria) this;
        }

        public Criteria andRepairshopamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("repairShopAmount >=", value, "repairshopamount");
            return (Criteria) this;
        }

        public Criteria andRepairshopamountLessThan(Integer value) {
            addCriterion("repairShopAmount <", value, "repairshopamount");
            return (Criteria) this;
        }

        public Criteria andRepairshopamountLessThanOrEqualTo(Integer value) {
            addCriterion("repairShopAmount <=", value, "repairshopamount");
            return (Criteria) this;
        }

        public Criteria andRepairshopamountIn(List<Integer> values) {
            addCriterion("repairShopAmount in", values, "repairshopamount");
            return (Criteria) this;
        }

        public Criteria andRepairshopamountNotIn(List<Integer> values) {
            addCriterion("repairShopAmount not in", values, "repairshopamount");
            return (Criteria) this;
        }

        public Criteria andRepairshopamountBetween(Integer value1, Integer value2) {
            addCriterion("repairShopAmount between", value1, value2, "repairshopamount");
            return (Criteria) this;
        }

        public Criteria andRepairshopamountNotBetween(Integer value1, Integer value2) {
            addCriterion("repairShopAmount not between", value1, value2, "repairshopamount");
            return (Criteria) this;
        }

        public Criteria andRepairshopremarksIsNull() {
            addCriterion("repairShopRemarks is null");
            return (Criteria) this;
        }

        public Criteria andRepairshopremarksIsNotNull() {
            addCriterion("repairShopRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andRepairshopremarksEqualTo(String value) {
            addCriterion("repairShopRemarks =", value, "repairshopremarks");
            return (Criteria) this;
        }

        public Criteria andRepairshopremarksNotEqualTo(String value) {
            addCriterion("repairShopRemarks <>", value, "repairshopremarks");
            return (Criteria) this;
        }

        public Criteria andRepairshopremarksGreaterThan(String value) {
            addCriterion("repairShopRemarks >", value, "repairshopremarks");
            return (Criteria) this;
        }

        public Criteria andRepairshopremarksGreaterThanOrEqualTo(String value) {
            addCriterion("repairShopRemarks >=", value, "repairshopremarks");
            return (Criteria) this;
        }

        public Criteria andRepairshopremarksLessThan(String value) {
            addCriterion("repairShopRemarks <", value, "repairshopremarks");
            return (Criteria) this;
        }

        public Criteria andRepairshopremarksLessThanOrEqualTo(String value) {
            addCriterion("repairShopRemarks <=", value, "repairshopremarks");
            return (Criteria) this;
        }

        public Criteria andRepairshopremarksLike(String value) {
            addCriterion("repairShopRemarks like", value, "repairshopremarks");
            return (Criteria) this;
        }

        public Criteria andRepairshopremarksNotLike(String value) {
            addCriterion("repairShopRemarks not like", value, "repairshopremarks");
            return (Criteria) this;
        }

        public Criteria andRepairshopremarksIn(List<String> values) {
            addCriterion("repairShopRemarks in", values, "repairshopremarks");
            return (Criteria) this;
        }

        public Criteria andRepairshopremarksNotIn(List<String> values) {
            addCriterion("repairShopRemarks not in", values, "repairshopremarks");
            return (Criteria) this;
        }

        public Criteria andRepairshopremarksBetween(String value1, String value2) {
            addCriterion("repairShopRemarks between", value1, value2, "repairshopremarks");
            return (Criteria) this;
        }

        public Criteria andRepairshopremarksNotBetween(String value1, String value2) {
            addCriterion("repairShopRemarks not between", value1, value2, "repairshopremarks");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductiblepremiumIsNull() {
            addCriterion("excludingDeductiblePremium is null");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductiblepremiumIsNotNull() {
            addCriterion("excludingDeductiblePremium is not null");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductiblepremiumEqualTo(Integer value) {
            addCriterion("excludingDeductiblePremium =", value, "excludingdeductiblepremium");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductiblepremiumNotEqualTo(Integer value) {
            addCriterion("excludingDeductiblePremium <>", value, "excludingdeductiblepremium");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductiblepremiumGreaterThan(Integer value) {
            addCriterion("excludingDeductiblePremium >", value, "excludingdeductiblepremium");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductiblepremiumGreaterThanOrEqualTo(Integer value) {
            addCriterion("excludingDeductiblePremium >=", value, "excludingdeductiblepremium");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductiblepremiumLessThan(Integer value) {
            addCriterion("excludingDeductiblePremium <", value, "excludingdeductiblepremium");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductiblepremiumLessThanOrEqualTo(Integer value) {
            addCriterion("excludingDeductiblePremium <=", value, "excludingdeductiblepremium");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductiblepremiumIn(List<Integer> values) {
            addCriterion("excludingDeductiblePremium in", values, "excludingdeductiblepremium");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductiblepremiumNotIn(List<Integer> values) {
            addCriterion("excludingDeductiblePremium not in", values, "excludingdeductiblepremium");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductiblepremiumBetween(Integer value1, Integer value2) {
            addCriterion("excludingDeductiblePremium between", value1, value2, "excludingdeductiblepremium");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductiblepremiumNotBetween(Integer value1, Integer value2) {
            addCriterion("excludingDeductiblePremium not between", value1, value2, "excludingdeductiblepremium");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleamountIsNull() {
            addCriterion("excludingDeductibleAmount is null");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleamountIsNotNull() {
            addCriterion("excludingDeductibleAmount is not null");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleamountEqualTo(Integer value) {
            addCriterion("excludingDeductibleAmount =", value, "excludingdeductibleamount");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleamountNotEqualTo(Integer value) {
            addCriterion("excludingDeductibleAmount <>", value, "excludingdeductibleamount");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleamountGreaterThan(Integer value) {
            addCriterion("excludingDeductibleAmount >", value, "excludingdeductibleamount");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("excludingDeductibleAmount >=", value, "excludingdeductibleamount");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleamountLessThan(Integer value) {
            addCriterion("excludingDeductibleAmount <", value, "excludingdeductibleamount");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleamountLessThanOrEqualTo(Integer value) {
            addCriterion("excludingDeductibleAmount <=", value, "excludingdeductibleamount");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleamountIn(List<Integer> values) {
            addCriterion("excludingDeductibleAmount in", values, "excludingdeductibleamount");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleamountNotIn(List<Integer> values) {
            addCriterion("excludingDeductibleAmount not in", values, "excludingdeductibleamount");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleamountBetween(Integer value1, Integer value2) {
            addCriterion("excludingDeductibleAmount between", value1, value2, "excludingdeductibleamount");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleamountNotBetween(Integer value1, Integer value2) {
            addCriterion("excludingDeductibleAmount not between", value1, value2, "excludingdeductibleamount");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleremarksIsNull() {
            addCriterion("excludingDeductibleRemarks is null");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleremarksIsNotNull() {
            addCriterion("excludingDeductibleRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleremarksEqualTo(String value) {
            addCriterion("excludingDeductibleRemarks =", value, "excludingdeductibleremarks");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleremarksNotEqualTo(String value) {
            addCriterion("excludingDeductibleRemarks <>", value, "excludingdeductibleremarks");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleremarksGreaterThan(String value) {
            addCriterion("excludingDeductibleRemarks >", value, "excludingdeductibleremarks");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleremarksGreaterThanOrEqualTo(String value) {
            addCriterion("excludingDeductibleRemarks >=", value, "excludingdeductibleremarks");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleremarksLessThan(String value) {
            addCriterion("excludingDeductibleRemarks <", value, "excludingdeductibleremarks");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleremarksLessThanOrEqualTo(String value) {
            addCriterion("excludingDeductibleRemarks <=", value, "excludingdeductibleremarks");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleremarksLike(String value) {
            addCriterion("excludingDeductibleRemarks like", value, "excludingdeductibleremarks");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleremarksNotLike(String value) {
            addCriterion("excludingDeductibleRemarks not like", value, "excludingdeductibleremarks");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleremarksIn(List<String> values) {
            addCriterion("excludingDeductibleRemarks in", values, "excludingdeductibleremarks");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleremarksNotIn(List<String> values) {
            addCriterion("excludingDeductibleRemarks not in", values, "excludingdeductibleremarks");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleremarksBetween(String value1, String value2) {
            addCriterion("excludingDeductibleRemarks between", value1, value2, "excludingdeductibleremarks");
            return (Criteria) this;
        }

        public Criteria andExcludingdeductibleremarksNotBetween(String value1, String value2) {
            addCriterion("excludingDeductibleRemarks not between", value1, value2, "excludingdeductibleremarks");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyIsNull() {
            addCriterion("insuranceCompany is null");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyIsNotNull() {
            addCriterion("insuranceCompany is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyEqualTo(String value) {
            addCriterion("insuranceCompany =", value, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyNotEqualTo(String value) {
            addCriterion("insuranceCompany <>", value, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyGreaterThan(String value) {
            addCriterion("insuranceCompany >", value, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyGreaterThanOrEqualTo(String value) {
            addCriterion("insuranceCompany >=", value, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyLessThan(String value) {
            addCriterion("insuranceCompany <", value, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyLessThanOrEqualTo(String value) {
            addCriterion("insuranceCompany <=", value, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyLike(String value) {
            addCriterion("insuranceCompany like", value, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyNotLike(String value) {
            addCriterion("insuranceCompany not like", value, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyIn(List<String> values) {
            addCriterion("insuranceCompany in", values, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyNotIn(List<String> values) {
            addCriterion("insuranceCompany not in", values, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyBetween(String value1, String value2) {
            addCriterion("insuranceCompany between", value1, value2, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecompanyNotBetween(String value1, String value2) {
            addCriterion("insuranceCompany not between", value1, value2, "insurancecompany");
            return (Criteria) this;
        }

        public Criteria andInsurancecallIsNull() {
            addCriterion("insuranceCall is null");
            return (Criteria) this;
        }

        public Criteria andInsurancecallIsNotNull() {
            addCriterion("insuranceCall is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancecallEqualTo(String value) {
            addCriterion("insuranceCall =", value, "insurancecall");
            return (Criteria) this;
        }

        public Criteria andInsurancecallNotEqualTo(String value) {
            addCriterion("insuranceCall <>", value, "insurancecall");
            return (Criteria) this;
        }

        public Criteria andInsurancecallGreaterThan(String value) {
            addCriterion("insuranceCall >", value, "insurancecall");
            return (Criteria) this;
        }

        public Criteria andInsurancecallGreaterThanOrEqualTo(String value) {
            addCriterion("insuranceCall >=", value, "insurancecall");
            return (Criteria) this;
        }

        public Criteria andInsurancecallLessThan(String value) {
            addCriterion("insuranceCall <", value, "insurancecall");
            return (Criteria) this;
        }

        public Criteria andInsurancecallLessThanOrEqualTo(String value) {
            addCriterion("insuranceCall <=", value, "insurancecall");
            return (Criteria) this;
        }

        public Criteria andInsurancecallLike(String value) {
            addCriterion("insuranceCall like", value, "insurancecall");
            return (Criteria) this;
        }

        public Criteria andInsurancecallNotLike(String value) {
            addCriterion("insuranceCall not like", value, "insurancecall");
            return (Criteria) this;
        }

        public Criteria andInsurancecallIn(List<String> values) {
            addCriterion("insuranceCall in", values, "insurancecall");
            return (Criteria) this;
        }

        public Criteria andInsurancecallNotIn(List<String> values) {
            addCriterion("insuranceCall not in", values, "insurancecall");
            return (Criteria) this;
        }

        public Criteria andInsurancecallBetween(String value1, String value2) {
            addCriterion("insuranceCall between", value1, value2, "insurancecall");
            return (Criteria) this;
        }

        public Criteria andInsurancecallNotBetween(String value1, String value2) {
            addCriterion("insuranceCall not between", value1, value2, "insurancecall");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodstartIsNull() {
            addCriterion("insurancePeriodStart is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodstartIsNotNull() {
            addCriterion("insurancePeriodStart is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodstartEqualTo(Date value) {
            addCriterionForJDBCDate("insurancePeriodStart =", value, "insuranceperiodstart");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodstartNotEqualTo(Date value) {
            addCriterionForJDBCDate("insurancePeriodStart <>", value, "insuranceperiodstart");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodstartGreaterThan(Date value) {
            addCriterionForJDBCDate("insurancePeriodStart >", value, "insuranceperiodstart");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodstartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("insurancePeriodStart >=", value, "insuranceperiodstart");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodstartLessThan(Date value) {
            addCriterionForJDBCDate("insurancePeriodStart <", value, "insuranceperiodstart");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodstartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("insurancePeriodStart <=", value, "insuranceperiodstart");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodstartIn(List<Date> values) {
            addCriterionForJDBCDate("insurancePeriodStart in", values, "insuranceperiodstart");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodstartNotIn(List<Date> values) {
            addCriterionForJDBCDate("insurancePeriodStart not in", values, "insuranceperiodstart");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodstartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("insurancePeriodStart between", value1, value2, "insuranceperiodstart");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodstartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("insurancePeriodStart not between", value1, value2, "insuranceperiodstart");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodendIsNull() {
            addCriterion("insurancePeriodEnd is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodendIsNotNull() {
            addCriterion("insurancePeriodEnd is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodendEqualTo(Date value) {
            addCriterionForJDBCDate("insurancePeriodEnd =", value, "insuranceperiodend");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodendNotEqualTo(Date value) {
            addCriterionForJDBCDate("insurancePeriodEnd <>", value, "insuranceperiodend");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodendGreaterThan(Date value) {
            addCriterionForJDBCDate("insurancePeriodEnd >", value, "insuranceperiodend");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodendGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("insurancePeriodEnd >=", value, "insuranceperiodend");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodendLessThan(Date value) {
            addCriterionForJDBCDate("insurancePeriodEnd <", value, "insuranceperiodend");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodendLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("insurancePeriodEnd <=", value, "insuranceperiodend");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodendIn(List<Date> values) {
            addCriterionForJDBCDate("insurancePeriodEnd in", values, "insuranceperiodend");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodendNotIn(List<Date> values) {
            addCriterionForJDBCDate("insurancePeriodEnd not in", values, "insuranceperiodend");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodendBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("insurancePeriodEnd between", value1, value2, "insuranceperiodend");
            return (Criteria) this;
        }

        public Criteria andInsuranceperiodendNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("insurancePeriodEnd not between", value1, value2, "insuranceperiodend");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNull() {
            addCriterion("totalCost is null");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNotNull() {
            addCriterion("totalCost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcostEqualTo(BigDecimal value) {
            addCriterion("totalCost =", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotEqualTo(BigDecimal value) {
            addCriterion("totalCost <>", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThan(BigDecimal value) {
            addCriterion("totalCost >", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalCost >=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThan(BigDecimal value) {
            addCriterion("totalCost <", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalCost <=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostIn(List<BigDecimal> values) {
            addCriterion("totalCost in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotIn(List<BigDecimal> values) {
            addCriterion("totalCost not in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalCost between", value1, value2, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalCost not between", value1, value2, "totalcost");
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

        public Criteria andEnclosureIsNull() {
            addCriterion("enclosure is null");
            return (Criteria) this;
        }

        public Criteria andEnclosureIsNotNull() {
            addCriterion("enclosure is not null");
            return (Criteria) this;
        }

        public Criteria andEnclosureEqualTo(String value) {
            addCriterion("enclosure =", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotEqualTo(String value) {
            addCriterion("enclosure <>", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureGreaterThan(String value) {
            addCriterion("enclosure >", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureGreaterThanOrEqualTo(String value) {
            addCriterion("enclosure >=", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLessThan(String value) {
            addCriterion("enclosure <", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLessThanOrEqualTo(String value) {
            addCriterion("enclosure <=", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureLike(String value) {
            addCriterion("enclosure like", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotLike(String value) {
            addCriterion("enclosure not like", value, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureIn(List<String> values) {
            addCriterion("enclosure in", values, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotIn(List<String> values) {
            addCriterion("enclosure not in", values, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureBetween(String value1, String value2) {
            addCriterion("enclosure between", value1, value2, "enclosure");
            return (Criteria) this;
        }

        public Criteria andEnclosureNotBetween(String value1, String value2) {
            addCriterion("enclosure not between", value1, value2, "enclosure");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
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