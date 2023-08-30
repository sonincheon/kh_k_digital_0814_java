package 제네릭연습2;

public class GenericPrinter<T> {
    private T material; // T 자료형으로 변수 선언
    public void setMaterial(T material){
        this.material = material;
    }
    public T getMaterial(){
        return material;
    }
    public String toString(){
        return material.toString();
    }
}

class Powder {

    public void doPrinting() {
        System.out.println("Powder 재료로 출력합니다 .");
    }
    public String toString(){
        return "재료는 Powder 입니다";
    }
}

class Plastic{
    public void doPrinting(){
        System.out.println("Plastic 재료로 출력합니다 .");
    }
    public String toString(){
        return "재료는 Plastic 입니다";
    }
}