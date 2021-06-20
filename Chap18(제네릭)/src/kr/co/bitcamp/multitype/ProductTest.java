package kr.co.bitcamp.multitype;

public class ProductTest {
    public static void main(String[] args) {
        //멀티타입 파라미터를 적용한 클래스
        
        //멀티타입 파라미터가 적용된 p1
        Product<Tv, String> p1 = new Product<>();
        p1.setT(new Tv(2021, 3));
        p1.setM("LG OLED AI TV");
        
        System.out.println("나의 TV는" +p1.getT().getYear()+"년"+
                                      p1.getT().getMonth()+"월 식이며" +
                                      p1.getM()+"이다.");

        System.out.println("-----------------------------------------");
        //나의 차는 2021년 7월 출시될 현대의 펠리세이드 캐리그리피이다.

        Product<Car, String> p2 = new Product<>();
        p2.setT(new Car("현대", 2021, 7));
        p2.setM("현대의 펠리세이드 캐리그리피");
        
        Car car = p2.getT();
        String str = p2.getM();
        
        System.out.println("나의 차는" + car.getYear()+"년"+
                                       car.getMonth()+"월 출시될"+
                                       car.getBrand()+str+"이다." );
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
