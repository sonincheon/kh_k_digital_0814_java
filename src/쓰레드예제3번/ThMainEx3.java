package 쓰레드예제3번;
// 쓰레드간의 협업 : wait(), notify(), notifyAll()
// notify() : 일시정지 상태에 있는 쓰레드를 실행 대기 상태로 변경
// wait() : 자신을 일시 정지 상태로 만듬
public class ThMainEx3 {
    public static void main(String[] args) {
        WarkObject sharedObject = new WarkObject();// 객체생성
        Thread threadA = new ThreadA(sharedObject);
        Thread threadB = new ThreadB(sharedObject);
        threadA.start();
        threadB.start();

    }
}
class WarkObject {
    // synchronized : 멀티쓰레드 환경에서 임계영역의 접근을 방지 하는 역할  (Lock / UnLock)
    public synchronized void methodA(){
        System.out.println("Thread의 methodA() 작업 실행");
        notify(); // 일시정지 상태에 있는 TheadB를 실행 대기 상태로 만듬
        try{
            wait();
        } catch (InterruptedException e) { }
    }
    public synchronized void methodB(){
        System.out.println("Thread의 methodB() 작업 실행");
        notify(); // 일시정지 상태에 있는 TheadA를 실행 대기 상태로 만듬
        try{
            wait();
        } catch (InterruptedException e) { }
    }
}

class ThreadA extends Thread{
    final WarkObject warkObject;
    public ThreadA(WarkObject warkObject){
        this.warkObject =warkObject;
    }
    @Override
    public void run(){
        for(int i = 0; i< 10 ;i++){
            warkObject.methodA();
        }
    }

}

class ThreadB extends Thread{
    final WarkObject warkObject;
    public ThreadB(WarkObject warkObject){
        this.warkObject =warkObject;
    }
    @Override
    public void run(){
        for(int i = 0; i< 10 ;i++){
            warkObject.methodB();
        }
    }
}
