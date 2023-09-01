package 스택연습문제;

import java.util.Scanner;
import java.util.Stack;

//스택을 이용해서 열림괄호 닫힘 괄호 체크하기
public class StackMainEx {
    public static void main(String[] args) {
        Stack<Character> st =new Stack<>();
        Scanner sc =new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String exp = sc.next();
        // 입력 받은 문자열 길이 만큼 반복 순회
        for(int i = 0; i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch == '('){
                st.push(ch);
            } else if (ch == ')') {
                if(!st.empty()) st.pop(); // 닫힘 가로일때 스택이 비어있지않으면 pop (위에서 뺴내줌)
                else {
                    System.out.println("괄호가 일치 하지 않습니다.");
                    return;
                }
            }
        }
        if(st.isEmpty()){
            System.out.println("괄호가 일치 합니다.");
        }else {
            System.out.println("괄호가 일치 하지 않습니다. ");
        }

    }
}
