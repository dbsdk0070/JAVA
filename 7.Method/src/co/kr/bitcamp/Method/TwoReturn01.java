package co.kr.bitcamp.Method;

import java.util.Arrays;

/*
 * 2개의 정수형 값을 리턴하는 메서드를 구현하시오.
 * - Array로 리턴하면 된다(복수개의 값을 리턴)
 * 
 */
public class TwoReturn01 {
    public static void main(String[] args) {
        
       int[] result = testMethod();         // 배열 변수 선언 
         System.out.println("result[0] : " + result[0]);
         System.out.println("result[1] : " + result[1]);
         System.out.println("result[1] : " + result[2]);
         System.out.println(result[0] + result[1]);
         System.out.println(Arrays.toString(result));
    }
    
    public static int[] testMethod() {
        int num1 = 100;
        int num2 = 200;
        int num3 = 300;
        
        return new int[] {num1, num2, num3};
    }

}
