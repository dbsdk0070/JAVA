package kr.co.bitcamp.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
public static void main(String[] args) {
    
    Queue<Message> queue = new LinkedList<>();
    queue.offer(new Message("sendMail","최지만"));
    queue.offer(new Message("sendSMS", "류현진"));
    queue.offer(new Message("sendkakaotalk", "추신수"));
    queue.offer(new Message("sendFackBook","박찬호"));
    
    while(!queue.isEmpty()) {
        Message message = queue.poll();
        System.out.println(queue.size());
        
        switch(message.getCommand()) {
        case"sendMail":
            System.out.println(message.getTo()+"에게 메일을 보낸다.");
            break;
        case"sendSMS":
            System.out.println(message.getTo()+"에게 SMS를 보낸다.");
            break;
        case"sendkakaotalk":
            System.out.println(message.getTo()+"에게 카카오톡을 보낸다.");
            break;
        case"sendFackBook":
            System.out.println(message.getTo()+"에게 페이스북을 보낸다.");
            break;
        
        }
    }
    
    
    
    
}
}
