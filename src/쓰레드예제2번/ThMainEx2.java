package 쓰레드예제2번;
//다른 쓰레드의 종료를 기다림 (Join())

import static java.lang.Thread.sleep;

public class ThMainEx2 {
    public static void main(String[] args) throws InterruptedException {
        SumThread sumThread =new SumThread();
        sumThread.start();

        try{
            sumThread.join(8000); //sumThread가 작업을 완료할떄 까지 기다림
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("합 : " + sumThread.getSum());


    }
}

class SumThread extends Thread{
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run (){
        for (int i = 0; i <=210000000; i++){
            sum+=1;
        }
    }
}


