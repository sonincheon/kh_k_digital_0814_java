package 예외처리세번쨰;
// NullPointException (NPE) = Java 에서 발생하는 대표적인 런타입 에러 입니다. 참조하려는 객체가 없는 경우에 발생 합니다.
public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;

         if(test != null) {
            String testStr = test.name;
            System.out.println(testStr);
        }else {
             System.out.println("testrk null 입니다.");
         }
    }
}

class Test{
    String name ="곰돌이사육사";
}
