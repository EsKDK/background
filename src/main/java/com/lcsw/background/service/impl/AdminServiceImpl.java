package com.lcsw.background.service.impl;

import com.github.pagehelper.PageHelper;
import com.lcsw.background.domain.*;
import com.lcsw.background.mapper.MerchantMapper;
import com.lcsw.background.mapper.TradeserialMapper;
import com.lcsw.background.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    MerchantMapper merchantMapper;
    @Autowired
    TradeserialMapper tradeserialMapper;

    @Override
    public List<AdminPlus> payList(String username) {
        //获取查询出的对象
        List<Admin> admins = merchantMapper.queryPay(username);
        if (admins.size() == 0 || admins == null) {
            return null;
        }
        //传入前台的对象集合
        List<AdminPlus> adminPlusList = new ArrayList<>();
        AdminPlus adminPlus = new AdminPlus();
        //获取列表第一个数据的userid
        int userId = Integer.parseInt(admins.get(0).getMatchingUserid());
        for (Admin admin : admins) {
            //获取当前对象id
            int uid = Integer.parseInt(admin.getMatchingUserid());
            //用户id不一样
            if (uid != userId) {
                adminPlusList.add(adminPlus);
                adminPlus = new AdminPlus();
                userId = uid;
            }
            adminPlus.setUsername(admin.getUsername());
            adminPlus.setMatchingUserid(uid);
            //如果用户id一样
            //未处理
            if (admin.getPayStatus() == 0) {
                adminPlus.setUntreatedCount(admin.getCount());
            }
            //成功
            else if (admin.getPayStatus() == 1) {
                adminPlus.setSuccessCount(admin.getCount());
            }
            //失败
            else if (admin.getPayStatus() == 2) {
                adminPlus.setFailCount(admin.getCount());
            }
            //已处理
            adminPlus.setProcessedCount(adminPlus.getSuccessCount() + adminPlus.getFailCount());
            //总数
            adminPlus.setAllCount(adminPlus.getProcessedCount() + adminPlus.getUntreatedCount());
        }
        adminPlusList.add(adminPlus);
        return adminPlusList;
    }


    /**
     * 管理员页面查询详情
     */
    @Override
    public List<Tradeserial> queryDetail(String username,String merchant_no,Integer id,String out_trade_no) {
        List<Tradeserial> list = tradeserialMapper.queryDetail(username,merchant_no,id,out_trade_no);
        return list;
    }

    @Override
    public List<Tradeserial> payDetails(String username) {
        List<Tradeserial> list = tradeserialMapper.payDetail(username);
        return list;
    }

    @Override
    public List<UserPayStauCountDto> findByuserIdsAndTime(MerchantParam merchantParam) {
        //得到返回结果
        List<UserPayStauCount> responseList = merchantMapper.findByuserIdsAndTime(merchantParam);
        if (responseList.size() == 0 || responseList == null) {
            return null;
        }
        //对返回结果进行处理
        List<UserPayStauCountDto> countList = new ArrayList<UserPayStauCountDto>();
        UserPayStauCountDto userPayStauCountDto = new UserPayStauCountDto();
        int firstUserid = merchantParam.getList().get(0);
        for (UserPayStauCount userPayStauCount : responseList) {
            if (firstUserid != userPayStauCount.getUserId()) {
                countList.add(userPayStauCountDto);
                userPayStauCountDto = new UserPayStauCountDto();
                firstUserid = userPayStauCount.getUserId();
            }
            userPayStauCountDto.setUserId(userPayStauCount.getUserId());
            userPayStauCountDto.setUsername(userPayStauCount.getUsername());
            if (0 == userPayStauCount.getPayStatus()) {
                userPayStauCountDto.setNotPayCount(userPayStauCount.getPayCount());
            }
            if (1 == userPayStauCount.getPayStatus()) {
                userPayStauCountDto.setPaySuccessCount(userPayStauCount.getPayCount());
            }
            if (2 == userPayStauCount.getPayStatus()) {
                userPayStauCountDto.setPayFailCount(userPayStauCount.getPayCount());
            }
        }
        countList.add(userPayStauCountDto);
        return countList;
    }

    @Override
    public List<Integer> findUserId(MerchantParam merchantParam) {
        PageHelper.startPage(merchantParam.getPageNum(), merchantParam.getPageSize());
        List<Integer> userId = merchantMapper.findUserId(merchantParam);
        return userId;
    }

}
