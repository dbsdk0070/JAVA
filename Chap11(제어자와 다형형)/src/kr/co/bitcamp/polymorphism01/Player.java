package kr.co.bitcamp.polymorphism01;

//조상 클래스
public class Player {
    
    //멤버 변수(instance variable)
    private String name;
    private int age;
    private int backnumber;
    private int speed;
    
    //조상 클래스의 생성자
    public Player(String name, int age, int backnumber, int speed) {
        super();
        this.name = name;
        this.age = age;
        this.backnumber = backnumber;
        this.speed = speed;
    }
    
    //getter() 메서드 생성
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBacknumber() {
        return backnumber;
    }

    public int getSpeed() {
        return speed;
    }
    
    public void info() {
        System.out.println("이름: " +this.getName());
        System.out.println("나이: " +this.getAge());
        System.out.println("등 번호: " +this.getBacknumber());
        System.out.println("속도: " +this.getSpeed());
    }
    
    public void pass() {
        System.out.println("이름: " +this.getName());
        System.out.println("나이: " +this.getAge());
        System.out.println("등 번호: " +this.getBacknumber());
        System.out.println("속도: " +this.getSpeed());
    }
    
    public void defence() {
        System.out.println("이름: " +this.getName());
        System.out.println("나이: " +this.getAge());
        System.out.println("등 번호: " +this.getBacknumber());
        System.out.println("속도: " +this.getSpeed());
    }
    
}
