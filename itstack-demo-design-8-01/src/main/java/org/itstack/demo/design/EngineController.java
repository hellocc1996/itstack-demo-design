package org.itstack.demo.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 人群差异化发优惠卷
 */
public class EngineController {

    private Logger logger = LoggerFactory.getLogger(EngineController.class);


    /**
     * 除了我们说的扩展性和每次的维护以外，这样的代码实现起来是最快的。
     * 而且从样子来看也很适合新人理解。
     *
     * @param userId
     * @param userSex
     * @param userAge
     * @return
     */
    public String process(final String userId, final String userSex, final int userAge) {

        logger.info("ifelse实现方式判断用户结果。userId：{} userSex：{} userAge：{}", userId, userSex, userAge);

        if ("man".equals(userSex)) {
            if (userAge < 25) {
                return "果实A";

                //根据职业继续区分？？
                //N多个条件？？后续这段代码就成了禁区，谁都不敢碰

            } else {
                return "果实B";
            }
        }

        if ("woman".equals(userSex)) {
            if (userAge < 25) {
                return "果实C";
            } else {
                return "果实D";
            }
        }

        return null;

    }


}
