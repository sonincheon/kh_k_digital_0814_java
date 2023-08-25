package 디폴트메소드;

import java.util.Scanner;

public class DefaultMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("제품선택 [1] 오디오 [2] 티비  : ");
        int sel = sc.nextInt();
        RemoteControl rc;
        if(sel ==1 ){
            rc = new Audio();
            rc.turnON();
            rc.setVolume(20);
            rc.setMute(true);
            RemoteControl.changeBattery();
        }else {
            rc = new Television();
            rc.turnON();
            rc.setVolume(30);
        }

    }
}
