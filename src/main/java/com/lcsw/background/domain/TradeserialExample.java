package com.lcsw.background.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TradeserialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TradeserialExample() {
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

        public Criteria andMerchantNoIsNull() {
            addCriterion("merchant_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNotNull() {
            addCriterion("merchant_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoEqualTo(String value) {
            addCriterion("merchant_no =", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotEqualTo(String value) {
            addCriterion("merchant_no <>", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThan(String value) {
            addCriterion("merchant_no >", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_no >=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThan(String value) {
            addCriterion("merchant_no <", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_no <=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLike(String value) {
            addCriterion("merchant_no like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotLike(String value) {
            addCriterion("merchant_no not like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIn(List<String> values) {
            addCriterion("merchant_no in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotIn(List<String> values) {
            addCriterion("merchant_no not in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoBetween(String value1, String value2) {
            addCriterion("merchant_no between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotBetween(String value1, String value2) {
            addCriterion("merchant_no not between", value1, value2, "merchantNo");
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

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("out_trade_no not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoIsNull() {
            addCriterion("out_refund_no is null");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoIsNotNull() {
            addCriterion("out_refund_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoEqualTo(String value) {
            addCriterion("out_refund_no =", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoNotEqualTo(String value) {
            addCriterion("out_refund_no <>", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoGreaterThan(String value) {
            addCriterion("out_refund_no >", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_refund_no >=", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoLessThan(String value) {
            addCriterion("out_refund_no <", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoLessThanOrEqualTo(String value) {
            addCriterion("out_refund_no <=", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoLike(String value) {
            addCriterion("out_refund_no like", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoNotLike(String value) {
            addCriterion("out_refund_no not like", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoIn(List<String> values) {
            addCriterion("out_refund_no in", values, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoNotIn(List<String> values) {
            addCriterion("out_refund_no not in", values, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoBetween(String value1, String value2) {
            addCriterion("out_refund_no between", value1, value2, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoNotBetween(String value1, String value2) {
            addCriterion("out_refund_no not between", value1, value2, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNull() {
            addCriterion("total_fee is null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNotNull() {
            addCriterion("total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeEqualTo(Integer value) {
            addCriterion("total_fee =", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotEqualTo(Integer value) {
            addCriterion("total_fee <>", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThan(Integer value) {
            addCriterion("total_fee >", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_fee >=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThan(Integer value) {
            addCriterion("total_fee <", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThanOrEqualTo(Integer value) {
            addCriterion("total_fee <=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIn(List<Integer> values) {
            addCriterion("total_fee in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotIn(List<Integer> values) {
            addCriterion("total_fee not in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeBetween(Integer value1, Integer value2) {
            addCriterion("total_fee between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("total_fee not between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andPayStatusCodeIsNull() {
            addCriterion("pay_status_code is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusCodeIsNotNull() {
            addCriterion("pay_status_code is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusCodeEqualTo(Byte value) {
            addCriterion("pay_status_code =", value, "payStatusCode");
            return (Criteria) this;
        }

        public Criteria andPayStatusCodeNotEqualTo(Byte value) {
            addCriterion("pay_status_code <>", value, "payStatusCode");
            return (Criteria) this;
        }

        public Criteria andPayStatusCodeGreaterThan(Byte value) {
            addCriterion("pay_status_code >", value, "payStatusCode");
            return (Criteria) this;
        }

        public Criteria andPayStatusCodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_status_code >=", value, "payStatusCode");
            return (Criteria) this;
        }

        public Criteria andPayStatusCodeLessThan(Byte value) {
            addCriterion("pay_status_code <", value, "payStatusCode");
            return (Criteria) this;
        }

        public Criteria andPayStatusCodeLessThanOrEqualTo(Byte value) {
            addCriterion("pay_status_code <=", value, "payStatusCode");
            return (Criteria) this;
        }

        public Criteria andPayStatusCodeIn(List<Byte> values) {
            addCriterion("pay_status_code in", values, "payStatusCode");
            return (Criteria) this;
        }

        public Criteria andPayStatusCodeNotIn(List<Byte> values) {
            addCriterion("pay_status_code not in", values, "payStatusCode");
            return (Criteria) this;
        }

        public Criteria andPayStatusCodeBetween(Byte value1, Byte value2) {
            addCriterion("pay_status_code between", value1, value2, "payStatusCode");
            return (Criteria) this;
        }

        public Criteria andPayStatusCodeNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_status_code not between", value1, value2, "payStatusCode");
            return (Criteria) this;
        }

        public Criteria andPayStatusMsgIsNull() {
            addCriterion("pay_status_msg is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusMsgIsNotNull() {
            addCriterion("pay_status_msg is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusMsgEqualTo(String value) {
            addCriterion("pay_status_msg =", value, "payStatusMsg");
            return (Criteria) this;
        }

        public Criteria andPayStatusMsgNotEqualTo(String value) {
            addCriterion("pay_status_msg <>", value, "payStatusMsg");
            return (Criteria) this;
        }

        public Criteria andPayStatusMsgGreaterThan(String value) {
            addCriterion("pay_status_msg >", value, "payStatusMsg");
            return (Criteria) this;
        }

        public Criteria andPayStatusMsgGreaterThanOrEqualTo(String value) {
            addCriterion("pay_status_msg >=", value, "payStatusMsg");
            return (Criteria) this;
        }

        public Criteria andPayStatusMsgLessThan(String value) {
            addCriterion("pay_status_msg <", value, "payStatusMsg");
            return (Criteria) this;
        }

        public Criteria andPayStatusMsgLessThanOrEqualTo(String value) {
            addCriterion("pay_status_msg <=", value, "payStatusMsg");
            return (Criteria) this;
        }

        public Criteria andPayStatusMsgLike(String value) {
            addCriterion("pay_status_msg like", value, "payStatusMsg");
            return (Criteria) this;
        }

        public Criteria andPayStatusMsgNotLike(String value) {
            addCriterion("pay_status_msg not like", value, "payStatusMsg");
            return (Criteria) this;
        }

        public Criteria andPayStatusMsgIn(List<String> values) {
            addCriterion("pay_status_msg in", values, "payStatusMsg");
            return (Criteria) this;
        }

        public Criteria andPayStatusMsgNotIn(List<String> values) {
            addCriterion("pay_status_msg not in", values, "payStatusMsg");
            return (Criteria) this;
        }

        public Criteria andPayStatusMsgBetween(String value1, String value2) {
            addCriterion("pay_status_msg between", value1, value2, "payStatusMsg");
            return (Criteria) this;
        }

        public Criteria andPayStatusMsgNotBetween(String value1, String value2) {
            addCriterion("pay_status_msg not between", value1, value2, "payStatusMsg");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdIsNull() {
            addCriterion("channel_user_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdIsNotNull() {
            addCriterion("channel_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdEqualTo(String value) {
            addCriterion("channel_user_id =", value, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdNotEqualTo(String value) {
            addCriterion("channel_user_id <>", value, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdGreaterThan(String value) {
            addCriterion("channel_user_id >", value, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_user_id >=", value, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdLessThan(String value) {
            addCriterion("channel_user_id <", value, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdLessThanOrEqualTo(String value) {
            addCriterion("channel_user_id <=", value, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdLike(String value) {
            addCriterion("channel_user_id like", value, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdNotLike(String value) {
            addCriterion("channel_user_id not like", value, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdIn(List<String> values) {
            addCriterion("channel_user_id in", values, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdNotIn(List<String> values) {
            addCriterion("channel_user_id not in", values, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdBetween(String value1, String value2) {
            addCriterion("channel_user_id between", value1, value2, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdNotBetween(String value1, String value2) {
            addCriterion("channel_user_id not between", value1, value2, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelTradeNoIsNull() {
            addCriterion("channel_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andChannelTradeNoIsNotNull() {
            addCriterion("channel_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTradeNoEqualTo(String value) {
            addCriterion("channel_trade_no =", value, "channelTradeNo");
            return (Criteria) this;
        }

        public Criteria andChannelTradeNoNotEqualTo(String value) {
            addCriterion("channel_trade_no <>", value, "channelTradeNo");
            return (Criteria) this;
        }

        public Criteria andChannelTradeNoGreaterThan(String value) {
            addCriterion("channel_trade_no >", value, "channelTradeNo");
            return (Criteria) this;
        }

        public Criteria andChannelTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("channel_trade_no >=", value, "channelTradeNo");
            return (Criteria) this;
        }

        public Criteria andChannelTradeNoLessThan(String value) {
            addCriterion("channel_trade_no <", value, "channelTradeNo");
            return (Criteria) this;
        }

        public Criteria andChannelTradeNoLessThanOrEqualTo(String value) {
            addCriterion("channel_trade_no <=", value, "channelTradeNo");
            return (Criteria) this;
        }

        public Criteria andChannelTradeNoLike(String value) {
            addCriterion("channel_trade_no like", value, "channelTradeNo");
            return (Criteria) this;
        }

        public Criteria andChannelTradeNoNotLike(String value) {
            addCriterion("channel_trade_no not like", value, "channelTradeNo");
            return (Criteria) this;
        }

        public Criteria andChannelTradeNoIn(List<String> values) {
            addCriterion("channel_trade_no in", values, "channelTradeNo");
            return (Criteria) this;
        }

        public Criteria andChannelTradeNoNotIn(List<String> values) {
            addCriterion("channel_trade_no not in", values, "channelTradeNo");
            return (Criteria) this;
        }

        public Criteria andChannelTradeNoBetween(String value1, String value2) {
            addCriterion("channel_trade_no between", value1, value2, "channelTradeNo");
            return (Criteria) this;
        }

        public Criteria andChannelTradeNoNotBetween(String value1, String value2) {
            addCriterion("channel_trade_no not between", value1, value2, "channelTradeNo");
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