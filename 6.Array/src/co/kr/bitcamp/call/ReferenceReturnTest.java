package co.kr.bitcamp.call;

import java.util.Arrays;

public class ReferenceReturnTest {
    public static void main(String[] args) {
        
        int[] origin = new int[] {10,20,30,40,50};      //원본배열
        int[] cloned = null;                            // cloned: 복사. 타겟배열
        System.out.println("copy() 호출 전 : " + Arrays.toString(cloned));
        
        cloned = copy(origin);
        System.out.println("copy() 호출 후 origin[]값 : " + Arrays.toString(origin));
        System.out.println("copy() 호출 후 origin[]값 : " + Arrays.toString(cloned));
        
        
        
    }
    
    // 리턴타입이 참조타입이 온 경우임
    public static int[] copy(int[] arr) {   //매개변수도 참조형으로. int[]
    
        int[] temp = new int[5];
        
        System.arraycopy(arr, 0, temp, 0, arr.length); // arraycopy 2번째 0: 전체 복사

        
    return temp;
    }
}
