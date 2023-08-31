package 해쉬셋;

import java.util.Arrays;
import java.util.HashSet;

// 중복 허용 하지 않음 , 순서 보장 하지 않음 , 수학의 집합과 유사한 개념
public class HashSeMain {
    public static void main(String[] args) {

        HashSet<String> set =new HashSet<>();
        set.add("java");
        set.add("c");
        set.add("c++");
        set.add("Python");
        set.add("java"); // add안됨
        for(String e : set){
            System.out.print(e + " ");
        }

    }

}
