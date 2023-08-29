package 중첩인터페이스;

public class CallListener implements Button.OnClickListener{
    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
