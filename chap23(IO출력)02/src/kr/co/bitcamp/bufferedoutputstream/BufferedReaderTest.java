package kr.co.bitcamp.bufferedoutputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class BufferedReaderTest {
public static void main(String[] args) throws Exception {
    
    //주스트림은 바이트 기반
    InputStream iStream = System.in;
    //보조스트림 첫번째: 바이트를 문자로 바꿔주는 InputStreamReader를 연결함
    Reader reader = new InputStreamReader(iStream);
    //보조스트림 두번째: 속도 및 성능 향상해주는 BufferedReader를 연결함
    BufferedReader bReader = new BufferedReader(reader);
    System.out.print("입력: ");
    /*
     * readLine() : 한줄 단위로 읽어들임
     */
    String lineString = bReader.readLine();
    System.out.println("출력: " + lineString);
    
    bReader.close();
    reader.close();
    iStream.close();
    
    
    }
}
