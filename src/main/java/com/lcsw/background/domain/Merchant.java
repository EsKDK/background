package com.lcsw.background.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author LMQ
 */
@Setter
@Getter
public class Merchant implements Serializable {
    /**
     * 商户处理表
     */
    private Integer id;

    /**
     * 创建时间:yyyy-MM-dd HH:mm:ss
     */
    private Date createtime;

    /**
     * 商户id
     */
    private Integer merchantid;

    /**
     * 商户号
     */
    private String merchantno;

    /**
     * 商户名称
     */
    private String merchantname;

    /**
     * 业务经理id
     */
    private Integer regionalId;

    /**
     * bd名称
     */
    private String regionalName;

    /**
     * 所属代理商
     */
    private Integer agentId;

    /**
     * 代理商名称
     */
    private String agentName;

    /**
     * 业务员id
     */
    private Integer salesmanId;

    /**
     * 业务员名称
     */
    private String salesmanName;

    /**
     * 商户创建时间:yyyy-MM-dd HH:mm:ss
     */
    private Date merchantCreatetime;

    /**
     * 终端号
     */
    private String terminalno;

    /**
     * 终端令牌
     */
    private String token;

    /**
     * 匹配userid
     */
    private Integer matchingUserid;

    /**
     * 0 未测试 1 交易成功 2交易失败
     */
    private Byte payStatus;

    /**
     * 测试结果
     */
    private String payMsg;

    /**
     * 备注
     */
    private String orderbody;

    @Override
    public String toString() {
        return "Merchant{" +
                "id=" + id +
                ", createtime=" + createtime +
                ", merchantid=" + merchantid +
                ", merchantno='" + merchantno + '\'' +
                ", merchantname='" + merchantname + '\'' +
                ", regionalId=" + regionalId +
                ", regionalName='" + regionalName + '\'' +
                ", agentId=" + agentId +
                ", agentName='" + agentName + '\'' +
                ", salesmanId=" + salesmanId +
                ", salesmanName='" + salesmanName + '\'' +
                ", merchantCreatetime=" + merchantCreatetime +
                ", terminalno='" + terminalno + '\'' +
                ", token='" + token + '\'' +
                ", matchingUserid=" + matchingUserid +
                ", payStatus=" + payStatus +
                ", payMsg='" + payMsg + '\'' +
                ", orderbody='" + orderbody + '\'' +
                '}';
    }
}