package 접근제한자;

import 인스턴스필드.Parent;

public class AccessRestrictor {
    public static void main(String[] args) {
        Child child =new Child("엔지니어");
        System.out.println(child.getname());
        System.out.println(child.getaddr());

    }

}
class Child extends Parent {
    String jobs;
    public Child(String jods){
        this.jobs=jods;
    }
    public String getname(){
        return name;
    }
    public String getaddr (){
        return addr;
    }
}