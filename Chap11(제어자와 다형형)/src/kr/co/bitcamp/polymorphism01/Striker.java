package kr.co.bitcamp.polymorphism01;

public class Striker extends Player{
    
    private int shoot;

    public Striker(String name, int age, int backnumber, int speed, int shoot) {
        super(name, age, backnumber, speed);                //player의 생성자
        this.shoot = shoot;
    }
    
    public int getShoot() {
        return this.shoot;
    }
    
    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();                                       //player의 info()를 호출
        System.out.println("유효 슈팅:" + this.getShoot());
    }
    
    
}
