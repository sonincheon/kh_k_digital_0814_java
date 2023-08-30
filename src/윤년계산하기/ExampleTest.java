package 윤년계산하기;
//        [윤년의 조건]
//        - 연도가 4로 나누어 떨어 진다.
//        - 100으로 나누어 떨어지면 연도는 윤년이 아니다.
//        - 400으로 나누어 떨어지면 윤년이다.

import java.util.Scanner;

public class ExampleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하세요 : ");
        int year = sc.nextInt();

        if(year % 4 == 0 && (year % 100 !=0 || year % 400 == 0)){
           System.out.println(year +"년은 윤년 입니다."); //조건이 참인경우 수행되는 구간
        }else {
           System.out.println(year +"년은 윤년 아닙니다.");//조건이 거짓인경우
        }
    }
}
