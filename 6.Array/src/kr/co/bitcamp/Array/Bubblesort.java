package kr.co.bitcamp.Array;

import java.util.Arrays;

/*
 * 버블 정렬 : 서로 이웃한 데이터를 비교하여 정렬하는 방법이다.
 *          거품 정렬이라고도 한다. 데이터의 이동 모양이 거품모양으로 수면위로 올라오는 듯한
 *          모습으로 보이기때문에 지어진 이름이다.
 *  
 */

public class Bubblesort {

    public static void main(String[] args) {
      
        int[] ball = new int[5];
        for(int i = 0; i < ball.length; i++ ) {
            ball[i] = (int)(Math.random() * 45) + 1;
           
        }
        System.out.println("정렬 전");
        
        for(int i = 0; i < ball.length; i++) {
            System.out.print(ball[i] + " ");
        }
        
        System.out.println();
        // 버블소팅을 위해서 반드시 1차원 배열이라도 더블루프가 필요하고
        // 조건문이 하나 필요함
        for(int i = 0; i < ball.length; i++) {
            for(int j = 0; j < ball.length-1; j++) {
                // 버블정렬
                if(ball[j] > ball[j+1]) {
                    int temp = ball[j];
                    ball[j] = ball[j+1];
                    ball[j+1] = temp;
                }
            }
                
        }
        
//        Arrays.sort(ball);      //오름차순 정렬
            
        System.out.println("정렬 후");
//        for(int i = 0; i < ball.length; i++) {
//            System.out.print(ball[i] + " ");
//        }
        
        System.out.println();
        
        System.out.println(Arrays.toString(ball));
    }
  

}
