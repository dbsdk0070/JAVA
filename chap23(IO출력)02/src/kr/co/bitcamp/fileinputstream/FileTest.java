package kr.co.bitcamp.fileinputstream;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileTest {
public static void main(String[] args) throws IOException, Exception {
    
    File directory = new File("C:\\Temp\\directory");
    File file1 = new File("C:\\Temp\\file1.txt");
    File file2 = new File("C:\\Temp\\file2.txt");
    File file3 = new File(new URI("file://C:/Temp/file3.txt"));
    //directory폴더가 존재하느냐?
    if(directory.exists() == false){
        
        /*
         * mkdir() 부모 디렉토리가 없으면 자기 자신의 폴더를 만들고
         *         부모가 있다면 그 안에다가 자신의 폴더를 만든다.
         *         단 부모 폴더가 없을때는 자신의 폴더는 안만들어진다.
         *         
         * mkdirs() 경로상 없는 디렉토리를 다 생서안다.(9권장)    
         */
        
        directory.mkdirs();

    }
    else {
        if(file1.exists() == false) {
            file1.createNewFile();
            System.out.println("file1.txt가 실행되었습니니다.");
            
        }else {
            if(file1.exists() == false) {
                file1.createNewFile();
                System.out.println("file2.txt가 생성되었습니니다.");
                
        }else {
            if(file1.exists() == false) {
                file1.createNewFile();
                System.out.println("file3.txt가 생성되었습니니다.");
    }
    
            File temp = new File("C:\'Users\\bitcamp\\eclipse-workspace");
            //workspace 서브 디렉토리 및 파일을 배열로 만들어서 출력해보자
            File[] contents = temp.listFiles();
            
            System.out.println("날짜\t시간\t\t\t\t형태 크기\t이름");
            
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy- = MM-dd a HH:mm");
                    System.out.println("---------------------------------------------");
                    for(File file : contents) {
                        System.out.println(new Date(file.lastModified()));
                        
                        
                        //file이 디렉토리냐?
                        
                        if(file.isDirectory()) {
                        System.out.print("\t<DIR>\t\t" + file.getName());    
                        }
                        //file이면
                        else {
                            //파일의 크기와 이름을 출력한다.
                            System.out.println("\t\t"+file.length()+"\t"+file.getName());
                        }
                        
                        
                        
                        
                        System.out.println();
                    }
            
    
}
}
}
}
}
    