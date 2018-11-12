package per.ljj.demo.ObserverLearn;

/**
 * @version V1.0
 * @Description:${todo}(用一句话描述该文件做什么)
 * @author: ljj
 * @date: 2018/11/8 17:59
 */
public class Mother implements ObserverLearnFamily {

    private String name = "妈妈";

    @Override
    public void notifyToEatDinner(String action) {
        System.out.println(name +"通知了儿子来"+action);
    }
}
