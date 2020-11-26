package org.itstack.demo.design.domain.service.engine.impl;

import org.itstack.demo.design.domain.model.aggregates.TreeRich;
import org.itstack.demo.design.domain.model.vo.EngineResult;
import org.itstack.demo.design.domain.model.vo.TreeNode;
import org.itstack.demo.design.domain.service.engine.EngineBase;

import java.util.Map;

/**
 * 决策引擎的实现
 * <p>
 * 可以由很多优化点
 * 比如：此处可以一次性获取决策树对应全部的决策规则key对应的数据，一次性拿到用户性别、年龄等
 */
public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);

        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }

}
