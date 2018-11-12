package per.ljj.demo;

import per.ljj.demo.factoryLearn.Animal;
import per.ljj.demo.factoryLearn.AnimalFactory;
import per.ljj.demo.observerLearn.Mother;
import per.ljj.demo.observerLearn.Son;

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

//test 工厂模式
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getInstance("Cat");
        if (animal != null) {
            animal.eatFood();
        } else {
            System.err.println("We don't know this kind of animal");
        }
    }

}
