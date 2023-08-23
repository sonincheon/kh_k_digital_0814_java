package 영화표예매;

import java.util.Scanner;

public class MovieTiket {
    //좌석의 개수
    int seat[] = new int[10]; // 인스턴스 필드
    int ticetPrice;
    MovieTiket(int price){ // ticetPrice에대한 생성자 price생성
        ticetPrice=price;
    }
    //판매된 좌석의 개수를 확인, 총 판매 금액을 구해서 반환
    int totalAmount(){
        int cnt = 0; //지역변수 (int totalAmout에대한)
        for(int val : seat){// val 이라는 변수는 seat 배열을 처음 부터 마지막까지 순회하는 요소
            if(val == 1) cnt++; // val이 1이면 판매된 좌석이라는 의미
        }
        return cnt * ticetPrice; // 반환값이 int값(int totalAmount에대한 반환값)
    }
    void pirntSeat(){// 선택 가능한 좌석의 리스트를 보여줌
        for(int i = 0; i < seat.length; i++){
            if(seat[i] == 0) System.out.print("[ ]"); //판매가 안된 좌석
            else System.out.print("[v]"); //이미 판매가된 좌석
        }
        System.out.println();
    }
    void selectSeat(){ //좌석을 판매하는 메뉴
        pirntSeat(); // 좌석 리스트 상태를 보여주는 메소드 호출
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석을 선택하세요 : ");
        int selSeat = sc.nextInt(); // 유저가 선택한 좌석을 입력 받음 (유저는 1부터 생각함)
        if(seat[selSeat-1] == 0) {// 유저가 선택한 좌석이 판매되었는지 확인
            seat[selSeat - 1] = 1; // 판매가 안된 좌석이기 떄문에 판매함
            pirntSeat(); //판매 이후의 좌석 상태를 다시보여줌
        }else System.out.println("이미 판매된 좌석 입니다. 다른 좌석을 선택하세요.");
    }
}
