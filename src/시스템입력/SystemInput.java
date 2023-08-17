package 시스템입력;
// Scanner 클래스를 사용해서 입력 받음
// 클래스는 설계도면이라고 생각하면됨

import java.util.Scanner;

public class SystemInput {
    public static void main(String[] args) {
        //sc는 클래스에 대한 변수
        Scanner sc =new Scanner(System.in); //스캐너에 대한 객체 생성
//        byte a = sc.nextByte(); // byte형 입력을 받아 반환 (반환 : 입력해서 밖으로 출력)
//        short b = sc.nextShort(); //short형 입력을 받아 반환
//        int c = sc.nextInt(); //int형 입력을 받아 반환
//        long d = sc.nextLong(); //long형 입력을 받아 반환
//        char ch = sc.next().charAt(0); // 문자열을 받는 메소드에 .charAt(@) @번쨰 값만 추출 **
//        float e = sc.nextFloat(); // float형 입력을 받아 반환
//        double f = sc.nextDouble(); // double형 입력을 받아 반환
//        String h = sc.next(); // 공백 기준으로 입력 받음
//        String i = sc.nextLine(); // 줄바꿈 문자 기준

        System.out.print("이름을 입력 하세요 : ");
        String name = sc.next(); //이름을 입력 받은 후 공백이나 줄바꿈이 일어나면 다음으로 넘어감
        sc.nextLine(); // 버퍼 비우기
        System.out.print("주소를 입력 하세요 : ");
        String addr = sc.nextLine(); // 줄바꿈이 일어나면 다음으로 넘어감
        System.out.print("성별을 입력 하세요 : ");
        char gender = sc.next().charAt(0); // 입력받은 문자열에서 맨앞의 문자 1자 추출
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();

        System.out.println("===== 회원 정보 출력 ====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);

    }


}
