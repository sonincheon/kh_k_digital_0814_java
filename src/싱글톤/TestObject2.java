package 싱글톤;

public class TestObject2 {
    Singleton singleton =Singleton.getSingleton();
    void setInfo(String name,int id){
        singleton.name=name;
        singleton.id=id;
    }
    void viewInfo(){
        System.out.println("이름 : " + singleton.name);
        System.out.println("아이디 : " +singleton.id);

    }
}

