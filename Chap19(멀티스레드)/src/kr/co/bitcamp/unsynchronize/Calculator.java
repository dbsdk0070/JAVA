package kr.co.bitcamp.unsynchronize;

//공유객체
public class Calculator {

    private int memory;
    
    public int getMemory() {
        return this.memory;
    }
    
    //비동기화 메서드 -> 동기화 메서드: 데이터 신뢰성을 보장하기 위해서는 반드시 동기화처리가 필수다.
    public synchronized void setMomory(int memory) {
        
        this.memory = memory;
        
      //System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);                                 //1초간 일시정지
        }catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Thread.currentThread().getName()+":"+
                           this.getMemory());
    }
}













