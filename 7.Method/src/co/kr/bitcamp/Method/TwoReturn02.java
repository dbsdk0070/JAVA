package co.kr.bitcamp.Method;

import java.util.Arrays;

/*
 * 반환값이 2개 있는 메서드를 구현해보시오.
 * 메서드는{"Software", "HARDWARE" } 입력시 소문자는 대문자로, 대문자는 소문자로 출력되도록 구현한다.
 * 
 */

import java.util.Scanner;
public class TwoReturn02 {
    public static void main(String[] args) {
        
        
//
//        String[] result = testMethod();
//        System.out.println(Arrays.toString(result));
//               
//    }
//
//    public static String[] testMethod() {
//        
//        String method1 = new String("Software").toUpperCase();
//        String method2 = new String("HARDWARE").toLowerCase();
//        
//        
//        return new String[] {method1, method2};

        String[] result = capitalMethod("software", "HARDWARE");    // 4) 반환값 --> O        받는 인자값 --> O 
        
        System.out.println(Arrays.toString(result));
        
    }
    
    public static String[] capitalMethod(String str1, String str2) {
        
        String a = str1.toUpperCase();
        String b = str2.toLowerCase();
        
        String[] rValue = {a, b};
        
        return rValue;
    }
    
}
