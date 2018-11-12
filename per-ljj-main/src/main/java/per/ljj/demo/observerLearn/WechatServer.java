package per.ljj.demo.observerLearn;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V1.0
 * @Description:${todo}(用一句话描述该文件做什么)
 * @author: ljj
 * @date: 2018/11/12 16:02
 */
public class WechatServer implements Observerable {

    //注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
    private List<Observer> list;
    private String message;

    public WechatServer() {
        // 被创建的时候 就要初始化 所有观察者的List集合
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(!list.isEmpty())
        list.remove(o);
    }

    @Override
    public void sendMessageToObserver() {
        for(int i = 0; i < list.size(); i++) {
            Observer oserver = list.get(i);
            oserver.update(message);
        }
    }

    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        sendMessageToObserver();
    }
}
