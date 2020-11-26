package org.itstack.demo.design.pay.channel;

import org.itstack.demo.design.pay.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 支付类型桥接抽象类
 */
public abstract class Pay {

    protected Logger logger = LoggerFactory.getLogger(Pay.class);

    /**
     * 桥接接口;重点
     */
    protected IPayMode payMode;

    /**
     * 上游自行选择支付模式
     *
     * @param payMode
     */
    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    /**
     * 转账
     * <p>
     * <p>
     * 在支付的时候分别都调用了风控的接口进行验证，也就是不同模式的支付(刷脸、指纹)，都需要过指定的风控，才能保证支付安全。
     *
     * @param uId
     * @param tradeId
     * @param amount
     * @return
     */
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);

}
