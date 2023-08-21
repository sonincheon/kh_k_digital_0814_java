package 연습문제8월21일;
// 1~45 사이의 임의의 수 6개 생성해야 함(Math.random() >> 0.1 ~0.9999 )
// int val = (int)((Math.random() *45) +1);
// 단 중복 제거
// 생성된 val값을 배열에 담을때 배열내에 해당하는 값이 있는지 확인 필요.
// 배열은 6개
// 반복횟수는 정할수 없음 ( while(ture) >> 탈출조건 중복되지 않는 번호가 6개 저장되면 break)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class 중복없는로또 {
    public static void main(String[] args) {

//        // 배열사용
//        int[] code = new int[6];
//        int tmp, index = 0; // 임시 로또 번호
//        boolean isExist = false;
//
//        while (true) {
//            tmp = (int) ((Math.random() * 45) + 1);
//            for (int a = 0; a < code.length; a++) {
//                if (code[a] == tmp) isExist = true;
//            }
//            if(!isExist) code[index ++] = tmp;
//            if(index ==6) break;
//            isExist =false;
//        }
//        for(int e :code) System.out.print(e +" ");

//        //ArrayList
//        List<Integer> list = new ArrayList<>();
//        int tmp ;
//        while (true){
//            tmp = (int)((Math.random()*45)+1);
//            if(!list.contains(tmp)){
//                list.add(tmp);
//            }
//            if(list.size() ==6) break;
//        }
//        System.out.print(list);

        //set : 자바에서 사용 집합 개념
        HashSet<Integer> set = new HashSet<>();
        while (true){
           int tmp = (int)((Math.random()*45)+1);
           set.add(tmp);
           if(set.size() == 6) break;
        }
        System.out.println(set);

    }
}




