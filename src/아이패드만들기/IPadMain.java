package 아이패드만들기;

public class IPadMain {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            IPadPro iPadPro = new IPadPro("iPad Pro");
            if(!iPadPro.continueOrder()) break;
            iPadPro.setScrean();
            iPadPro.setColor();
            iPadPro.setMomory();
            iPadPro.setNetwork();
            iPadPro.setName();
            iPadPro.setSerialNum();
            iPadPro.progressPad();
            iPadPro.ProctPad();
        }
    }
}
