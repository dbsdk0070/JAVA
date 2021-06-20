package kr.co.bitcamp.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        
        Vector<Board> vector = new Vector<>(5);                     //Capacity 용량
        System.out.println("용량:" + vector.capacity());              //기본용량: 5
        System.out.println("초기 사이즈: " + vector.size());
        System.out.println("--------------------------");
        
        //객체추가(컬렉션에 들어가면 모두 객체다.)
        vector.add(new Board("제목1", "내용1", "글쓴이1"));
        vector.add(new Board("제목2", "내용2", "글쓴이2"));
        vector.add(new Board("제목3", "내용3", "글쓴이3"));
        vector.add(new Board("제목4", "내용4", "글쓴이4"));
        vector.add(new Board("제목5", "내용5", "글쓴이5"));
        System.out.println("객체 추가 후 용량:" + vector.capacity());             
        System.out.println("객체 추가 후 사이즈: " + vector.size());
        System.out.println("--------------------------");
    
        //객체삭제
        vector.remove(2);                                           //배열복사 일어남
        vector.remove(3);                                           //배열복사 일어남
        System.out.println("객체 삭제 후 용량:" + vector.capacity());             
        System.out.println("객체 삭제 후 사이즈: " + vector.size());
        System.out.println("--------------------------");
        
        //용량만 확보
        vector.ensureCapacity(20);                                  //ensureCapacity(최소용량)
        System.out.println("객체 최소 용량:" + vector.capacity());             
        System.out.println("객체 삭제 후 사이즈: " + vector.size());
        System.out.println("--------------------------");
        
        //null값 포함하여 size값 변경
        vector.setSize(7);                                          //배열복사 일어남
        System.out.println("size 변경 후 용량:" + vector.capacity());             
        System.out.println("size변경 후 사이즈: " + vector.size());     //나머지는 null값임
        System.out.println("--------------------------");
        
        //size로 잡히지 않은 null값은 삭제를 해준다.
        vector.trimToSize();
        System.out.println("null값 삭제 후 용량:" + vector.capacity());             
        System.out.println("null값 삭제 후 사이즈: " + vector.size());     
        System.out.println("--------------------------");
        
        vector.setSize(3);                                          //배열복사 일어남
        System.out.println("size변경 후 용량:" + vector.capacity());             
        System.out.println("size변경 후 사이즈: " + vector.size());     
        System.out.println("--------------------------");
        
        //향상된 for문을 사용
        for(Board board: vector) {                                  //vector안에 있는 하나하나는 board임
            System.out.println(board.subject + board.content +board.writer);
            System.out.println("--------------------------");
            
        //반복자로 출력하기
            Iterator<Board> iterator = vector.iterator();
            while(iterator.hasNext()) {                             //가져올데이터가 있느냐?
               Board board1 = iterator.next();                       //있으면 가져와라
               System.out.println(board1);
            }
            
        }
        
    }

}


