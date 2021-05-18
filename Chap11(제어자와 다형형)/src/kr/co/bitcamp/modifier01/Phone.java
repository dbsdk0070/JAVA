package kr.co.bitcamp.modifier01;

public class Phone {
    /*
     * public: 모두 오픈
     * protected 접근 제어자: 같은 패키지에서 다 접근 가능 (상속을 받든 안받든 모두 가능)
     *                     --> 상속받지 않은 클래스도 접근 가능함.
     *                     but, 다른 패키지에서는 다 접근 불가 (상속을 받든 안받든 접근 불가)
     *                     
     * 때문에 접근제어자는 대부분 private로 사용                    
     */
    protected String model;
    private String color;
    private String company;
    
    //생성자 --> 오버로드할 수 있다.
    
    //기본 생성자. default constructor
    public Phone() {
        
    }
    
    //오버로드된 매개변수가 있는 생성자
    public Phone(String model, String color, String company) {
        super();                            //조상이 만들어지고 자손이 만들어지기 때문에 "super()"필요
        this.model = model;
        this.color = color;
        this.company = company;
    }
    
    
    //getter() 생성
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getCompany() {
        return company;
    }
    
    
    @Override
    public String toString() {

        String str = "모델: " +this.getModel() +
                     "컬러: " +this.getColor() +
                     "제조회사: " +this.getCompany();

        return str;
    }
    
    
    
    
}












