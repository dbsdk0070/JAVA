package kr.co.bitcamp.nested02;

import kr.co.bitcamp.nested02.A.C;

public class ATest {

    public static void main(String[] args) {
        A a = new A();
        
        //인스턴스 멤버클래스인 B는 반드시 외부 클래스 A의 인스턴스가 있어야 생성이 가능함.
        A.B b = a.new B();
        b.method1();
        System.out.println("--------------------------------------");
        
        //정적멤버 클래스인 C는 외부 클래스 A의 인스턴스가 있든 없든 상관없이 접근 가능하다.
        System.out.println(A.C.C);      //정적멤버(static)이기 때문에 바로 호출 가능
        A.C.method2();
        
        A.C c = new A.C();
        System.out.println(c.a);
        c.method1();
        System.out.println("--------------------------------------");

        //외부클래스의 인스턴스를 생성하면 얼마든지 메서드를 호출하여
        //로컬클래스를 생성해서 사용할 수 있다.
        a.method();
        
        
        
    }

}









