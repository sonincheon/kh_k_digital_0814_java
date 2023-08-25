package 추상클래스두번째;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone=new SmartPhone("iPhone");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();
    }
}
