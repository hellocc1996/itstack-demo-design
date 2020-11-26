package org.itstack.demo.design;

import org.junit.Test;

import java.math.BigDecimal;

public class ApiTest {

    @Test
    public void test_pay() {
        PayController pay = new PayController();

        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        pay.doPay("weixin_1092033111", "100000109893", new BigDecimal(100), 1, 2);

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        pay.doPay("jlu19dlxo111", "100000109894", new BigDecimal(100), 2, 3);

        /**
         *
         * 从测试结果看已经满足了我们的不同支付类型和支付模式的组合，但是这样的代码在后面的维护以及扩展都会变得非常复杂。
         *
         */
    }
}
