package 홀수짝수나누어담기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenArray2 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("정수 입력 : ");
        for(int i = 0; i < 7; i++) list.add(sc.nextInt());
        System.out.print("홀수 : ");
        list.stream().filter((n->n%2!=0)).forEach(e->System.out.print(e+" "));
        System.out.println();
        System.out.print("짝수 : ");
        list.stream().filter((n->n%2==0)).forEach(e->System.out.print(e+" "));
    }
}
