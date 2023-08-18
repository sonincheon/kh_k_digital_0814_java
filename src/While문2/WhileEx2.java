package While문2;
// 반복 횟수를 알수 없는 경우 대한 예제
// do ~while  : 한번은 무조건 수행하고 조건을 물어봄
import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        int age; // 나이를 입력 받는변수
//        Scanner sc = new Scanner(System.in);
//        while(true){// 무한횟수 반복의 조건 (탈출문이 필요)
//            System.out.print("나이를 입력 하세요 : ");
//            age = sc.nextInt();
//            if(age > 0 && age < 200) break; //1~ 199사이만 정상적으로 입력된 나이로 간주
//            System.out.println("나이를 잘못 입력 하셨습니다.");
//
//
//        }
        do{
            System.out.print("나이를 입력 하세요 : ");
            Scanner sc = new Scanner(System.in);
            age =sc.nextInt();
        }while (age <= 0 || age >= 200);


        System.out.println("입력하신 나이는 " + age +"입니다.");

    }
}
