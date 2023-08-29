package 클론Object;

import 중첩인터페이스.CallListener;

public class CloneObject implements Cloneable {
    public static void main(String[] args) {
        Member mem1 = new Member("bear", "곰돌이사육사", "12345", 23, true);
        Member mem2 = mem1.getMember(); //얕은 복사가 일어나는 조건
        mem1.viewInfo();
        mem2.password = "kkkkk";
        mem2.name = "KH정보교육원";
        mem2.viewInfo();
        mem1.viewInfo();
    }
}


