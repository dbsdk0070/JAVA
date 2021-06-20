package kr.co.bitcamp.exception02;

public class TryCatchTest {
    public static void main(String[] args) {

//        System.out.println(1);
//        System.out.println(2);
//        
//        try {
//            System.out.println(3);
//            System.out.println(4);
//            System.out.println(2/0);
//            System.out.println(6);
//        }catch(ArithmeticException e) {
//            System.out.println(7);
//            System.out.println(8);
//            
//        }
//        
//        System.out.println(9);
//        System.out.println(10);
//        
      try {
          Class class2 = Class.forName("kr.co.bitcamp.exception02.TryCatchTest");
          System.out.println("파일명을 찾았습니다.");
          
          System.out.println(class2.getName());
          System.out.println(class2.getSimpleName());
      }catch(ClassNotFoundException s) {
          System.out.println("파일명을 찾을 수 없습니다.");
          s.printStackTrace();
      }finally {
          System.out.println("프로그램을 안전하게 종료합니다.");
      }
        
//        System.out.println(1);
//        System.out.println(2);
//        
//        try {
//            System.out.println(3);
////          System.out.println(2/0);        //0으로 나누는 예외발생 상황 만듦
//            System.out.println(5);          //위에서 예외가 발생했기때문에 (5)실행 안됨
//        }catch(ArithmeticException e) {
//            System.out.println(6);
//            
//        }
//        System.out.println(7);
//        
    }

}

