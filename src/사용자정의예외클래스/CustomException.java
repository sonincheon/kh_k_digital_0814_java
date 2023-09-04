package 사용자정의예외클래스;
// 기본적으로 자바는 수많은 예외클래스가 있음. 하지만 사용하려는 목적에 맞는 예외 처리가 없는 경우 직접 만들 수 있음
public class CustomException {
    public static void main(String[] args) {
        CheckEven ce = new CheckEven();
        int num1 = 100;
        int num2 = 99;
        try {
            System.out.println(ce.printEven(num1));
            System.out.println(ce.printEven(num2));
        }catch (EvenException e){
            e.printStackTrace();
        }
    }
}

class EvenException extends Exception{
    private Integer number = null;
    public EvenException (int number){
        this.number =number;
    }
    @Override
    public String getMessage(){
        if(number == null) return "숫자가 아닙니다.";
        else return number + "는 짝수가 아닙니다.";
    }
}

class CheckEven{
    private int num;
    public CheckEven() {
        this.num = num;
    }
    public int printEven(int number) throws EvenException{
        this.num = number;
        if(num %2 != 0)throw new EvenException(num);
        else return num;
    }
}