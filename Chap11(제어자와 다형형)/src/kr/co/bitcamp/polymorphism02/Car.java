package kr.co.bitcamp.polymorphism02;
//조상 클래스
public class Car {

    String color;
    int door;
    
    public void drive() {
        System.out.println("차가 달립니다.");
    }
    
    public void stop() {
        System.out.println("차가 멈춥니다.");
    }
    
    class PoliceCar extends Car{
        void siren() {
            System.out.println("사이렌이 울립니다.");
        }
    }
    
    class SportCar extends Car{
        void speedUp() {
            System.out.println("속도를 높입니다.");
        }
    }
    
    class SoprtCar extends Car{
        void speedDown() {
            System.out.println("속도를 줄입니다.");
        }
    }
    
    
    
    
    //    //일반적인 기능을 넣는 것
//    String color;
//    int door;
//    
//    
//    //동적인 기능을 넣는 것 
//    public void drive() {
//        System.out.println("차가 달립니다.");
//    }
//    
//    public void stop() {
//        System.out.println("차가 멈춥니다.");
//    }
    
}
