package per.ljj.demo.proxyLearn;

/**
 * @version V1.0
 * @Description:${todo}(用一句话描述该文件做什么)
 * @author: ljj
 * @date: 2018/11/12 15:35
 */
public class ZSSubject implements Subject {

    private String customName ="阿三";

    @Override
    public void visit() {
        System.out.println("我要去访问"+customName);
    }
}
