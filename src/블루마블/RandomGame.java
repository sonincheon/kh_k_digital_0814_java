package 블루마블;
// 두개의 주사위를 던져 12가 나오면 탈출하는 게임


import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        int rand1,rand2;
        int cnt = 0; //몇번만에 탈출햇는지 숫자세기

        while (true){
            cnt++;
            rand1 =(int)((Math.random()*6)+1); // (정수)(0.1~ 5.999999 +1)
            rand2 =(int)((Math.random()*6)+1);
            if((rand1+rand2) ==12){
                System.out.printf("무인도를 %d번만에 탈출했습니다\n",cnt);
                break;
            }else {
                System.out.println("주사위의 합이"+(rand1+rand2)+"입니다.");
            }

        }





    }
}
