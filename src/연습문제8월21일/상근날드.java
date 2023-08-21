package 연습문제8월21일;

import java.util.Scanner;

public class 상근날드 {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int a1 = sc.nextInt();
//        int b1 = sc.nextInt();
//        int gg = 0;
//        int gg1 = 0;
//
//        int[] br = new int[3];
//        br[0] = a;
//        br[1] = b;
//        br[2] = c;
//        int[] dr = new int[2];
//        dr[0] = a1;
//        dr[1] = b1;
//
//        for (int i = 0; i < br.length; i++) {
//            for (int j = 1; j < br.length; j++) {
//                if (br[i] > br[j]) ;
//                gg = br[j];
//                br[j] = br[i];
//                br[i] = gg;
//            }
//        }
//            for (int z = 0; z < dr.length; z++) {
//                for (int x = 1; x < dr.length; x++) {
//                    if (dr[z] > dr[x]) ;
//                    gg1 = dr[x];
//                    dr[x] = dr[z];
//                    dr[z] = gg1;
//                }
//            }
//        System.out.println(br[0]+dr[0]-50);
//
//        }
//    }

    //선생님 해답
    public static void main(String[] args) {
        int[] menu = new int[5];
        Scanner sc =new Scanner(System.in);
        System.out.print("메뉴 입력 : ");
        for(int i = 0; i < menu.length;i++) menu[i] =sc.nextInt(); // 햄버거 3개 음료 2개 입력받기
        int minBerger = menu[0]; //젤 싼버거
        int minDrink = menu[3]; //젤 싼음료
        for(int i = 0; i<menu.length;i++){
            if (i < 3 && minBerger > menu[i]) minBerger = menu[i]; //***
            if(i > 2 && minDrink >menu[i]) minDrink =menu[i];
            }
        System.out.println(minBerger +minDrink -50);
        }


    }
