package 티비기본;

import java.nio.channels.Channel;

public class TV {
    private boolean isOn; // TV 전원
    private int channel;
    private int volume;

    TV(){
        isOn =false;
        channel = 11;
        volume = 10;
        System.out.println("전원 : " + isOn + ", 채널 : " + channel + ", 볼륨 : "+volume);
    }

    TV(boolean isOn,int ch,int vol){
        this.isOn=isOn;
        channel=ch;  // this는 클래스내의 변수 확인
        volume=vol;
        System.out.println("전원 : " + isOn + ", 채널 : " + channel + ", 볼륨 : "+volume);
    }
    public void setOn(boolean isOn){
        this.isOn =isOn;
        String onOffStr=(isOn) ?"ON" :"OFF";
        System.out.println("TV 전원이 "+onOffStr+"되었습니다.");
    }
    public void setChannel(int ch){
        if(ch >= 1 && ch <=999){
            channel=ch;
            System.out.println("채널을 " + channel +"로 변경하였습니다.");
        }else {
            System.out.println("채널 설정값이 허용 범위를 벗어 났습니다.");
        }
    }
    public void setVolume(int vol){
        if(vol>= 0 &&vol<=100){
            volume=vol;
            System.out.println("볼륨값은 " + volume + "변경 하였습니다.");
        }else {
            System.out.println("볼륨 설정값이 허용 범위를 벗어 났습니다.");
        }
    }
    public void getInfor(){
        String onOffStr =(isOn) ? "ON" :"OFF";
        System.out.println("=".repeat(5)+"TV 정보"+"=".repeat(5));
        System.out.println("전원 : " + onOffStr);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
    }
}
