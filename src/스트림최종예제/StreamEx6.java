package 스트림최종예제;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamEx6 {
    public static void main(String[] args) {
        TravelCustomer customerA = new TravelCustomer("안유진",21,100);
        TravelCustomer customerB = new TravelCustomer("유나",21,100);
        TravelCustomer customerC = new TravelCustomer("지수",24,80);
        List<TravelCustomer> customerList =new ArrayList<>();
        customerList.add(customerA);
        customerList.add(customerB);
        customerList.add(customerC);
        customerList.add(new TravelCustomer("혜린",18,90));
        //고객 명단
        System.out.println("=".repeat(5)+"고객 명단 순서 대로 출력"+"=".repeat(5));
        customerList.stream().map(c->c.getName()).forEach(c-> System.out.print(c + " "));
        System.out.println();
        // 고객이 지불한 총비용
        int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println("총 여행 비용 : " +total);
        // 20세 이상 성인 출력
        System.out.println("=".repeat(5)+"성인 명단 출력"+"=".repeat(5));
        customerList.stream()
                .filter(c->c.getAge()>=20)
                .map(c->c.getName())
                .sorted(Comparator.reverseOrder()) // 반대 오름차수
                .forEach(c-> System.out.print(c +" "));



    }
}

class TravelCustomer{
    private String name;
    private int age;
    private int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }
}
