package kr.co.bitcamp.abstractt;

public class PhoneTest {

    public static void main(String[] args) {
        // 추상클래스는 인스턴스를 생성할 수 없다.
        // Phone phone = new Phone(111, "홍길동", "갤럭시21");

        SmartPhone smartPhone = new SmartPhone(202103, "삼성", "이순신");
        smartPhone.showInfo();
        smartPhone.turnOn();
        smartPhone.turnOff();
        smartPhone.internetSearch();
        System.out.println("----------------------------------------");
        
        TripleCameraPhone tCameraPhone = new TripleCameraPhone(202112, "애플", "이방원");
        tCameraPhone.showInfo();
        tCameraPhone.turnOn();
        tCameraPhone.turnOff();
        tCameraPhone.cameraOn();
        tCameraPhone.cameraOff();
        System.out.println("----------------------------------------");
        
        Phone[] phone = new Phone[10];
        phone[0] = new SmartPhone(201106, "샤오미", "이성계");
        phone[1] = new TripleCameraPhone(201112, "LG", "박지성");
        
        phone[0].turnOn();
        phone[0].turnOff();
        phone[1].turnOff();
        phone[1].showInfo();
        
    }

}




















