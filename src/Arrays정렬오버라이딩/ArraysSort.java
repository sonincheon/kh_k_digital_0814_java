package Arrays정렬오버라이딩;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {
    public static void main(String[] args) {
        // 길이순 정렬하고, 같으면 사전순 정렬
        String[] fruit = {"Kiwi", "Orange", "Apple", "Banana", "Melon",
                "Mango", "Watermelon", "Cherry", "Plum", "Peach"};
        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() >o2.length()) return 1;
                else {
                    if(o1.length() == o2.length()){ //길이가 같으면 사전 순 정렬 조건
                        //비교 대상의 객체가 작으면 음수 반환 -- compareTo
                        //비교 대상의 객체가 크면 양수 반환
                        //비교 대상의 객체가 같으면 0을 반환
                        return o1.compareTo(o2);
                    }
                    return -1; // 현상태 유지
                }
            }
        });
        System.out.println(Arrays.toString(fruit));


    }

}
