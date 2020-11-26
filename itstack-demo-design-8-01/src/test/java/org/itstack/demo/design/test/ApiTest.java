package org.itstack.demo.design.test;

import org.itstack.demo.design.EngineController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 测试ifelse形式的人群差异化发优惠卷
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_EngineController() {
        EngineController engineController = new EngineController();
        String process = engineController.process("000000001", "man", 29);
        logger.info("测试结果：{}", process);
    }

}
