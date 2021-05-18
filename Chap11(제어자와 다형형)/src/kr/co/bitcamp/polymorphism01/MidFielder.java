package kr.co.bitcamp.polymorphism01;

//자손 클래스
public class MidFielder extends Player{
    
    private int pass;

    public MidFielder(String name, int age, int backnumber, int speed, int pass) {
        super(name, age, backnumber, speed);
        this.pass = pass;
    }
    
    public int Pass() {
        return this.pass;
    }
   
    @Override
    public void info() {
        super.info();
        System.out.println(pass);
    }
    
  
    }
    


