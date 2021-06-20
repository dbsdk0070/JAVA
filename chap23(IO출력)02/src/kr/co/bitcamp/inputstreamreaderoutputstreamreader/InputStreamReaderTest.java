package kr.co.bitcamp.inputstreamreaderoutputstreamreader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderTest {
public static void main(String[] args) throws Exception {
    
    //주 입력스트림 바이트 기반인 InputStream으로 설정한다.
    InputStream iStream = System.in;                    //콘솔로부터 입력 받는다.
    
    //문자를 받기 위해 보조스트림을 주 입력스트림에 연결한다.
    Reader reader = new InputStreamReader(iStream);
    
    int readCount;
    char[] cArr = new char[100];
    System.out.print("문자열을 입력하세요.");
    
    /*
     * 콘솔에서 입력을 계속받을때는 -1을 리턴하는 경우는 Ctrl+z누르면 됨
     * 콘솔창으 ㅣ실행, 중지창을 자세히 살펴보도록 한다.
     */
    while((readCount = reader.read(cArr)) != -1) {
        String str = new String(cArr, 0, readCount);
        System.out.println("키보드로부터 읽은 문자열 : " + str);
       
        if((readCount = reader.read(cArr)) == -1)
            break;
        }
    
    reader.close();
    iStream.close();
     
     }
}
