package kr.co.bitcamp.writer;

import java.io.File;
import java.io.Writer;

public class WriterTest01 {
public static void main(String[] args) {
    
    //toCharArray()묹열을 char[]로 리턴한다.
    char[] str = "이순신".toCharArray();
    System.out.println(str);
    
    Writer writer= new Filewriter("C:\\Users\\bitcamp\\eclipse-workspace\\writer6.txt")){
        for(int i=0; [i]);                      //(덜 효율적)
                System.out.println("루핑 수: " + i);
                
    }
    writer.flush();                             //강제로 버퍼를 비워준다.
System.out.println("파일이 생성되었습니다.");
}
}
