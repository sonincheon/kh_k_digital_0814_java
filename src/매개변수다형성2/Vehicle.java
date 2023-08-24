package 매개변수다형성2;

import 다형성기본.Parent;

public class Vehicle {
    public void run(){
        System.out.println("차량이 달립니다.");
    }
}
class SportsCar extends Vehicle{
    @Override
    public void run(){
        System.out.println("스포츠카가 달립니다.");
    }
}
class Texi extends Vehicle{
    @Override
    public void run(){
        System.out.println("택시가 달립니다.");
    }
}