package 컴페어러블;
// Comparable과 Comparator는 클래스에 대한 정렬을 구현 할 수 있도록 해주는 인터페이스


import java.util.TreeSet;

public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<CarComp> list = new TreeSet<>();
        list.add(new CarComp("싼타페",2016,"흰색"));
        list.add(new CarComp("아반뗴",2010,"검정"));
        list.add(new CarComp("소렌토",2011,"주황색"));
        list.add(new CarComp("코나",2016,"황색"));
        list.add(new CarComp("셀토스",2018,"똥색"));

        for(CarComp e : list){
            System.out.println(e.modelName);
            System.out.println(e.modelYear);
            System.out.println(e.color);
            System.out.println("-".repeat(25));
        }
    }





}
