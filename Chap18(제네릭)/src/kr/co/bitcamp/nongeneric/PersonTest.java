package kr.co.bitcamp.nongeneric;

public class PersonTest {
    public static void main(String[] args) {
        
        Person person = new Person();
        person.setObject("이순신");                 //(String -> object) 업캐스팅
        String str = (String)person.getObject();           //(Object -> String) 다운캐스팅
        System.out.println(str);
        
        
    }

}


















