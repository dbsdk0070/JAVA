package kr.co.bitcamp.abstractt;

public abstract class Phone {

    private int serialNo;
    private String company;
    private String owner;
   
    public Phone(int serialNo, String company, String owner) {
        super();
        this.serialNo = serialNo;
        this.company = company;
        this.owner = owner;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public String getCompany() {
        return company;
    }

    public String getOwner() {
        return owner;
    }
    
    //추상메서드 선언
    public abstract void turnOn();
    public abstract void turnOff();
    

    
public void showInfo() {
    System.out.println("시리얼 넘버 : " + this.getSerialNo());
    System.out.println("제조회사 : " + this.getCompany());
    System.out.println("소유자 : " + this.getOwner());
    
    
    
    }
}










