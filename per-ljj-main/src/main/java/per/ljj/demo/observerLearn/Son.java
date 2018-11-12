package per.ljj.demo.observerLearn;

/**
 * @version V1.0
 * @Description:${todo}(用一句话描述该文件做什么)
 * @author: ljj
 * @date: 2018/11/8 18:01
 */
public class Son {
    ObserverLearnFamily observerLearnsFamily;

    public void notifyToEatDinner(){
        observerLearnsFamily.notifyToEatDinner("吃饭？");
    }

}
