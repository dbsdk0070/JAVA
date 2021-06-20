package kr.co.bitcamp.nongeneric;

public class Person {
    
    //참조변수(멤버)
    private Object object;
    
    //기본생성자
    public Person() {
    }

    //리턴타입 Object
    public Object getObject() {
        return object;
    }

    //매개변수가 Object이다.
    public void setObject(Object object) {  //참조형이 Object이기 때문에 모든 클래스를 다 매개변수, 리턴타입으로 하겠다(다형성)
        this.object = object;
    }

    

}
