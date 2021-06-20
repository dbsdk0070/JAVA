package kr.co.bitcamp.filereaderwriter.file;

import java.io.File;
import java.io.FileWriter;

public class FileWriterTest {

    public static void main(String[] args) {
       
        File file = new File("C:/Temp/abc.txt");
        //FileWriter = fWriter = new FileWriter(file);                //내용이 계속 덮어써진다.
        
        FileWriter fWriter = new FileWriter(fiel, true);
        
        fWriter.write("FileWriter 클래스로 보낸 내용입니다." + "\r\n");
        fWriter.write("FileWriter 클래스로 다시 보낸 내용입니다." + "\r\n");
        fWriter.flush();
        System.out.println(file.getName() + "이 생성되었습니다.");
                
        fWriter.close();
    }

}















