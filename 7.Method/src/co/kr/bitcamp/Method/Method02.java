package co.kr.bitcamp.Method;

public class Method02 {
    public static void main(String[] args) {
    
        int a = 100, b = 200;
        
        plusMethod(a,b);        // 반환값 --> X        받는 인자값 --> O
        
    }
    
    public static void plusMethod(int a, int b) {
        System.out.printf("인자로 넘겨받은 2개의 값은 %d과 %d입니다.%n", a, b);    // 단순출력
        
        int result = a + b;
        System.out.println("두 수를 더한 값 :"  + result);
    }
}
