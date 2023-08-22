package 소수의합구하기;
import java.util.Scanner;
//입력 받은 정수보다 작은 소수의 합을 구하는 함수를 만드세요.
//예) 12이면 2+3+5+7+11 =28
// 소수란 ? 1과 자기 자신이외의 자연수로 나누어 지지않는 수
public class PrimSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        int sum = 0;
        // 입력 받은 정수 미만의 소수를 찾기 위해 반복적으로 prime ()메소드 호출
        for(int i = 2; i < n; i++) sum += prime(i);
        System.out.println(sum);
    }

   static int prime(int n) {
       boolean isPrime = true;
       for (int i = 2; i < n; i++) {
           if (n % i == 0) isPrime =false;
       }
       if(isPrime) return n; //소수인 경우 매개변수로 전달된 값을 반환
       else return 0;
   }
}
