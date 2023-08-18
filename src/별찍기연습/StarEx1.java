package 별찍기연습;
//삼각형 별찍기
// 입력 받은 수만큼 별찍기
//*
//* *
//* * *
//* * * *
//* * * * *


import java.util.Scanner;

public class StarEx1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("별 개수를 입력하시오 : ");
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.println("* ");
//            }
//            System.out.println();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
