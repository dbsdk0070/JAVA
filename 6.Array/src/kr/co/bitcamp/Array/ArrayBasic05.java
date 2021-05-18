package kr.co.bitcamp.Array;

import java.util.Arrays;

/*
 * 배열의 값들을 for문과 같은 반복문을 사용하지 않고 한꺼번에 출력하는 코드를 작성해보시오.
 */

/*
 * Arrays.toString() 메서드
 * 반복문을 사용하지 않고 배열의 값을 출력할 수 있음
 */
public class ArrayBasic05 {

    public static void main(String[] args) {
        
        // 배열선언
        int[] arr = {238, 483, 239, 442, 487, 239, 873};
        
        // for문
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + "");
        System.out.println();
        
        // toString() 메서드 사용하여 값 출력해보기
        System.out.println(Arrays.toString(arr));   // [] 대괄호 형태로 배열 표시를 보여주면서 출력됨
        System.out.println(arr[0]);

    }

}
