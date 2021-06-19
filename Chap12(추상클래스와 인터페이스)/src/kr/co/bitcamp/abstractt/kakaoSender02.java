package kr.co.bitcamp.abstractt;

public abstract class kakaoSender02 extends ContentSender{       //kakaosender02에 빨간줄이 뜨는 건, 생성자가 없기때문
    
    private String content;

    //오버로딩해서 조상클래스 생성자 추가
public kakaoSender02(String title, String name, String content) {
    super(title, name);
    this.content = content;
}


 @Override
    public void sendMessage(String content) {

    }
    
    

}
