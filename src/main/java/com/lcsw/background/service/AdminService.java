package com.lcsw.background.service;

import com.lcsw.background.domain.AdminPlus;
import com.lcsw.background.domain.MerchantParam;
import com.lcsw.background.domain.Tradeserial;
import com.lcsw.background.domain.UserPayStauCountDto;

import java.util.List;

public interface AdminService {
   //根据条件查询支付情况
   List<AdminPlus> payList(String username);

   //管理员页面查询详情
   List<Tradeserial> queryDetail(String username,String merchant_no,Integer id,String out_trade_no);

   //子帐户订单表
   List<Tradeserial> payDetails(String username);


   /**
    * 根据账户的id 以及 时间查询
    *
    * @param merchantParam 包含list startTime endTime
    * @return 返回数据统计集合
    */
   List<UserPayStauCountDto> findByuserIdsAndTime(MerchantParam merchantParam);


   /**
    * 查找所有用户的id 包含时间
    *
    * @return
    */
   List<Integer> findUserId(MerchantParam merchantParam);
}
