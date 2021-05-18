package kr.co.bitcamp.polymorphism01;

public class Defender extends Player{
    
    private int defence;

    
    public Defender(String name, int age, int backnumber, int speed, int defence) {
        super(name, age, backnumber, speed);
        this.defence = defence;
    }

    public int getDfence() {
        return this.defence;
    }
    
    
}
