package 홀수짝수나누어담기;

import java.util.Scanner;

public class OddEvenFunc {
    int[] input = new int[7];
    int[] even = new int[7];
    int[] odd = new int[7];
    int eIdx = 0; // 짝수에 대한 배열 인덱스
    int oIdx = 0; // 홀수에 대한 배열 인덱스

    //7개의 정수를 입력 받아 배열에 넣기
    public void inputFunc(){
        System.out.println();
        Scanner sc= new Scanner(System.in);
        for(int i = 0; i<7;i++){
            input[i] =sc.nextInt();
        }
    }
    public void oddEvenCalc(){
        for(int i = 0 ; i < 7 ; i++){
            if(input[i] %2 == 0) even[eIdx++] =input[i];
            else odd[oIdx++] =input[i];
        }
    }
    public void oddEvenOutput(){
        System.out.print("홀수 : ");
        for(int i = 0; i< oIdx; i++) System.out.printf("%2d", odd[i]);
        System.out.println();
        System.out.print("짝수 : ");
        for(int i = 0; i< eIdx; i++) System.out.printf("%2d", even[i]);

    }
}
