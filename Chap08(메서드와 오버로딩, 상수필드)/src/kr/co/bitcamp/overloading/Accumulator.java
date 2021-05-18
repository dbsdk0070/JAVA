package kr.co.bitcamp.overloading;
/*
 * 오버로딩               vs          오버라이딩
 * -----------------------------------------
 * 
 * new                              change, modify
 * * object의 멤버
 * public String toString()
 * 
 * * String의 멤버
 * public String toString()
 * 
 */

class A{
    int data1 = 10;
    int data2 = 20;
}


public class Accumulator {
    // add()라는 메서드명으로 오버로딩
    public int add(int x, int y) {
        System.out.println("add(int x, int y) 호출");
        return x + y;
    }
    
//    public int add(int a, int b) {
//        return a+b;
//    }

    public long add(int x, long y) {
        System.out.println("add(int a, long b) 호출");
        return x + y;
        
    }
    
    public long add(long x, int y) {
        System.out.println("add(long x, int y) 호출");
        return x + y;
    }
    
    public double add(double x, double y) {
        System.out.println("add(double x, double y) 호출");
        return x + y;
    }
    
    //참조형 변수를 받아서 오버로딩하는 케이스
    
    public long add(int[] arr) {
       System.out.println("add(int[] arr) 배열의 주소를 받아서 그 배열의 총합을 구하여 리턴");
        long sum = 0L;
        
        for(int i : arr) {
            sum += i;
        
        }
        return sum;
    }
    
   //클래스를 매개변수로 받아서 오버로딩하는 케이스
   public int add(A a) {
       System.out.println("add(A a) 호출");
       return a.data1 + a.data2;
   }
    
}
