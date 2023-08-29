package 중첩인터페이스;

public class Button {
    OnClickListener listener; //생성된 객체의 주소를 대입 받기 위함

    void setOnClickListener(OnClickListener listener){
        this.listener =listener;
    }
    void touch(){
        listener.onClick(); // 구현 객체의 onClick() 메소드 호출
    }

    //클래스 내부에서 인터페이스를 만듬 ( 중첩 인터페이스 )
    interface OnClickListener{
        void onClick();
    }
}
