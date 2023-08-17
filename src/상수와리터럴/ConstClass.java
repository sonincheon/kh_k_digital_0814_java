package 상수와리터럴;
// 상수 : 변수와 마찬가지로 메모리에 저장할 공간을 확보하는 것, 단 한번만 값을 지정할 수 있음.
// 값을 한번 쓰고 나면 read only 상태가 됨
// final 키워드를 사용
// 상수는 변화하지않는 값

import java.util.Scanner; // 스캐너를 사용하기 위해 import 해야함

public class ConstClass {
//    final static String KH_DOMAIN = "http:// 192.1212";
//    final static  String PORT_NUM = "8111";

    public static void main(String[] args) {
//        final int AGE = 30; // 상수는 관례상 대문자 사용, 자바는 선언과 별도로 단 한번 값의 대입 가능
//        char gender = 'M';
//
//        if (gender == 'M') {
//            AGE = 33;
//        }
//        System.out.println(AGE);


        final double TAX_RATE = 0.10; // 세율 값을 고정
        Scanner sc = new Scanner(System.in); // 표준 입력을 받기 위해서 사용 , Scanner(System.in) 입력한값을  뜻함
       System.out.println("수입을 입력 하세요 : ");
       int income = sc.nextInt(); // 키보드로부터 입력 받은 값을 정수형 변수에 대입 함
       System.out.println("당신이 내야 할 세금은" + (income * TAX_RATE) +"입니다" );






    }
}
