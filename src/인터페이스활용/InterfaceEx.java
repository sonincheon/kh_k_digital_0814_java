package 인터페이스활용;

public class InterfaceEx {
    public static void main(String[] args) {
    Customer customer=new Customer();
    Buy buyer =customer;  // customer 참조 변수를 Buy 인터페이스형에 대입
    buyer.buy(); // 인터페이스 Buy로 buyer를 생성하여 인터페이스의 메소드만 사용가능
    customer.buy();
    customer.sell();

    Sell seller = customer;
    seller.sell();
    Customer customer2 = (Customer) seller;
    customer2.buy();
    customer2.sell();
    }
}
