package com.igeek.pojo.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AccidentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccidentExample() {
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

        public Criteria andAccidentnoIsNull() {
            addCriterion("accidentno is null");
            return (Criteria) this;
        }

        public Criteria andAccidentnoIsNotNull() {
            addCriterion("accidentno is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentnoEqualTo(Integer value) {
            addCriterion("accidentno =", value, "accidentno");
            return (Criteria) this;
        }

        public Criteria andAccidentnoNotEqualTo(Integer value) {
            addCriterion("accidentno <>", value, "accidentno");
            return (Criteria) this;
        }

        public Criteria andAccidentnoGreaterThan(Integer value) {
            addCriterion("accidentno >", value, "accidentno");
            return (Criteria) this;
        }

        public Criteria andAccidentnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("accidentno >=", value, "accidentno");
            return (Criteria) this;
        }

        public Criteria andAccidentnoLessThan(Integer value) {
            addCriterion("accidentno <", value, "accidentno");
            return (Criteria) this;
        }

        public Criteria andAccidentnoLessThanOrEqualTo(Integer value) {
            addCriterion("accidentno <=", value, "accidentno");
            return (Criteria) this;
        }

        public Criteria andAccidentnoIn(List<Integer> values) {
            addCriterion("accidentno in", values, "accidentno");
            return (Criteria) this;
        }

        public Criteria andAccidentnoNotIn(List<Integer> values) {
            addCriterion("accidentno not in", values, "accidentno");
            return (Criteria) this;
        }

        public Criteria andAccidentnoBetween(Integer value1, Integer value2) {
            addCriterion("accidentno between", value1, value2, "accidentno");
            return (Criteria) this;
        }

        public Criteria andAccidentnoNotBetween(Integer value1, Integer value2) {
            addCriterion("accidentno not between", value1, value2, "accidentno");
            return (Criteria) this;
        }

        public Criteria andDriverIsNull() {
            addCriterion("driver is null");
            return (Criteria) this;
        }

        public Criteria andDriverIsNotNull() {
            addCriterion("driver is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEqualTo(String value) {
            addCriterion("driver =", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotEqualTo(String value) {
            addCriterion("driver <>", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThan(String value) {
            addCriterion("driver >", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThanOrEqualTo(String value) {
            addCriterion("driver >=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThan(String value) {
            addCriterion("driver <", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThanOrEqualTo(String value) {
            addCriterion("driver <=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLike(String value) {
            addCriterion("driver like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotLike(String value) {
            addCriterion("driver not like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverIn(List<String> values) {
            addCriterion("driver in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotIn(List<String> values) {
            addCriterion("driver not in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverBetween(String value1, String value2) {
            addCriterion("driver between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotBetween(String value1, String value2) {
            addCriterion("driver not between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andCarbrandIsNull() {
            addCriterion("carbrand is null");
            return (Criteria) this;
        }

        public Criteria andCarbrandIsNotNull() {
            addCriterion("carbrand is not null");
            return (Criteria) this;
        }

        public Criteria andCarbrandEqualTo(String value) {
            addCriterion("carbrand =", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotEqualTo(String value) {
            addCriterion("carbrand <>", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandGreaterThan(String value) {
            addCriterion("carbrand >", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandGreaterThanOrEqualTo(String value) {
            addCriterion("carbrand >=", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandLessThan(String value) {
            addCriterion("carbrand <", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandLessThanOrEqualTo(String value) {
            addCriterion("carbrand <=", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandLike(String value) {
            addCriterion("carbrand like", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotLike(String value) {
            addCriterion("carbrand not like", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandIn(List<String> values) {
            addCriterion("carbrand in", values, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotIn(List<String> values) {
            addCriterion("carbrand not in", values, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandBetween(String value1, String value2) {
            addCriterion("carbrand between", value1, value2, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotBetween(String value1, String value2) {
            addCriterion("carbrand not between", value1, value2, "carbrand");
            return (Criteria) this;
        }

        public Criteria andAccidenttimeIsNull() {
            addCriterion("accidentTime is null");
            return (Criteria) this;
        }

        public Criteria andAccidenttimeIsNotNull() {
            addCriterion("accidentTime is not null");
            return (Criteria) this;
        }

        public Criteria andAccidenttimeEqualTo(Date value) {
            addCriterion("accidentTime =", value, "accidenttime");
            return (Criteria) this;
        }

        public Criteria andAccidenttimeNotEqualTo(Date value) {
            addCriterion("accidentTime <>", value, "accidenttime");
            return (Criteria) this;
        }

        public Criteria andAccidenttimeGreaterThan(Date value) {
            addCriterion("accidentTime >", value, "accidenttime");
            return (Criteria) this;
        }

        public Criteria andAccidenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("accidentTime >=", value, "accidenttime");
            return (Criteria) this;
        }

        public Criteria andAccidenttimeLessThan(Date value) {
            addCriterion("accidentTime <", value, "accidenttime");
            return (Criteria) this;
        }

        public Criteria andAccidenttimeLessThanOrEqualTo(Date value) {
            addCriterion("accidentTime <=", value, "accidenttime");
            return (Criteria) this;
        }

        public Criteria andAccidenttimeIn(List<Date> values) {
            addCriterion("accidentTime in", values, "accidenttime");
            return (Criteria) this;
        }

        public Criteria andAccidenttimeNotIn(List<Date> values) {
            addCriterion("accidentTime not in", values, "accidenttime");
            return (Criteria) this;
        }

        public Criteria andAccidenttimeBetween(Date value1, Date value2) {
            addCriterion("accidentTime between", value1, value2, "accidenttime");
            return (Criteria) this;
        }

        public Criteria andAccidenttimeNotBetween(Date value1, Date value2) {
            addCriterion("accidentTime not between", value1, value2, "accidenttime");
            return (Criteria) this;
        }

        public Criteria andAccidentplaceIsNull() {
            addCriterion("accidentPlace is null");
            return (Criteria) this;
        }

        public Criteria andAccidentplaceIsNotNull() {
            addCriterion("accidentPlace is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentplaceEqualTo(String value) {
            addCriterion("accidentPlace =", value, "accidentplace");
            return (Criteria) this;
        }

        public Criteria andAccidentplaceNotEqualTo(String value) {
            addCriterion("accidentPlace <>", value, "accidentplace");
            return (Criteria) this;
        }

        public Criteria andAccidentplaceGreaterThan(String value) {
            addCriterion("accidentPlace >", value, "accidentplace");
            return (Criteria) this;
        }

        public Criteria andAccidentplaceGreaterThanOrEqualTo(String value) {
            addCriterion("accidentPlace >=", value, "accidentplace");
            return (Criteria) this;
        }

        public Criteria andAccidentplaceLessThan(String value) {
            addCriterion("accidentPlace <", value, "accidentplace");
            return (Criteria) this;
        }

        public Criteria andAccidentplaceLessThanOrEqualTo(String value) {
            addCriterion("accidentPlace <=", value, "accidentplace");
            return (Criteria) this;
        }

        public Criteria andAccidentplaceLike(String value) {
            addCriterion("accidentPlace like", value, "accidentplace");
            return (Criteria) this;
        }

        public Criteria andAccidentplaceNotLike(String value) {
            addCriterion("accidentPlace not like", value, "accidentplace");
            return (Criteria) this;
        }

        public Criteria andAccidentplaceIn(List<String> values) {
            addCriterion("accidentPlace in", values, "accidentplace");
            return (Criteria) this;
        }

        public Criteria andAccidentplaceNotIn(List<String> values) {
            addCriterion("accidentPlace not in", values, "accidentplace");
            return (Criteria) this;
        }

        public Criteria andAccidentplaceBetween(String value1, String value2) {
            addCriterion("accidentPlace between", value1, value2, "accidentplace");
            return (Criteria) this;
        }

        public Criteria andAccidentplaceNotBetween(String value1, String value2) {
            addCriterion("accidentPlace not between", value1, value2, "accidentplace");
            return (Criteria) this;
        }

        public Criteria andAccidentdetailsIsNull() {
            addCriterion("accidentDetails is null");
            return (Criteria) this;
        }

        public Criteria andAccidentdetailsIsNotNull() {
            addCriterion("accidentDetails is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentdetailsEqualTo(String value) {
            addCriterion("accidentDetails =", value, "accidentdetails");
            return (Criteria) this;
        }

        public Criteria andAccidentdetailsNotEqualTo(String value) {
            addCriterion("accidentDetails <>", value, "accidentdetails");
            return (Criteria) this;
        }

        public Criteria andAccidentdetailsGreaterThan(String value) {
            addCriterion("accidentDetails >", value, "accidentdetails");
            return (Criteria) this;
        }

        public Criteria andAccidentdetailsGreaterThanOrEqualTo(String value) {
            addCriterion("accidentDetails >=", value, "accidentdetails");
            return (Criteria) this;
        }

        public Criteria andAccidentdetailsLessThan(String value) {
            addCriterion("accidentDetails <", value, "accidentdetails");
            return (Criteria) this;
        }

        public Criteria andAccidentdetailsLessThanOrEqualTo(String value) {
            addCriterion("accidentDetails <=", value, "accidentdetails");
            return (Criteria) this;
        }

        public Criteria andAccidentdetailsLike(String value) {
            addCriterion("accidentDetails like", value, "accidentdetails");
            return (Criteria) this;
        }

        public Criteria andAccidentdetailsNotLike(String value) {
            addCriterion("accidentDetails not like", value, "accidentdetails");
            return (Criteria) this;
        }

        public Criteria andAccidentdetailsIn(List<String> values) {
            addCriterion("accidentDetails in", values, "accidentdetails");
            return (Criteria) this;
        }

        public Criteria andAccidentdetailsNotIn(List<String> values) {
            addCriterion("accidentDetails not in", values, "accidentdetails");
            return (Criteria) this;
        }

        public Criteria andAccidentdetailsBetween(String value1, String value2) {
            addCriterion("accidentDetails between", value1, value2, "accidentdetails");
            return (Criteria) this;
        }

        public Criteria andAccidentdetailsNotBetween(String value1, String value2) {
            addCriterion("accidentDetails not between", value1, value2, "accidentdetails");
            return (Criteria) this;
        }

        public Criteria andResponsibilityIsNull() {
            addCriterion("responsibility is null");
            return (Criteria) this;
        }

        public Criteria andResponsibilityIsNotNull() {
            addCriterion("responsibility is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibilityEqualTo(String value) {
            addCriterion("responsibility =", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityNotEqualTo(String value) {
            addCriterion("responsibility <>", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityGreaterThan(String value) {
            addCriterion("responsibility >", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityGreaterThanOrEqualTo(String value) {
            addCriterion("responsibility >=", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityLessThan(String value) {
            addCriterion("responsibility <", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityLessThanOrEqualTo(String value) {
            addCriterion("responsibility <=", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityLike(String value) {
            addCriterion("responsibility like", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityNotLike(String value) {
            addCriterion("responsibility not like", value, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityIn(List<String> values) {
            addCriterion("responsibility in", values, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityNotIn(List<String> values) {
            addCriterion("responsibility not in", values, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityBetween(String value1, String value2) {
            addCriterion("responsibility between", value1, value2, "responsibility");
            return (Criteria) this;
        }

        public Criteria andResponsibilityNotBetween(String value1, String value2) {
            addCriterion("responsibility not between", value1, value2, "responsibility");
            return (Criteria) this;
        }

        public Criteria andMaintenancefactoryIsNull() {
            addCriterion("maintenanceFactory is null");
            return (Criteria) this;
        }

        public Criteria andMaintenancefactoryIsNotNull() {
            addCriterion("maintenanceFactory is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenancefactoryEqualTo(String value) {
            addCriterion("maintenanceFactory =", value, "maintenancefactory");
            return (Criteria) this;
        }

        public Criteria andMaintenancefactoryNotEqualTo(String value) {
            addCriterion("maintenanceFactory <>", value, "maintenancefactory");
            return (Criteria) this;
        }

        public Criteria andMaintenancefactoryGreaterThan(String value) {
            addCriterion("maintenanceFactory >", value, "maintenancefactory");
            return (Criteria) this;
        }

        public Criteria andMaintenancefactoryGreaterThanOrEqualTo(String value) {
            addCriterion("maintenanceFactory >=", value, "maintenancefactory");
            return (Criteria) this;
        }

        public Criteria andMaintenancefactoryLessThan(String value) {
            addCriterion("maintenanceFactory <", value, "maintenancefactory");
            return (Criteria) this;
        }

        public Criteria andMaintenancefactoryLessThanOrEqualTo(String value) {
            addCriterion("maintenanceFactory <=", value, "maintenancefactory");
            return (Criteria) this;
        }

        public Criteria andMaintenancefactoryLike(String value) {
            addCriterion("maintenanceFactory like", value, "maintenancefactory");
            return (Criteria) this;
        }

        public Criteria andMaintenancefactoryNotLike(String value) {
            addCriterion("maintenanceFactory not like", value, "maintenancefactory");
            return (Criteria) this;
        }

        public Criteria andMaintenancefactoryIn(List<String> values) {
            addCriterion("maintenanceFactory in", values, "maintenancefactory");
            return (Criteria) this;
        }

        public Criteria andMaintenancefactoryNotIn(List<String> values) {
            addCriterion("maintenanceFactory not in", values, "maintenancefactory");
            return (Criteria) this;
        }

        public Criteria andMaintenancefactoryBetween(String value1, String value2) {
            addCriterion("maintenanceFactory between", value1, value2, "maintenancefactory");
            return (Criteria) this;
        }

        public Criteria andMaintenancefactoryNotBetween(String value1, String value2) {
            addCriterion("maintenanceFactory not between", value1, value2, "maintenancefactory");
            return (Criteria) this;
        }

        public Criteria andRepairdateIsNull() {
            addCriterion("repairDate is null");
            return (Criteria) this;
        }

        public Criteria andRepairdateIsNotNull() {
            addCriterion("repairDate is not null");
            return (Criteria) this;
        }

        public Criteria andRepairdateEqualTo(Date value) {
            addCriterionForJDBCDate("repairDate =", value, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("repairDate <>", value, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateGreaterThan(Date value) {
            addCriterionForJDBCDate("repairDate >", value, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repairDate >=", value, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateLessThan(Date value) {
            addCriterionForJDBCDate("repairDate <", value, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repairDate <=", value, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateIn(List<Date> values) {
            addCriterionForJDBCDate("repairDate in", values, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("repairDate not in", values, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repairDate between", value1, value2, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repairDate not between", value1, value2, "repairdate");
            return (Criteria) this;
        }

        public Criteria andRepairenddateIsNull() {
            addCriterion("repairEndDate is null");
            return (Criteria) this;
        }

        public Criteria andRepairenddateIsNotNull() {
            addCriterion("repairEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andRepairenddateEqualTo(Date value) {
            addCriterionForJDBCDate("repairEndDate =", value, "repairenddate");
            return (Criteria) this;
        }

        public Criteria andRepairenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("repairEndDate <>", value, "repairenddate");
            return (Criteria) this;
        }

        public Criteria andRepairenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("repairEndDate >", value, "repairenddate");
            return (Criteria) this;
        }

        public Criteria andRepairenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repairEndDate >=", value, "repairenddate");
            return (Criteria) this;
        }

        public Criteria andRepairenddateLessThan(Date value) {
            addCriterionForJDBCDate("repairEndDate <", value, "repairenddate");
            return (Criteria) this;
        }

        public Criteria andRepairenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repairEndDate <=", value, "repairenddate");
            return (Criteria) this;
        }

        public Criteria andRepairenddateIn(List<Date> values) {
            addCriterionForJDBCDate("repairEndDate in", values, "repairenddate");
            return (Criteria) this;
        }

        public Criteria andRepairenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("repairEndDate not in", values, "repairenddate");
            return (Criteria) this;
        }

        public Criteria andRepairenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repairEndDate between", value1, value2, "repairenddate");
            return (Criteria) this;
        }

        public Criteria andRepairenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repairEndDate not between", value1, value2, "repairenddate");
            return (Criteria) this;
        }

        public Criteria andDamagefeeIsNull() {
            addCriterion("damageFee is null");
            return (Criteria) this;
        }

        public Criteria andDamagefeeIsNotNull() {
            addCriterion("damageFee is not null");
            return (Criteria) this;
        }

        public Criteria andDamagefeeEqualTo(BigDecimal value) {
            addCriterion("damageFee =", value, "damagefee");
            return (Criteria) this;
        }

        public Criteria andDamagefeeNotEqualTo(BigDecimal value) {
            addCriterion("damageFee <>", value, "damagefee");
            return (Criteria) this;
        }

        public Criteria andDamagefeeGreaterThan(BigDecimal value) {
            addCriterion("damageFee >", value, "damagefee");
            return (Criteria) this;
        }

        public Criteria andDamagefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("damageFee >=", value, "damagefee");
            return (Criteria) this;
        }

        public Criteria andDamagefeeLessThan(BigDecimal value) {
            addCriterion("damageFee <", value, "damagefee");
            return (Criteria) this;
        }

        public Criteria andDamagefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("damageFee <=", value, "damagefee");
            return (Criteria) this;
        }

        public Criteria andDamagefeeIn(List<BigDecimal> values) {
            addCriterion("damageFee in", values, "damagefee");
            return (Criteria) this;
        }

        public Criteria andDamagefeeNotIn(List<BigDecimal> values) {
            addCriterion("damageFee not in", values, "damagefee");
            return (Criteria) this;
        }

        public Criteria andDamagefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("damageFee between", value1, value2, "damagefee");
            return (Criteria) this;
        }

        public Criteria andDamagefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("damageFee not between", value1, value2, "damagefee");
            return (Criteria) this;
        }

        public Criteria andInsuranceclaimamountIsNull() {
            addCriterion("InsuranceClaimAmount is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceclaimamountIsNotNull() {
            addCriterion("InsuranceClaimAmount is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceclaimamountEqualTo(BigDecimal value) {
            addCriterion("InsuranceClaimAmount =", value, "insuranceclaimamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceclaimamountNotEqualTo(BigDecimal value) {
            addCriterion("InsuranceClaimAmount <>", value, "insuranceclaimamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceclaimamountGreaterThan(BigDecimal value) {
            addCriterion("InsuranceClaimAmount >", value, "insuranceclaimamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceclaimamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("InsuranceClaimAmount >=", value, "insuranceclaimamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceclaimamountLessThan(BigDecimal value) {
            addCriterion("InsuranceClaimAmount <", value, "insuranceclaimamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceclaimamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("InsuranceClaimAmount <=", value, "insuranceclaimamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceclaimamountIn(List<BigDecimal> values) {
            addCriterion("InsuranceClaimAmount in", values, "insuranceclaimamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceclaimamountNotIn(List<BigDecimal> values) {
            addCriterion("InsuranceClaimAmount not in", values, "insuranceclaimamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceclaimamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InsuranceClaimAmount between", value1, value2, "insuranceclaimamount");
            return (Criteria) this;
        }

        public Criteria andInsuranceclaimamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InsuranceClaimAmount not between", value1, value2, "insuranceclaimamount");
            return (Criteria) this;
        }

        public Criteria andDriverborneamountIsNull() {
            addCriterion("driverBorneAmount is null");
            return (Criteria) this;
        }

        public Criteria andDriverborneamountIsNotNull() {
            addCriterion("driverBorneAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDriverborneamountEqualTo(BigDecimal value) {
            addCriterion("driverBorneAmount =", value, "driverborneamount");
            return (Criteria) this;
        }

        public Criteria andDriverborneamountNotEqualTo(BigDecimal value) {
            addCriterion("driverBorneAmount <>", value, "driverborneamount");
            return (Criteria) this;
        }

        public Criteria andDriverborneamountGreaterThan(BigDecimal value) {
            addCriterion("driverBorneAmount >", value, "driverborneamount");
            return (Criteria) this;
        }

        public Criteria andDriverborneamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("driverBorneAmount >=", value, "driverborneamount");
            return (Criteria) this;
        }

        public Criteria andDriverborneamountLessThan(BigDecimal value) {
            addCriterion("driverBorneAmount <", value, "driverborneamount");
            return (Criteria) this;
        }

        public Criteria andDriverborneamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("driverBorneAmount <=", value, "driverborneamount");
            return (Criteria) this;
        }

        public Criteria andDriverborneamountIn(List<BigDecimal> values) {
            addCriterion("driverBorneAmount in", values, "driverborneamount");
            return (Criteria) this;
        }

        public Criteria andDriverborneamountNotIn(List<BigDecimal> values) {
            addCriterion("driverBorneAmount not in", values, "driverborneamount");
            return (Criteria) this;
        }

        public Criteria andDriverborneamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("driverBorneAmount between", value1, value2, "driverborneamount");
            return (Criteria) this;
        }

        public Criteria andDriverborneamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("driverBorneAmount not between", value1, value2, "driverborneamount");
            return (Criteria) this;
        }

        public Criteria andMaintenancecostsIsNull() {
            addCriterion("maintenanceCosts is null");
            return (Criteria) this;
        }

        public Criteria andMaintenancecostsIsNotNull() {
            addCriterion("maintenanceCosts is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenancecostsEqualTo(BigDecimal value) {
            addCriterion("maintenanceCosts =", value, "maintenancecosts");
            return (Criteria) this;
        }

        public Criteria andMaintenancecostsNotEqualTo(BigDecimal value) {
            addCriterion("maintenanceCosts <>", value, "maintenancecosts");
            return (Criteria) this;
        }

        public Criteria andMaintenancecostsGreaterThan(BigDecimal value) {
            addCriterion("maintenanceCosts >", value, "maintenancecosts");
            return (Criteria) this;
        }

        public Criteria andMaintenancecostsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("maintenanceCosts >=", value, "maintenancecosts");
            return (Criteria) this;
        }

        public Criteria andMaintenancecostsLessThan(BigDecimal value) {
            addCriterion("maintenanceCosts <", value, "maintenancecosts");
            return (Criteria) this;
        }

        public Criteria andMaintenancecostsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("maintenanceCosts <=", value, "maintenancecosts");
            return (Criteria) this;
        }

        public Criteria andMaintenancecostsIn(List<BigDecimal> values) {
            addCriterion("maintenanceCosts in", values, "maintenancecosts");
            return (Criteria) this;
        }

        public Criteria andMaintenancecostsNotIn(List<BigDecimal> values) {
            addCriterion("maintenanceCosts not in", values, "maintenancecosts");
            return (Criteria) this;
        }

        public Criteria andMaintenancecostsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maintenanceCosts between", value1, value2, "maintenancecosts");
            return (Criteria) this;
        }

        public Criteria andMaintenancecostsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maintenanceCosts not between", value1, value2, "maintenancecosts");
            return (Criteria) this;
        }

        public Criteria andMaintenancecontentsIsNull() {
            addCriterion("maintenanceContents is null");
            return (Criteria) this;
        }

        public Criteria andMaintenancecontentsIsNotNull() {
            addCriterion("maintenanceContents is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenancecontentsEqualTo(String value) {
            addCriterion("maintenanceContents =", value, "maintenancecontents");
            return (Criteria) this;
        }

        public Criteria andMaintenancecontentsNotEqualTo(String value) {
            addCriterion("maintenanceContents <>", value, "maintenancecontents");
            return (Criteria) this;
        }

        public Criteria andMaintenancecontentsGreaterThan(String value) {
            addCriterion("maintenanceContents >", value, "maintenancecontents");
            return (Criteria) this;
        }

        public Criteria andMaintenancecontentsGreaterThanOrEqualTo(String value) {
            addCriterion("maintenanceContents >=", value, "maintenancecontents");
            return (Criteria) this;
        }

        public Criteria andMaintenancecontentsLessThan(String value) {
            addCriterion("maintenanceContents <", value, "maintenancecontents");
            return (Criteria) this;
        }

        public Criteria andMaintenancecontentsLessThanOrEqualTo(String value) {
            addCriterion("maintenanceContents <=", value, "maintenancecontents");
            return (Criteria) this;
        }

        public Criteria andMaintenancecontentsLike(String value) {
            addCriterion("maintenanceContents like", value, "maintenancecontents");
            return (Criteria) this;
        }

        public Criteria andMaintenancecontentsNotLike(String value) {
            addCriterion("maintenanceContents not like", value, "maintenancecontents");
            return (Criteria) this;
        }

        public Criteria andMaintenancecontentsIn(List<String> values) {
            addCriterion("maintenanceContents in", values, "maintenancecontents");
            return (Criteria) this;
        }

        public Criteria andMaintenancecontentsNotIn(List<String> values) {
            addCriterion("maintenanceContents not in", values, "maintenancecontents");
            return (Criteria) this;
        }

        public Criteria andMaintenancecontentsBetween(String value1, String value2) {
            addCriterion("maintenanceContents between", value1, value2, "maintenancecontents");
            return (Criteria) this;
        }

        public Criteria andMaintenancecontentsNotBetween(String value1, String value2) {
            addCriterion("maintenanceContents not between", value1, value2, "maintenancecontents");
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