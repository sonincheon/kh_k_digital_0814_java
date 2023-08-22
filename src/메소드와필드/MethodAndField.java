package 메소드와필드;
// 메소드 : 클래스 내에서 동작에 대한 기능을 구현하는 것 (함수가 클래스 내부에있으면 메소드라함)
// 필드 : 클래스 내의 값을 저장하는 변수를 의미(상태를 저장


public class MethodAndField {
    public static void main(String[] args) {
//        int result = MethodAndField.sum(100,200,200,400); //매개변수의 갯수를 알수 없을떄 ...val
        int result =whileSum(10);
        System.out.println(result);
    }
    // 메소드 앞에 static 을 선언 하는 경우 객체 소속이 아니고 클래스 소속
    static int sum(int a, int b){
        return a+b;
    }
    // sum 메소드의 매개변수 개수를 다르게 해서 만들었으므로 오버로드 관계 성립
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static int sum(int ...val){
        int sum = 0;
        for(int e : val) sum+=e;
        return sum;
    }
    // 재귀 호출 : 메소드 자신이 자신을 호출하는것
    static int recfunc(int n){
        if(n == 1) return 1;
        return n + recfunc(n-1);
    }
    static int whileSum(int n){
        int sum = 0;
        while (n>0){
            sum+=n;
            n--;
        }
        return sum;
    }
}
