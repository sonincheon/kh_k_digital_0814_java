package 연습문제8월17일;

import java.util.Scanner;

//세자리의 정수를 입력 받아 가장 큰 수 출력
public class test6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("세자리 정수 :");
        int num1= sc.nextInt();

        int x = num1/100; // 3번째 자리
        int y = num1%100/10; // 2번째 자리
        int z = num1%10; //1번째 자리

        if(x > y && x > z){
            System.out.println("가장큰 정수는 "+ x +"입니다.");
        } else if (y > x && y > z) {
            System.out.println("가장큰 정수는 "+ y +"입니다.");
        } else if (z > y && z > x) {
            System.out.println("가장큰 정수는 " + z + "입니다.");
        }
    }
}
