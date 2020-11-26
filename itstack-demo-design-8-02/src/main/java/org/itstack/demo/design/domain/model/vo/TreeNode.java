package org.itstack.demo.design.domain.model.vo;

import java.util.List;

/**
 * 规则树节点信息
 */
public class TreeNode {

    /**
     * 规则树ID
     */
    private Long treeId;

    /**
     * 规则树节点ID
     */
    private Long treeNodeId;

    /**
     * 节点类型；1子叶、2果实
     */
    private Integer nodeType;

    /**
     * 节点值[nodeType=2]；果实值；
     * <p>
     * 可以为某个对象字符串
     */
    private String nodeValue;

    /**
     * 规则Key
     * <p>
     * 决策规则字段，例如年龄、性别
     */
    private String ruleKey;

    /**
     * 规则描述
     */
    private String ruleDesc;

    /**
     * 节点链路
     * <p>
     * 一个节点可能关联N个子节点，例如树杈
     */
    private List<TreeNodeLink> treeNodeLinkList;

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getTreeNodeId() {
        return treeNodeId;
    }

    public void setTreeNodeId(Long treeNodeId) {
        this.treeNodeId = treeNodeId;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }

    public String getRuleKey() {
        return ruleKey;
    }

    public void setRuleKey(String ruleKey) {
        this.ruleKey = ruleKey;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    public List<TreeNodeLink> getTreeNodeLinkList() {
        return treeNodeLinkList;
    }

    public void setTreeNodeLinkList(List<TreeNodeLink> treeNodeLinkList) {
        this.treeNodeLinkList = treeNodeLinkList;
    }

}
