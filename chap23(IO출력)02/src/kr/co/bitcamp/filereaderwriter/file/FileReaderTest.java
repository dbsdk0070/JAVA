package kr.co.bitcamp.filereaderwriter.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTest {
public static void main(String[] args) throws Exception {
    
    File filePath = new File("C:\\Users\\bitcamp\\eclipse-workspace\\chap23(IO출력)02\\src\\kr\\co\\bitcamp\\filereaderwriter\\file\\코로나19 대국민 담화문.txt");
    
    /*
     * XXXReader, XXXWriter 붙는 클래스들 : 문자특화기반 클래스임.
     * 동영상, 그림, 오디오 등 이진파일을 읽을 수 없음.
     */
    
    FileReader fReader = new FileReader(filePath);
    
    int readCharNo;
    int i =0;
    char[] cArr = new char[100];                        //200바이트
    while(readCharNo = fReader.read(cArr)) != -1){
        String str = new String(cArr, 0, readCharNo);
        System.out.println(str);
        i++;
    }
System.out.println();
System.out.println("루핑 수 : " + i);
    fReader.close();
}
}
