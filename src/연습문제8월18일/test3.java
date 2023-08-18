package 연습문제8월18일;
//N개의 숫자가 공백 없이 쓰여있다. 이숫자를 모두 합해서 출력
//첫쨰줄에 숫자개수 n이 주워진다 둘쨰줄에 숫자 n개가 공백없이 주어진다.
// 입력으로 주어진 숫자 n개의 합을 출력한다 .
//[힌트] 입력을 문자열로 간주 , 문자열에 하나의 문자를 추출해야함.
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String number = sc.next();
        int sum = 0;
        for(int i = 0; i<n;i++){
            sum += number.charAt(i) -'0';

        }
        System.out.println(sum);

    }
}

