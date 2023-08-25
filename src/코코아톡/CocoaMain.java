package 코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTalk cocoaTalk =new CocoaTalk("곰돌이사육사");
        cocoaTalk.writeMsg("오늘 아침에 비가 많이 왔어요.");
        NetAdapter adapter ;
        Scanner sc= new Scanner(System.in);
        System.out.print("네트워크 [1] WiFi [2] 5G ");
        int sel = sc.nextInt();
        if(sel ==1 ) adapter =new WiFi();
        else adapter =new FiveG();
        cocoaTalk.send(adapter);
    }
}
