package org.itstack.demo.design.domain.service.engine;


import org.itstack.demo.design.domain.model.aggregates.TreeRich;
import org.itstack.demo.design.domain.model.vo.EngineResult;
import org.itstack.demo.design.domain.model.vo.TreeNode;
import org.itstack.demo.design.domain.model.vo.TreeRoot;
import org.itstack.demo.design.domain.service.logic.LogicFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 基础决策引擎功能
 */
public abstract class EngineBase extends EngineConfig implements IEngine {

    private Logger logger = LoggerFactory.getLogger(EngineBase.class);

    /**
     * 提供一个抽象方法，执行决策流程的方法供外部去做具体的实现
     *
     * @param treeId
     * @param userId
     * @param treeRich
     * @param decisionMatter
     * @return
     */
    @Override
    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);

    /**
     * 决策树流程的处理过程
     * <p>
     * 类似于通过链路的关系(性别、年龄)在二叉树中寻找果实节点的过程。
     *
     * @param treeRich
     * @param treeId
     * @param userId
     * @param decisionMatter
     * @return
     */
    protected TreeNode engineDecisionMaker(TreeRich treeRich, Long treeId, String userId, Map<String, String> decisionMatter) {
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();

        // 规则树根ID
        Long rootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNodeInfo = treeNodeMap.get(rootNodeId);

        //节点类型[NodeType]；1子叶、2果实
        while (treeNodeInfo.getNodeType().equals(1)) {
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId, userId, decisionMatter);
            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLinkList());
            treeNodeInfo = treeNodeMap.get(nextNode);
            logger.info("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}", treeRoot.getTreeName(), userId, treeId, treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);
        }
        return treeNodeInfo;
    }

}
