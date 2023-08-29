package 연산자;

import java.util.Scanner;

//산술연산자 : 사칙연산(+ - * /), % 나누고 나머지1자릿수
public class operateClass {
    public static void main(String[] args) {
        int num1 = 10, num2 = 4;
        System.out.println("덧셈 : " + (num1 + num2));
        System.out.println("뺼셈 : " + (num1 - num2));
        System.out.println("곱셈 : " + (num1 * num2));
        System.out.println("나눗셈 : " + ((double)num1 / num2));
        System.out.println("나머지 : " + (num1 % num2)); //젤중요 알고리즘때
        System.out.println("몫 : " + (num1 / num2));

    //대입연산자 : 변수에 값을 대입하는 연산자 ( = ), 프로그램에서 = 같다라는 의마가아니고 값을 대입한다라는 의미
        // ( == ) 같다라는 의미

        System.out.println(num1 += 2);//복합 대입 연산자 : num += 2 >> num1 = num1 +2
        System.out.println(num1 -= 2);//복합 대입 연산자 : num -= 2 >> num1 = num1 -2
        System.out.println(num1 *= 2);//복합 대입 연산자 : num *= 2 >> num1 = num1 *2 (잘안씀)
        System.out.println(num1 /= 2);//복합 대입 연산자 : num /= 2 >> num1 = num1 /2 (잘안씀)

        //증감 연산자 : 단항연산자, 피연산자의 값을 1증가 또는 1감소 시키는 연산자

        System.out.println(++num1); //11 전위 연산자
        System.out.println(num1++); //10 후위 연산자 이 다음부터 +1
        int tmp = num1++;
        System.out.println(tmp);
        System.out.println(num1);

        //비교 연산자 : 두개의 피연산자를 비교해서 어느쪽이 큰지를 판단
        int x = 10;
        int y = 20;
        boolean rst1, rst2, rst3;
        System.out.println(x > y); // 거짓 false
        System.out.println(x < y); // 참 true
        System.out.println(x == y); // 거짓 false
        System.out.println(x != y); //참 (같지 않다)
        System.out.println(x >= y); // 거짓
        System.out.println(x <= y); // 참

        //논리 연산자 : && (AND 연산자 : 둘다 참인경우 참 ), || (OR 연산자 : 둘중 하나만 맞음 참)

        // ! : NOT  연산자 , 현재가 참이면 실행안함, 거짓이면 실행

        rst1 = (x > 0) && (x>y); //앞만 참 둘다 참이아님 , 거짓
        rst2 = (x>0) || (x>y); // 둘중아하나만 참이면, 참
        rst3 = !((x>0) || (x>y)); // 참의 반대기떄문에 거짓
        System.out.println(rst1 +" "+rst2 +" "+rst3);

        //삼항연산자 : 3개의 피연산자를 필요로 하는 연산자 (조건문)

        Scanner sc = new Scanner(System.in); //키보드입력을 받기위해서
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        boolean isAdult = (age > 19) ? true : false;
        System.out.println(isAdult);

        //문자열 결합 연산자
        System.out.println("Java" + 18.04 + 12); //Java18.0412
        System.out.println(3 + 3.3 + "JDK"); //6.3JDK

        //연산자 우선 순위 확인
        int val1 = 5;
        int val2 = 5;
        int val3 = 5;
        int result1, result2, result3;

        result1 = val1 + val2 * val3; //30
        result2 = (val1 + val2) * val3; //50
        result3 = val1 + (++val2) * val3; //35

        System.out.println(result1+" "+result2+" "+result3);
    }
}
