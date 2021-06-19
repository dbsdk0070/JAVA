package kr.co.bitcamp.nested01;

public class NestedTest2 {
    
    //인스턴스멤버 클래스
    class A{
        int iv = 100;
        
        public A(){
            System.out.println("A내부클래스 A생성자 호출");
        }
        
        public void method() {
            System.out.println("A내부클래스의 method() 호출");
        }
        
    }
        
    static class B{
            int iv = 200;
            static int cv = 250;
            
            public B() {
                System.out.println("B내부클래스 B생성자 호출");
            }
            
            public static void method2() {
                System.out.println("B내부클래스의 method2() 호출");
            }
            
            public static void method5() {
                System.out.println("B내부클래스의 method5() 호출");
            }
            
        }
        
    public void method3() {
        //로컬메서드: 외부클래스의 메서드에서는 선언할 수 있다.(잠깐 사용하는 용도)
        //static클래스 선언 불가
        class C{
            int iv = 300;
            
            public C() {
                System.out.println("localmethod안에서의 로컬클래스 C생성자 호출");
            }
            
            public void lmethod() {
                System.out.println("localmethod안에서의 C메서드 호출");
            }
        }
        //로컬클래스는 해당 메서드 안에서만 호출 가능
        C c = new C();
        System.out.println(c.iv);
        c.lmethod();
        
    }

   
    public void method4() {
        class D{
            int iv = 400;
            public D() {
                System.out.println("method4안에서의 로컬클래스 D생성자 호출");
            }
            public void lmethod2() {
                System.out.println("method4안에서의 D메서드 호출");
            }

        }
            D d = new D();
            System.out.println(d.iv);
            d.lmethod2();
        
    }
    //외부클래스의 메서드 생성
    public static void main(String[] args) {
        
        //호출 객체 생성
        NestedTest2 nestedtest2 = new NestedTest2();
        
        //인스턴스멤버클래스 생성 멤버 호출
        NestedTest2.A a = nestedtest2.new A();
        System.out.println(a.iv);
        a.method();
        System.out.println("-----------------------------------");
        
        //정적클래스 생성 멤버 호출("static"이기 때문에, 외부클래스의 인스턴스가 없어도 호출 가능함)
        System.out.println(B.cv);
        NestedTest2.B.method2();
        System.out.println("-----------------------------------");
        
        NestedTest2.B b = new B();
        System.out.println(b.iv);
        b.method2();
        b.method5();
        System.out.println("-----------------------------------");
        
        nestedtest2.method4();
        nestedtest2.method3();
        
        /*
         * 인스턴스클래스 + 정적클래스와 로컬클래스를 구분짓는 기준
         * -> 생성을 해보면 바이트코드가 만들어지는데 로컬클래스는 순번이 붙음.
         *    나머지는 멤버(인스턴스, 정적)클래스
         */
        
    }

}
