package 인터페이스기본;

import java.util.Scanner;

public class InterfaceBasic {
    public static void main(String[] args) {
        NetworkAdapter adapter; // 완전 추상화가 적용된 인터페이스
        Scanner sc = new Scanner(System.in);
        System.out.println("연결할 네트워크 [1]LAN [2]WiFi [3]5G : ");
        int sel = sc.nextInt();
        switch (sel){
            case 1: adapter = new LAN("KT Megapass");
                    adapter.connect();
                    break;
            case 2: adapter = new WiFi("SK Telecom");
                    adapter.connect();
                    break;
            case 3:adapter = new FiveG("LG U+");
                   adapter.connect();
                   break;
            default:
                System.out.println("선택한 네트워크는 없습니다.");
        }
    }
}
