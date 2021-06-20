package kr.co.bitcamp.multihread03;

// 타이머스레드 --> 남은 시간을 출력하는 프로그램
public class TimerThread extends Thread {
    
    //스레드1
    @Override
    public void run() {
       for(int i=10; i>0; i--) {
           System.out.println("남은 시간: " + i);
           
           try {
               Thread.sleep(1000);
           }catch(Exception e) {
               System.out.println(e.getMessage());
           }
           
       }
        
    }

}
