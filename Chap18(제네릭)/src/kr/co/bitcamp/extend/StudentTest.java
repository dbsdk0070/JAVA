package kr.co.bitcamp.extend;

public class StudentTest {
public static void main(String[] args) {
    
    //필드의 다형성 적용(원래타입에 영향)
    Person<String, String> person = new Student<String, String, Integer>();
    person.setKind("아시아계");
    person.setMode("묻지마살상피해");
    
    System.out.println(person.getKind() + ": " + person.getMode());
    
    Student<String, String, Integer> personstudent = new Student<>();
    personstudent.setKind("미국백인족");
    personstudent.setMode("살상공격");
    personstudent.setC(100);
    
    System.out.println(personstudent.getKind()+":"+ personstudent.getMode() + personstudent.getC());

    
     }
}
