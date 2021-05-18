package kr.co.bitmap.object1;

public class FieldInitTest {
    
    public static void main(String[] args) {
        
        // 붕어빵을 찍어봅시다.
        // 제품을 생산하고 있다.
        
        // FieldInit class에 대한 인스턴스 정의 --> new로 정의
        // new FieldInit --> 객체 생성
         
        /* "new 연산자" : 클래스 안에 있는 멤버들의 바이트 크기만큼
         *              heap(힙)에다가 메모리를 할당하여 동시에 초기화를 시켜주는 역할을 함.
         *              
         * "this" : 객체 자기자신의 주소
         * super : 부모, 조상 객체의 주소
         *              
         */
        
        
        FieldInit finit = new FieldInit();
        System.out.println(finit.bytefield);
        System.out.println(finit.intfield);
        System.out.println(finit.charfield);
        System.out.println(finit.floatfield);
        System.out.println(finit.arrfield);
        System.out.println(finit.booleanfield);
        
        
        System.out.println(finit);
        System.out.println(finit.toString());       // Object의 toString() 호출함.
    }

}
