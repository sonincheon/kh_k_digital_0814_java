package PC방알바;
// 인원 수 **
// 예약할 좌석 번호 100개
// 결과는 거절 횟수 출력

import java.util.Scanner;

public class PcRoom {
    public static void main(String[] args) {
        int[] pcRoom = new int[100];  // 배열 생성
        int rejectcnt = 0; // 카운트
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 원하는 자리수 입력
        for(int i = 0; i < n; i++) { // 배열의 자리 는 기본적으로 0 , 1을 추가해줌
            int seatNum = sc.nextInt(); // 자리 배열 0 0 0 0 0 선택
            if(pcRoom[seatNum-1] == 1) rejectcnt++; // 자리가 이미 있어서 꽉찼습니다.
            else pcRoom[seatNum-1] = 1; // 자리가 있을떄 cnt +1
        }
        System.out.println(rejectcnt);


    }
}


