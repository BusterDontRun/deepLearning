package per.ljj.demo;


import per.ljj.demo.observerLearn.Observer;
import per.ljj.demo.observerLearn.User;
import per.ljj.demo.observerLearn.WechatServer;

/**
 * @version V1.0
 * @Description:${todo}(用一句话描述该文件做什么)
 * @author: ljj
 * @date: 2018/11/8 17:49
 */
public class Test {

//test 观察者模式
//    public static void main(String[] args) {
//        Mother mother = new Mother();
//        Son son = new Son();
//
//        mother.notifyToEatDinner("吃饭");
//    }

    //test 工厂模式     --抽象
//    public static void main(String[] args) {
//        Animal animal = AnimalFactory.getInstance("Cat");
//        if (animal != null) {
//            animal.eatFood();
//        } else {
//            System.err.println("We don't know this kind of animal");
//        }
//    }
//测试代理模式        --抽象
//    public static void main(String[] args) {
//        Proxy proxy = new Proxy(new ZSSubject());
//        proxy.visit();
//        Proxy proxy2 = new Proxy(new LSSubject());
//        proxy2.visit();
//    }
//测试观察者模式(new)
    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");

        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");

    }
}
