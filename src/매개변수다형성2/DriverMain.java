package 매개변수다형성2;
//**
import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver =new Driver("incheons");
        SportsCar sportsCar=new SportsCar();
        Texi texi=new Texi();
        Scanner sc =new Scanner(System.in);
        System.out.print("운전하고 싶은 차를 선택 [1]스포츠카 [2]택시 : ");
        int selCar =sc.nextInt();
        switch (selCar){
            case 1 : driver.drive(sportsCar); break;
            case 2 : driver.drive(texi);break;
            default:
                System.out.println("차량 선택을 잘못하셨습니다.");
        }



    }
}
