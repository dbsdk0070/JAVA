package kr.co.bitcamp.outputstream;

// 배열의 write 읽어들여옴

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutPutStreamTest03 {
    public static void main(String[] args) throws Exception {
        
        OutputStream oStream =
                new FileOutputStream("C:\\Users\\bitcamp\\eclipse-workspace\\write3.txt");
        
        //배열 안에 있는 데이터를 기준으로 write할거임 --> byte[] 배열 만들어줌
        byte[] data = "ABC빅데이터란".getBytes();
        System.out.println("data byte배열의 크기: " + data.length);
        
        //시작인덱스가 3이고, 15개의 길이만큼 파일로 내보낸다.
        oStream.write(data, 3, 15);
        oStream.flush();
        System.out.println("파일이 저장되었습니다.");
        
        oStream.close();
    }

}
