package List인터페이스;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
// 리스트 인터페이스는 ArrayList, Linked List, Vector의 부모로 인터페이스로 구현되어 있음
// 리스트 구조는 배열과 유사하고 차이점은 동적으로 크기가 변한다는 점
//ArrayList, Linked List, Vector 거의 동일한 메소드를 가지고 있어 코드변환이 자유로움
//ArrayList : 리스트 타입의 대표적인 자료 구조 (특별한 경우가 아니면 ArrayLIst사용)
// - 검색이 빈번한 경우 효율적이며, 맨 뒤에 입력이 일어나는 경우에는 효과적임
public class ListEx1 {
    public static void main(String[] args) {
        String[] arr = {"100","300","200","300","10","998","35"};
        //Arrays.asList(arr) : 이미 만들어진 배열을 ArrayList에 추가
        List<String> list =new ArrayList<>(Arrays.asList(arr));
//        // 리스트 값 +
//        list.add("100"); // List에 값을 추가(add())
//        list.add("300");
//        list.add("200");
//        list.add("300");
        System.out.println(list);
        //특정 위치에 값을 가져 올 떄 : get (index)
        System.out.println(list.get(1));
        // list의 크기를 가져 올 떄 : size << 리스트의 갯수
        System.out.println(list.size());
        // list 내에 해당하는 항목이 있는지 판별(true/ false)  : contains( 찾을 항목 )
        System.out.println("포함 여부 확인 : "+ list.contains("142"));
        // list 내에 해당하는 항목 삭제 후 결과를 반환 (true/ false) : remove( 삭제항목 )
        // list 내에 해당하는 위치를 삭제 후 결과를 반환 (true/ false) : remove( index )
        System.out.println("삭제 성공 여부 확인 : " +list.remove("300"));
        System.out.println("삭제 성공 여부 확인 : " +list.remove(2));

        Comparator<String> nameComp =new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };

        list.sort(Comparator.naturalOrder()); // 오름 차순 정렬
        list.sort(Comparator.reverseOrder()); // 내림 차순 정렬

        System.out.println(list);
    }
}
