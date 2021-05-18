package kr.co.bitmap.object1;

// 설계도, 붕어빵틀

public class FieldInit {
    
    // 모두 static이 없음 --> variable 인스턴스
    
    // 기본형 변수
    
    byte bytefield;             // 1byte                        // byte: 타입, bytefield: 변수
    short shortfield;           // 2byte
    int intfield;               // 4byte   (디폴트 타입)
    long longfield;             // 8byte
    
    boolean booleanfield;       // 1byte
    char charfield;             // 2byte (유니코드)
    
    float floatfield;           // 4byte 
    double doublefield;         // 8byte
    
    // 참조형 변수 (참조 번지는 무조건 4byte)
    
    int[] arrfield;             // 4byte
    String[] strfield;          // 4byte
    
    public String toString() {
        
        /*
         *  toString(): 클래스의 멤버변수(필드)의 값들을 수시로 확인하고자 할때나,
         *              원하는 포맷으로 멤버변수들을 출력하고자 할대 많이 사용함.
         */
        
        
        String str = "byteField : " + bytefield +
                     ",shortField : " + shortfield +
                     ",intField : " + intfield +
                     ",booleanField : " +booleanfield +
                     ",strField :  " + strfield;
        
        return str;
    }
    
}
