package per.ljj.demo.singletonLearn;

/**
 * @version V1.0
 * @Description:单例模式(枚举)
 * 这种方式是Effective Java作者Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，
 * 而且还能防止反序列化重新创建新的对象，可谓是很坚强的壁垒啊，
 * 不过，个人认为由于1.5中才加入enum特性
 * @author: ljj
 * @date: 2018/11/8 17:45
 */
public enum SingletonLearnEnum {
    SINGLETON_LEARN_ENUM;
}
