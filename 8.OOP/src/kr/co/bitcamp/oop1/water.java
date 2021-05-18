package kr.co.bitcamp.oop1;


    class Waterline{
    //변수
    
    String shape;
    int size;
    String local;
    
    
    // 동작을 나타내는 메소드 생성
    public void drink() {
        System.out.println("water is drinking");    
    }
    
    public void grap() {
        System.out.println("water is grapping");
    }
    
    public void drop() {
        System.out.println("water is dropping");
    }
    
    }
    
    public class water {
        public static void main(String[] args) {
            
            Waterline waterline = new Waterline();
            
            waterline.shape = "circle";
            waterline.local = "Koera";
            waterline.size = 5;
            
            System.out.println("물의 모양은 : " + waterline.shape + "입니다.");
            System.out.println("물의 생산지는 : " + waterline.local + "입니다.");
            System.out.println("물의 사이즈는 : " + waterline.size + "size 입니다.");
            
            waterline.drink();
            waterline.drop();
            waterline.grap();
            
        }
        

    
    
    
}
