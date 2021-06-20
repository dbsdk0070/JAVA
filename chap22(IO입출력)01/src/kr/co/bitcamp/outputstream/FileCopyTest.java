package kr.co.bitcamp.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest {
public static void main(String[] args) throws Exception {
    //write3.txt --> write3_복사본.txt
    
    InputStream FinputStream = new FileInputStream("C:\\Users\\bitcamp\\eclipse-workspace\\write2.txt");
    OutputStream FoutputStream = new FileOutputStream("C:\\Users\\bitcamp\\eclipse-workspace\\wtire2_복사본.txt");
    
    byte[] readBytes = new byte[1000];
    
    //byte단위로 읽어들이기
    int data;
    while((data = FinputStream.read(readBytes)) != -1) {
        FoutputStream.write(readBytes);
    }
    FoutputStream.flush();
    System.out.println("C드라이브에 write02_복사본.txt파일이 생성되었습니다.");
    
    FoutputStream.close();
    FinputStream.close();
    
}
}
