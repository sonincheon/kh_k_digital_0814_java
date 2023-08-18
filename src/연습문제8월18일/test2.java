package 연습문제8월18일;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

//        for(int a = 1;a<=1000; a++ );{
//            if(a%7 ==0){
//                System.out.printf("%5d",a);
//                if(a%70==00) System.out.println();
//            }
//
//        }
        int cnt =0;
        for(int i = 7; i<=1000;i+=7){
            cnt++;
            System.out.printf("%5d",i);
                if(cnt == 10) {
                    System.out.println();
                    cnt = 0;
                }


        }




    }




}
