package 저항알고리즘;

import java.util.Scanner;

public class TestEx1 {
    public static void main(String[] args) {
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
//        int[] x = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        int a =0,b=0,c=0;
        long cnt;
        Scanner sc = new Scanner(System.in);
        String color1 = sc.next();
        String color2 = sc.next();
        String color3 = sc.next();
        for (int i = 0; i < 10; i++) {
        if(color1.equalsIgnoreCase(color[i]))a=i;
        if(color2.equalsIgnoreCase(color[i]))b=i;
        if(color3.equalsIgnoreCase(color[i]))c=i;
        }
        cnt = ((a*10)+b) * (long)(Math.pow(10,c));
        System.out.println(cnt);
    }
}