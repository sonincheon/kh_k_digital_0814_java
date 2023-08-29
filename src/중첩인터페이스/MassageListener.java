package 중첩인터페이스;

public class MassageListener implements Button.OnClickListener {

    @Override
    public void onClick() {
        System.out.println("메세지를 보냅니다.");
    }
}
