package 전자레인지;

import java.util.Scanner;

public class ex1sub {
    int a =0;
    int b =0;
    int c =0;
    int input=0;

    public void out(){
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하세요 (초): ");
        input = sc.nextInt();
        while (true) {
            if(input>10000){
                System.out.println("초를 다시입력하세요");return;}
            else if(input >=300){ a++; input -=300;return;}
            else if(input>=60){b++; input-=60;return;}
            else if(input>=1){c++; input-=10;return;}
            else if(input == 0)break;
        }
        if(input>-1){
            System.out.println(input);}
        System.out.println("A 버튼 : "+a+"B 버튼 : "+b+"C 버튼 : "+c);
    }
}
