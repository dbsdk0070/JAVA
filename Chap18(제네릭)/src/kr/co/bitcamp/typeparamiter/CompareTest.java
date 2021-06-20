package kr.co.bitcamp.typeparamiter;

public class CompareTest {
    public static void main(String[] args) {
        
        int result = Compare.compare(300, 200);
        System.out.println(result);
        
        //String클래스는 Number클래스와 아무런 상속관계가 없음 -> 값으로 넣을 수가 없다.
        //Compare.compare("이순신", "김순신");                                     //에러발생
        
        //Number클래스는 Object클래스의 자손이기 때문에 매개변수 타입으로 적합하지 않음.
        //Compare.compare(new Object(), new Object());                          //에러발생
          
          result = Compare.compare(new Integer(100), new Double(75.11));        //auto 오토박싱 사용하라는 뜻
          System.out.println(result);
          
        //Number는 추상클래스이기 때문에 인스턴스를 생성하지 못한다.
        //Compare.compare(new Number(),new Number());                           //에러발생
        
    }

}










