package kr.co.bitcamp.abstractt;

public class SenderTest {
    public static void main(String[] args) {
    
      // 추상클래스이니 절대 인스턴스를 생성할수가 없음.  
      // ContentSender contentSender = new ContentSender("안녕","안녕하세요");
        
        //추상클래스도 조상이니까 필드의 다형성
        ContentSender contentSender = new kakaoSender("카카오톡", "남윤아", "안녕 해피바이러스!");
        contentSender.sendMessage("박지선");
        System.out.println();
        
        ContentSender contentSender2  = new SmsSender("SMS", "박성광","내 귀하고 씩씩했던 삶!");
        contentSender2.sendMessage("박지선");
      }
    
    
    
}
