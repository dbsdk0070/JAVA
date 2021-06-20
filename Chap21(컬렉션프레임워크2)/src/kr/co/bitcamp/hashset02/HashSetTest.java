package kr.co.bitcamp.hashset02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import kr.co.bitcamp.hashmap03.Student;

public class HashSetTest {
    public static void main(String[] args) {
        
        HashSet<Member> set = new HashSet<>();
        
        /*
         * new를 사용했기 때문에, 아래 4개의 Member객체는 서로 다른 주소를 가지고 있다.
         * 그러나 Member클래스에서 hashCode()를 재정의했기에 동등객체로 인식한다.
         * => Set은 중복저장을 하지 않는다.
         * 
         */
        
        set.add(new Member("양현종", 30));
        set.add(new Member("양현종", 30));
        set.add(new Member("양현종", 25));
        set.add(new Member("양현종", 17));
        System.out.println("총 객체수: " + set.size());
        
        Iterator<Member> iterator = set.iterator();
        while(iterator.hasNext()) {
            Member member = iterator.next();
            System.out.println(member.getName()+":"+member.getAge());
        }
        System.out.println("--------------------------------------");
        
        Set<Student> keySet = map.keySet();
        Iterator<Student> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()) {
            Student key = keyIterator.next();
            System.out.println("학번: " +key.getSno()+","+
                               "이름: " +key.getName()+","+
                               "정수: " +map.get(new Student(key.getSno(), key.getName()));
        };
        
    }

}
