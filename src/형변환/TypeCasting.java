package 형변환;
//형변환이란 : 하나의 데이터 타입을 다른 타입으로 변환 하는것
// 명시적 형변환 : 개발자가 의도를 가지고 형변환을 하는것
// 묵시적 형변환 : 컴파일러가 자동으로 해주는 것 (유리한 방향으로 변경)Auto
public class TypeCasting {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
//        double result1 = num1 / num2; // 형변환이 안일어남
//        double result2 =(double) num1 / num2; //명시적(num1에게 더블로 명시), 묵시적(num2는 앞 num1 더블로인해) 형변환이 일어남
        String kor = "90";
//        int intkor = Integer.parseInt(kor);// 바꿔줘 kor의 문자를 숫자로 (문자열을 숫자로 변환하는 메소드)
        int mat = 88;
        int eng = 55;
        int total = Integer.parseInt(kor) + mat + eng; // 총점

//        double avg = total / 3; // 정수값만나옴
        double avg = (double) total / 3;

//      Integer.parseInt(test);`  문자열을 정수 int 타입으로 변환 합니다.
//
//      Double.parseDouble(test);`  문자열을 실수 double 타입으로 변환 합니다.

        System.out.println(avg);

    }
}
