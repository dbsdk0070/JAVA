package kr.co.bitcamp.bufferedoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputStreamTest {
    public static void main(String[] args) throws Exception {
        
        
//        File file =
//                new File("C:\\Users\\bitcamp\\eclipse-workspace\\chap23(IO출력)02\\src\\kr\\co\\bitcamp\\bufferedoutputstream\\Norway AMAZING Beautiful Nature with Relaxing Music and sound - 4k Ultra HD Quality.mp4");
       File file = new File("C:\\Users\\bitcamp\\eclipse-workspace\\chap23(IO출력)02\\src\\kr\\co\\bitcamp\\bufferedoutputstream\\We Never Go Alone.mp4");
        
        System.out.println("파일의 크기: " + file.length()/1024 + " Kbyte");
        System.out.println("파일의 크기: " + ((file.length()/1024))/1024 + " Mbyte");
        
        //주스트림
        FileInputStream fInputStream = null;
        FileOutputStream fOutputStream = null;
        
        //보조스트림
        BufferedInputStream bInputStream = null;
        BufferedOutputStream bOutputStream = null;
        
        int dataCount = 0;
        long start = 0;
        long end = 0;
        byte[] bArr = new byte[10000];
        //주스트림에 보조스트림을 연결함(입력)
        fInputStream = new FileInputStream(file);
        bInputStream = new BufferedInputStream(fInputStream);
        
        //주스트림에 보조스트림을 연결함(출력)
        fOutputStream = new FileOutputStream("C:/Temp/우리는 결코 혼자가 아닙니다.mp4");
        bOutputStream = new BufferedOutputStream(fOutputStream);
        
        start = System.currentTimeMillis(); //읽고 저장하기 전 시간 저장
        
        //1바이트씩 읽고 1바이트씩 저장하는 경우
        while((dataCount = bInputStream.read(bArr)) != -1) {
            fOutputStream.write(bArr, 0, dataCount);
        }
        fOutputStream.flush();
        
        end = System.currentTimeMillis();   //읽고 저장한 후 시간 저장
        
        System.out.println((end - start) + "ms");
        
        
        bInputStream.close();
        fOutputStream.close();
        fInputStream.close();
    
    /*
     * 소결론: 배열을 사용해서 적절하게 저장공간을 주고,
     * BufferedInputStream, BuffeedOutputStream을
     * 보조스트림을 연결하여 사용하면, 상당한 성능을 발휘하는 사실을 알 수 있다.
     */
    
    }

}



