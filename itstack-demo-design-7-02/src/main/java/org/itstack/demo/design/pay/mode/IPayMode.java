package org.itstack.demo.design.pay.mode;

/**
 * 支付模式接口
 */
public interface IPayMode {

    /**
     * 任何一个支付模式；刷脸、指纹、密码，都会过不同程度的安全风控，这里定义一个安全校验接口
     * <p>
     * <p>
     * 用户选择不同支付类型的时候，则会进行相应的风控拦截以此保障支付安全。
     *
     * @param uId
     * @return
     */
    boolean security(String uId);

}
