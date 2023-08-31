package 컴페어레이터;
//두개의 메소드를 비교하는 방법


import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Fruit> set=new TreeSet<>(new DescendComparator().reversed());
        set.add(new Fruit("포도",3000));
        set.add(new Fruit("수박",10000));
        set.add(new Fruit("토마토",5000));
        set.add(new Fruit("딸기",8000));

        for(Fruit e : set){
            System.out.println("이름 : " + e.name );
            System.out.println("가격 : "+e.price);
            System.out.println("-".repeat(25));
        }




    }
}
