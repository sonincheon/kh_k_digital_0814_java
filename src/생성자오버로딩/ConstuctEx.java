package 생성자오버로딩;

public class ConstuctEx {
    public static void main(String[] args) {
        Car car = new Car();
        car.carInfo();

        Car santafe = new Car("싼타패");
        santafe.carInfo();
        Car corando = new Car("코란도","레드");
        corando.carInfo();
        Car avante = new Car("아반뗴","레드",100,60);
        avante.carInfo();

    }
}
