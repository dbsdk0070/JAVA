package kr.co.bitcamp.unsynchronize;

public class UsingToilet extends Thread {
    
    //공유객체
    private Toilet toilet;
    
    public UsingToilet (Toilet toilet, String name) {
        this.toilet = toilet;
        this.setName(name);
        
    }
    
    @Override
    public void run() {
        try {
            this.toilet.Use();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
