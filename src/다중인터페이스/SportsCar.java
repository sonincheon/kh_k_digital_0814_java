package 다중인터페이스;

public class SportsCar extends Car implements AirCon, AutoDrive{
    private boolean isAirCon;
    private int setTemp;
    private boolean isAutoDrv;
    private int speed;
    private String color;
    private String year;
    private boolean isTurbo;

    public SportsCar(boolean isAirCon, int setTemp, boolean isAutoDrv, int speed, String color, String year, boolean isTurbo) {
        this.isAirCon = isAirCon;
        this.setTemp = setTemp;
        this.isAutoDrv = isAutoDrv;
        this.speed = speed;
        this.color = color;
        this.year = year;
        this.isTurbo = isTurbo;
    }
    public void viewInfo(){
        String airConStr = (isAirCon) ? "ON" : "OFF";
        String autoStr = (isAutoDrv) ? "ON" : "OFF";
        String turboStr = (isTurbo) ? "ON" : "OFF";
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("제작연도 : " + year);
        System.out.println("에어컨 : " + airConStr);
        System.out.println("에어컨 온도 : " + setTemp);
        System.out.println("자율 주행 : " + autoStr);
        System.out.println("터보 모드 : " + turboStr);
    }


    @Override
    public void airConON() {
        System.out.println("에어컨을 켰습니다.");
    }

    @Override
    public void airConOFF() {
        System.out.println("에어컨을 껐습니다.");
    }

    @Override
    public void setAirConTemp(int temp) {
        System.out.println("에어컨 설정 온도를 " + temp + "로 변경 합니다.");
    }

    @Override
    public void autoDrvON() {
        System.out.println("자율 주행 모드를 켰습니다.");
    }

    @Override
    public void autoDrvOFF() {
        System.out.println("자율 주행 모드를 껐습니다.");
    }
}
