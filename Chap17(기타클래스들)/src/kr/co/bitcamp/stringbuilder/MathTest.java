package kr.co.bitcamp.stringbuilder;

public class MathTest {
    public static void main(String[] args) {
        
        //절대값
        int v1 = Math.abs(-5);
        double v2 = Math.abs(-7.88);
        System.out.println(v1);
        System.out.println(v2);
        
        //올림값
        double v3 = Math.ceil(5.3);
        System.out.println(v3);
        
        //내림값
        double v4 = Math.floor(5.9);
        System.out.println(v4);
        
        //최대값
        int v5 = Math.max(10, 5);
        System.out.println(v5);
       
        //최소값
        int v6 = Math.min(10, 5);
        System.out.println(v6);
        
        //랜덤값
        double v7 = Math.random();
        System.out.println(v7);
        
        //가장 가까운 실수값
        double v8 = Math.rint(5.3);
        double v9 = Math.rint(5.5);
        System.out.println(v8);
        System.out.println(v8);
        
        //반올림 (기본적으로 소숫점 둘째자리에서 반올림)
        long v10 = Math.round(5.23);
        System.out.println(v10);
        
        //소숫점 셋째 자리에서 반올림
        double value = 12.3456;
        double temp1 = value * 100;
        System.out.println(temp1);
        long temp2 = Math.round(temp1);
        double v11 = temp2/100.0;
        System.out.println(v11);
        
        
        
        
    }

}
