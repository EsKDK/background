package com.lcsw.background.domain;

import lombok.*;

/**
 * Admin类加强版  将对象传到前台  用于管理员页面的查询
 *
 * @Author lmq
 * @Date 2019/7/7
 **/

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdminPlus {

    /**
     * 用户id
     */
    private int matchingUserid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 计数
     */
    private int allCount;

    /**
     * 已处理数量
     */
    private int processedCount;

    /**
     * 未处理数量
     */
    private int untreatedCount;

    /**
     * 成功数量
     */
    private int successCount;

    /**
     * 失败数量
     */
    private int failCount;
}
