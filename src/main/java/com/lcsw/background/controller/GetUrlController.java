package com.lcsw.background.controller;

import com.alibaba.fastjson.JSONObject;
import com.lcsw.background.domain.User;
import com.lcsw.background.service.GetUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * 返回支付url
 */
@RestController
@RequestMapping("/getUrl")
public class GetUrlController {
    @Autowired
    private GetUrlService getUrlService;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/url")
    public JSONObject url() throws UnsupportedEncodingException {
        JSONObject object = new JSONObject();
        User user = new User();
        Object user1 = request.getSession().getAttribute("user");
        if (user1 == null) {
            object.put("msg", "请先登录");
            return object;
        }
        user = (User) user1;
            if (user.getId() != null) {
                JSONObject object1 = getUrlService.getUrl(user.getId());
                return object1;
            }
        object.put("msg", "异常");
        return object;
    }

    /**
     * 查询当前用户剩余未处理数量
     *
     * @return
     */
    @RequestMapping("/queryRemainCode")
    public JSONObject queryRemainCode() {
        User user = new User();
        JSONObject object = new JSONObject();
        Object user1 = request.getSession().getAttribute("user");
        if (user1 == null) {
            object.put("msg", "请先登录");
            return object;
        }
        user = (User) request.getSession().getAttribute("user");
        if (null != user.getId()) {
            object.put("count", getUrlService.queryRemainCode(user.getId()));
            return object;
        }
        return object;
    }

    /**
     * 查询当前用户的所有二维码数量
     *
     * @return
     */
    @RequestMapping("/queryAllCode")
    public JSONObject queryAllCode() {
        User user = new User();
        JSONObject object = new JSONObject();
        Object user1 = request.getSession().getAttribute("user");
        if (user1 == null) {
            object.put("msg", "请先登录");
            return object;
        }
        user = (User) request.getSession().getAttribute("user");
        if (null != user.getId()) {
            object.put("count", getUrlService.queryAllCode(user.getId()));
            return object;
        }
        return object;
    }
}
