package kr.co.bitcamp.classs;

public class ClassTest2 {
    public static void main(String[] args) {
        
        
        // 1.객체로부터 클래스 정보를 얻는 방법 "getClass"
        Person person = new Person();
        Class class1 = person.getClass();
        System.out.println(class1.getName());
        System.out.println(class1.getSimpleName());
        
        // 2.문자열로부터 객체의 정보를 얻는 방법(Class.forName(""))
        // try, catch로 작성해야 함
        
        try {
            Class class2 = Class.forName("kr.co.bitcamp.classs.Person2");
            System.out.println(class2.getName());
            System.out.println(class2.getSimpleName());
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        
        
    }

}
















