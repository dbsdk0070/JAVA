package kr.co.bitcamp.multihread02;

import java.awt.Toolkit;

//Thread를 상속받아서 스레스 클래스로 만듦
public class Beep extends Thread{
    
    @Override
    public void run() {
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++) {
            System.out.println("비프음 실행하는 스레드명:" +
                                Thread.currentThread().getName());
            
        }
        
        toolkit.beep();
        
        try {
            Thread.sleep(900);
        }catch(InterruptedException e) {
            System.out.println(e.getMessage());
            
        }
    }
    

}
