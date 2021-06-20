package kr.co.bitcamp.wildcard;

//자손클래스
public class Student extends Person {

    public Student(String name) {
        super(name);
        //생성자가 없으면 Strudent에 오류남. 조상 클래스 불러오면 생성자 만들어야됨
    }   

    
    
}
