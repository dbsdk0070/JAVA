package kr.co.bitcamp.generic;

//Person이라는 클래스를 제네릭 타입으로 설계함 --> Person<T>
public class Person<T> {
    /*
     * T라는 타입이 아직 정해지지 않았다.
     * T는 개발코드에서 정해진다.
     * static은 올 수 없다. (어떤 값이 올지 모르는데 미리 클래스영역에 올려둘 순 없다.)
     */
    
    // t라는 타입 추가
    private T t;
    
    // 생성자 추가
    public Person() {
        // TODO Auto-generated constructor stub
    }

    //get, set 추가
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    
    
    
    
    
    
}

