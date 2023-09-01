package 전자레인지;
// 5분(300 ) /1분 (60) /10초 ,버튼 생성
// 최소 횟수로 눌러서 요리시간을 설정하는 문제
// 시간을 맞출수 없으면 -1 반환
import java.util.Scanner;

public class ex1main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("시간을 입력하세요(초) : ");
        int input =sc.nextInt();

        int a = input/300;
        int b = (input%300)/60;
        int c = ((input%300)%60)/10;
//        if(input%10 !=0){
//            System.out.println("-1");}
        if((input-((a*300)+(b*60)+(c*10))<10)){
            System.out.println(-1);
            c++;
            System.out.println("A 버튼 : "+a+" B 버튼 : "+b+" C 버튼 : "+c);
        }else {System.out.println("A 버튼 : "+a+" B 버튼 : "+b+" C 버튼 : "+c);}

    }
}



