package x보다작은수;
// 첫쨰줄에 N과 X가 주어짐
// 입력 : 10 5
// 2번쨰 입력 : 1 10 4 9 2 3 8 5 7 6
// 결과 : 1 4 2 3

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt(); // 배열의 갯수
        int x = sc.nextInt(); // 크기를 비교하는 기준값 (미만 값을 찾음)
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt()); // 리스트 에 값을 추가함
            if(list.get(i) < x) System.out.print(list.get(i) + " ");
        }
        System.out.println();


    }
}
