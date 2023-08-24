package kmp는왜kmp일까;
// KNuth - Morris -Pratt >> KMP
//Mirko-Slavko >> MS
//split("-")을 이용하는 방법

import 시스템출력.SystemOut;

import java.util.Scanner;

public class Kmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하시오 : ");
        String name =sc.next();
        //1 인덱스**
//        for(int i = 0; i < name.length();i++) {
//            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') System.out.println(name.charAt(i));
//        }




        //2 첫번쨰 문자 선택 , '-'다음 **
//            for(int i = 0; i < name.length();i++) {
//                if (i == 0) System.out.print(name.charAt(i));
//                else {
//                    if (name.charAt(i) == '-') System.out.println(name.charAt(i + 1));
//                }
//            }






//        //3 split() 메소드 활용**
//        String[] splitName = name.split("-");
//        for(String e : splitName) System.out.print(e.charAt(0));



        //4 toCharArray() 문자열을 문자 배열로 변경

//        char[] chName = name.toCharArray(); // 문자열을 문자 배열로 변환
//        for(char ch : chName){
//            if(ch >='A'&&ch<='Z') System.out.print(ch);
//        }

    }

}
