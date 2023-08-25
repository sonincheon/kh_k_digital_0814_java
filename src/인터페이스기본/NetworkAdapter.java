package 인터페이스기본;

public interface NetworkAdapter {
    void connect(); // 자동으로 public abstract 포함됨

}
// 유선 인터넷
class LAN implements NetworkAdapter{
    String company;
    LAN(String company){
        this.company =company;
    }
    @Override
    public void connect() {
        System.out.println(company +"LAN 에 연결 되었습니다.");
    }
}
class WiFi implements NetworkAdapter{
    String company;
    WiFi(String company){
        this.company=company;
    }
    @Override
    public void connect() {
        System.out.println(company + " WiFi 에 연결 되었습니다.");
    }
}
class FiveG implements NetworkAdapter {
    String company;

    FiveG(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " 5G 에 연결 되었습니다.");
    }
}