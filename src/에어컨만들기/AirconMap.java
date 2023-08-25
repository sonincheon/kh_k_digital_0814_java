package 에어컨만들기;
// 전원 : on / off
// 온도 설정 기능
// 현재 온도 표시 기능
// Cooler ON/OFF
// Heater ON/OFF
// 바람세기 : 1단 /2단 /3단

import java.util.Calendar;
import java.util.Scanner;

public class AirconMap {
   private boolean isPower; // on / off
   private int setTemp; //온도설정
   private int currTemp; //현재온도
   private boolean isCooler;
   private boolean isHeater;
   private int windStep; // 1,2,3단

    AirconMap(){
       final int[] MONTHDTEMP = {-5,3,10,15,22,28,32,30,24,16,8,2}; // 에어컨의 현재 온도를 보여주기위한 값
       Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH); // 배열의 인덱스와 동일 0 >> 1월
        currTemp = MONTHDTEMP[month];  // 월에대한 내용을 알려달라 >> 알려준값으로 현재 월의 온도 파악
        isPower =false;
        setTemp = 18;
        isCooler=false;
        isHeater=false;
        windStep = 1;
    }
    void airConInfo(){
        String onOffStr =(isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"","1단계","2단계","3단계"};
        System.out.println("=".repeat(5) + " 에어컨 정보 " +"=".repeat(5));
        System.out.println("전원 : "+ onOffStr);
        System.out.println("현재 온도 : "+ currTemp);
        System.out.println("설정 온도 : "+ setTemp);
        System.out.println("히터 : "+ heaterStr);
        System.out.println("쿨러 : "+ coolerStr);
        System.out.println("바람세기 : "+ windStr[windStep]);
    }
    public void setAirConState(){
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도는 " + currTemp + "입니다.");
        System.out.print("온도를 설정 하세요 : ");
        setTemp =sc.nextInt();
        System.out.println("설정 온도는 " +setTemp +"입니다.");
        System.out.print("바람 세기를 성정하세요 (1단/2단/3단) : ");
        windStep = sc.nextInt();
        if(currTemp>setTemp){ // 설정 온도가 현재 온도보다 낮은 상태 , 더운상태
            System.out.println("쿨러가 동작 합니다.");
            isCooler = true;
            isHeater = false;
        }else if(currTemp<setTemp){
            System.out.println("히터가 동작합니다.");
            isHeater =true;
            isCooler =false;
        }else{
            isCooler =false;
            isHeater =false;
        }

    }
    public void setPower(boolean power){
        isPower = power;
    }
    public int getWindStep(){
        return windStep;
    }
    public boolean isHeater(){
        return isHeater;
    }
    public boolean isCooler(){
        return isCooler;
    }
    public void setCurrTemp(int n){ // 매개변수의 정수 값을 받아 현재 온도를 변경해줌
        currTemp += n;
    }
    public int getCurrTemp(){ //현재 온도를 읽는 메소드
        return currTemp;
    }
    public int getSetTemp(){ //설정 온도를 읽는 메소드
        return setTemp;
    }

}
