package 연습문제8월18일;

import java.util.Scanner;

//"45분 일찍 알람 설정하기"
public class test1 {
    public static void main(String[] args) {
        int H;
        int M;

        Scanner sc = new Scanner(System.in);
        System.out.print("등교할시간을 알려주세요 (시간) :");
        H =sc.nextInt();
        System.out.print("등교할시간을 알려주세요 (분) :");
        M =sc.nextInt();

        int all = (60*H)+M;

        if(all < 45){
            all = 24*60-45;
        } all -= 45;




        //내가푼문제
//        if(0<=H && H<24 && 0<=M && M<45) {
//            H-=1;
//            M+=45;
//            M-=60;
//            System.out.println("상근이 기상시간은"+H+"시"+M+"분 입니다.");
//        }else if (0<=H && H<24 && 45<=M && M<60){
//            M-=45;
//            System.out.println("상근이 기상시간은"+H+"시"+M+"분 입니다.");
//        } else {
//            System.out.println("정확한 시간이아닙니다.");
//        }
        //해답
        int totalM= H *60 +M;
        if(totalM <45) {
            totalM = 24 * 60 + totalM;
        }
            totalM -=45;
            System.out.println("상근이 기상시간은"+(totalM/60)+"시"+(totalM%60)+"분 입니다.");





    }
}
