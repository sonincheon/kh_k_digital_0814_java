package 시스템출력;
// System.out : 표준 출력 스트림
//print, println : 오버로딩이 적용된 메소드이며 줄바꿈 차이만 존재

import java.util.Scanner;

public class SystemOut {
    public static void main(String[] args) {
        String name = "곰돌이사육사";
        String addr = "수원시";
        int age = 22;
        char gender = 'M';
        int kor = 99, eng =88, mat= 40;

        // 자바 스타일 : 오버로딩으로 구현 되어 있음
        System.out.println("======Java Style======");
        System.out.println("이름 = " + name);
        System.out.println("주소 = " + addr);
        System.out.println("성별 = " + gender);
        System.out.println("나이 = " + age);
        System.out.println("총점 = " + (kor +eng +mat)); //연산자 우선순위로 변경
        System.out.println("평균 = " + ((double)(kor+eng+mat)/3));

        // C언어 스타일 : 서식을 지정하는 스타일
        // 서식지정자 : %d(정수),%ld(long 타입 정수),%u (부호 없는 정수형), %f(실수형), %c(문자),
        //이스케이프 시퀀스 :\n(줄바꿈),\r(캐리지 리턴, 커서를 라인의 처음으로 이동), \t (탭), \b(백스페이스),\\ (\꼭 필요할떈 2개)
       System.out.println("======c언어 Style======");
       System.out.printf("이름 : %s\n", name);
       System.out.printf("오늘의 습도는 %.2f%%입니다\n",85.5555); // (실수형 출력) 실수가 0.xx 두자릿수짜리까지 %.2f 로표시,  %%는 % 하나를 위해
       System.out.printf("성별 : %c\n", gender); //문자 출력System.out.println("안녕하세요 저의 이름은 \"곰돌이사육사\" 입니다.");
       System.out.printf("평균 : %.2f\n", ((double)(kor+eng+mat)/3));

       System.out.println("Apple\rBanana\tOrange\b\b\n"); // 이스케이프 시퀀스 예시
       System.out.printf("|%-6d|%-6d|%-6d|\n",100,2000,30000); //공간 맞추기

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 :");
        int n = sc.nextInt();
        for(int i = 1; i <= n * n; i++) {
            System.out.printf("%8d", i);
            if (i % n == 0) System.out.println();
        }
    }

}
