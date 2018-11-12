package per.ljj.demo.singletonLearn;

/**
 * @version V1.0
 * @Description:单例模式(懒汉模式 --线程安全)
 * @author: ljj
 * @date: 2018/11/8 17:41
 */
public class SingletonLearnLazy {
    private SingletonLearnLazy(){};

    private static SingletonLearnLazy instance;

    public static synchronized SingletonLearnLazy getInstance () {
        if (instance == null) {
            instance = new SingletonLearnLazy();
        }
        return instance;
    }

}
