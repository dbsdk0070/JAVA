package kr.co.bitcamp.multihread01;

import java.awt.Toolkit;

public class BeepSoundTest03 {
    
    //main()은 JVM이 실행함
    public static void main(String[] args, Thread thread) {
        
        //집접 스레드를 생성하는 방법 3가지
        //방법3 --> 람다식(함수적 인터페이스): JDK1.8, 코드절약, 가독성, 
        Thread hread = new Thread(()-> {
            java.awt.Toolkit toolkit = Toolkit.getDefaultToolkit();
            
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
        });
        thread.start();
        
        for(int i=0; i<5; i++) {
            System.out.println("비프음 실행하는 스레드명 : " +
                                Thread.currentThread().getName());
            
            System.out.println("삐옹~~~");
        }
        
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
