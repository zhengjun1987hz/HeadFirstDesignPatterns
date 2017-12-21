package chapter01;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2017/12/21
 * Project:HeadFirstDesignPatterns
 */
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println(MyUtils.getCurrentTime() +"I CANNOT fly!");
    }
}
