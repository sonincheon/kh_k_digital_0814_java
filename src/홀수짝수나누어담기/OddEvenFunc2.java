package 홀수짝수나누어담기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenFunc2 {
    List<Integer> input = new ArrayList<>();
    List<Integer> even = new ArrayList<>();
    List<Integer> odd = new ArrayList<>();

    public void inputFunc() {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            input.add(sc.nextInt());
        }
    }

    public void oddEvenCalc() {
        for (Integer e : input) {
            if (e % 2 == 0) even.add(e);
            else odd.add(e);
        }
    }
        public void oddEvenOutput(){
            System.out.print("홀수 : ");
            for (Integer e : odd) System.out.print(e + " ");
            System.out.println();
            System.out.print("짝수 : ");
            for (Integer e : odd) System.out.print(e + " ");
        }
    }
