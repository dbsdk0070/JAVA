package kr.co.bitcamp.polymorphism03;

public class ReferTest {

    public static void main(String[] args) {
       Parent parent = new Child();
       Child child = new Child();
       
       //클래스의 멤버변수는 원래 선언을 할 때 사용했던 변수 그대로 사용함
       // 멤버변수는 원래타입을 벗어나지 못함.
       System.out.println(parent.x);
       System.out.println(child.x);
       
       //멤버메서드는 현재 참조하고 있는 인스턴스에 영향을 받음 (오버라이드)
       parent.method();
       child.method();
       System.out.println();
       
       parent.type(child);
       parent.type(parent);
       //parent.type(new Car());          //상속관계가 아니기때문에 캐스팅이 안됨

    }

}
