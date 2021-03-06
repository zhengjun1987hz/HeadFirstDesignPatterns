package chapter12;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/5 14:58
 */
public interface Quackable extends QuackObservable {
    void quack();

    @Override
    void registerObserver(Observer observer);

    @Override
    void notifyAllObservers();
}
