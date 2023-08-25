package 객체를배열로관리;

public class NameCard {
    private String name;
    private String mail;
    private String phoneNumber;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void printInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("연락처 : " + phoneNumber);
        System.out.println("메일 : " + mail);
    }
}

