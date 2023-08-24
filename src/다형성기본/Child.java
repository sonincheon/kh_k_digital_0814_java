package 다형성기본;

public class Child extends Parent {
    private int x = 100;
    public Child () {} // 생성자 만들어
    public void out(){ // 아웃이라는 메소드 생성
        System.out.println("부모의 protected num 필드 : " + num);
        System.out.println("자식 클래스 메소드");
    }
    @Override
    public void display(){
        System.out.println("상속 받아 재정의한 메소드");
    }
}
