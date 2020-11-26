package org.itstack.demo.design.domain.service.logic.impl;

import org.itstack.demo.design.domain.service.logic.BaseLogic;

import java.util.Map;

/**
 * 年龄节点
 */
public class UserAgeFilter extends BaseLogic {

    /**
     * 决策逻辑的节点获取值的方式都非常简单，只是获取用户的入参即可
     * <p>
     * 实际的业务开发可以从数据库、RPC接口、缓存运算等各种方式获取。
     *
     * @param treeId
     * @param userId
     * @param decisionMatter
     * @return
     */
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }

}
