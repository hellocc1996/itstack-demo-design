package org.itstack.demo.design.domain.service.logic;


import org.itstack.demo.design.domain.model.vo.TreeNode;
import org.itstack.demo.design.domain.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * 决策抽象类提供基础服务
 */
public abstract class BaseLogic implements LogicFilter {

    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList) {
        for (TreeNodeLink nodeLine : treeNodeLinkList) {
            if (decisionLogic(matterValue, nodeLine)) {
                return nodeLine.getNodeIdTo();
            }
        }
        return 0L;
    }


    /**
     * 让每一个实现接口的类(决策节点)都必须按照规则提供决策值，这个决策值用于做逻辑比对。
     */
    @Override
    public abstract String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);

    /**
     * 基本的决策方法；1、2、3、4、5，等于、小于、大于、小于等于、大于等于的判断逻辑
     *
     * @param matterValue
     * @param nodeLink
     * @return
     */
    private boolean decisionLogic(String matterValue, TreeNodeLink nodeLink) {
        switch (nodeLink.getRuleLimitType()) {
            case 1:
                return matterValue.equals(nodeLink.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue) > Double.parseDouble(nodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue) < Double.parseDouble(nodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue) <= Double.parseDouble(nodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue) >= Double.parseDouble(nodeLink.getRuleLimitValue());
            default:
                return false;
        }
    }

}
