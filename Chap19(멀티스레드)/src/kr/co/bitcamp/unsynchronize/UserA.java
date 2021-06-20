package kr.co.bitcamp.unsynchronize;

public class UserA extends Thread{
    
    //공유객체 선언
    private Calculator calculator;
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
        this.setName("UserA");                         //스레드 이름 지정
    }
    
    
    
    @Override
    public void run() {
    
        //공유객체의 필드인 memory값에 100을 변경
        this.calculator.setMomory(100);
        System.out.println("UserA스레드가 출력한 값: " + this.calculator.getMemory());
    }
    
    

}
