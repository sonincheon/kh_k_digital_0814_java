package 제네릭연습1;
// 멀티 타입 파라메터
public class GenericEx1 {
    public static void main(String[] args) {
//        Person<String> p1 = new Person<>("incheon");
//        System.out.println(p1.name);
//        Person<Integer> p2 = new Person<>(2);
//        System.out.println(p2.name);
        Product<String,Integer> pr1 = new Product<>();
        pr1.setName("스마트 TV");
        pr1.setYear(2023);
        System.out.println(pr1.getName() + "  " +pr1.getYear());

        Product<Integer,String> pr2 = new Product<>();
        pr2.setName(25);
        pr2.setYear("이천이십삼년");
        System.out.println(pr2.getName() + "  " +pr1.getYear());

    }
}
class Product<T,M>{
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getYear() {
        return year;
    }

    public void setYear(M year) {
        this.year = year;
    }

    private M year;



}



class Person<T>{ // 집어넣는 변수 타입마다 쓸수있다
    public T name;
    Person(T name){
        this.name=name;

    }



}