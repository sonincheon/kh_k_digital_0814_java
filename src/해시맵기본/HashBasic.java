package 해시맵기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashBasic {
    public static void main(String[] args) {
        //    key , value
        Map<String,Integer> map = new HashMap<>();
        // 객체 저장 : key, value
        map.put("우영우",99);
        map.put("동그라미",55);
        map.put("최수연",95);
        map.put("이준호",80);
        map.put("동그라미",70); // 키가 같기 떄문에 나중에 저장된 값으로 대체
        System.out.println("총 Entry 수 : " + map.size());
        //객체 찾기 : get(key), 지정된 키에 대한 값을 반환 합니다.
        System.out.println(map.get("우영우"));
        // 향상된 for문
        for(String key : map.keySet()){ //keySet() key가 포함된 Set 컬렉션 반환
            System.out.println(key + "\t"+map.get(key));
        }

        map.remove("최수연");

        for(String key : map.keySet()){ //keySet() key가 포함된 Set 컬렉션 반환
            System.out.println(key + "\t"+map.get(key));
        }
    }

}
