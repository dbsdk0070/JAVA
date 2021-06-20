package kr.co.bitcamp.genericmethod;

public class PersonTest {
    public static void main(String[] args) {
        
      //Person<Integer> p1 = Util.<Integer>changing(300);       //정상적인 호출코드
        Person<Integer> p1 = Util.changing(300);                //(auto boxing)
        int value = p1.getT();
        System.out.println("Person객체가 가지고 있는 값: " + value);
    
     //Person<String> p2 = Util.<String>changing("이순신");       //<Strin>생략가능
       Person<String> p2 = Util.changing("이순신");
       String str = p2.getT();
       System.out.println("Person객체가 가지고 있는 값: " + str);
    }
    
    

}
