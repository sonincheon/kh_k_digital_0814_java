package this에대해서;
// this : 자기 자신의 객체를 참조하는데 사용하는 참조 변수**
// this() : 생성자 내에서 다른 생성자를 호출하는데 사용

public class ThisRef {
    public static void main(String[] args) {
    Car car=new Car("Santafe");
    car.carInfo();
    }
}
