package kr.co.bitcamp.Array;

/*
 * main()의 매개변수의 활용하는 방법 확인해보세요
 * 
 */
public class Mainarguments {
    public static void main(String[] args) {
       
        
        if(args.length != 2) {
            System.out.println("프로그램 사용법 : ");
            System.out.println("아이디, 패스워드 입력:");
        }
        
        String str1 = args[0];
        String str2 = args[1];
        
        System.out.println("아이디: " +str1);
        System.out.println("패스워드: " +str2);
        
        int count = Integer.parseInt(str2);
        int total = count + 500;
        System.out.println("total 값:" + total);
    }
}
