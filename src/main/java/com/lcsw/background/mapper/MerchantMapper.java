package com.lcsw.background.mapper;

import com.lcsw.background.domain.Admin;
import com.lcsw.background.domain.Merchant;
import com.lcsw.background.domain.MerchantParam;
import com.lcsw.background.domain.UserPayStauCount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description: 商户处理
 * @Author: LMQ
 * @Date: 2019/7/4
 */
@Component
@Mapper
public interface MerchantMapper {
    /**
     * 获取商家号、终端号、令牌 生成url
     *
     * @param id 当前登录用户的id
     * @return
     */
    Merchant getUrl(Integer id);


    /**
     * 根据二维码支付状态，查询当前用户剩余未处理数量
     *
     * @param id 当前登录用户的id
     * @return
     */
    int queryRemainCode(Integer id);


    /**
     * 查询当前用户的所有二维码数量
     *
     * @param id 当前登录用户的id
     * @return
     */
    int queryAllCode(Integer id);


    /**
     * 管理员页面条件查询
     *
     * @return
     */
    List<Admin> queryPay(@Param("username") String username);

    /**
     * 根据merchantid 修改交易状态
     */
    void updatePayStatus(@Param("merchantid") Integer merchantid, @Param("status") Integer status, @Param("pay_msg")String msg);

    /**
     * 根据账户的id 以及 时间查询
     *
     * @param merchantParam 包含list startTime endTime
     * @return 返回数据统计集合
     */
    List<UserPayStauCount> findByuserIdsAndTime(MerchantParam merchantParam);


    /**
     * 查找所有用户的id
     *
     * @return
     */
    List<Integer> findUserId(MerchantParam merchantParam);

}