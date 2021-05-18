package kr.co.bitcamp.finalconstant;

public class PersonTest {

    public static void main(String[] args) {
        
        Person person = new Person(25);
        System.out.println(person.age);
        System.out.println(person.nation);           //final변수이기 때문에 korea출력
        
      // person.nation = "China";                    불가함 확인. final(KOREA)로 정의했기 때문에
      // person.age = 60;                            불가함 확인. 

        System.out.println(person.MAX_NUMBER);
        
        Person person2 = new Person(50);
        Person person3 = new Person(150);
        Person person4 = new Person(250);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        
        System.out.println();
        System.out.println(person2.age);
        System.out.println(person3.age);
        System.out.println(person4.age);
        System.out.println(person.MAX_NUMBER);
    
    }

}
