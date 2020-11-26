package org.itstack.demo.design.test;

import org.itstack.demo.design.pay.channel.Pay;
import org.itstack.demo.design.pay.channel.WxPay;
import org.itstack.demo.design.pay.channel.ZfbPay;
import org.itstack.demo.design.pay.mode.PayFaceMode;
import org.itstack.demo.design.pay.mode.PayFingerprintMode;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * 支付测试类
 */
public class ApiTest {

    @Test
    public void test_pay() {
        /**
         * 这里的调用方式变得整洁、干净、易使用；new WxPay(new PayFaceMode())、new ZfbPay(new PayFingerprintMode())
         *
         * 外部的使用接口的用户不需要关心具体的实现，只按需选择使用即可。
         *
         * tips：
         * 此处还可以使用工厂模式继续优化
         */

        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111", "100000109894", new BigDecimal(100));

    }

}
