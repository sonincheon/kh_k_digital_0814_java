package 디폴트메소드;

public interface RemoteControl {
    int MAX_VOLUME =100; //자동으로  뒤에 final static 추가됨
    int MIN_VOLUME =0;
    void turnON(); // 리모콘 on 추상 메소드,public abstract 추가
    void turnoff();
    void setVolume(int vol);
    // 디폴트 메소드는 JDK 8 이후에 추가됨
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다 .");
    }
    static void changeBattery(){
        System.out.println("건전지 교환 합니다.");
    }

}
