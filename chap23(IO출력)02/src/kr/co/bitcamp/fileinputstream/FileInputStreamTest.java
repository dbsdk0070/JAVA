package kr.co.bitcamp.fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamTest {

    public static void main(String[] args) throws Exception {
        
        File file =
                new File("C:\\Users\\bitcamp\\eclipse-workspace\\chap23(IO출력)02\\src\\kr\\co\\bitcamp\\fileinputstream\\FileInputStreamTest.java");
        System.out.println("파일의 경로: " + file.getPath());
        System.out.println("부모 디렉토리" + file.getParent());
        System.out.println("실행 가능한가: " + file.canExecute());
        System.out.println("읽기 가능한가: " + file.canRead());
        System.out.println("숨김 파일인가:" + file.isHidden());
        System.out.println("쓰기나 수정이 가능한가: " + file.canWrite());
        System.out.println("파일 이름: " + file.getName());
        System.out.println("파일 크기:" + file.length());
        System.out.println("URI:" + file.toURI());
        
        FileInputStream fis = new FileInputStream(file);
        int data;
        int i=0;
        byte[] bArr = new byte[1000];
        //한 바이트씩 읽기
        while((data = fis.read(bArr))!= -1) {
            System.out.write(bArr);
            
            i++;
        }
        
        System.out.println("루핑 수:"+i);
        fis.close();
        
        
        
        
    }

}
