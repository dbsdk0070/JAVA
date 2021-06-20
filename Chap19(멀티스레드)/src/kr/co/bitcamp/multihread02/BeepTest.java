package kr.co.bitcamp.multihread02;

public class BeepTest {
    public static void main(String[] args) {
        
        Thread thread = new Beep();                 //OOP적용) 필드의 다형성
        thread.start();                             //Run이 실행되려면 start();가 호출되어야함    

       for(int i=0; i<5; i++) {
           System.out.println("따당");
           
           try {
               Thread.sleep(900);
           }catch(InterruptedException e) {
               System.out.println(e.getMessage());
           }
    
       
       }
    
    }

}
