package kr.co.bitmap.Object03;

public class Monitor {
    
    // 멤버변수 (필드, 속성)
    String color;                   // 모니터의 색상
    int channel;                    // 채널
    int volume;                     // 볼륨
    boolean power;                  // 전원(on/off)
    
    
    // 멤버메서드 (기능)
    
    public void power() {
        if(!this.power) {
            System.out.println("모니터가 켜졌습니다.");
            this.power = !power;
        }
        else {
            System.out.println("모니터가 꺼졌습니다.");
            this.power = !power;
        }
        
    }
    
    // channelUp()
    
   public void channelUp() {
       this.channel++;
       System.out.println("현재 채널: " + this.channel);
   }
    
   // channelDown()
    
    public void channelDown() {
        this.channel--;
        System.out.println("현재 채널 : " + this.channel);
    
    
    }
    
    //volumeUp
    
    public void volumeUp() {
        System.out.println("현재 볼륨(v) : " +(++this.volume));
    }
    
    public void volumeDown() {
        System.out.println("현재 볼륨 : " + (--this.volume));
    }
   
    public String toString() {
        return "현재 채널 : " +this.channel+
                ", 현재 볼륨 :" +this.volume;
        
        
    }
    
    
}
