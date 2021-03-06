package per.ljj.demo.factoryLearn;

import org.springframework.util.StringUtils;

/**
 * @version V1.0
 * @Description:工厂
 * @author: ljj
 * @date: 2018/11/12 15:09
 */
public class AnimalFactory {

    public static Animal getInstance (String kindClassName) {
        if (!StringUtils.isEmpty(kindClassName)) {
            if ("Dog".equals(kindClassName)) {
                return new Dog();
            } else if ("Wolf".equals(kindClassName)) {
                return new Wolf();
            } else {
                return null;
            }
        }
        return null;
    }

}
