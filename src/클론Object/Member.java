package 클론Object;
// clone()은 Cloneable 인터페이스를 상속 받은 경우에만 가능

public class Member implements Cloneable {
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;
    void viewInfo(){
        System.out.println("ID"+id);
        System.out.println("이름 "+name);
        System.out.println("비번 "+password);
        System.out.println("나이" +age);
    }

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone(); // 클론 메서드는 Object타입이므로 Member 타입으로 변경
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}

