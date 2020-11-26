package org.itstack.demo.design;

import org.itstack.demo.design.store.ICommodity;
import org.itstack.demo.design.store.impl.CardCommodityService;
import org.itstack.demo.design.store.impl.CouponCommodityService;
import org.itstack.demo.design.store.impl.GoodsCommodityService;

public class StoreFactory {

    /**
     * 工厂类
     * <p>
     * 如果你不喜欢if判断，也可以使用switch或者map配置结构，会让代码更加干净
     * 也可以使用反射或者结合其他设计模式组合使用
     *
     * @param commodityType
     * @return
     */
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) {
            return null;
        } else if (1 == commodityType) {
            return new CouponCommodityService();
        } else if (2 == commodityType) {
            return new GoodsCommodityService();
        } else if (3 == commodityType) {
            return new CardCommodityService();
        }
        throw new RuntimeException("不存在的商品服务类型");
    }

}
