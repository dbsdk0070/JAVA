package kr.co.bitcamp.polymorphism02;

public class CarTest {
    
    public static void main(String[] args) {

         Car car = null;
         SportCar sportCar = new SportCar();
         PoliceCar policeCar = new PoliceCar();
         
         policeCar.drive();
         policeCar.stop();
         policeCar.siren();

         sportCar.drive();
         sportCar.stop();
         sportCar.speedUp();
         sportCar.speedDown();
         
         car = sportCar;
      // car.speedUp();             ERR발생
         

         SportCar sportCar2 = null;
        
         sportCar = (SportCar)car;
         
         sportCar.drive();
         sportCar.speedDown();
         sportCar.speedUp();
         sportCar.stop();
        
         
         
         PoliceCar police = new PoliceCar();
    }
         
}
//         
//        Car car = null;
//        SportCar sportCar = new SportCar();
//        PoliceCar policeCar = new PoliceCar();
//        
//        sportCar.speedUp();
//        
//        car = sportCar;                 // 1.자식타입이 부모타입으로 (UPcasting업캐스팅) : 조작할 수 있는 멤버가 줄어듦
//     // car.speedUp();
//        
//        SportCar sportCar2 = null;
//        sportCar2 = (SportCar)car;      // 2.부모타입이 자식타입으로 (Downcasting다운캐스팅) : 조작할 수 있는 멤버가 늘어남.
//                                        // 다운캐스팅을 할 때, 반드시 명시적으로 형변환 코드를 작성해야 함.
//        
//        sportCar.speedUp();
//    }


