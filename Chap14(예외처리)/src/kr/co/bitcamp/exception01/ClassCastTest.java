package kr.co.bitcamp.exception01;


class A{}
class B extends A{}
class C extends A{}

interface I{}               //인스턴스도 다형성이 적용됨
class D implements I{}      //직접적으로 객체를 생성할순없지만 상속받으면 가능
class E implements I{}

public class ClassCastTest {
    
    public static void main(String[] args) {
        
        A a = new B();      //B는 A타입으로 업캐스팅됨(Up casting): 자동 형변환 이루어짐
        B b = (B)a;         //A는 B타입으로 다운캐스팅됨(Down casting)
        System.out.println("실행완료");
        
        A a1 = new C();     
        C c = (C)a1;
        System.out.println("실행완료");
    
        I i = new D();
        D d = (D)i;
        System.out.println("실행완료");
        
        I i2 = new E();
        E e = (E)i2;
        System.out.println("실행완료");
    
    }

}
