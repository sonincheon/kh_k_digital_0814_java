package 변수의스코프;
//변수가 할당되고 사용되는 범위 확인
public class varSccopeClass {
    public static void main(String[] args) {
        // 문자 자료형 : 자바에서는 유니코드를 사용 (2바이트로 전세계의 문자 표시), 앞의 1바이트는 ASCII와 동일
        char ch = 'A'; // 자바에서 문자는 작은 따옴표를 사용, 실제 저장은 정수값으로 저장 됨
        String ch1 = "B"; // 요건 문자값(참조 주소값) 으로 표현

//        System.out.println(ch);
//        System.out.println((int)ch); // 명시적으로 형을 int형으로 변경함 (정수값으로 표현)
//
//        char ch2 = 66; // char형은 음수가 올 수 없다.
//        System.out.println(ch2); // 정수값이 문자로 표현 [ASCII값]
//        System.out.println((int)ch2);

        //실수 자료형 : float(4Byte,32bit), double(8바이트), 근사치 계산법

//        float height = 175.5f; // float는 뒤에 항상 f
//        double pi = 3.14159; // double은 안붙여도됨 .(일반적으로 많이씀)

        double num1 = 0.1;
        for(int i = 0; i<1000; i++){
            num1 += 0.1;
        }
        System.out.println(num1);

    }
}
