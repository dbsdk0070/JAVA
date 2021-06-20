package kr.co.bitcamp.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapTest {
   public static void main(String[] args) {
    
     //키가 String, 값이 Integer이다. 둘다 객체라는 것에 주목하자. 
       Map<String,Integer> map = new HashMap<>();
       System.out.println("사이즈: " + map.size());
       
       map.put("최지만", 95);
       map.put("류현진", 90);
       map.put("추신수", 80);
       map.put("류현진", 95);
       map.put("추신수", 100);
       
       //map은 중복된 키는 저장하지 않는다. 류현진, 추신수는 2번씩 put을 해서 저장이 되었지만 실제로는 한번만 저장이 되었음
       System.out.println("사이즈: " + map.size());
       
       //중복저장이될 경우, 마지막에 저장된 값으로 대체가 된다.
       System.out.println("류현진 :" + map.get("류현진"));
       System.out.println("추신수 :" + map.get("추신수"));
       System.out.println("-------------------------------------------");
       
       //map컬렉션에 있는 Key값만 Set계열로 바꾼다.
       Set<String>set = map.keySet();
       System.out.println("keySet()을 이용해서 출력해 봄");
       
       //key값을 확인하기 위해서 Iterator을 사용
       Iterator<String> iterator = set.iterator();
       //하나하나 객체를 리턴하기 위해서 has.Next 사용
       while(iterator.hasNext()) {
           String key = iterator.next();
           //키값에 대한 value값
           int value = map.get(key);            //key값이 기준이됨. 반복자(while)를 통해서 얻은 key값을 가지고 값을 얻어온다.
           System.out.println(key +":"+value);
           
       }
       System.out.println("-------------------------------------------");
       
       //Map컬렉션의 Map.Entry 객체를 대상으로 Set계열로 바꾼다.
       Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
       System.out.println("entrySet()을 이용해서 출력해 봄");
       
       //반복자 얻기
       Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
       while(entryIterator.hasNext()){
           Map.Entry<String, Integer> entry = entryIterator.next();
           String key = entry.getKey();             
           entry.getValue();                        //키값을 얻는다.
           int value = entry.getValue();            //값을 얻는다.
           System.out.println(key+ ":"+ "+" + value);
       }
       System.out.println("-------------------------------------------------");

       //전체객체 삭제
       map.clear();
       System.out.println("사이즈:" + map.size());
       
}
       

}
