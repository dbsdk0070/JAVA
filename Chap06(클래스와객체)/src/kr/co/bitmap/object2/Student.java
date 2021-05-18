package kr.co.bitmap.object2;


public class Student {
    
    //멤버필드(변수)
    String name;
    int age;
    
    

    // Object라는 자바이 최상위 클래스의 toString을 오버라이딩(재정의)함
    @Override //재정의 뜻
    public String toString() {
        
        String str = "이름 : " + this.name+       // this: 클래스의 주소(자기 자신의 주소)
                     "나이 : " + this.age;        //       new라는 연산자가 인스턴스를 생성하면 비로소 활성화됨 (new는 만들었을 때 사용)
                                                //        this는 static메서드나 클래스 앞에 사용할 수 없음.
                                                //
         return str;
    }
    
    // public static String getName()
    // return this.name;

}
