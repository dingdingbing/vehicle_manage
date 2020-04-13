package com.igeek.pojo.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MaintainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintainExample() {
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

        public Criteria andMaintainnoIsNull() {
            addCriterion("maintainNo is null");
            return (Criteria) this;
        }

        public Criteria andMaintainnoIsNotNull() {
            addCriterion("maintainNo is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainnoEqualTo(Integer value) {
            addCriterion("maintainNo =", value, "maintainno");
            return (Criteria) this;
        }

        public Criteria andMaintainnoNotEqualTo(Integer value) {
            addCriterion("maintainNo <>", value, "maintainno");
            return (Criteria) this;
        }

        public Criteria andMaintainnoGreaterThan(Integer value) {
            addCriterion("maintainNo >", value, "maintainno");
            return (Criteria) this;
        }

        public Criteria andMaintainnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("maintainNo >=", value, "maintainno");
            return (Criteria) this;
        }

        public Criteria andMaintainnoLessThan(Integer value) {
            addCriterion("maintainNo <", value, "maintainno");
            return (Criteria) this;
        }

        public Criteria andMaintainnoLessThanOrEqualTo(Integer value) {
            addCriterion("maintainNo <=", value, "maintainno");
            return (Criteria) this;
        }

        public Criteria andMaintainnoIn(List<Integer> values) {
            addCriterion("maintainNo in", values, "maintainno");
            return (Criteria) this;
        }

        public Criteria andMaintainnoNotIn(List<Integer> values) {
            addCriterion("maintainNo not in", values, "maintainno");
            return (Criteria) this;
        }

        public Criteria andMaintainnoBetween(Integer value1, Integer value2) {
            addCriterion("maintainNo between", value1, value2, "maintainno");
            return (Criteria) this;
        }

        public Criteria andMaintainnoNotBetween(Integer value1, Integer value2) {
            addCriterion("maintainNo not between", value1, value2, "maintainno");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMaintenancecompanyIsNull() {
            addCriterion("maintenanceCompany is null");
            return (Criteria) this;
        }

        public Criteria andMaintenancecompanyIsNotNull() {
            addCriterion("maintenanceCompany is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenancecompanyEqualTo(String value) {
            addCriterion("maintenanceCompany =", value, "maintenancecompany");
            return (Criteria) this;
        }

        public Criteria andMaintenancecompanyNotEqualTo(String value) {
            addCriterion("maintenanceCompany <>", value, "maintenancecompany");
            return (Criteria) this;
        }

        public Criteria andMaintenancecompanyGreaterThan(String value) {
            addCriterion("maintenanceCompany >", value, "maintenancecompany");
            return (Criteria) this;
        }

        public Criteria andMaintenancecompanyGreaterThanOrEqualTo(String value) {
            addCriterion("maintenanceCompany >=", value, "maintenancecompany");
            return (Criteria) this;
        }

        public Criteria andMaintenancecompanyLessThan(String value) {
            addCriterion("maintenanceCompany <", value, "maintenancecompany");
            return (Criteria) this;
        }

        public Criteria andMaintenancecompanyLessThanOrEqualTo(String value) {
            addCriterion("maintenanceCompany <=", value, "maintenancecompany");
            return (Criteria) this;
        }

        public Criteria andMaintenancecompanyLike(String value) {
            addCriterion("maintenanceCompany like", value, "maintenancecompany");
            return (Criteria) this;
        }

        public Criteria andMaintenancecompanyNotLike(String value) {
            addCriterion("maintenanceCompany not like", value, "maintenancecompany");
            return (Criteria) this;
        }

        public Criteria andMaintenancecompanyIn(List<String> values) {
            addCriterion("maintenanceCompany in", values, "maintenancecompany");
            return (Criteria) this;
        }

        public Criteria andMaintenancecompanyNotIn(List<String> values) {
            addCriterion("maintenanceCompany not in", values, "maintenancecompany");
            return (Criteria) this;
        }

        public Criteria andMaintenancecompanyBetween(String value1, String value2) {
            addCriterion("maintenanceCompany between", value1, value2, "maintenancecompany");
            return (Criteria) this;
        }

        public Criteria andMaintenancecompanyNotBetween(String value1, String value2) {
            addCriterion("maintenanceCompany not between", value1, value2, "maintenancecompany");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost not between", value1, value2, "cost");
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

        public Criteria andStartmaintaindateIsNull() {
            addCriterion("startMaintainDate is null");
            return (Criteria) this;
        }

        public Criteria andStartmaintaindateIsNotNull() {
            addCriterion("startMaintainDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartmaintaindateEqualTo(Date value) {
            addCriterionForJDBCDate("startMaintainDate =", value, "startmaintaindate");
            return (Criteria) this;
        }

        public Criteria andStartmaintaindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("startMaintainDate <>", value, "startmaintaindate");
            return (Criteria) this;
        }

        public Criteria andStartmaintaindateGreaterThan(Date value) {
            addCriterionForJDBCDate("startMaintainDate >", value, "startmaintaindate");
            return (Criteria) this;
        }

        public Criteria andStartmaintaindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startMaintainDate >=", value, "startmaintaindate");
            return (Criteria) this;
        }

        public Criteria andStartmaintaindateLessThan(Date value) {
            addCriterionForJDBCDate("startMaintainDate <", value, "startmaintaindate");
            return (Criteria) this;
        }

        public Criteria andStartmaintaindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startMaintainDate <=", value, "startmaintaindate");
            return (Criteria) this;
        }

        public Criteria andStartmaintaindateIn(List<Date> values) {
            addCriterionForJDBCDate("startMaintainDate in", values, "startmaintaindate");
            return (Criteria) this;
        }

        public Criteria andStartmaintaindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("startMaintainDate not in", values, "startmaintaindate");
            return (Criteria) this;
        }

        public Criteria andStartmaintaindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startMaintainDate between", value1, value2, "startmaintaindate");
            return (Criteria) this;
        }

        public Criteria andStartmaintaindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startMaintainDate not between", value1, value2, "startmaintaindate");
            return (Criteria) this;
        }

        public Criteria andEndmaintaindateIsNull() {
            addCriterion("endMaintainDate is null");
            return (Criteria) this;
        }

        public Criteria andEndmaintaindateIsNotNull() {
            addCriterion("endMaintainDate is not null");
            return (Criteria) this;
        }

        public Criteria andEndmaintaindateEqualTo(Date value) {
            addCriterionForJDBCDate("endMaintainDate =", value, "endmaintaindate");
            return (Criteria) this;
        }

        public Criteria andEndmaintaindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("endMaintainDate <>", value, "endmaintaindate");
            return (Criteria) this;
        }

        public Criteria andEndmaintaindateGreaterThan(Date value) {
            addCriterionForJDBCDate("endMaintainDate >", value, "endmaintaindate");
            return (Criteria) this;
        }

        public Criteria andEndmaintaindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endMaintainDate >=", value, "endmaintaindate");
            return (Criteria) this;
        }

        public Criteria andEndmaintaindateLessThan(Date value) {
            addCriterionForJDBCDate("endMaintainDate <", value, "endmaintaindate");
            return (Criteria) this;
        }

        public Criteria andEndmaintaindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endMaintainDate <=", value, "endmaintaindate");
            return (Criteria) this;
        }

        public Criteria andEndmaintaindateIn(List<Date> values) {
            addCriterionForJDBCDate("endMaintainDate in", values, "endmaintaindate");
            return (Criteria) this;
        }

        public Criteria andEndmaintaindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("endMaintainDate not in", values, "endmaintaindate");
            return (Criteria) this;
        }

        public Criteria andEndmaintaindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endMaintainDate between", value1, value2, "endmaintaindate");
            return (Criteria) this;
        }

        public Criteria andEndmaintaindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endMaintainDate not between", value1, value2, "endmaintaindate");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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