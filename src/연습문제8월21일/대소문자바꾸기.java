package 연습문제8월21일;
// 대소문자 변경
//charAt(index) : 문자열에 해당 문자를 추출
//toCharArray() : 문자열을 문자 배열로 변환
import java.util.Scanner;

public class 대소문자바꾸기 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a = sc.next();

        for(int i = 0; i<a.length();i++){
            char b = a.charAt(i);
            if(b < 'a') System.out.print((char)(b+('a'-'A')));
            else System.out.print((char)(b-('a'-'A')));
        }


    }
}
