package kr.co.bitcamp.modifier01;

public class AccessClass {

    public static void main(String[] args) {
        
        Phone phone = new Phone("iPhone12", "Blue", "Apple");
        //phone.model;      //private: 같은 패키지가 아니기때문에 보이지 않음
        //phone.model;      //protected: 같은 패키지이기 때문에 보임
        
        
    }
    
}
