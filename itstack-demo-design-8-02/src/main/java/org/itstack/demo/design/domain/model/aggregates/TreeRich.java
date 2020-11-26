package org.itstack.demo.design.domain.model.aggregates;

import org.itstack.demo.design.domain.model.vo.TreeNode;
import org.itstack.demo.design.domain.model.vo.TreeRoot;

import java.util.Map;

/**
 * 规则树
 * <p>
 * <p>
 * 一棵🌲由树根和N个🌲节点组成；
 * <p>
 * 其中🌲节点可能是子叶🍃，也可能是果实🍒
 */
public class TreeRich {

    /**
     * 树根信息
     */

    private TreeRoot treeRoot;

    /**
     * key：树节点ID
     * value：子节点
     */
    private Map<Long, TreeNode> treeNodeMap;

    public TreeRich(TreeRoot treeRoot, Map<Long, TreeNode> treeNodeMap) {
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }

    public TreeRoot getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(TreeRoot treeRoot) {
        this.treeRoot = treeRoot;
    }

    public Map<Long, TreeNode> getTreeNodeMap() {
        return treeNodeMap;
    }

    public void setTreeNodeMap(Map<Long, TreeNode> treeNodeMap) {
        this.treeNodeMap = treeNodeMap;
    }
}
