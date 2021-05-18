package kr.co.bitcamp.overloading;


public class AccumulatorTest {

    public static void main(String[] args) {
        
        Accumulator accm = new Accumulator();
     
        
        int iResult = accm.add(10, 50);
        System.out.println("iResult : " + iResult);
        
        long lResult = accm.add(100, 7500L);            //접미사 L로 끝나면 long형의 값으로 끝난다.
        System.out.println("lResult : " + lResult);     //점미사 반드시 붙이도록 함.
        
        lResult = accm.add(1000L, 10);
        System.out.println("lResult : " + lResult);
        
        double dResult = accm.add(107.88, 11.55);
        System.out.println("dResult : " + dResult);
        
        long aResult = accm.add(new int[] {1,2,3,4,5});
        System.out.println("aResult : " + aResult);
        
        iResult = accm.add(new A());
        System.out.println("iResult : " + iResult);
        
        
        
    }
    
       

}
