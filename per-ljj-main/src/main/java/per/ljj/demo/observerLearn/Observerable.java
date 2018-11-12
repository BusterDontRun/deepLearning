package per.ljj.demo.observerLearn;

import per.ljj.demo.observerLearn.Observer;

/**
 * @version V1.0
 * @Description: 抽象观察者 (微信公众号)
 * @author: ljj
 * @date: 2018/11/12 16:00
 */
public interface Observerable {
    //用户关注
    void registerObserver(Observer o);
    //用户取消关注
    void removeObserver(Observer o);
    //通知用户消息
    void sendMessageToObserver();
}
