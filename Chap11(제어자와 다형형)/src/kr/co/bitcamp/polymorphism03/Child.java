package kr.co.bitcamp.polymorphism03;

public class Child extends Parent{
    
    int x = 200;                        //다 상속받고있지만 x = 200으로 초기화해봄(새로운 값)

    
    @Override
    public void method() {
        System.out.println("자손메서드 호출");
    }
}















