package kr.co.bitcamp.generic;

public class TvTest {

    public static void main(String[] args) {
        
        Tv<String> tv = new Tv<>();
        tv.setE("LG OLED TV");
        String tvName = tv.getE();
        System.out.println("나의 TV는" +tvName + "입니다.");
        
        Tv<String> tv2 = new Tv<>();
        tv2.setE("삼성 OLED TV");
        String tvName2 = tv2.getE();
        System.out.println("나의 TV는" +tvName2+"입니다.");
        
    }
}






























