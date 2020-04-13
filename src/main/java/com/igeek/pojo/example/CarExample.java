package com.igeek.pojo.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andCarnoIsNull() {
            addCriterion("carNo is null");
            return (Criteria) this;
        }

        public Criteria andCarnoIsNotNull() {
            addCriterion("carNo is not null");
            return (Criteria) this;
        }

        public Criteria andCarnoEqualTo(Integer value) {
            addCriterion("carNo =", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotEqualTo(Integer value) {
            addCriterion("carNo <>", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoGreaterThan(Integer value) {
            addCriterion("carNo >", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("carNo >=", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLessThan(Integer value) {
            addCriterion("carNo <", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLessThanOrEqualTo(Integer value) {
            addCriterion("carNo <=", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoIn(List<Integer> values) {
            addCriterion("carNo in", values, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotIn(List<Integer> values) {
            addCriterion("carNo not in", values, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoBetween(Integer value1, Integer value2) {
            addCriterion("carNo between", value1, value2, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotBetween(Integer value1, Integer value2) {
            addCriterion("carNo not between", value1, value2, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnameIsNull() {
            addCriterion("carName is null");
            return (Criteria) this;
        }

        public Criteria andCarnameIsNotNull() {
            addCriterion("carName is not null");
            return (Criteria) this;
        }

        public Criteria andCarnameEqualTo(String value) {
            addCriterion("carName =", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameNotEqualTo(String value) {
            addCriterion("carName <>", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameGreaterThan(String value) {
            addCriterion("carName >", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameGreaterThanOrEqualTo(String value) {
            addCriterion("carName >=", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameLessThan(String value) {
            addCriterion("carName <", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameLessThanOrEqualTo(String value) {
            addCriterion("carName <=", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameLike(String value) {
            addCriterion("carName like", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameNotLike(String value) {
            addCriterion("carName not like", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameIn(List<String> values) {
            addCriterion("carName in", values, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameNotIn(List<String> values) {
            addCriterion("carName not in", values, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameBetween(String value1, String value2) {
            addCriterion("carName between", value1, value2, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameNotBetween(String value1, String value2) {
            addCriterion("carName not between", value1, value2, "carname");
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

        public Criteria andCarspecsIsNull() {
            addCriterion("carSpecs is null");
            return (Criteria) this;
        }

        public Criteria andCarspecsIsNotNull() {
            addCriterion("carSpecs is not null");
            return (Criteria) this;
        }

        public Criteria andCarspecsEqualTo(String value) {
            addCriterion("carSpecs =", value, "carspecs");
            return (Criteria) this;
        }

        public Criteria andCarspecsNotEqualTo(String value) {
            addCriterion("carSpecs <>", value, "carspecs");
            return (Criteria) this;
        }

        public Criteria andCarspecsGreaterThan(String value) {
            addCriterion("carSpecs >", value, "carspecs");
            return (Criteria) this;
        }

        public Criteria andCarspecsGreaterThanOrEqualTo(String value) {
            addCriterion("carSpecs >=", value, "carspecs");
            return (Criteria) this;
        }

        public Criteria andCarspecsLessThan(String value) {
            addCriterion("carSpecs <", value, "carspecs");
            return (Criteria) this;
        }

        public Criteria andCarspecsLessThanOrEqualTo(String value) {
            addCriterion("carSpecs <=", value, "carspecs");
            return (Criteria) this;
        }

        public Criteria andCarspecsLike(String value) {
            addCriterion("carSpecs like", value, "carspecs");
            return (Criteria) this;
        }

        public Criteria andCarspecsNotLike(String value) {
            addCriterion("carSpecs not like", value, "carspecs");
            return (Criteria) this;
        }

        public Criteria andCarspecsIn(List<String> values) {
            addCriterion("carSpecs in", values, "carspecs");
            return (Criteria) this;
        }

        public Criteria andCarspecsNotIn(List<String> values) {
            addCriterion("carSpecs not in", values, "carspecs");
            return (Criteria) this;
        }

        public Criteria andCarspecsBetween(String value1, String value2) {
            addCriterion("carSpecs between", value1, value2, "carspecs");
            return (Criteria) this;
        }

        public Criteria andCarspecsNotBetween(String value1, String value2) {
            addCriterion("carSpecs not between", value1, value2, "carspecs");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andProductiondateIsNull() {
            addCriterion("productionDate is null");
            return (Criteria) this;
        }

        public Criteria andProductiondateIsNotNull() {
            addCriterion("productionDate is not null");
            return (Criteria) this;
        }

        public Criteria andProductiondateEqualTo(Date value) {
            addCriterionForJDBCDate("productionDate =", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateNotEqualTo(Date value) {
            addCriterionForJDBCDate("productionDate <>", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateGreaterThan(Date value) {
            addCriterionForJDBCDate("productionDate >", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("productionDate >=", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateLessThan(Date value) {
            addCriterionForJDBCDate("productionDate <", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("productionDate <=", value, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateIn(List<Date> values) {
            addCriterionForJDBCDate("productionDate in", values, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateNotIn(List<Date> values) {
            addCriterionForJDBCDate("productionDate not in", values, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("productionDate between", value1, value2, "productiondate");
            return (Criteria) this;
        }

        public Criteria andProductiondateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("productionDate not between", value1, value2, "productiondate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateIsNull() {
            addCriterion("purchaseDate is null");
            return (Criteria) this;
        }

        public Criteria andPurchasedateIsNotNull() {
            addCriterion("purchaseDate is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasedateEqualTo(Date value) {
            addCriterionForJDBCDate("purchaseDate =", value, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("purchaseDate <>", value, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateGreaterThan(Date value) {
            addCriterionForJDBCDate("purchaseDate >", value, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchaseDate >=", value, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateLessThan(Date value) {
            addCriterionForJDBCDate("purchaseDate <", value, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchaseDate <=", value, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateIn(List<Date> values) {
            addCriterionForJDBCDate("purchaseDate in", values, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("purchaseDate not in", values, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchaseDate between", value1, value2, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchaseDate not between", value1, value2, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andEnginenoIsNull() {
            addCriterion("engineNo is null");
            return (Criteria) this;
        }

        public Criteria andEnginenoIsNotNull() {
            addCriterion("engineNo is not null");
            return (Criteria) this;
        }

        public Criteria andEnginenoEqualTo(String value) {
            addCriterion("engineNo =", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoNotEqualTo(String value) {
            addCriterion("engineNo <>", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoGreaterThan(String value) {
            addCriterion("engineNo >", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoGreaterThanOrEqualTo(String value) {
            addCriterion("engineNo >=", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoLessThan(String value) {
            addCriterion("engineNo <", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoLessThanOrEqualTo(String value) {
            addCriterion("engineNo <=", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoLike(String value) {
            addCriterion("engineNo like", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoNotLike(String value) {
            addCriterion("engineNo not like", value, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoIn(List<String> values) {
            addCriterion("engineNo in", values, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoNotIn(List<String> values) {
            addCriterion("engineNo not in", values, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoBetween(String value1, String value2) {
            addCriterion("engineNo between", value1, value2, "engineno");
            return (Criteria) this;
        }

        public Criteria andEnginenoNotBetween(String value1, String value2) {
            addCriterion("engineNo not between", value1, value2, "engineno");
            return (Criteria) this;
        }

        public Criteria andFramenoIsNull() {
            addCriterion("frameNo is null");
            return (Criteria) this;
        }

        public Criteria andFramenoIsNotNull() {
            addCriterion("frameNo is not null");
            return (Criteria) this;
        }

        public Criteria andFramenoEqualTo(String value) {
            addCriterion("frameNo =", value, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoNotEqualTo(String value) {
            addCriterion("frameNo <>", value, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoGreaterThan(String value) {
            addCriterion("frameNo >", value, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoGreaterThanOrEqualTo(String value) {
            addCriterion("frameNo >=", value, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoLessThan(String value) {
            addCriterion("frameNo <", value, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoLessThanOrEqualTo(String value) {
            addCriterion("frameNo <=", value, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoLike(String value) {
            addCriterion("frameNo like", value, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoNotLike(String value) {
            addCriterion("frameNo not like", value, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoIn(List<String> values) {
            addCriterion("frameNo in", values, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoNotIn(List<String> values) {
            addCriterion("frameNo not in", values, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoBetween(String value1, String value2) {
            addCriterion("frameNo between", value1, value2, "frameno");
            return (Criteria) this;
        }

        public Criteria andFramenoNotBetween(String value1, String value2) {
            addCriterion("frameNo not between", value1, value2, "frameno");
            return (Criteria) this;
        }

        public Criteria andStorageIsNull() {
            addCriterion("storage is null");
            return (Criteria) this;
        }

        public Criteria andStorageIsNotNull() {
            addCriterion("storage is not null");
            return (Criteria) this;
        }

        public Criteria andStorageEqualTo(String value) {
            addCriterion("storage =", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotEqualTo(String value) {
            addCriterion("storage <>", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThan(String value) {
            addCriterion("storage >", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThanOrEqualTo(String value) {
            addCriterion("storage >=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThan(String value) {
            addCriterion("storage <", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThanOrEqualTo(String value) {
            addCriterion("storage <=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLike(String value) {
            addCriterion("storage like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotLike(String value) {
            addCriterion("storage not like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageIn(List<String> values) {
            addCriterion("storage in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotIn(List<String> values) {
            addCriterion("storage not in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageBetween(String value1, String value2) {
            addCriterion("storage between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotBetween(String value1, String value2) {
            addCriterion("storage not between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andManagerIsNull() {
            addCriterion("manager is null");
            return (Criteria) this;
        }

        public Criteria andManagerIsNotNull() {
            addCriterion("manager is not null");
            return (Criteria) this;
        }

        public Criteria andManagerEqualTo(String value) {
            addCriterion("manager =", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotEqualTo(String value) {
            addCriterion("manager <>", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThan(String value) {
            addCriterion("manager >", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThanOrEqualTo(String value) {
            addCriterion("manager >=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThan(String value) {
            addCriterion("manager <", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThanOrEqualTo(String value) {
            addCriterion("manager <=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLike(String value) {
            addCriterion("manager like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotLike(String value) {
            addCriterion("manager not like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerIn(List<String> values) {
            addCriterion("manager in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotIn(List<String> values) {
            addCriterion("manager not in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerBetween(String value1, String value2) {
            addCriterion("manager between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotBetween(String value1, String value2) {
            addCriterion("manager not between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAdditionaldescriptionIsNull() {
            addCriterion("additionalDescription is null");
            return (Criteria) this;
        }

        public Criteria andAdditionaldescriptionIsNotNull() {
            addCriterion("additionalDescription is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionaldescriptionEqualTo(String value) {
            addCriterion("additionalDescription =", value, "additionaldescription");
            return (Criteria) this;
        }

        public Criteria andAdditionaldescriptionNotEqualTo(String value) {
            addCriterion("additionalDescription <>", value, "additionaldescription");
            return (Criteria) this;
        }

        public Criteria andAdditionaldescriptionGreaterThan(String value) {
            addCriterion("additionalDescription >", value, "additionaldescription");
            return (Criteria) this;
        }

        public Criteria andAdditionaldescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("additionalDescription >=", value, "additionaldescription");
            return (Criteria) this;
        }

        public Criteria andAdditionaldescriptionLessThan(String value) {
            addCriterion("additionalDescription <", value, "additionaldescription");
            return (Criteria) this;
        }

        public Criteria andAdditionaldescriptionLessThanOrEqualTo(String value) {
            addCriterion("additionalDescription <=", value, "additionaldescription");
            return (Criteria) this;
        }

        public Criteria andAdditionaldescriptionLike(String value) {
            addCriterion("additionalDescription like", value, "additionaldescription");
            return (Criteria) this;
        }

        public Criteria andAdditionaldescriptionNotLike(String value) {
            addCriterion("additionalDescription not like", value, "additionaldescription");
            return (Criteria) this;
        }

        public Criteria andAdditionaldescriptionIn(List<String> values) {
            addCriterion("additionalDescription in", values, "additionaldescription");
            return (Criteria) this;
        }

        public Criteria andAdditionaldescriptionNotIn(List<String> values) {
            addCriterion("additionalDescription not in", values, "additionaldescription");
            return (Criteria) this;
        }

        public Criteria andAdditionaldescriptionBetween(String value1, String value2) {
            addCriterion("additionalDescription between", value1, value2, "additionaldescription");
            return (Criteria) this;
        }

        public Criteria andAdditionaldescriptionNotBetween(String value1, String value2) {
            addCriterion("additionalDescription not between", value1, value2, "additionaldescription");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andNextannualinspectiondateIsNull() {
            addCriterion("nextAnnualInspectionDate is null");
            return (Criteria) this;
        }

        public Criteria andNextannualinspectiondateIsNotNull() {
            addCriterion("nextAnnualInspectionDate is not null");
            return (Criteria) this;
        }

        public Criteria andNextannualinspectiondateEqualTo(Date value) {
            addCriterionForJDBCDate("nextAnnualInspectionDate =", value, "nextannualinspectiondate");
            return (Criteria) this;
        }

        public Criteria andNextannualinspectiondateNotEqualTo(Date value) {
            addCriterionForJDBCDate("nextAnnualInspectionDate <>", value, "nextannualinspectiondate");
            return (Criteria) this;
        }

        public Criteria andNextannualinspectiondateGreaterThan(Date value) {
            addCriterionForJDBCDate("nextAnnualInspectionDate >", value, "nextannualinspectiondate");
            return (Criteria) this;
        }

        public Criteria andNextannualinspectiondateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nextAnnualInspectionDate >=", value, "nextannualinspectiondate");
            return (Criteria) this;
        }

        public Criteria andNextannualinspectiondateLessThan(Date value) {
            addCriterionForJDBCDate("nextAnnualInspectionDate <", value, "nextannualinspectiondate");
            return (Criteria) this;
        }

        public Criteria andNextannualinspectiondateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nextAnnualInspectionDate <=", value, "nextannualinspectiondate");
            return (Criteria) this;
        }

        public Criteria andNextannualinspectiondateIn(List<Date> values) {
            addCriterionForJDBCDate("nextAnnualInspectionDate in", values, "nextannualinspectiondate");
            return (Criteria) this;
        }

        public Criteria andNextannualinspectiondateNotIn(List<Date> values) {
            addCriterionForJDBCDate("nextAnnualInspectionDate not in", values, "nextannualinspectiondate");
            return (Criteria) this;
        }

        public Criteria andNextannualinspectiondateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nextAnnualInspectionDate between", value1, value2, "nextannualinspectiondate");
            return (Criteria) this;
        }

        public Criteria andNextannualinspectiondateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nextAnnualInspectionDate not between", value1, value2, "nextannualinspectiondate");
            return (Criteria) this;
        }

        public Criteria andInsurancedeadlineIsNull() {
            addCriterion("insuranceDeadline is null");
            return (Criteria) this;
        }

        public Criteria andInsurancedeadlineIsNotNull() {
            addCriterion("insuranceDeadline is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancedeadlineEqualTo(Date value) {
            addCriterionForJDBCDate("insuranceDeadline =", value, "insurancedeadline");
            return (Criteria) this;
        }

        public Criteria andInsurancedeadlineNotEqualTo(Date value) {
            addCriterionForJDBCDate("insuranceDeadline <>", value, "insurancedeadline");
            return (Criteria) this;
        }

        public Criteria andInsurancedeadlineGreaterThan(Date value) {
            addCriterionForJDBCDate("insuranceDeadline >", value, "insurancedeadline");
            return (Criteria) this;
        }

        public Criteria andInsurancedeadlineGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("insuranceDeadline >=", value, "insurancedeadline");
            return (Criteria) this;
        }

        public Criteria andInsurancedeadlineLessThan(Date value) {
            addCriterionForJDBCDate("insuranceDeadline <", value, "insurancedeadline");
            return (Criteria) this;
        }

        public Criteria andInsurancedeadlineLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("insuranceDeadline <=", value, "insurancedeadline");
            return (Criteria) this;
        }

        public Criteria andInsurancedeadlineIn(List<Date> values) {
            addCriterionForJDBCDate("insuranceDeadline in", values, "insurancedeadline");
            return (Criteria) this;
        }

        public Criteria andInsurancedeadlineNotIn(List<Date> values) {
            addCriterionForJDBCDate("insuranceDeadline not in", values, "insurancedeadline");
            return (Criteria) this;
        }

        public Criteria andInsurancedeadlineBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("insuranceDeadline between", value1, value2, "insurancedeadline");
            return (Criteria) this;
        }

        public Criteria andInsurancedeadlineNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("insuranceDeadline not between", value1, value2, "insurancedeadline");
            return (Criteria) this;
        }

        public Criteria andLastservicedateIsNull() {
            addCriterion("lastServiceDate is null");
            return (Criteria) this;
        }

        public Criteria andLastservicedateIsNotNull() {
            addCriterion("lastServiceDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastservicedateEqualTo(Date value) {
            addCriterionForJDBCDate("lastServiceDate =", value, "lastservicedate");
            return (Criteria) this;
        }

        public Criteria andLastservicedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("lastServiceDate <>", value, "lastservicedate");
            return (Criteria) this;
        }

        public Criteria andLastservicedateGreaterThan(Date value) {
            addCriterionForJDBCDate("lastServiceDate >", value, "lastservicedate");
            return (Criteria) this;
        }

        public Criteria andLastservicedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastServiceDate >=", value, "lastservicedate");
            return (Criteria) this;
        }

        public Criteria andLastservicedateLessThan(Date value) {
            addCriterionForJDBCDate("lastServiceDate <", value, "lastservicedate");
            return (Criteria) this;
        }

        public Criteria andLastservicedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastServiceDate <=", value, "lastservicedate");
            return (Criteria) this;
        }

        public Criteria andLastservicedateIn(List<Date> values) {
            addCriterionForJDBCDate("lastServiceDate in", values, "lastservicedate");
            return (Criteria) this;
        }

        public Criteria andLastservicedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("lastServiceDate not in", values, "lastservicedate");
            return (Criteria) this;
        }

        public Criteria andLastservicedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastServiceDate between", value1, value2, "lastservicedate");
            return (Criteria) this;
        }

        public Criteria andLastservicedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastServiceDate not between", value1, value2, "lastservicedate");
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