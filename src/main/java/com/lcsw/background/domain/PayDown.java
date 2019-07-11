package com.lcsw.background.domain;

public class PayDown {
    /**
     * 商户号
     */
    private String merchantNo;

    /**
     * 二维码编号
     */
    private Integer id;

    /**
     * 订单号
     */
    private String outTradeNo;

    /**
     * 支付状态，支付成功1，支付失败2，支付中3，已撤销4,  退款成功5  退款失败6
     */
    private Byte payStatusCode;

    /**
     * 总金额(单位分)
     */
    private Integer totalFee;

    /**
     * 支付完成时间：yyyy-MM-dd HH:mm:ss
     */
    private String endtime;

    /**
     * 失败原因
     */
    private String payStatusMsg;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Byte getPayStatusCode() {
        return payStatusCode;
    }

    public void setPayStatusCode(Byte payStatusCode) {
        this.payStatusCode = payStatusCode;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getPayStatusMsg() {
        return payStatusMsg;
    }

    public void setPayStatusMsg(String payStatusMsg) {
        this.payStatusMsg = payStatusMsg;
    }

    @Override
    public String toString() {
        return "PayDown{" +
                "merchantNo='" + merchantNo + '\'' +
                ", id=" + id +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", payStatusCode=" + payStatusCode +
                ", totalFee=" + totalFee +
                ", endtime='" + endtime + '\'' +
                ", payStatusMsg='" + payStatusMsg + '\'' +
                '}';
    }
}
