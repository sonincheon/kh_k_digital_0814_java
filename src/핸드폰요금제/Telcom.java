package 핸드폰요금제;
// 영식 : 30초당 10원 (30초가 되면 2통이됨)
// 민식 : 50초당 15원
// 첫번쨰 줄에 통화의 횟수, 두번쨰 줄에 통화당 통화 시간(초단위)
// 출력은 싼요금제를 출력 영식 요금제는 Y 민식 요금제는 M
// 총통화요금이 같을경우 YM 총 통화 요금 표시
import java.util.Scanner;

public class Telcom {
    public static void main(String[] args) {
        int[] call = new int[20]; // 통화 횟수에 대한 통화 시간을 입력받기위한 배열
        int yPay = 0, mPay = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("통화한 횟수 : ");
        int cnt = sc.nextInt();
        System.out.print("통화한 시간 : ");
        for(int i = 0; i< cnt; i++){ //통화 횟수 당 통화시간을 입력 받음
            call[i] = sc.nextInt();
        }
        // 총 통화 요금 구하기
        for(int i = 0; i < cnt; i++){
            yPay +=(call[i] / 30) * 10 + 10; // 기본한통화가있음
            mPay +=(call[i] / 60) * 15 + 15;
        }
        if(yPay > mPay){
            System.out.println("M" + mPay);
        }else if(yPay <mPay){
            System.out.println("Y" +yPay);
        }else {
            System.out.println("YM" +yPay);
        }
    }
}
