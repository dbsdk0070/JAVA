package kr.co.bitcamp.fileoutputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutPutStreamTest02 {

    public static void main(String[] args) throws Exception{
       
        //파일 복사를 하기 위해 경로를 설정
//      String orignFileName = "C:\\Users\\bitcamp\\eclipse-workspace\\chap23(IO출력)02\\src\\kr\\co\\bitcamp\\fileoutputstream\\FileOutPutStreamTest02.java";
//        String orignFileName = "C:\\Users\\bitcamp\\eclipse-workspace\\chap23(IO출력)02\\src\\kr\\co\\bitcamp\\fileoutputstream\\SampleData2.xlsx.java";
//      String targetFileName = "C:/temp/Nature.mp4";
//        String targetFileName = "C:/temp/SampleData2.xlsx";
        String orignFileName = "C:\\Users\\bitcamp\\eclipse-workspace\\chap23(IO출력)02\\src\\kr\\co\\bitcamp\\fileoutputstream\\어서와 자바는 처음이지.ppt.java";
        String targetFileName = "C:/temp/어서와 자바는 처음이지2.ppt";
        
        File file = new File(orignFileName);
        FileInputStream fis = new FileInputStream(file);                //입력
        FileOutputStream fos = new FileOutputStream(targetFileName);    //출력
        
        int readByteCount;
        int i = 0;
        
        //byte[] bArr = new byte[100];
        byte[] bArr = new byte[1000];
        //바이트 배열을 크게 잡을수록 복사시간이 짧아진다.
        long startTime = System.currentTimeMillis();
        
        while((readByteCount = fis.read(bArr)) != -1);{
            fos.write(bArr, 0, readByteCount);                            
        }
        fos.flush();
        long endTime = System.currentTimeMillis();                
        
        System.out.println("총 루핑수: " + i);
        System.out.println("복사 시간: " + (endTime - startTime) + "ms");
        System.out.println("복사한 파일 크기: " + (file.length()/1024));
        
        fos.close();
        fis.close();
        System.out.println(file.getName() + "파일의 복사가 완료되었습니다.");
        

    }

}
