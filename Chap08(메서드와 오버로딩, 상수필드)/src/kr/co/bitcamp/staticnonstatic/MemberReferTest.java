package kr.co.bitcamp.staticnonstatic;


//멤버들간의 참조여부 확인
public class MemberReferTest {
    
    int iv;             //인스턴스 멤버변수
    static int cv;      //정적 멤버변수
    
    // 인스턴스 메소드 (두 타입 모두 가능)
    // 이유: 인스턴스 메소드가 호출 될때는 이미 인스턴스가 생성되어있을 것임
    public void instanceMethod() {
        System.out.println(this.iv);                 //인스턴스 멤버변수 사용가능
        System.out.println(cv);                      //정적 멤버변수 사용 가능
        staticMethod();                              //정적멤버 메소드 사용 가능
    }
    
        // 정적변수 메소드만 사용 가능
        // 이유: 인스턴스가 언제 생성될지 아무도 모르기 때문에
        //      정적 메소드 내에서는 인스턴스 멤버들을 절대 사용할 수 없다.
        public static void staticMethod() {
         // System.out.println(this.iv);             //인스턴스 변수 사용불가
         // this.instatnceMethod()                   //인스턴스 멤버 메소드 사용불가
            System.out.println(cv);                  //정적멤버 변수 사용가능
            staticMethod();                          //정적멤버 메소드 사용 가능
        }
        

        
        
    }


