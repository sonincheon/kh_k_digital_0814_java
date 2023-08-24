package 다형성기본;
//**
public class PolyBasic {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child =new Child();

        child.out();
        child.display();
        parent.display();

        Parent p = new Child(); //부모 클래스의 참조 변수로 자식 객체를 접근 함
        p.display(); //dispaly 는 child로 불려진다 .

    }
}

