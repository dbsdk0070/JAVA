package kr.co.bitcamp.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputStreamReadTest03 {
    public static void main(String[] args) throws Exception {
        
        InputStream iStream =
                new FileInputStream("C:\\Users\\bitcamp\\eclipse-workspace\\test3.txt");
        
        //iStream을 읽어올 변수명
        int count;
        //byte[] Array 추가
        byte[] readBytes = new byte[10];
        
        //2~5까지의 바이트를 읽어온다.
        //시작 인덱스가 2(0,1,2)가 되고, length전체 크기가 5가되는 셈.(시작 인덱스가 2이고 5개만 읽어서 저장하는 코드) 
        count = iStream.read(readBytes, 2, 5);
        System.out.println("읽은 바이트 수: " + count);
        System.out.println();
        
        for(byte b : readBytes) {
            System.out.println("읽은 바이트: " + (char)b);
        }
        
        
        iStream.close();
    }

}







