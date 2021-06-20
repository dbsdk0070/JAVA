package kr.co.bitcamp.unsynchronize;

public class Toilet {

    //플래스 변수
     private boolean seat;
     
     
     public synchronized void Use() throws Exception  {
         
     String name = Thread.currentThread().getName();
     
            //누군가 화장실에 들어왔을때
     if(this.seat == false) {
         
     
     System.out.println(name +"가/이 화장실에 입장하였습니다.");
     this.seat = true;
     
     Thread.sleep(1000);
     System.out.println(name +"가/이 말: 아 시원하다~~");
  
     this.seat = false;
     System.out.println(name +"가/이 화장실 사용을 마쳤습니다.");
     System.out.println();
     
     }else {
         System.out.println(name +"가/이 화장실 사용중입니다. 기다리세요!");
     }
     
   }
     
}
