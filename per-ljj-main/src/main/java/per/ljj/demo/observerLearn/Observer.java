package per.ljj.demo.observerLearn;

/**
 * @version V1.0
 * @Description: 抽象观察者接口 (微信公众号用户)
 * @author: ljj
 * @date: 2018/11/12 15:59
 */
public interface Observer {
    // 接收公众号推送消息
    void update(String message);

}
