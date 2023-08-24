package 싱글톤;

import 연1.T;

// 객체가 한번만 생성되는 것
public class SingletonMain {
    public static void main(String[] args) {
        // Singleton test =new Singleton(); 객체 생성을 할 수 없음
//        Singleton obj1 = Singleton.getSingleton();
//        Singleton obj2 = Singleton.getSingleton();
//        System.out.println(obj1.id);
//        System.out.println(obj1.name);
//        obj1.id = 1004;
//        obj1.name ="곰돌이사육사";
//        System.out.println(obj2.id);
//        System.out.println(obj2.name);

    TestObject1 member1 = new TestObject1();
    TestObject2 member2 = new TestObject2();
    for(int i = 0; i< 1000; i++){
        member1.setInfo("동그라미",27);
        member2.setInfo("우영우",27);
    }
    member1.viewInfo();



    }

}
