package org.itstack.demo.design.domain.service.engine;


import org.itstack.demo.design.domain.service.logic.LogicFilter;
import org.itstack.demo.design.domain.service.logic.impl.UserAgeFilter;
import org.itstack.demo.design.domain.service.logic.impl.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 决策节点配置
 */
public class EngineConfig {

    static Map<String, LogicFilter> logicFilterMap;

    static {
        //初始化决策节点对应的规则key
        logicFilterMap = new ConcurrentHashMap<String, LogicFilter>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }

    public Map<String, LogicFilter> getLogicFilterMap() {
        return logicFilterMap;
    }

    public void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap) {
        EngineConfig.logicFilterMap = logicFilterMap;
    }

}
