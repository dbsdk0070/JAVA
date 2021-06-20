package kr.co.bitcamp.multitype;

//제네릭 클래스인데 타입파라메터가 2개임 (설계클래스)
public class Product <T,M>{

    private T t;
    private M m;
    
    public void setT(int i, int j, String string) {
        // TODO Auto-generated method stub
        
    }
    
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public M getM() {
        return m;
    }
    public void setM(M m) {
        this.m = m;
    }

    
}











