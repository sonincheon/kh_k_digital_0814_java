package Vector클래스;
//ArrayList구조와 메소드가 동일, 동기화가 지원되어서 멀티쓰레드 환경에 안정함. 하지만 ArrayList 대비 성능이 떨어짐

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        List<NameCard> list = new ArrayList<>();
        list.add(new NameCard("우영우","yyy@naver.com","010-9411-4852","변호사"));
        list.add(new NameCard("동그라미","ddd@naver.com","010-9888-4852","무직"));
        list.add(new NameCard("이준호","yyy@naver.com","010-9411-4852","회사사"));

        for(NameCard d : list){
            System.out.println("이름 : " + d.name);
            System.out.println("이메일 : " + d.mail);
            System.out.println("폰 : " +d.phone);
            System.out.println("직업 : " + d.jobs);
        }
    }
}

class NameCard{
    String name;
    String mail;
    String phone;
    String jobs;

    public NameCard(String name, String mail, String phone, String jobs) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.jobs = jobs;
    }
}
