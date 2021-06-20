package kr.co.bitcamp.inputstream;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodingDcodingTest {
    public static void main(String[] args) throws Exception {
        
        String hangul = "한글";
        String[] encodings = new String[] {"x-windows-949", "EUC-KR", "UTF-8","ISO8859-1"};
        String[] encoded = new String[4];
        
        //encoding --> byte 단위로 변환하는 방법
        for(int i=0; i<encodings.length; i++) {
           //인코딩(기계가 이해하는 쪽으로 변환)
         encoded[i] = URLEncoder.encode(hangul, encodings[i]);
         System.out.println(encodings[i] + "으로 인코딩된 값:" + encoded[i]);
        
        
        }
        
        String[] decoded = new String[4];
        for(int i =0; i<encodings.length; i++) {
            //디코딩(사람이 이해하는 쪽으로 변환)
            decoded[i] = URLDecoder.decode(encoded[i], encodings[i]);
            System.out.println(decoded[i] + "으로 디코딩된 값:" + decoded[i]);
        
        }
        
     }

}
