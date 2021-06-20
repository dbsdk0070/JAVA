package kr.co.bitcamp.hashset01;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetTest {
    
public static void main(String[] args) {
    
    Set<String> set = new HashSet<>();
    System.out.println("사이즈: " + set.size());
    
    set.add("Java");
    set.add("Java");
    set.add("Java");
    set.add("Java");
    set.add("Java");
    set.add("Java");
    set.add("Java");
    set.add("Java");
    
    System.out.println("사이즈: " + set.size());
    System.out.println("-------------------------------------");
    
    /*
     * Set 계열은 중복 저장이 안된다. 순서유지를 하지도 않는다.
     * Set 계열에는 null값도 저장가능하지만, 오직 1개만 저장된다.(중복안됨)
     */
    set.add("JDBC");
    set.add("JSP");
    set.add("myBATIS");
    set.add("mySQL");
    set.add(null);
    set.add(null);
    
    System.out.println("사이즈: " + set.size());
    System.out.println("-------------------------------------");
    
    //반복자를 통해서 set 객체를 얻는다.
    set.iterator();
    Iterator<String> iterator = set.iterator();
    while(iterator.hasNext()) {                     //가져올게 있느냐? 있으면 true, 없으면 false를 리턴한다.
        String element = iterator.next();           //객체를 가져오세요.
        System.out.println(element);
        System.out.println("사이즈: " + set.size());
    }
    System.out.println("-------------------------------------");
    
    set.remove("JDBC");
    set.remove("myBATIS");
    System.out.println("사이즈: " + set.size());
    
    for(String str : set) {
        System.out.println(str);
    }
    System.out.println("-------------------------------------");
    
    set.clear();
    if(set.isEmpty()) {
        System.out.println("객체가 없다.");
    }else {
        System.out.println("객체가 있다.");
    }
    
}
}
