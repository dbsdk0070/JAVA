package kr.co.bitcamp.nested01;

public class NestedTest {
    
    // [인스턴스 멤버 클래스(static이 안붙었기 때문에)]
    class A{
        
        // 1.변수
        int iv = 100;
 //     static int cv = 200;        // static멤버 변수 자체를 정의할 수 없다. NestedTest.A.cv 이렇게 접근 안됨
    
        // 2. 내부클래스 A생성자
        public A() {
            System.out.println("A생성자 호출");
        }
        
        // 3.A내부 클래스의 메서드
        public void method() {
            System.out.println("A 클래스의 method1() 호출");
        }
        
//      public static void method2() { }                                NestedTest.A.mehod2() 이렇게 접근 안됨
            
    }
    
    // [정적(static)멤버 클래스]
    static class B {
        int iv = 100;
        static int cv = 500;                                         // NestedTest.B.cv 접근 가능하기때문에 선언됨
        
        public B() {
            System.out.println("B생성자 호출");
        }
        
        // B내부 클래스의 메서드
        public void method1() {
            System.out.println("B 클래스의 method1() 호출");
        }
        
        public static void method2(){
            System.out.println("B 클래스의 method2() 호출");
        }
        
    }
    
    // 외부클래스의 메서드 생성
    public void method1() {
        // [로컬클래스 (외부클래스의 메서드1 내에 선언, 잠깐 사용할 용도)]      //static멤버는 로컬클래스에서는 선언할 수 없다.
        class C{
            int iv =200;
//          static int cv = 700;                               //static멤버 선언 불가
            public C() {
                System.out.println("로컬클래스 C생성자 호출");
            }
            public void lmethod() {
                System.out.println("로컬클래스 C의 메서드 호출");
            }
//          public static void lmethod2() {                    //static멤버 선언 불가
//              System.out.println("로컬클래스 C의 메서드 호출");
//            }
            
        }
    //로컬클래스는 해당 메서드내에서만 사용이 가능하다는 것에 주목
    C c = new C();
    System.out.println(c.iv);
    c.lmethod();
    
        
    }
    
 // 외부클래스의 메서드 생성
    public void method2() {
        // [로컬클래스 (외부클래스의 메서드1 내에 선언, 잠깐 사용할 용도)]           //static멤버는 로컬클래스에서는 선언할 수 없다.
        class D{
            int iv =300;
//          static int cv = 700;                                    //static멤버 선언 불가
            public D() {
                System.out.println("로컬클래스 D생성자 호출");
            }
            public void lmethod() {
                System.out.println("로컬클래스 D의 메서드 호출");
            }
//          public static void lmethod2() {                         //static멤버 선언 불가
//              System.out.println("로컬클래스 C의 메서드 호출");
//            }
            
        }
    //로컬클래스는 해당 메서드내에서만 사용이 가능하다는 것에 주목
    D d = new D();
    System.out.println(d.iv);
    d.lmethod();
    
        
    }
    
    

public static void main(String[] args) {
    
    // 1.객체생성
    NestedTest nestedtest = new NestedTest();
   
    // 2.인스턴스 멤버 클래스 생성
    NestedTest.A a = nestedtest.new A();                            //인스턴스 멤버 클래스는 외부클래스의 인스턴스가 반드시 있어야 생성 가능
    System.out.println(a.iv);
    a.method();
    System.out.println("-------------------------------------------");
    
    //정적 클래스 static 멤버호출 --- 외부클래스의 인스턴스가 없이도 접근 가능함.
    System.out.println(NestedTest.B.cv);
    NestedTest.B.method2();
    System.out.println("-------------------------------------------");
    
    NestedTest.B b = new B();           //참조변수. 없어도 됨. "static"이기 때문에
    System.out.println(b.iv);
    b.method1();
    b.method2();
    System.out.println("-------------------------------------------");
    
    nestedtest.method1();
    System.out.println("-------------------------------------------");
    
    nestedtest.method2();
    
    /*
     * 멤버클래스(+정적클래스)와 로컬클래스를 구분짓는 기준 
     * => 생성을 해보면 바이트코드가 만들어지는데 로컬클래스는 순번이 붙음. 나머지는 멤버(인스턴스, 정적)클래스
     */
        
 }


}










