package kr.co.bitcamp.polymorphism04;

public class Product {

    int price;                  //제품의 가격
    int bonusPoint;             //제품구매시 제공하는 보너스 점수
    
    //가격에 대한 생성자
    public Product(int price) {
        this.price = price;
        this.bonusPoint = (int)(price/10.0);        //보너스 점수는 제품가격의 10% 정립
    }
    
    
    
}
 