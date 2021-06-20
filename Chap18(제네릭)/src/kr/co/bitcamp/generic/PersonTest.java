package kr.co.bitcamp.generic;

public class PersonTest {
public static void main(String[] args) {
    
    //Person 제네릭클래스에 T를 String만 들어오게끔 무조건 생성함.
    Person<String> person = new Person<>();
    person.setT("이성계");
    String str = person.getT();          //getT 리턴타입은 String  
    System.out.println(str);
    
    //데이타의 통일화, 타입 변환 제거, 다른 타입을 넣으면 컴파일 예외를 발생(타입 체크)
    Person<Integer> person2 = new Person<>();
    person2.setT(100);                  //자동 박싱
    int value = person2.getT();         //자동 언박싱
    System.out.println(value);
    
    Person<String> apple = new Person<>();
    apple.setT("사과");
    String str2 = apple.getT();
    System.out.println(str2);
    
    Person<Apple> person3 = new Person<>();
    person3.setT(new Apple());          //자동박싱
    Apple apple1 = person3.getT();
    System.out.println(apple1);
    
    
    
    }
}
