package kr.co.bitcamp.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.FileNotFoundException;

public class InputStreamReadTest01 {
    //일반 예외가 발생하는데 그 예외를 JVM에게 던지고 있음.
    public static void main(String[] args) throws Exception {
        
        //다형성이 적용된 코드
        InputStream iStream = new FileInputStream("C:\\Users\\bitcamp\\eclipse-workspace\\Test.txt");
        int readByte;           //읽은 바이트 수를 리턴 받는 변수
        
        /*
         * InputStream의 read()는 더이상 읽은게 없다면 -1을 리턴함.
         */
        
        //기본적인 read 읽는 방법 1) 이 방법이 훨씬 좋음!
        while((readByte = iStream.read()) != -1) {
            System.out.println("읽은 데이터(1바이트) :" + readByte);            //아스키코드 값을 출력
            System.out.println("읽은 문자: " + (char)readByte);              //강제타입캐스팅(형변환) char --> 문자출력   
        }
        
        //while(true)를 사용해서 read를 읽는 방법 2)
        while(true) {
           readByte = iStream.read();
           if(readByte == -1)
               break;
           System.out.println("읽은 문자: " + (char)readByte);
        }
        
        
        
        //이클립스상의 디폴트 캐릭터셋을 가져옴
        System.out.println(Charset.defaultCharset());
        
        
        
        //리소스 반납
        iStream.close();
    }

}
