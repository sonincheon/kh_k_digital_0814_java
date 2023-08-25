package 자동차만들기;

public class Car {
    double speed;
    int mileage;
    int tank;
    int seat;
    String name;
    int [] distance = {0, 400, 200, 150, 300};
    public Car() {
    }
    void sub (int a, int b){
        int pundo;
        if(b%seat!=0){
            pundo = b/seat +1 ;
        }else
        {pundo = b/seat;}
        double oil = ((double)distance[a] /(tank * mileage))*(pundo);
        double time = ((double)distance[a] /speed)*pundo *60;

        System.out.println("======"+name+"======");
        System.out.println("총 비용 : " + (int)(((double)distance[a] / mileage)* 2000)*pundo+"원");
        System.out.println("총 주유 횟수 : " + (int)Math.ceil(oil) + "회");
        System.out.println("총 이동 시간 : " + (int)time/60 + "시간" +(int)time%60 +"분");
    }
}
class SportsCar extends Car{

    public SportsCar(int d) {
        super();
        name ="sportsCar";
        speed = 250;
        mileage = 8;
        tank = 30;
        seat =2;
        if(d==1){
            speed=speed*1.2;
        }
    }
}
class Sedan extends Car{
    public Sedan (int d) {

        name ="sedan";
        speed =200;
        mileage = 12;
        tank = 45;
        seat =4;
        name = name;
        if(d==1){
            seat=seat + 1;
        }
    }
}
class Bus extends Car{
    public Bus (int d) {
        name ="bus";
        speed = 150;
        mileage = 5;
        tank = 100;
        seat =20;
        name = name;
        if(d==1){
            tank =tank + 30;
        }
    }

}