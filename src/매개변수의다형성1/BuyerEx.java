package 매개변수의다형성1;
//**

import java.util.Scanner;

public class BuyerEx {
    public static void main(String[] args) {
        Buyer buyer= new Buyer();
        TV tv = new TV();
        Computer computer =new Computer();
        Audio audio=new Audio();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("[1] TV [2] Computer [3] Audio [4]quit");
            int sel = sc.nextInt();
            switch (sel){
                case 1 : buyer.buy(tv);
                         buyer.viewInfo();
                         break;
                case 2 : buyer.buy(computer);
                         buyer.viewInfo();
                         break;
                case 3 : buyer.buy(audio);
                         buyer.viewInfo();
                         break;
                case 4 :
                    System.out.println("구매를 종료합니다 ."); return;
                default:
                    System.out.println("해당 제품이 없습니다.");
                    return;
            }
        }

    }
}
