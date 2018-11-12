package per.ljj.demo.factoryLearn;

/**
 * @version V1.0
 * @Description:拓展实现类
 * @author: ljj
 * @date: 2018/11/12 15:05
 */
public class Dog implements Animal {


    @Override
    public void eatFood() {
        System.out.println("I am a dog,i eat shit...");
    }
}
