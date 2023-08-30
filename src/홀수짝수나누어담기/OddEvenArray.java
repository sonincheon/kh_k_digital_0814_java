package 홀수짝수나누어담기;
// 7개의 정수를 입력받음
// 홀수와 짝수 배열로 나누어 담는 함수 만들기
// 홀수와 짝수를 출력하는 함수 만들기
// 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6

import java.util.*;

public class OddEvenArray {
    public static void main(String[] args) {
        OddEvenFunc oddEvenFunc = new OddEvenFunc();
        oddEvenFunc.inputFunc();
        oddEvenFunc.oddEvenCalc();
        oddEvenFunc.oddEvenOutput();

        OddEvenFunc2 oddEvenFunc2 = new OddEvenFunc2();
        oddEvenFunc2.inputFunc();
        oddEvenFunc2.oddEvenCalc();
        oddEvenFunc2.oddEvenOutput();

    }
}