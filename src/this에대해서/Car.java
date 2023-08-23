package this에대해서;

public class Car {    // Car car =new car();
    private String model; //자동차명
    private int year;     //출고년도
    private String color; //색상
    private int maxSpeed; //최고 속도

    Car(){}
    Car(String model){
       this(model, 2022,"brack",230);
    }
    Car(String model,int year,String color, int speed){
        this.model = model;
        this.year =year;
        this.color=color;
        maxSpeed = speed;
    }
}
