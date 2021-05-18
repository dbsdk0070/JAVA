package kr.co.bitcamp.staticvariable;

public class Card {

    // 인스턴스 변수 (statc이 없으니까) --> 반드시 new를 해서 인스턴스 생성을 해야 접근 가능.
    private String color;       // 카드의 색상
    private String company;     // 카드의 회사명
    
    
    // static 변수(정적변수, 클래스변수(class전연에서 공통적으로쓰임), 공유변수)
    // --> 인스턴스 생성 없이도 클래스명.static변수명으로 접근 가능.
    // static은 private를 정의하지 않고쓸 수 있음 (static은 public으로 정의되어있음)
    
    static int width = 100;     // 카드 폭
    static int height = 50;      // 카드 높이
    
    
    // getter, setter()
    // 인스턴스 메서드(static이 없음) static: 공통적으로 사용할 수 있는 메서드
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    
    
    
    public String toString() {
        /*
         * 정적변수(static)는 접근 방법이 반드시 클래스명.static 변수명으로 접근해야 올바른 방법이다.
         */
        return "card의 색상: " + this.getColor() + "card의 회사: " + this.getCompany() +
                ", 크기: ("+ Card.width + "," + Card.height + ")";
    }
    
    
}
