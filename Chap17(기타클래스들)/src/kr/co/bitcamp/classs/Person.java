package kr.co.bitcamp.classs;

public class Person {
    
    private String name;
    private int age;
    
    //기본생성자
    public Person() {
    
    }

    //오버로드
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    
    //getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }    
        
        
    

}
