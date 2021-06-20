package kr.co.bitcamp.extend;

//조상이 제네릭으로 선언이 되어있다면 자손도 제네릭타입이어야된다.
public class Student<T, M, C> extends Person<T,M>{

    private C c;

    
    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
    
    
}
