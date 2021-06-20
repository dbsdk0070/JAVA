package kr.co.bitcamp.boxing;

public class BoxingUnBoxingTest {
    public static void main(String[] args) {
        
        //객체생성
        //박싱(Boxing)코드 --> 객체화 시킴
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer(100);        //Integer String 사용 --> 100이라는 문자열 생성
        Integer obj3 = Integer.valueOf(100);
        
        //컴파일을 하면    new Integer(100)로 자동으로 바뀐다.
        //자동 오토박싱이 되게끔 처리해줌
        Integer obj4 = 100;
        System.out.println("박싱 후: " + obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
     
        //언박싱(unBoxing)코드 --> 기본값으로 바꾼다.
        int value1 = obj1.intValue();
        int value2 = obj2;
        int value3 = obj3;
        int value4 = obj4.intValue();
        
        System.out.println("언박싱 후: " + value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        
        
        
    }

}
