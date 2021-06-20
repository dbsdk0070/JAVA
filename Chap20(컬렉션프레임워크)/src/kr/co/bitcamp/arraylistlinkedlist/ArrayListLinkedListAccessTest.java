package kr.co.bitcamp.arraylistlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListAccessTest {
    
    //순차적 시간 비교
    public static void add(List<String>list) {
        for(int i=0; i<1000000; i++) {
            list.add(i+"");                         //i를 계속 더한다라는 뜻
        }
    }
    
    public static long access(List<String> list) {
        long start = System.currentTimeMillis();
        
        for(int i=0; i<10000; i++) {
            list.get(i);
        }
        
        long end = System.currentTimeMillis();
        return end-start;
    }
    
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();
        
        add(arrayList);
        add(linkedList);
        
        System.out.println("접근시간 테스트");
        System.out.println("ArrayList: " + access(arrayList));
        System.out.println("linkedList: " + access(linkedList));
    }

}
