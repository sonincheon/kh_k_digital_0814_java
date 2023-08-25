package 에어컨만들기;
import java.util.Scanner;
import static java.lang.Thread.sleep;


public class AirconMain {
    public static void main(String[] args) throws InterruptedException {
        AirconMap lgAirCon =new AirconMap();
        int elapsedTime = 0;
        boolean isSetTemp = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("에어컨을 키시겠습니까? (yes/no)");
        String isOn = sc.next();
        if(isOn.equalsIgnoreCase("yes")){
            lgAirCon.setPower(true);
            lgAirCon.setAirConState();
            while (true){
                sleep(1000);
                elapsedTime ++; // 1초 마다 1씩올라감
                switch (lgAirCon.getWindStep()){
                    case 1 : if(elapsedTime >= 60) isSetTemp =true; break;
                    case 2 : if(elapsedTime >= 30) isSetTemp =true; break;
                    case 3 : if(elapsedTime >= 20) isSetTemp =true; break;
                    default: if(elapsedTime >= 61) isSetTemp =true; break;
                }
                if(isSetTemp){
                    if(lgAirCon.isHeater()) lgAirCon.setCurrTemp(1);
                    else if(lgAirCon.isCooler()) lgAirCon.setCurrTemp(-1);
                    lgAirCon.airConInfo();
                    isSetTemp =false; //온도 변경 이후 초기화
                    elapsedTime=0;    //온도 변경 이후 초기화
                }
                if(lgAirCon.getCurrTemp() == lgAirCon.getSetTemp()){
                    System.out.println("에언컨을 종료합니다.");
                    break;
                }
            }
        }
    }
}
