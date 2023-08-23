package 아이패드만들기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class IPadPro {
    int screan;  // 11인치 12.9
    int color;// 스페이스그레이,실버
    int momory;  // 128,256,512GB,1TB
    int network; //Wi-Fi only, Wi-Fi+Cellular
    String name; //각인서비스 내용
    String productData; //제품 생산 일자
    String serialNum; //제품의 일렬번호 : 고유값
    static int cnt = 0; //클래스 소속의 변수, 몇대가 만들어졌는지 즉 클래스가 객체로 만들어진 횟수

    IPadPro(String name){
        this.name =name;
        Date now = new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("yyMMdd");
        productData = sdf.format(now); //생산한 년/월/일을 가져옴
        cnt++;
        productData += cnt; // 문자열에 생산갯수 이어붙이기
    }
    boolean continueOrder(){
        Scanner sc =new Scanner(System.in);
        System.out.println("=".repeat(5)+"iPad Pro 구입하기"+"=".repeat(5));
        System.out.println("구입 하시려면 yes / 종료는 quit :");
        String isContinue = sc.next();
        if(isContinue.equalsIgnoreCase("yes")) return true; //구입을 진행함
        else return false; // 종료
    }
    //화면 사이즈 정하기
    void setScrean(){
        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.print("디스플레이 선택 : [1] 11인치, [2] 12.9인치");
            screan =sc.nextInt();
            if(screan == 1|| screan ==2)return;
            System.out.println("디스플레이를 다시 선택 하세요.");
        }
    }
    void setColor(){
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("색상을 선택하세요 : [1] 스페이스그레이, [2] 실버");
            color =sc.nextInt();
            if(color == 1 || color ==2)return;
            System.out.println("색상을 다시 선택 하세요.");
        }
    }
    void setMomory(){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("용량 선택하세요 : [1] 125Gb, [2] 256Gb, [3] 512Gb, [4] 1TB ");
            momory = sc.nextInt();
            if (momory > 0 && momory<5 ) return;
            System.out.println("용량을 다시 선택 하세요.");
        }
    }

    void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("네트워크를 선택하세요 : [1] Wi-Fi, [2] Wi-Fi+Cellular");
            network = sc.nextInt();
            if (network == 1 || network == 2) return;
            System.out.println("네트워크를 다시 선택 하세요.");
        }
    }
    void setName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("각인 서비스를 신청 하시겠습니까? (yes /no ) ");
        String service =sc.next();
        if(service.equalsIgnoreCase("yes")){
            System.out.print("내용을 입력하세요 : ");
            name=sc.next();
        }
    }
    void setSerialNum(){
        String screenStr = (screan == 1) ? "11" : "13";
        String[] memStr= {"","128","256","512","1024"};
        String netStr =(network == 1) ? "W" :"C";
        serialNum = "iPad"+screenStr+memStr[momory] +netStr+productData; //일렬번호 생성
    }
    void progressPad() throws InterruptedException {
        int cnt = 0;
        while (true){
            sleep(300);
            cnt++;
            System.out.print("<<ipad Pro 제작 중 [" + cnt +"%]>>");
            System.out.print("\r");
            if(cnt >= 100) break;
        }
    }
    void ProctPad(){
        final String[] screenType = {"", "11인지","12.9인치"};
        final String[] colorType = {"", "스페이스그레이","실버"};
        final String[] memoryType ={"", "128GB","256GB","512GB","1TB"};
        final String[] netType ={"","Wi-Fi","Wi-FiCellular"};
        System.out.println("=".repeat(5)+"iPad Pro 사양"+"=".repeat(5));
        System.out.println("화면 크기: " +screenType[screan]);
        System.out.println("제품 색상: " +colorType[color]);
        System.out.println("제품 용량: " +memoryType[momory]);
        System.out.println("네트 워크: " +netType[network]);
        System.out.println("이름: "+ name);
        System.out.println("일련번호: " +serialNum );
        System.out.println("-".repeat(40));
    }

}
