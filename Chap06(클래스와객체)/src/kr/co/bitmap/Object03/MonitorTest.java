package kr.co.bitmap.Object03;

public class MonitorTest {

    public static void main(String[] args) {
        
        // monitor 참조변수는 리모컨과 같은 것임.
        Monitor monitor = new Monitor();            // 참조변수 만들어짐
        //System.out.println(monitor);
        
        // 토글형식으로 실행됨
        monitor.power();
        monitor.power();
        monitor.power();
        
        System.out.println("--------------------------");
        
        monitor.channel = 5;
        monitor.channelUp();
        monitor.channelUp();
        
        monitor.channelDown();
        monitor.channelDown();
        
        System.out.println("--------------------------");

        monitor.volumeUp();
        monitor.volumeUp();
        
        System.out.println(monitor);
        
        monitor.power();
        
        
    }
}
