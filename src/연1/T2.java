package 연1;

import java.util.Scanner;

//100의 자리 정수를 입력 받아서 3개의 변수에 나누어 대입 하기
public class T2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("100자리 숫자를 입력하시오 : ");
        int num =sc.nextInt();

        int a = num / 100;
        int b = (num%100)/10;
        int c = num%10;

        System.out.println("100의자리 : "+a +", 10의자리 : "+b +", 1의자리 : "+ c);

    }

}
