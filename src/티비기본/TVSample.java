package 티비기본;

public class TVSample {
    public static void main(String[] args) {
        TV tv = new TV();
//        tv.getInfor();

        TV gTV= new TV(false,20,30);
//        gTV.getInfor();
        gTV.setOn(true);
        gTV.setChannel(59);
        gTV.setVolume(20);
        gTV.getInfor();

    }
}
