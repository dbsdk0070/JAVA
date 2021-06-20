package kr.co.bitcamp.wildcard;

//조상클래스
public class Person {

    private String name;

    //생성자 추가
    public Person(String name) {
        super();
        this.name = name;
    }

    //getter 추가
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name;
    }
    
    
}
