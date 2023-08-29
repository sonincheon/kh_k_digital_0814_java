package 디폴트메소드중복;

public interface Buy {
    void buy(); // public abstract 자동으로 추가됨
    default void order(){// 예외적으로 구현부를 가짐
        System.out.println("구매 주문");
    }
}
interface Sell{
    void sell();
    default void order(){
        System.out.println("판매 주문");
    }
}

class Customer implements Buy,Sell{

    @Override
    public void buy() {

    }

    @Override
    public void order() {
        Buy.super.order();
        Sell.super.order();
    }

    @Override
    public void sell() {

    }
}