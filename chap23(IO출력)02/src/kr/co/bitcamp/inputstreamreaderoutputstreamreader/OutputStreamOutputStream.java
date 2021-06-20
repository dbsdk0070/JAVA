package kr.co.bitcamp.inputstreamreaderoutputstreamreader;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamOutputStream {
public static void main(String[] args) throws Exception {
    
    //주 스트링 생성 
    FileOutputStream fStream = new FileOutputStream("C:/Temp/wRITER.TXT");
    
    //보조 스트림 생성
    Writer writer = new OutputStreamWriter(fStream);
    
     String data = "문자데이터를 보조출력스트림으로 보내어 바이트 기변으로 변호되어 저장함";
     writer.write(data); // 보조스트림 즉,문자기반스트링인 OutputStreaWriter로 data를
                         // 보내어 바이트 기반으로 변환시켜주는 역할
     
     
    writer.close();
    fStream.close();
    System.out.println("파일이 저장되었습니다."); 
    }
}





