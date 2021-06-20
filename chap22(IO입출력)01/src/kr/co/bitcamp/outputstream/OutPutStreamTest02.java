package kr.co.bitcamp.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutPutStreamTest02 {

    public static void main(String[] args) throws Exception {
        
     
        OutputStream oStream = new FileOutputStream("C:\\Users\\bitcamp\\eclipse-workspace\\write2.txt");
            
            //인코딩
            byte[] data = "ABC가나다".getBytes();
            
            /*
             * getByte()을 사용할 때, 매개변수 값을 ㅗ캐릭ㅌ ㅓ셋을 줄수가 없는데
             * UTF-8은 한글을 3바이트로 인식, EUC-KR, X-window949는 한글을 2바이트로 인식한다.
             * ISO8859-1 캐릭터 셋에서는 한글을 1바이트로 인식한다.
             */
            
            System.out.println("data 바이트 배열의 크기: " + data.length);
        
            /*
             * 바이트 배열을 한번에 스트림에 보낸다.
             * 앞서 write(int b)메서드에 비해서 훨씬 효율적이다.
             */
           
            oStream.write(data);
            oStream.flush();
            System.out.println("저장이 완료되었습니다.");
            System.out.println();
            
            //출려으로 내보낸 파일인 "write2.txt"파일을 읽어들이기 위해서 객체를 생성함
            InputStream iStream =
                    new FileInputStream("C:\\Users\\bitcamp\\eclipse-workspace\\write2.txt");
            
            //읽어들일 값 저장할 "count"
            int count;
            
            //UTF-8은 한글이 한 글자당 3바이트이므로 바이트 배열 사이즈를 3바이트로 지정
            byte[] readBytes = new byte[3];
            int i =0;
            
            while((count = iStream.read(readBytes)) != -1) {
                i++;
                
                String str = new String(readBytes);         //사람이 읽어들이기(디코딩) String을 써서...
                System.out.println("읽은 값: " + str);
                System.out.println("읽은 바이트 수: " + count);
                
            }
            System.out.println("루핑 수: " + i);
            
            iStream.close();
            oStream.close();
    }
}
    