package kr.co.bitcamp.unsynchronize;

public class UnsynchronizeTest {
public static void main(String[] args) {
    
    //공유객체 생성
    Calculator calculator = new Calculator();
    
    /*
     * UseB스레드가 설정한 값으로 UserA클래스도 출력한디. => 데이어  신리성 붕괴
     * 동기화처리를 함으로써 객체의 잠금이 일어나면서 데이터희 신뢰성을 확보해줌 
     */
    UserA userA = new UserA();
    userA.setCalculator(calculator);
    
    UserB userB = new UserB();
    userB.setCalculator(calculator);
    
    userB.start();
    userA.start();
    
    
}
}
