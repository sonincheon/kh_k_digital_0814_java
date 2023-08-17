package 연습문제8월17일;

//- 시험 성적을 입력 받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지는 F를 출력하는 프로그램
//        - 0 ~ 100 사이가 아니면 성적이 잘못 입력 되었다고 출력
import 스위치문.SwichEx;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
                System.out.print("성적을 입력하세요 : ");
                int num = sc.nextInt();
                if (num < 0 || num > 100) continue;
                else if (num >= 90) System.out.println("A");
                else if (num >= 80) System.out.println("B");
                else if (num >= 70) System.out.println("C");
                else if (num >= 60) System.out.println("D");
                else System.out.println("F");
                break;
            }
        }

    }

