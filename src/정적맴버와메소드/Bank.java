package 정적맴버와메소드;

public class Bank {
    private static int count = 0; //정적 필드, 객체로 생성 xx
    private int account; //계좌
    private String bank; //은행 이름

    Bank(String name,int account) {
        count++;
        this.bank =name;
        this.account=account;
        System.out.println(bank + "은행에 계좌를 개설 합니다. 잔액은 " + this.account + " 입니다 ");
    }
    public static int getCount(){ //정적 메소드, 객체로 만들어지지 않음
        return count;
    }
    public void setDeposit(final int dep){ // final의 금액은 절대 바뀌지않는다 .
        this.account += dep;
        System.out.println(dep + "을 예금 했습니다 . ");
    }
    public void setWithDraw(final int with){
        if(with > account){
            System.out.println("잔액이 부족합니다.");
        }else {
            this.account-=with;
            System.out.println(with + "를 출금 했습니다.");
        }
    }
    public void viewAcount(){
        System.out.println("현재 남은 잔액은"+account+"입니다.");
    }
}

