package While문;
// 주어진 조건이 참인 동안 계속 해당 블록{ }을 반복 수행

import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하시오 : ");
        int n = sc.nextInt();
        int sum = 0 ; //합계를 구한 변수를 초기화 (지역변수)
//        while(n > 0) {
//            sum +=n; // sum = sum + n;
//            n--; // 입력 받은 값을 1씩 감소 시킴
//        }
        //for(초기식; 조건식; 증감식)
        for(int i =1 ; i <= n; i++){
            sum += i;

        }

        System.out.println("주어진 정수의 합" + sum);

    }
}
