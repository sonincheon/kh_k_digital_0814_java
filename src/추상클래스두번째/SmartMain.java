package 추상클래스두번째;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone=new SmartPhone("iPhone");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();

        Phone phone = new Phone("목업") {

            @Override
            void call() {
                System.out.println("목업폰이라 망햇어 ㅠ");
            }
        };
        phone.call();
    }
}
