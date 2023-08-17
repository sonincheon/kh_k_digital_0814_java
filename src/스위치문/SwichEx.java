package 스위치문;

import java.util.Scanner;

// 조건에 조건식이 올수 없고 , 조건의 값이 와야 함
// 조건값에는 정수, 문자, 문자열이 올수 있음
// 장점은 if문에 비해 가독성이 좋음, 성능적으로 빠름
// 단점은 조건식이나 범위가 올수 없음
public class SwichEx {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("계절을 입력 하세요 : ");
        String season =sc.next();
        switch (season){
            case "spring" :
                System.out.println("꽃이 피는 봄이 왔어요");
                break;
            case "summer" :
                System.out.println("더운 여름이 왔어요.");
                break;
            case  "fall" :
            case "autumn":
                System.out.println("낙엽 날리는 가을이 왔어요");
                break;
            case "winter" :
                System.out.println("추운 겨울이 왔어요.");
                break;
            default :
                System.out.println("계절을 잘못 입력했습니다.");
                break;
        }

    }
}
