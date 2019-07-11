package com.lcsw.background.mapper;

import com.lcsw.background.domain.Tradeserial;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description: 订单
 * @Author: LMQ
 * @Date: 2019/7/4
 */
@Component
@Mapper
public interface TradeserialMapper {


    /**
     *  管理员页面查询详情
     * @param username
     * @param merchant_no
     * @param id
     * @param out_trade_no
     * @return
     */
    List<Tradeserial> queryDetail(@Param("username") String username, @Param("merchant_no") String merchant_no, @Param("id") Integer id, @Param("out_trade_no") String out_trade_no);
//    /**
//     *  点击子账号显示相关详情
//     * @param username
//     * @return
//     */
    List<Tradeserial> payDetail(String username);


    /**
     * 轮询查询二维码支付状态
     *
     * @param merchantid
     * @return
     */
    Integer queyPayCode(Integer merchantid);




    /**
     * 插入订单表
     *
     * @param merchantid  商家id
     * @param merchant_no  商家号
     * @param terminalno
     * @param createtime
     * @param out_trade_no
     * @param total_fee
     * @param pay_status_code
     * @param pay_status_msg
     * @param endtime
     */
    void insert(@Param("merchantid") String merchantid, @Param("merchant_no") String merchant_no, @Param("terminalno") String terminalno, @Param("createtime") String createtime,
                @Param("createdate") String createdate, @Param("out_trade_no") String out_trade_no, @Param("total_fee") String total_fee, @Param("pay_status_code") String pay_status_code,
                @Param("pay_status_msg") String pay_status_msg, @Param("endtime") String endtime);
}