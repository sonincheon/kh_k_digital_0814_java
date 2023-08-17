package 연1;

import java.util.Scanner;

// 어른 어린이 구분하기
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하시오 :");
        int year =sc.nextInt();

        boolean isadult = (year >= 20) ? true : false;



    }
}
