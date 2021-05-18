package kr.co.bitcamp.polymorphism02;
//자식클래스
public class SportCar extends Car {
    
    public void speedUp() {
        System.out.println("속도를 높입니다.");
    }
    
    public void speedDown() {
        System.out.println("속도를 줄입니다.");
    }
    
}
