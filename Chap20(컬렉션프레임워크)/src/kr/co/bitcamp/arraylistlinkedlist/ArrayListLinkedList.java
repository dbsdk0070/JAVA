package kr.co.bitcamp.arraylistlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList {

        
        //순차적으로 데이터 추가하기
        public static long add1(List<String>list) {
         
            long start = System.currentTimeMillis();
            for(int i=0; i<1000000; i++) {
                list.add(i + "");
            }
            return start;
        }
        
        //비순차적 데이터 추가
        public static long add2(List<String>list) {
            long start = System.currentTimeMillis();
            
            for(int i=0; i<10000; i++) {
                list.add(500, "X");
            }

            long end = System.currentTimeMillis();
            return end - start;
        }
        
        //순차적 데이터 삭제
        public static long remove1(List<String>list) {
            long start = System.currentTimeMillis();
            
            for(int i=list.size()-1; i>=0; i--) {
                list.remove(i);
            }
            
            
            long end = System.currentTimeMillis();
            return end - start;
        }
        
        //비순차적 데이터삭제
        public static long remove2(List<String>list) {
            long start = System.currentTimeMillis();
            
            for(int i=0; i<10000; i++) {
                list.remove(i);
            }
            
            
            long end = System.currentTimeMillis();
            return end - start;
        }
        
        public static void main(String[] args) {
 
            
            ArrayList<String> arraylist = new ArrayList<>();
            LinkedList<String> linkedlist = new LinkedList<>();
        
            System.out.println("==========순차적으로 데이터 추가하기=========");
            System.out.println("ArrayList : " + add1(arraylist));
            System.out.println("LinkedList: " + add1(linkedlist));
            System.out.println();
            
            System.out.println("==========비순차적으로 데이터 추가하기=========");
            System.out.println("ArrayList(배열복사가 발생) : " + add2(arraylist));
            System.out.println("LinkedList(노드값 변경): " + add2(linkedlist));
            System.out.println();
            
            System.out.println("=========비순차적으로 데이터 삭제하기==========");
            System.out.println("ArrayList(배열복사가 발생) : " + remove2(arraylist));
            System.out.println("LinkedList(노드값 변경): " + remove2(linkedlist));
            System.out.println();
            
            System.out.println("=========순차적으로 데이터 삭제하기==========");
            System.out.println("ArrayList(배열복사가 발생) : " + remove1(arraylist));
            System.out.println("LinkedList(노드값 변경): " + remove1(linkedlist));
            System.out.println();
    
        
    }


}