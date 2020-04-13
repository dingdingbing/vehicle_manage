package com.igeek.pojo.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CarapplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarapplicationExample() {
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

        public Criteria andApplicationnoIsNull() {
            addCriterion("applicationNo is null");
            return (Criteria) this;
        }

        public Criteria andApplicationnoIsNotNull() {
            addCriterion("applicationNo is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationnoEqualTo(Integer value) {
            addCriterion("applicationNo =", value, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoNotEqualTo(Integer value) {
            addCriterion("applicationNo <>", value, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoGreaterThan(Integer value) {
            addCriterion("applicationNo >", value, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("applicationNo >=", value, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoLessThan(Integer value) {
            addCriterion("applicationNo <", value, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoLessThanOrEqualTo(Integer value) {
            addCriterion("applicationNo <=", value, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoIn(List<Integer> values) {
            addCriterion("applicationNo in", values, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoNotIn(List<Integer> values) {
            addCriterion("applicationNo not in", values, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoBetween(Integer value1, Integer value2) {
            addCriterion("applicationNo between", value1, value2, "applicationno");
            return (Criteria) this;
        }

        public Criteria andApplicationnoNotBetween(Integer value1, Integer value2) {
            addCriterion("applicationNo not between", value1, value2, "applicationno");
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

        public Criteria andSelfdrivingIsNull() {
            addCriterion("selfDriving is null");
            return (Criteria) this;
        }

        public Criteria andSelfdrivingIsNotNull() {
            addCriterion("selfDriving is not null");
            return (Criteria) this;
        }

        public Criteria andSelfdrivingEqualTo(Integer value) {
            addCriterion("selfDriving =", value, "selfdriving");
            return (Criteria) this;
        }

        public Criteria andSelfdrivingNotEqualTo(Integer value) {
            addCriterion("selfDriving <>", value, "selfdriving");
            return (Criteria) this;
        }

        public Criteria andSelfdrivingGreaterThan(Integer value) {
            addCriterion("selfDriving >", value, "selfdriving");
            return (Criteria) this;
        }

        public Criteria andSelfdrivingGreaterThanOrEqualTo(Integer value) {
            addCriterion("selfDriving >=", value, "selfdriving");
            return (Criteria) this;
        }

        public Criteria andSelfdrivingLessThan(Integer value) {
            addCriterion("selfDriving <", value, "selfdriving");
            return (Criteria) this;
        }

        public Criteria andSelfdrivingLessThanOrEqualTo(Integer value) {
            addCriterion("selfDriving <=", value, "selfdriving");
            return (Criteria) this;
        }

        public Criteria andSelfdrivingIn(List<Integer> values) {
            addCriterion("selfDriving in", values, "selfdriving");
            return (Criteria) this;
        }

        public Criteria andSelfdrivingNotIn(List<Integer> values) {
            addCriterion("selfDriving not in", values, "selfdriving");
            return (Criteria) this;
        }

        public Criteria andSelfdrivingBetween(Integer value1, Integer value2) {
            addCriterion("selfDriving between", value1, value2, "selfdriving");
            return (Criteria) this;
        }

        public Criteria andSelfdrivingNotBetween(Integer value1, Integer value2) {
            addCriterion("selfDriving not between", value1, value2, "selfdriving");
            return (Criteria) this;
        }

        public Criteria andPassengerIsNull() {
            addCriterion("passenger is null");
            return (Criteria) this;
        }

        public Criteria andPassengerIsNotNull() {
            addCriterion("passenger is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerEqualTo(String value) {
            addCriterion("passenger =", value, "passenger");
            return (Criteria) this;
        }

        public Criteria andPassengerNotEqualTo(String value) {
            addCriterion("passenger <>", value, "passenger");
            return (Criteria) this;
        }

        public Criteria andPassengerGreaterThan(String value) {
            addCriterion("passenger >", value, "passenger");
            return (Criteria) this;
        }

        public Criteria andPassengerGreaterThanOrEqualTo(String value) {
            addCriterion("passenger >=", value, "passenger");
            return (Criteria) this;
        }

        public Criteria andPassengerLessThan(String value) {
            addCriterion("passenger <", value, "passenger");
            return (Criteria) this;
        }

        public Criteria andPassengerLessThanOrEqualTo(String value) {
            addCriterion("passenger <=", value, "passenger");
            return (Criteria) this;
        }

        public Criteria andPassengerLike(String value) {
            addCriterion("passenger like", value, "passenger");
            return (Criteria) this;
        }

        public Criteria andPassengerNotLike(String value) {
            addCriterion("passenger not like", value, "passenger");
            return (Criteria) this;
        }

        public Criteria andPassengerIn(List<String> values) {
            addCriterion("passenger in", values, "passenger");
            return (Criteria) this;
        }

        public Criteria andPassengerNotIn(List<String> values) {
            addCriterion("passenger not in", values, "passenger");
            return (Criteria) this;
        }

        public Criteria andPassengerBetween(String value1, String value2) {
            addCriterion("passenger between", value1, value2, "passenger");
            return (Criteria) this;
        }

        public Criteria andPassengerNotBetween(String value1, String value2) {
            addCriterion("passenger not between", value1, value2, "passenger");
            return (Criteria) this;
        }

        public Criteria andPassengernumberIsNull() {
            addCriterion("passengerNumber is null");
            return (Criteria) this;
        }

        public Criteria andPassengernumberIsNotNull() {
            addCriterion("passengerNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPassengernumberEqualTo(Integer value) {
            addCriterion("passengerNumber =", value, "passengernumber");
            return (Criteria) this;
        }

        public Criteria andPassengernumberNotEqualTo(Integer value) {
            addCriterion("passengerNumber <>", value, "passengernumber");
            return (Criteria) this;
        }

        public Criteria andPassengernumberGreaterThan(Integer value) {
            addCriterion("passengerNumber >", value, "passengernumber");
            return (Criteria) this;
        }

        public Criteria andPassengernumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("passengerNumber >=", value, "passengernumber");
            return (Criteria) this;
        }

        public Criteria andPassengernumberLessThan(Integer value) {
            addCriterion("passengerNumber <", value, "passengernumber");
            return (Criteria) this;
        }

        public Criteria andPassengernumberLessThanOrEqualTo(Integer value) {
            addCriterion("passengerNumber <=", value, "passengernumber");
            return (Criteria) this;
        }

        public Criteria andPassengernumberIn(List<Integer> values) {
            addCriterion("passengerNumber in", values, "passengernumber");
            return (Criteria) this;
        }

        public Criteria andPassengernumberNotIn(List<Integer> values) {
            addCriterion("passengerNumber not in", values, "passengernumber");
            return (Criteria) this;
        }

        public Criteria andPassengernumberBetween(Integer value1, Integer value2) {
            addCriterion("passengerNumber between", value1, value2, "passengernumber");
            return (Criteria) this;
        }

        public Criteria andPassengernumberNotBetween(Integer value1, Integer value2) {
            addCriterion("passengerNumber not between", value1, value2, "passengernumber");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeIsNull() {
            addCriterion("departureTime is null");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeIsNotNull() {
            addCriterion("departureTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeEqualTo(Date value) {
            addCriterionForJDBCDate("departureTime =", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("departureTime <>", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("departureTime >", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("departureTime >=", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeLessThan(Date value) {
            addCriterionForJDBCDate("departureTime <", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("departureTime <=", value, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeIn(List<Date> values) {
            addCriterionForJDBCDate("departureTime in", values, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("departureTime not in", values, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("departureTime between", value1, value2, "departuretime");
            return (Criteria) this;
        }

        public Criteria andDeparturetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("departureTime not between", value1, value2, "departuretime");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNull() {
            addCriterion("returnTime is null");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNotNull() {
            addCriterion("returnTime is not null");
            return (Criteria) this;
        }

        public Criteria andReturntimeEqualTo(Date value) {
            addCriterionForJDBCDate("returnTime =", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("returnTime <>", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThan(Date value) {
            addCriterionForJDBCDate("returnTime >", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("returnTime >=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThan(Date value) {
            addCriterionForJDBCDate("returnTime <", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("returnTime <=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeIn(List<Date> values) {
            addCriterionForJDBCDate("returnTime in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("returnTime not in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("returnTime between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("returnTime not between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andReasonsIsNull() {
            addCriterion("reasons is null");
            return (Criteria) this;
        }

        public Criteria andReasonsIsNotNull() {
            addCriterion("reasons is not null");
            return (Criteria) this;
        }

        public Criteria andReasonsEqualTo(String value) {
            addCriterion("reasons =", value, "reasons");
            return (Criteria) this;
        }

        public Criteria andReasonsNotEqualTo(String value) {
            addCriterion("reasons <>", value, "reasons");
            return (Criteria) this;
        }

        public Criteria andReasonsGreaterThan(String value) {
            addCriterion("reasons >", value, "reasons");
            return (Criteria) this;
        }

        public Criteria andReasonsGreaterThanOrEqualTo(String value) {
            addCriterion("reasons >=", value, "reasons");
            return (Criteria) this;
        }

        public Criteria andReasonsLessThan(String value) {
            addCriterion("reasons <", value, "reasons");
            return (Criteria) this;
        }

        public Criteria andReasonsLessThanOrEqualTo(String value) {
            addCriterion("reasons <=", value, "reasons");
            return (Criteria) this;
        }

        public Criteria andReasonsLike(String value) {
            addCriterion("reasons like", value, "reasons");
            return (Criteria) this;
        }

        public Criteria andReasonsNotLike(String value) {
            addCriterion("reasons not like", value, "reasons");
            return (Criteria) this;
        }

        public Criteria andReasonsIn(List<String> values) {
            addCriterion("reasons in", values, "reasons");
            return (Criteria) this;
        }

        public Criteria andReasonsNotIn(List<String> values) {
            addCriterion("reasons not in", values, "reasons");
            return (Criteria) this;
        }

        public Criteria andReasonsBetween(String value1, String value2) {
            addCriterion("reasons between", value1, value2, "reasons");
            return (Criteria) this;
        }

        public Criteria andReasonsNotBetween(String value1, String value2) {
            addCriterion("reasons not between", value1, value2, "reasons");
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

        public Criteria andDesignatedvehicleIsNull() {
            addCriterion("designatedVehicle is null");
            return (Criteria) this;
        }

        public Criteria andDesignatedvehicleIsNotNull() {
            addCriterion("designatedVehicle is not null");
            return (Criteria) this;
        }

        public Criteria andDesignatedvehicleEqualTo(Integer value) {
            addCriterion("designatedVehicle =", value, "designatedvehicle");
            return (Criteria) this;
        }

        public Criteria andDesignatedvehicleNotEqualTo(Integer value) {
            addCriterion("designatedVehicle <>", value, "designatedvehicle");
            return (Criteria) this;
        }

        public Criteria andDesignatedvehicleGreaterThan(Integer value) {
            addCriterion("designatedVehicle >", value, "designatedvehicle");
            return (Criteria) this;
        }

        public Criteria andDesignatedvehicleGreaterThanOrEqualTo(Integer value) {
            addCriterion("designatedVehicle >=", value, "designatedvehicle");
            return (Criteria) this;
        }

        public Criteria andDesignatedvehicleLessThan(Integer value) {
            addCriterion("designatedVehicle <", value, "designatedvehicle");
            return (Criteria) this;
        }

        public Criteria andDesignatedvehicleLessThanOrEqualTo(Integer value) {
            addCriterion("designatedVehicle <=", value, "designatedvehicle");
            return (Criteria) this;
        }

        public Criteria andDesignatedvehicleIn(List<Integer> values) {
            addCriterion("designatedVehicle in", values, "designatedvehicle");
            return (Criteria) this;
        }

        public Criteria andDesignatedvehicleNotIn(List<Integer> values) {
            addCriterion("designatedVehicle not in", values, "designatedvehicle");
            return (Criteria) this;
        }

        public Criteria andDesignatedvehicleBetween(Integer value1, Integer value2) {
            addCriterion("designatedVehicle between", value1, value2, "designatedvehicle");
            return (Criteria) this;
        }

        public Criteria andDesignatedvehicleNotBetween(Integer value1, Integer value2) {
            addCriterion("designatedVehicle not between", value1, value2, "designatedvehicle");
            return (Criteria) this;
        }

        public Criteria andDriverinformationIsNull() {
            addCriterion("driverInformation is null");
            return (Criteria) this;
        }

        public Criteria andDriverinformationIsNotNull() {
            addCriterion("driverInformation is not null");
            return (Criteria) this;
        }

        public Criteria andDriverinformationEqualTo(String value) {
            addCriterion("driverInformation =", value, "driverinformation");
            return (Criteria) this;
        }

        public Criteria andDriverinformationNotEqualTo(String value) {
            addCriterion("driverInformation <>", value, "driverinformation");
            return (Criteria) this;
        }

        public Criteria andDriverinformationGreaterThan(String value) {
            addCriterion("driverInformation >", value, "driverinformation");
            return (Criteria) this;
        }

        public Criteria andDriverinformationGreaterThanOrEqualTo(String value) {
            addCriterion("driverInformation >=", value, "driverinformation");
            return (Criteria) this;
        }

        public Criteria andDriverinformationLessThan(String value) {
            addCriterion("driverInformation <", value, "driverinformation");
            return (Criteria) this;
        }

        public Criteria andDriverinformationLessThanOrEqualTo(String value) {
            addCriterion("driverInformation <=", value, "driverinformation");
            return (Criteria) this;
        }

        public Criteria andDriverinformationLike(String value) {
            addCriterion("driverInformation like", value, "driverinformation");
            return (Criteria) this;
        }

        public Criteria andDriverinformationNotLike(String value) {
            addCriterion("driverInformation not like", value, "driverinformation");
            return (Criteria) this;
        }

        public Criteria andDriverinformationIn(List<String> values) {
            addCriterion("driverInformation in", values, "driverinformation");
            return (Criteria) this;
        }

        public Criteria andDriverinformationNotIn(List<String> values) {
            addCriterion("driverInformation not in", values, "driverinformation");
            return (Criteria) this;
        }

        public Criteria andDriverinformationBetween(String value1, String value2) {
            addCriterion("driverInformation between", value1, value2, "driverinformation");
            return (Criteria) this;
        }

        public Criteria andDriverinformationNotBetween(String value1, String value2) {
            addCriterion("driverInformation not between", value1, value2, "driverinformation");
            return (Criteria) this;
        }

        public Criteria andTimeandplaceIsNull() {
            addCriterion("timeAndPlace is null");
            return (Criteria) this;
        }

        public Criteria andTimeandplaceIsNotNull() {
            addCriterion("timeAndPlace is not null");
            return (Criteria) this;
        }

        public Criteria andTimeandplaceEqualTo(String value) {
            addCriterion("timeAndPlace =", value, "timeandplace");
            return (Criteria) this;
        }

        public Criteria andTimeandplaceNotEqualTo(String value) {
            addCriterion("timeAndPlace <>", value, "timeandplace");
            return (Criteria) this;
        }

        public Criteria andTimeandplaceGreaterThan(String value) {
            addCriterion("timeAndPlace >", value, "timeandplace");
            return (Criteria) this;
        }

        public Criteria andTimeandplaceGreaterThanOrEqualTo(String value) {
            addCriterion("timeAndPlace >=", value, "timeandplace");
            return (Criteria) this;
        }

        public Criteria andTimeandplaceLessThan(String value) {
            addCriterion("timeAndPlace <", value, "timeandplace");
            return (Criteria) this;
        }

        public Criteria andTimeandplaceLessThanOrEqualTo(String value) {
            addCriterion("timeAndPlace <=", value, "timeandplace");
            return (Criteria) this;
        }

        public Criteria andTimeandplaceLike(String value) {
            addCriterion("timeAndPlace like", value, "timeandplace");
            return (Criteria) this;
        }

        public Criteria andTimeandplaceNotLike(String value) {
            addCriterion("timeAndPlace not like", value, "timeandplace");
            return (Criteria) this;
        }

        public Criteria andTimeandplaceIn(List<String> values) {
            addCriterion("timeAndPlace in", values, "timeandplace");
            return (Criteria) this;
        }

        public Criteria andTimeandplaceNotIn(List<String> values) {
            addCriterion("timeAndPlace not in", values, "timeandplace");
            return (Criteria) this;
        }

        public Criteria andTimeandplaceBetween(String value1, String value2) {
            addCriterion("timeAndPlace between", value1, value2, "timeandplace");
            return (Criteria) this;
        }

        public Criteria andTimeandplaceNotBetween(String value1, String value2) {
            addCriterion("timeAndPlace not between", value1, value2, "timeandplace");
            return (Criteria) this;
        }

        public Criteria andActualinformationIsNull() {
            addCriterion("actualInformation is null");
            return (Criteria) this;
        }

        public Criteria andActualinformationIsNotNull() {
            addCriterion("actualInformation is not null");
            return (Criteria) this;
        }

        public Criteria andActualinformationEqualTo(String value) {
            addCriterion("actualInformation =", value, "actualinformation");
            return (Criteria) this;
        }

        public Criteria andActualinformationNotEqualTo(String value) {
            addCriterion("actualInformation <>", value, "actualinformation");
            return (Criteria) this;
        }

        public Criteria andActualinformationGreaterThan(String value) {
            addCriterion("actualInformation >", value, "actualinformation");
            return (Criteria) this;
        }

        public Criteria andActualinformationGreaterThanOrEqualTo(String value) {
            addCriterion("actualInformation >=", value, "actualinformation");
            return (Criteria) this;
        }

        public Criteria andActualinformationLessThan(String value) {
            addCriterion("actualInformation <", value, "actualinformation");
            return (Criteria) this;
        }

        public Criteria andActualinformationLessThanOrEqualTo(String value) {
            addCriterion("actualInformation <=", value, "actualinformation");
            return (Criteria) this;
        }

        public Criteria andActualinformationLike(String value) {
            addCriterion("actualInformation like", value, "actualinformation");
            return (Criteria) this;
        }

        public Criteria andActualinformationNotLike(String value) {
            addCriterion("actualInformation not like", value, "actualinformation");
            return (Criteria) this;
        }

        public Criteria andActualinformationIn(List<String> values) {
            addCriterion("actualInformation in", values, "actualinformation");
            return (Criteria) this;
        }

        public Criteria andActualinformationNotIn(List<String> values) {
            addCriterion("actualInformation not in", values, "actualinformation");
            return (Criteria) this;
        }

        public Criteria andActualinformationBetween(String value1, String value2) {
            addCriterion("actualInformation between", value1, value2, "actualinformation");
            return (Criteria) this;
        }

        public Criteria andActualinformationNotBetween(String value1, String value2) {
            addCriterion("actualInformation not between", value1, value2, "actualinformation");
            return (Criteria) this;
        }

        public Criteria andFuelIsNull() {
            addCriterion("fuel is null");
            return (Criteria) this;
        }

        public Criteria andFuelIsNotNull() {
            addCriterion("fuel is not null");
            return (Criteria) this;
        }

        public Criteria andFuelEqualTo(String value) {
            addCriterion("fuel =", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotEqualTo(String value) {
            addCriterion("fuel <>", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelGreaterThan(String value) {
            addCriterion("fuel >", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelGreaterThanOrEqualTo(String value) {
            addCriterion("fuel >=", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelLessThan(String value) {
            addCriterion("fuel <", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelLessThanOrEqualTo(String value) {
            addCriterion("fuel <=", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelLike(String value) {
            addCriterion("fuel like", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotLike(String value) {
            addCriterion("fuel not like", value, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelIn(List<String> values) {
            addCriterion("fuel in", values, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotIn(List<String> values) {
            addCriterion("fuel not in", values, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelBetween(String value1, String value2) {
            addCriterion("fuel between", value1, value2, "fuel");
            return (Criteria) this;
        }

        public Criteria andFuelNotBetween(String value1, String value2) {
            addCriterion("fuel not between", value1, value2, "fuel");
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

        public Criteria andCostEqualTo(Integer value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Integer value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Integer value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Integer value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Integer value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Integer> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Integer> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Integer value1, Integer value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Integer value1, Integer value2) {
            addCriterion("cost not between", value1, value2, "cost");
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