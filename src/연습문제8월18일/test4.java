package 연습문제8월18일;
// 문자열을 입력 받음 : abcd - > dcba
// 문자열의 길이는 length()로 확인가능
//
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String input =sc.next();
        int pos =input.length() -1; // 문자열의 시작 위치(반전의 위치)

        while (pos>-1){
            System.out.print(input.charAt(pos));
            pos--;





        }

    }
}
