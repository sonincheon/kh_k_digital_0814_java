package 스퀘어출력;

import java.util.Scanner;

//input :4
//Output
//1 2 3 4
//5 6 7 9
//9 10 11 12
public class SquareEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력하시오 : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n*n; i++){
            System.out.printf("%4d",i);
            if( i % 4==0)
            System.out.println();

            }

        }



    }




