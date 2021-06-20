package kr.co.bitcamp.writer;
import java.io.FileWriter;
import java.io.IOExcepton;
import java.io.Writer;
public class writerTest02 {
public static void main(String[] args) {
    
    Writer writer = new FileWriter("C:\\Users\\bitcamp\\eclipse-workspace\\test7.txt");
    char[] str = "신사임당".toCharArray();
    String str = "안녕하ㅔ요. 지금 자바 IO간의 기번의 입출력을 공부하고 있어요.";
    
            
    //write()매개변수가 String 타입 => String 파일에 그대로 저장하게 된다.        
    writer.write(str, 1, 4);    //문자열 2번째 인덱스부터 10개의 문자를 파일로 저장하기
    writer.(str);
    System.out.println("파일이 생성되었습니다.");
    writer.close();
    
    
}

}
