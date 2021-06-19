package kr.co.bitcamp.abstractt;

public class SmsSender extends ContentSender{
    
    private String content;

    public SmsSender(String title, String name, String content) {
        super(title, name);
        this.content = content;
    }
    
    public String getContent() {
        return this.content;
    }
    
    @Override
    public void sendMessage(String recipient) {
        System.out.println("제목 : " + this.getTitle());
        System.out.println("이름 : " + this.getName());
        System.out.println("내용 : " + this.getContent());
        System.out.println("받는사람2 : " + recipient);
      
    }

    @Override
    public void sendMessage2(String content) {
       
        
    }
    
}
