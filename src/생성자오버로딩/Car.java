package 생성자오버로딩;

public class Car {
    //필드(클래스내 변수)
    String company = "현대자동차";
    String model;
    String color;
    int speed;
    int horsePower;

    //생성자
    Car(){}
    //매개변수있는 생성자 오버로딩
    Car(String model){
       this.model = model;
    }
    Car(String model,String color){
        this.model =model;
        this.color =color;
    }
    Car(String model,String color,int speed){
        this.model=model;
        this.color=color;
        this.speed=speed;
    }
    Car(String model,String color,int speed,int horsePower){
        this.model=model;
        this.color=color;
        this.speed=speed;
        this.horsePower=horsePower;
    }



    //메소드
    public void carInfo(){
        System.out.println(company);
        System.out.println(model);
        System.out.println(color);
        System.out.println(speed);
        System.out.println(horsePower);
    }
}
