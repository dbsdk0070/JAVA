package kr.co.bitcamp.polymorphism05;

public class Book extends Product{
    
    private int ISBN;
    private String title;
    private String author;
    
    // 생성자 오버로드
    public Book(int productID, String description, String maker, int price, int iSBN, String title, String author) {
        super(productID, description, maker, price);
        ISBN = iSBN;
        this.title = title;
        this.author = author;
    }

    //getter 생성
    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    
    
    @Override 
    public void shouwInfo() {         //조상 클래스의 메서드를 명시적 호출 
        super.shouwInfo();
        System.out.println("국제표준도서번호 >> " + this.getISBN());
        System.out.println("책 제목 >> " + this.getTitle());
        System.out.println("저자 >> " + this.getAuthor());
        
    }
    

}
    

