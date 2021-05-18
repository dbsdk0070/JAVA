package kr.co.bitcamp.polymorphism05;

// 상품관리 프로그램
// 조상클래스
public class Product {
    

    //멤버 variable
    private int productID;              //상품명
    private String description;         //상품 설명
    private String maker;               //브랜드, 메이커
    private int price;
    
    //멤머 bariable 생성자
    public Product(int productID, String description, String maker, int price) {
        super();
        this.productID = productID;
        this.description = description;
        this.maker = maker;
        this.price = price;
    }
    
    //getter 추가    


    public int getProductID() {
        return productID;
    }

    public String getDescription() {
        return description;
    }

    public String getMaker() {
        return maker;
    }

    public int getPrice() {
        return price;
    }
    
    public void shouwInfo() {
        System.out.println("상품ID >> " + (this.getProductID() +1));        //넘버가 0부터 시작할것이기 때문에 +1
        System.out.println("상품설명 >> " + (this.getDescription()));
        System.out.println("상품메이커 >> " + (this.getMaker()));
        System.out.println("가격 >> " + (this.getPrice()));
    }

    
}
    


















