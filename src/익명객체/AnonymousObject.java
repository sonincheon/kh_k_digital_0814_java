package 익명객체;
// 자바에서 이름 없는 객체는 주로 일회성으로 객체를 생성해야 하는 경우 사용
public class AnonymousObject {
    public static void main(String[] args) {
        A a = new A();
        a.field.methodParent();
    }
}


class Parent {
    String name = " Parent Class";
    void methodParent(){
        System.out.println("Parent method : " + this.name);
    }
}
class A {
    Parent field = new Parent(){
        int childField;
        void mothodChild(){
        }
        @Override
        void methodParent(){}
    };

}