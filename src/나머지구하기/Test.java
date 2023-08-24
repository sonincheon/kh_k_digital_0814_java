package 나머지구하기;

import java.util.Scanner;

//두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
public class Test {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int [] num = new int [9];
//        int cnt = 0;
//       while (true){
//           for(int a = 0; a <10;a++) {
//               num[a] = sc.nextInt();
//               if (num[a] >= 1000 && num[a] > 0){
//                       if(num[a] % 42 == num[a] % 42){
//                           cnt++;
//                       }
//
//               }
//            }
//        }
//
//    }
        //선생님 해답
        int[] arr = new int[42];
        int cnt = 0;  //42로 나눈 나머지가 다른 경우에 대한 총 숫자
        int input; // 입력받는 값
        Scanner sc =new Scanner(System.in);
        System.out.println("10개의 수 입력 : ");
        for(int i = 0; i <10;i++){
            input =sc.nextInt();
            arr[input %42] = 1; //입력 받은 값을 42로 나눈 나머지에 해당하는 인덱스에 1을 대입
        }
        for(int val : arr) cnt+=val;
        System.out.println(cnt);
    }

}


