package com.lcsw.background.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author 
 */
public class Tradeserial implements Serializable {
    /**
     * 订单记录表
     */
    private Integer id;

    /**
     * 商户id
     */
    private Integer merchantid;

    /**
     * 商户号
     */
    private String merchantNo;

    /**
     * 终端号
     */
    private String terminalno;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 创建日期
     */
    private Date createdate;

    /**
     * 订单号
     */
    private String outTradeNo;

    /**
     * 退款单号
     */
    private String outRefundNo;

    /**
     * 总金额(单位分)
     */
    private Integer totalFee;

    /**
     * 支付状态，支付成功1，支付失败2，支付中3，已撤销4,  退款成功5  退款失败6
     */
    private Byte payStatusCode;

    /**
     * 支付状态说明
     */
    private String payStatusMsg;

    /**
     * 第三方购买方用户id（微信为openid）
     */
    private String channelUserId;

    /**
     * 第三方通道返回的订单号
     */
    private String channelTradeNo;

    /**
     * 支付完成时间：yyyy-MM-dd HH:mm:ss
     */
    private String endtime;


    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(Integer merchantid) {
        this.merchantid = merchantid;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getTerminalno() {
        return terminalno;
    }

    public void setTerminalno(String terminalno) {
        this.terminalno = terminalno;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getOutRefundNo() {
        return outRefundNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public Byte getPayStatusCode() {
        return payStatusCode;
    }

    public void setPayStatusCode(Byte payStatusCode) {
        this.payStatusCode = payStatusCode;
    }

    public String getPayStatusMsg() {
        return payStatusMsg;
    }

    public void setPayStatusMsg(String payStatusMsg) {
        this.payStatusMsg = payStatusMsg;
    }

    public String getChannelUserId() {
        return channelUserId;
    }

    public void setChannelUserId(String channelUserId) {
        this.channelUserId = channelUserId;
    }

    public String getChannelTradeNo() {
        return channelTradeNo;
    }

    public void setChannelTradeNo(String channelTradeNo) {
        this.channelTradeNo = channelTradeNo;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tradeserial that = (Tradeserial) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(merchantid, that.merchantid) &&
                Objects.equals(merchantNo, that.merchantNo) &&
                Objects.equals(terminalno, that.terminalno) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(outTradeNo, that.outTradeNo) &&
                Objects.equals(outRefundNo, that.outRefundNo) &&
                Objects.equals(totalFee, that.totalFee) &&
                Objects.equals(payStatusCode, that.payStatusCode) &&
                Objects.equals(payStatusMsg, that.payStatusMsg) &&
                Objects.equals(channelUserId, that.channelUserId) &&
                Objects.equals(channelTradeNo, that.channelTradeNo) &&
                Objects.equals(endtime, that.endtime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, merchantid, merchantNo, terminalno, createtime, createdate, outTradeNo, outRefundNo, totalFee, payStatusCode, payStatusMsg, channelUserId, channelTradeNo, endtime);
    }

    @Override
    public String toString() {
        return "Tradeserial{" +
                "id=" + id +
                ", merchantid=" + merchantid +
                ", merchantNo='" + merchantNo + '\'' +
                ", terminalno='" + terminalno + '\'' +
                ", createtime=" + createtime +
                ", createdate=" + createdate +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", outRefundNo='" + outRefundNo + '\'' +
                ", totalFee=" + totalFee +
                ", payStatusCode=" + payStatusCode +
                ", payStatusMsg='" + payStatusMsg + '\'' +
                ", channelUserId='" + channelUserId + '\'' +
                ", channelTradeNo='" + channelTradeNo + '\'' +
                ", endtime='" + endtime + '\'' +
                '}';
    }
}