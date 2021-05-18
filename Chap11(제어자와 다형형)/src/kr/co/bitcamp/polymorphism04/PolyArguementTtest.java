package kr.co.bitcamp.polymorphism04;

public class PolyArguementTtest {

    public static void main(String[] args) {
        
        Buyer buyer = new Buyer();
        buyer.product(new TV());
        System.out.println("현재 남은 잔액: " +buyer.money +"만원 입니다.");
        System.out.println("현재 보너스 포인트: " +buyer.bonusPoint +"점입니다.");
        
        buyer.product(new Audio());
        System.out.println("현재 남은 잔액: " +buyer.money +"만원 입니다.");
        System.out.println("현재 보너스 포인트: " +buyer.bonusPoint +"점입니다.");
        
        buyer.product(new Computer());
        System.out.println("현재 남은 잔액: " +buyer.money +"만원 입니다.");
        System.out.println("현재 보너스 포인트: " +buyer.bonusPoint +"점입니다.");
        
        //Apple클래스는 Product클래스의 자손이 아니기 때문에 컴파일 에러가 발생함.
        //buyer.product(new Apple());
        
        //필드의 다형성: 부모 타입으로 자식 타입을 조종할 수 있다.
        Product product1 = new TV();
        Product product2 = new Computer();
        Product product3 = new Audio();
        Product[] pArray = new Product[10];
    }
    
    
    
    

}
