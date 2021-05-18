package kr.co.bitcamp.polymorphism04;

public class TV extends Product{
    
    public TV() {
        //조상변수에 매개변수가 있는 생성자Product(int price){}을 호출
        super(300);
    }
    @Override
    public String toString() {
        return "TV";                //오버로드해서 TV라고 리턴
    }

}
