package kr.co.bitcamp.finalconstant;

/*
 * final 초기화 방법
 * 
 *  1) 선언과 동시에 초기화
 *  2) 생성자에서 단 한번 초기화
 *
 */
public class Person {
    final String nation = "KOREA";                //상수선언 (선언과 동시에 초기화)
    
    final int age;
    /*
     * public Person(int age){                    //생성자를 생성하면서 정의. 클래스 이름과 동일하게 생성Person
     * this.age = age;
     * }
     */
    
    /*
     * 불변의 정적상수
     * (static final/data type: int/상수)
     * static이기 때문에 무조건 정의하면서 초기화됨
     * 무조건 선언과 동시에 초기화가 반드시 되어야한다.
     * static이기때문에 공용데이터로써 사용되어진다.
     * 클래스별로 관리되어짐(인스턴스별x)
     */
    static final int MAX_NUMBER = 1000;             
                        
    
    public Person(int age) {                        //생성자를 생성하면서 정의 (생성자에서 단 한번 초기화)
        this.age = age;                             //클래스이름과 동일하게 생성 Person
    }

//    @Override
//    public String toString() {
//        return "nation : " + this.nation +
//               " , age : " + this.age;
//                        
//    }
}
