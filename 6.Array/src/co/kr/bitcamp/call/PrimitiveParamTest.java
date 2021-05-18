package co.kr.bitcamp.call;


class A{
    int data;
}

public class PrimitiveParamTest {
    public static void main(String[] args) {
       
        A a = new A();
        a.data = 77;
        System.out.println("메서드 호출 main()내의 값: " + a.data);
        
        // Call by value(값에 의한 복사 호출)
        PrimitiveParamTest.dataChange(a.data);
        
        System.out.println("dataChange() 호출");
        System.out.println("메서드 호출 후 main()내의 값 : " + a.data);
        
        
    }
    
    public static void dataChange(int data) {       //블럭 안에서 쓸 수 있는 지역변수 :data
        
        /*
         * 지역변수(기본형)
         * data값은 값복사가 이루어짐 => 호출한곳으로부터 아무런 영향을 받지 않음.
         */
        data = 44;
        System.out.println("dataChange()내의 값 : " + data);
        return;
        
        
        
    }
    

}
