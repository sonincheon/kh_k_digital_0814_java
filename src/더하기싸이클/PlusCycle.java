package 더하기싸이클;
// 입력 받은 수를 더하기 싸이클 조건을 수행 했을때 몇회만에 원래 입력한수와같아지는지 확인
//입력 26 >> 2 + 6 = 8
//원래값의 1자리와 새롭게 만들어진 수의 1자리를 다시 더합 68
// 1cycle ---------------
//68 >> 6과 8을 분리해서 더합 >> 6+8 = 14
//원래 값의 1의 자리와 새롭게 만들어진 수의 1의 자리를 다시 더합 >> 12
// 2cycle ---------------------------------------------

import java.util.Scanner;

public class PlusCycle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("입력 : ");
        int input =sc.nextInt(); // 최초 숫자
        int totalCnt = 0; // 사이클 누적횟수
        int calcNum = input; //최초 입력값이 변경되지 않도록 하기위해서 ..
        int divsum = 0; // 수를 10의 자리와 1의 자리로 분리해서 더하기 위한 변수
        int newNum = 0;
        while (true){
            totalCnt++;
            divsum = (calcNum/10)+(calcNum%10); //10자리 1자리 분리해서 더함
            newNum = (calcNum%10)*10+(divsum%10); //앞의 1의 자리와 뒤의 1의자리 더함
            if(newNum == input)break;
            calcNum=newNum;
        }
        System.out.println(totalCnt);



    }
}
