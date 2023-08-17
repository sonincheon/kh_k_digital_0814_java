package 정수나누어담기;

import java.util.Scanner;

public class ExampleTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("100의 자리 정수를 입력하시오 :");
        int num1 = sc.nextInt();

        int a = num1/100;
        int b = (num1%100)/10;
        int c = num1%10;

        System.out.println("100의자리 : " + a +", 10의자리 : "+b+", 1의자리 : "+c );

    }
}
