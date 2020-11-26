package org.itstack.demo.design.domain.service.engine;

import org.itstack.demo.design.domain.model.aggregates.TreeRich;
import org.itstack.demo.design.domain.model.vo.EngineResult;

import java.util.Map;

/**
 * 决策引擎接口定义
 */
public interface IEngine {

    /**
     * 决策
     *
     * @param treeId
     * @param userId
     * @param treeRich
     * @param decisionMatter
     * @return
     */
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
