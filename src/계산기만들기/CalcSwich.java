package 계산기만들기;

import java.util.Scanner;

public class CalcSwich {
    public static void main(String[] args) {
        int x,y; //좌변과 우변
        char op; //연산자
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 : ");
        x =sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("연산자 : ");
        op =sc1.next().charAt(0);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("숫자 : ");
        y = sc2.nextInt();

        switch(op){
            case '+' :
                System.out.println("덧셈 :" + (x+y) );
                break;
            case '-' :
                System.out.println("뺄셈 :" + (x-y) );
                break;
            case '*' :
                System.out.println("곱셈 :" + (x*y) );
                break;
            case '/' :
                System.out.println("나눗셈 :" + ((double)x/y) );
                break;
            default:
                System.out.println("연산자를 잘못 입력 하셨습니다.");
                break;

        }


    }

}
