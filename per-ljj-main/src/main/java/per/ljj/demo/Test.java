package per.ljj.demo;

import per.ljj.demo.ObserverLearn.Mother;
import per.ljj.demo.ObserverLearn.Son;

/**
 * @version V1.0
 * @Description:${todo}(用一句话描述该文件做什么)
 * @author: ljj
 * @date: 2018/11/8 17:49
 */
public class Test {
    public static void main(String[] args) {
        Mother mother = new Mother();
        Son son = new Son();

        mother.notifyToEatDinner("吃饭");
//        测试下
    }
}
