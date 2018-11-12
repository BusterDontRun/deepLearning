package per.ljj.demo.proxyLearn;

/**
 * @version V1.0
 * @Description:${todo}(用一句话描述该文件做什么)
 * @author: ljj
 * @date: 2018/11/12 15:36
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void visit() {
        subject.visit();
    }
}
