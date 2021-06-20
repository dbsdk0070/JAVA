package kr.co.bitcamp.arraylist;

import java.util.ArrayList;

/*
 * - 자바 배열은 크기를 미리 지정하고 사용함 --> 넉넉하게 크기를 지정해놓고 사용함.
 * - ArrayList는 필요시에 언제든지 추가, 삭제가 가능함.
 * - List 인터페이스를 상속함으로 인덱스가 있고, 저장 순서가 유지되고, 데이터 중복이 가능함.
 * - 또한 제너릭 문법을 사용할 수 있다. --> 만약 제너릭을 사용하지 않는다면, 내부적으로 Object타입으로 처리됨.
 * 
 */
public class ArrayListTest01 {
    
    public static void main(String[] args) {
    
        //ArrayList를 제너릭이 아닌 일반 타입으로 정의했기때문에 내부적으로 Object타입으로 처리하게 되어있음
        ArrayList list = new ArrayList();                            //기본적으로 10개의 방을 생성함.
        System.out.println("총 크기: " + list.size());
        
        //객체추가(collection에는 기본적으로 객체추가가 이루어짐)
        //Object타입으로 정의했기 때문에 ()안의 타입은 상관 없음
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("222");                                             //ArrayList는 중복 가능함
        
        list.add(333);                                               //list.add(new Integer(333)) 오토박싱(Integer)으로 되어있기때문에 저장 가능 
        System.out.println("총 크기: " + list.size());
        System.out.println("ArrayList의 주소: " + list.hashCode());    //특정 해쉬값을 가지고 있다.
        System.out.println("ArrayList의 값 : " + list.toString());
        System.out.println();
        
        //0번째 인덱스에 문자열 "333"추가하기
        list.add(0, "333");                                          
        System.out.println("ArrayList의 값 : " + list.toString());
        System.out.println();
        
        //객체를 삭제하기
        //기본적으로 객체를 삭제했을때에는 맨 앞쪽부터 해당되는게 있다면 삭제 (가까운것 한개만 삭제) "333" = 0번째 삭제
        list.remove("333");
        System.out.println("ArrayList의 값 : " + list.toString());
       
        System.out.println(list.remove("333")); //결과값 boolean. "333"이 있으면 true, 없으면 false
        System.out.println("ArrayList의 값 : " + list.toString());
        System.out.println();
        
        //지정된 객체의 인덱스를 찾아오기 (없으면 -1)
        System.out.println("index = " + list.indexOf("333"));
        System.out.println("index = " + list.indexOf(333));
        
        //객체를 전부 삭제하기
//        list.clear();
//        System.out.println("ArrayList의 값 : " + list.toString());
//        
        /*
         * 인덱스 0을 삭제할때, i가 0이니까 당연히 0인덱스에 있는 객체가 삭제가 되지만,
         * 이후 i값이 증가하면서 제대로 삭제가 되지 않는 것임
         */
        
//        for(int i= 0; i<list.size(); i++) {
//            list.remove(i);
//            System.out.println("ArrayList의 값 : " + list.toString());
//        }
        
        // 전체 삭제를 할거면 "clear"를 사용하지만 삭제를 시킬려면 항상 뒤에서부터 삭제를 해주어야됨.
        for(int i = list.size()-1; i>=0; i--) {
            list.remove(i);
            System.out.println("ArrayList의 값 : " + list.toString());
        }
        
        
    }
}













