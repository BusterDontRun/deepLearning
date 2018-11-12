package per.ljj.demo.singletonLearn;

/**
 * @version V1.0
 * @Description:单例模式(通过内部静态类获取)
 * @author: ljj
 * @date: 2018/11/8 17:35
 */
public class SingletonLearnInnerClass {
    private SingletonLearnInnerClass() {};

    public static class SingletonHolder {
        private static final SingletonLearnInnerClass SINGLETON_LEARN_INNER_CLASS = new SingletonLearnInnerClass();
    }
    public static final SingletonLearnInnerClass getSingletonLearnInstance () {
        return SingletonHolder.SINGLETON_LEARN_INNER_CLASS;
    }
}
