package 스트림중간연산;

import 시스템출력.SystemOut;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 생성된 스트림은 중간 연산을 통해 또 다른 스트림으로 변환 됩니다.
// 1. 필터링 :
// - filter() : 주어진 조건에 맞는 요소만으로 구성된 새로운 스트림 생성
// - distinct() : 중복된 요소가 제거된 새로운 스트림 생성
//2. 스트림 변환 :
// - map() : 해당 스트림을 요소들을 함수에 인수로 전달하여, 그 반환값으로 이루어진 새로운 스트림을 만듬
// - flatMap() : 각 요소를 변환하여 중첩된 스트림들을 평면화하여 새로운 스트림을 생성합니다.
//3. 제한
// - Limit() : 해당 스트림의 첫 번쨰 요소부터 전달된 개수 만큼의 요소만으로 이루어진 새로운 스트림 생성
// - skip() : 해당 스트림의 첫 번쨰 요소부터 전달된 개수 만큼의 요소를 제외한 나머지 요소만으로 이루어진 생로운 스트림 생성
//4. 정렬
// - sorted() 메소드는 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬
public class StreamEx4 {
    public static void main(String[] args) {
//        IntStream stream1 =IntStream.of(7,5,5,2,1,2,3,4,5,6);
//        IntStream stream2 =IntStream.of(7,5,5,2,1,2,3,4,5,6);
//        // 스트림 중복된 요소를 제거함
//        stream1.distinct().forEach(e-> System.out.println(e + " "));
//        System.out.println();
        // 조건에 맞는 요소만으로 구성된 새로운 스트림 생성
//        stream2.filter(e->e%2!=0).forEach(e-> System.out.println(e + " "));

//        Stream<String> stream =Stream.of("HTML","CSS","JAVA","JAVASCRIPT");
//        stream.map(String::length).forEach(System.out::println);
//        System.out.println();
//
//        Stream<String> stream4 = Stream.of("I study hard","You study Java","I am hungry");
//        stream4.flatMap(e->Stream.of(e.split("t"))).forEach(System.out::print);

//        IntStream stream1 = IntStream.range(0,10);
//        IntStream stream2 = IntStream.range(0,10);
//        IntStream stream3 = IntStream.range(0,10);
//
//        // 전달된 요소의 개수만 제외 : 0 ~ 3
//        stream1.skip(4).forEach(e-> System.out.print(e + " "));
//        System.out.println();
//        // 전달된 요소의 개수 제한 : 0 ~ 4 (5개)
//        stream2.limit(5).forEach(e-> System.out.print(e + " "));
//        System.out.println();
//        // 중복가능
//        stream3.skip(4).limit(5).forEach(e-> System.out.print(e + " "));
//        System.out.println();

        Stream<String> stream1 = Stream.of("java","HTML","JAVASCRIPT","CSS");
        Stream<String> stream2 = Stream.of("java","HTML","JAVASCRIPT","CSS");
        stream1.sorted().forEach(e-> System.out.print(e + " "));
        System.out.println();
        stream2.sorted(Comparator.reverseOrder()).forEach(e-> System.out.print(e + " "));





    }
}
