package 트리셋;

import java.util.TreeSet;
// 검색 기능을 강화시킨 자료구조
// 데이터가 저장될때 이진 검색 트리 형태로 저장되고 , 값을 검색을 할때 inOrder(Left-Root-Right) 방식으로 탐색함
public class TreeSetMAin {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(10);
        ts.add(48);
        ts.add(15);
        ts.add(7);
        ts.add(22);
        for(Integer a: ts) System.out.print(a +" ");

    }
}
