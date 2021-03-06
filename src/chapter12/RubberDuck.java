package chapter12;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/5 15:01
 */
public class RubberDuck implements Quackable {
    Observable observable;

    public RubberDuck() {
        observable= new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println(MyUtils.getCurrentTime() +"Squeak");
        notifyAllObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyAllObservers() {
        observable.notifyAllObservers();
    }
}
