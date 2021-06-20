package kr.co.bitcamp.multihread03;

import javax.swing.JOptionPane;

public class TimerTest {
    public static void main(String[] args) throws Exception {
        
        //Run이 실행되기위한 기본 작업
        Thread thread = new TimerThread();
        thread.start();
        
        //메인스레드
        String input = JOptionPane.showInputDialog("10초 안에 값을 입력하세요.");
        //System.out.println(input);
        
        //입력한 값이 없으면 (!=null)
        //null이 아닌 경우는 --> 중간에 입력 값을 출력함
        if(input != null) {
            System.out.println("입력 값: " + input);
            System.exit(0);
            
        }else {
            Thread.sleep(10000);                  //10초를 대기한다.
            System.out.println("입력하지 못했습니다. 펑펑!!");
            System.exit(0);
        }
    
    
    
    
    }

}
