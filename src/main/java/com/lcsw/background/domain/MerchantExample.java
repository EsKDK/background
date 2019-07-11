package com.lcsw.background.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MerchantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MerchantExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andMerchantidIsNull() {
            addCriterion("merchantid is null");
            return (Criteria) this;
        }

        public Criteria andMerchantidIsNotNull() {
            addCriterion("merchantid is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantidEqualTo(Integer value) {
            addCriterion("merchantid =", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotEqualTo(Integer value) {
            addCriterion("merchantid <>", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidGreaterThan(Integer value) {
            addCriterion("merchantid >", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchantid >=", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLessThan(Integer value) {
            addCriterion("merchantid <", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLessThanOrEqualTo(Integer value) {
            addCriterion("merchantid <=", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidIn(List<Integer> values) {
            addCriterion("merchantid in", values, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotIn(List<Integer> values) {
            addCriterion("merchantid not in", values, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidBetween(Integer value1, Integer value2) {
            addCriterion("merchantid between", value1, value2, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotBetween(Integer value1, Integer value2) {
            addCriterion("merchantid not between", value1, value2, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantnoIsNull() {
            addCriterion("merchantno is null");
            return (Criteria) this;
        }

        public Criteria andMerchantnoIsNotNull() {
            addCriterion("merchantno is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantnoEqualTo(String value) {
            addCriterion("merchantno =", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotEqualTo(String value) {
            addCriterion("merchantno <>", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoGreaterThan(String value) {
            addCriterion("merchantno >", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoGreaterThanOrEqualTo(String value) {
            addCriterion("merchantno >=", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoLessThan(String value) {
            addCriterion("merchantno <", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoLessThanOrEqualTo(String value) {
            addCriterion("merchantno <=", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoLike(String value) {
            addCriterion("merchantno like", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotLike(String value) {
            addCriterion("merchantno not like", value, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoIn(List<String> values) {
            addCriterion("merchantno in", values, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotIn(List<String> values) {
            addCriterion("merchantno not in", values, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoBetween(String value1, String value2) {
            addCriterion("merchantno between", value1, value2, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnoNotBetween(String value1, String value2) {
            addCriterion("merchantno not between", value1, value2, "merchantno");
            return (Criteria) this;
        }

        public Criteria andMerchantnameIsNull() {
            addCriterion("merchantname is null");
            return (Criteria) this;
        }

        public Criteria andMerchantnameIsNotNull() {
            addCriterion("merchantname is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantnameEqualTo(String value) {
            addCriterion("merchantname =", value, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameNotEqualTo(String value) {
            addCriterion("merchantname <>", value, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameGreaterThan(String value) {
            addCriterion("merchantname >", value, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameGreaterThanOrEqualTo(String value) {
            addCriterion("merchantname >=", value, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameLessThan(String value) {
            addCriterion("merchantname <", value, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameLessThanOrEqualTo(String value) {
            addCriterion("merchantname <=", value, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameLike(String value) {
            addCriterion("merchantname like", value, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameNotLike(String value) {
            addCriterion("merchantname not like", value, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameIn(List<String> values) {
            addCriterion("merchantname in", values, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameNotIn(List<String> values) {
            addCriterion("merchantname not in", values, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameBetween(String value1, String value2) {
            addCriterion("merchantname between", value1, value2, "merchantname");
            return (Criteria) this;
        }

        public Criteria andMerchantnameNotBetween(String value1, String value2) {
            addCriterion("merchantname not between", value1, value2, "merchantname");
            return (Criteria) this;
        }

        public Criteria andRegionalIdIsNull() {
            addCriterion("regional_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionalIdIsNotNull() {
            addCriterion("regional_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionalIdEqualTo(Integer value) {
            addCriterion("regional_id =", value, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdNotEqualTo(Integer value) {
            addCriterion("regional_id <>", value, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdGreaterThan(Integer value) {
            addCriterion("regional_id >", value, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("regional_id >=", value, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdLessThan(Integer value) {
            addCriterion("regional_id <", value, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdLessThanOrEqualTo(Integer value) {
            addCriterion("regional_id <=", value, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdIn(List<Integer> values) {
            addCriterion("regional_id in", values, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdNotIn(List<Integer> values) {
            addCriterion("regional_id not in", values, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdBetween(Integer value1, Integer value2) {
            addCriterion("regional_id between", value1, value2, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("regional_id not between", value1, value2, "regionalId");
            return (Criteria) this;
        }

        public Criteria andRegionalNameIsNull() {
            addCriterion("regional_name is null");
            return (Criteria) this;
        }

        public Criteria andRegionalNameIsNotNull() {
            addCriterion("regional_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegionalNameEqualTo(String value) {
            addCriterion("regional_name =", value, "regionalName");
            return (Criteria) this;
        }

        public Criteria andRegionalNameNotEqualTo(String value) {
            addCriterion("regional_name <>", value, "regionalName");
            return (Criteria) this;
        }

        public Criteria andRegionalNameGreaterThan(String value) {
            addCriterion("regional_name >", value, "regionalName");
            return (Criteria) this;
        }

        public Criteria andRegionalNameGreaterThanOrEqualTo(String value) {
            addCriterion("regional_name >=", value, "regionalName");
            return (Criteria) this;
        }

        public Criteria andRegionalNameLessThan(String value) {
            addCriterion("regional_name <", value, "regionalName");
            return (Criteria) this;
        }

        public Criteria andRegionalNameLessThanOrEqualTo(String value) {
            addCriterion("regional_name <=", value, "regionalName");
            return (Criteria) this;
        }

        public Criteria andRegionalNameLike(String value) {
            addCriterion("regional_name like", value, "regionalName");
            return (Criteria) this;
        }

        public Criteria andRegionalNameNotLike(String value) {
            addCriterion("regional_name not like", value, "regionalName");
            return (Criteria) this;
        }

        public Criteria andRegionalNameIn(List<String> values) {
            addCriterion("regional_name in", values, "regionalName");
            return (Criteria) this;
        }

        public Criteria andRegionalNameNotIn(List<String> values) {
            addCriterion("regional_name not in", values, "regionalName");
            return (Criteria) this;
        }

        public Criteria andRegionalNameBetween(String value1, String value2) {
            addCriterion("regional_name between", value1, value2, "regionalName");
            return (Criteria) this;
        }

        public Criteria andRegionalNameNotBetween(String value1, String value2) {
            addCriterion("regional_name not between", value1, value2, "regionalName");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Integer value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Integer value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Integer value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Integer value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Integer> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Integer> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNull() {
            addCriterion("agent_name is null");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNotNull() {
            addCriterion("agent_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgentNameEqualTo(String value) {
            addCriterion("agent_name =", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotEqualTo(String value) {
            addCriterion("agent_name <>", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThan(String value) {
            addCriterion("agent_name >", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_name >=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThan(String value) {
            addCriterion("agent_name <", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThanOrEqualTo(String value) {
            addCriterion("agent_name <=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLike(String value) {
            addCriterion("agent_name like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotLike(String value) {
            addCriterion("agent_name not like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameIn(List<String> values) {
            addCriterion("agent_name in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotIn(List<String> values) {
            addCriterion("agent_name not in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameBetween(String value1, String value2) {
            addCriterion("agent_name between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotBetween(String value1, String value2) {
            addCriterion("agent_name not between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdIsNull() {
            addCriterion("salesman_id is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdIsNotNull() {
            addCriterion("salesman_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdEqualTo(Integer value) {
            addCriterion("salesman_id =", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdNotEqualTo(Integer value) {
            addCriterion("salesman_id <>", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdGreaterThan(Integer value) {
            addCriterion("salesman_id >", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("salesman_id >=", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdLessThan(Integer value) {
            addCriterion("salesman_id <", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdLessThanOrEqualTo(Integer value) {
            addCriterion("salesman_id <=", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdIn(List<Integer> values) {
            addCriterion("salesman_id in", values, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdNotIn(List<Integer> values) {
            addCriterion("salesman_id not in", values, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdBetween(Integer value1, Integer value2) {
            addCriterion("salesman_id between", value1, value2, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("salesman_id not between", value1, value2, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameIsNull() {
            addCriterion("salesman_name is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameIsNotNull() {
            addCriterion("salesman_name is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameEqualTo(String value) {
            addCriterion("salesman_name =", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameNotEqualTo(String value) {
            addCriterion("salesman_name <>", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameGreaterThan(String value) {
            addCriterion("salesman_name >", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameGreaterThanOrEqualTo(String value) {
            addCriterion("salesman_name >=", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameLessThan(String value) {
            addCriterion("salesman_name <", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameLessThanOrEqualTo(String value) {
            addCriterion("salesman_name <=", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameLike(String value) {
            addCriterion("salesman_name like", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameNotLike(String value) {
            addCriterion("salesman_name not like", value, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameIn(List<String> values) {
            addCriterion("salesman_name in", values, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameNotIn(List<String> values) {
            addCriterion("salesman_name not in", values, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameBetween(String value1, String value2) {
            addCriterion("salesman_name between", value1, value2, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andSalesmanNameNotBetween(String value1, String value2) {
            addCriterion("salesman_name not between", value1, value2, "salesmanName");
            return (Criteria) this;
        }

        public Criteria andMerchantCreatetimeIsNull() {
            addCriterion("merchant_createtime is null");
            return (Criteria) this;
        }

        public Criteria andMerchantCreatetimeIsNotNull() {
            addCriterion("merchant_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantCreatetimeEqualTo(Date value) {
            addCriterion("merchant_createtime =", value, "merchantCreatetime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreatetimeNotEqualTo(Date value) {
            addCriterion("merchant_createtime <>", value, "merchantCreatetime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreatetimeGreaterThan(Date value) {
            addCriterion("merchant_createtime >", value, "merchantCreatetime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("merchant_createtime >=", value, "merchantCreatetime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreatetimeLessThan(Date value) {
            addCriterion("merchant_createtime <", value, "merchantCreatetime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("merchant_createtime <=", value, "merchantCreatetime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreatetimeIn(List<Date> values) {
            addCriterion("merchant_createtime in", values, "merchantCreatetime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreatetimeNotIn(List<Date> values) {
            addCriterion("merchant_createtime not in", values, "merchantCreatetime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreatetimeBetween(Date value1, Date value2) {
            addCriterion("merchant_createtime between", value1, value2, "merchantCreatetime");
            return (Criteria) this;
        }

        public Criteria andMerchantCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("merchant_createtime not between", value1, value2, "merchantCreatetime");
            return (Criteria) this;
        }

        public Criteria andTerminalnoIsNull() {
            addCriterion("terminalno is null");
            return (Criteria) this;
        }

        public Criteria andTerminalnoIsNotNull() {
            addCriterion("terminalno is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalnoEqualTo(String value) {
            addCriterion("terminalno =", value, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoNotEqualTo(String value) {
            addCriterion("terminalno <>", value, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoGreaterThan(String value) {
            addCriterion("terminalno >", value, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoGreaterThanOrEqualTo(String value) {
            addCriterion("terminalno >=", value, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoLessThan(String value) {
            addCriterion("terminalno <", value, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoLessThanOrEqualTo(String value) {
            addCriterion("terminalno <=", value, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoLike(String value) {
            addCriterion("terminalno like", value, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoNotLike(String value) {
            addCriterion("terminalno not like", value, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoIn(List<String> values) {
            addCriterion("terminalno in", values, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoNotIn(List<String> values) {
            addCriterion("terminalno not in", values, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoBetween(String value1, String value2) {
            addCriterion("terminalno between", value1, value2, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoNotBetween(String value1, String value2) {
            addCriterion("terminalno not between", value1, value2, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andMatchingUseridIsNull() {
            addCriterion("matching_userid is null");
            return (Criteria) this;
        }

        public Criteria andMatchingUseridIsNotNull() {
            addCriterion("matching_userid is not null");
            return (Criteria) this;
        }

        public Criteria andMatchingUseridEqualTo(Integer value) {
            addCriterion("matching_userid =", value, "matchingUserid");
            return (Criteria) this;
        }

        public Criteria andMatchingUseridNotEqualTo(Integer value) {
            addCriterion("matching_userid <>", value, "matchingUserid");
            return (Criteria) this;
        }

        public Criteria andMatchingUseridGreaterThan(Integer value) {
            addCriterion("matching_userid >", value, "matchingUserid");
            return (Criteria) this;
        }

        public Criteria andMatchingUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("matching_userid >=", value, "matchingUserid");
            return (Criteria) this;
        }

        public Criteria andMatchingUseridLessThan(Integer value) {
            addCriterion("matching_userid <", value, "matchingUserid");
            return (Criteria) this;
        }

        public Criteria andMatchingUseridLessThanOrEqualTo(Integer value) {
            addCriterion("matching_userid <=", value, "matchingUserid");
            return (Criteria) this;
        }

        public Criteria andMatchingUseridIn(List<Integer> values) {
            addCriterion("matching_userid in", values, "matchingUserid");
            return (Criteria) this;
        }

        public Criteria andMatchingUseridNotIn(List<Integer> values) {
            addCriterion("matching_userid not in", values, "matchingUserid");
            return (Criteria) this;
        }

        public Criteria andMatchingUseridBetween(Integer value1, Integer value2) {
            addCriterion("matching_userid between", value1, value2, "matchingUserid");
            return (Criteria) this;
        }

        public Criteria andMatchingUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("matching_userid not between", value1, value2, "matchingUserid");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Byte value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Byte value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Byte value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Byte value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Byte value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Byte> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Byte> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Byte value1, Byte value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayMsgIsNull() {
            addCriterion("pay_msg is null");
            return (Criteria) this;
        }

        public Criteria andPayMsgIsNotNull() {
            addCriterion("pay_msg is not null");
            return (Criteria) this;
        }

        public Criteria andPayMsgEqualTo(String value) {
            addCriterion("pay_msg =", value, "payMsg");
            return (Criteria) this;
        }

        public Criteria andPayMsgNotEqualTo(String value) {
            addCriterion("pay_msg <>", value, "payMsg");
            return (Criteria) this;
        }

        public Criteria andPayMsgGreaterThan(String value) {
            addCriterion("pay_msg >", value, "payMsg");
            return (Criteria) this;
        }

        public Criteria andPayMsgGreaterThanOrEqualTo(String value) {
            addCriterion("pay_msg >=", value, "payMsg");
            return (Criteria) this;
        }

        public Criteria andPayMsgLessThan(String value) {
            addCriterion("pay_msg <", value, "payMsg");
            return (Criteria) this;
        }

        public Criteria andPayMsgLessThanOrEqualTo(String value) {
            addCriterion("pay_msg <=", value, "payMsg");
            return (Criteria) this;
        }

        public Criteria andPayMsgLike(String value) {
            addCriterion("pay_msg like", value, "payMsg");
            return (Criteria) this;
        }

        public Criteria andPayMsgNotLike(String value) {
            addCriterion("pay_msg not like", value, "payMsg");
            return (Criteria) this;
        }

        public Criteria andPayMsgIn(List<String> values) {
            addCriterion("pay_msg in", values, "payMsg");
            return (Criteria) this;
        }

        public Criteria andPayMsgNotIn(List<String> values) {
            addCriterion("pay_msg not in", values, "payMsg");
            return (Criteria) this;
        }

        public Criteria andPayMsgBetween(String value1, String value2) {
            addCriterion("pay_msg between", value1, value2, "payMsg");
            return (Criteria) this;
        }

        public Criteria andPayMsgNotBetween(String value1, String value2) {
            addCriterion("pay_msg not between", value1, value2, "payMsg");
            return (Criteria) this;
        }

        public Criteria andOrderbodyIsNull() {
            addCriterion("orderbody is null");
            return (Criteria) this;
        }

        public Criteria andOrderbodyIsNotNull() {
            addCriterion("orderbody is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbodyEqualTo(String value) {
            addCriterion("orderbody =", value, "orderbody");
            return (Criteria) this;
        }

        public Criteria andOrderbodyNotEqualTo(String value) {
            addCriterion("orderbody <>", value, "orderbody");
            return (Criteria) this;
        }

        public Criteria andOrderbodyGreaterThan(String value) {
            addCriterion("orderbody >", value, "orderbody");
            return (Criteria) this;
        }

        public Criteria andOrderbodyGreaterThanOrEqualTo(String value) {
            addCriterion("orderbody >=", value, "orderbody");
            return (Criteria) this;
        }

        public Criteria andOrderbodyLessThan(String value) {
            addCriterion("orderbody <", value, "orderbody");
            return (Criteria) this;
        }

        public Criteria andOrderbodyLessThanOrEqualTo(String value) {
            addCriterion("orderbody <=", value, "orderbody");
            return (Criteria) this;
        }

        public Criteria andOrderbodyLike(String value) {
            addCriterion("orderbody like", value, "orderbody");
            return (Criteria) this;
        }

        public Criteria andOrderbodyNotLike(String value) {
            addCriterion("orderbody not like", value, "orderbody");
            return (Criteria) this;
        }

        public Criteria andOrderbodyIn(List<String> values) {
            addCriterion("orderbody in", values, "orderbody");
            return (Criteria) this;
        }

        public Criteria andOrderbodyNotIn(List<String> values) {
            addCriterion("orderbody not in", values, "orderbody");
            return (Criteria) this;
        }

        public Criteria andOrderbodyBetween(String value1, String value2) {
            addCriterion("orderbody between", value1, value2, "orderbody");
            return (Criteria) this;
        }

        public Criteria andOrderbodyNotBetween(String value1, String value2) {
            addCriterion("orderbody not between", value1, value2, "orderbody");
            return (Criteria) this;
        }
    }

    /**
     */
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