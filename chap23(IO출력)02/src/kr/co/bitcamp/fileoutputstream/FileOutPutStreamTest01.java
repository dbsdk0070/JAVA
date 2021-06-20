package kr.co.bitcamp.fileoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;

public class FileOutPutStreamTest01 {
public static void main(String[] args) throws Exception {
    //파일 복사를 하기 위해 경로를 설정
    String originFileName = "C:\\Users\\bitcamp\\eclipse-workspace\\chap23(IO출력)02\\src\\kr\\co\\bitcamp\\fileoutputstream\\earth_and_moon-Universe_Photography_Wallpaper_1366x768.jpg";
    String targetFileName = "C\\Temp\\earth.jpg";
    
    File file = new File(originFileName);
    FileInputStream fis = new FileInputStream(file);                    //파일로부터 데이터를 복사(입력)
    FileOutputStream fos = new FileOutputStream(targetFileName);        //복사한 파일출력
    
    int readByteCount;
    int i =0;
    byte[] bArr = new byte[100];
 
    long startTime = System.currentTimeMillis();
    
    while((readByteCount = fis.read(bArr)) != -1);{
        fos.write(bArr, 0, readByteCount);                              //읽은 바이트 수만큼 출력리스트림으로 보내는 것
        i++;
    }
    fos.flush();
    long endTime = System.currentTimeMillis();                          //복사 종료 시점 저장한다.
    
    System.out.println("총 루핑수: " + i);
    System.out.println("복사 시간: " + (endTime - startTime) + "ms");
    System.out.println("복사한 파일 크기: " + (file.length()/1024));
    
    fos.close();
    fis.close();
    System.out.println(file.getName() + "파일의 복사가 완료되었습니다.");
       }
}
