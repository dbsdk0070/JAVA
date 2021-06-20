package kr.co.bitcamp.extend;
//조상클래스 정의
public class Person<T,M>{
    
    private T kind;
    private M mode;
    
    
    public T getKind() {
        return kind;
    }
    public void setKind(T kind) {
        this.kind = kind;
    }
    public M getMode() {
        return mode;
    }
    public void setMode(M mode) {
        this.mode = mode;
    }
    
    

}
