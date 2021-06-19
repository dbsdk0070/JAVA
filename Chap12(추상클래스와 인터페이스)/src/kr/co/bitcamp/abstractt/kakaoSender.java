package kr.co.bitcamp.abstractt;

public class kakaoSender extends ContentSender {

   private String content;


   public kakaoSender(String title, String name, String content) {
    super(title, name);
    this.content = content;
}
   
   public String getContent() {                 //get을 사용해 참조할 수 있게 만듦
       return this.content;
   }
   
   
   //조상클랫의 추상메서드를 오버라이딩 함
    @Override
        public void sendMessage(String recipient) {
            System.out.println("제목 : " + this.getTitle());
            System.out.println("이름 : " + this.getName());
            System.out.println("내용 : " + this.getContent());
            System.out.println("받는사람 : " + recipient);
            
            
        }
   
    @Override
        public void sendMessage2(String content) {
            // TODO Auto-generated method stub
            
        }

}
