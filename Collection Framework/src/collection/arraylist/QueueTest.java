package collection.arraylist;
import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<>();
    public void enQueue(String data){
        arrayQueue.add(data);
    }
    public String deQueue(){
        int len = arrayQueue.size();
        if (len == 0) {
            System.out.println("queue is empty.");
            return null;
        }

        return (arrayQueue.remove(0));
    }
}


public class QueueTest {
    public static void main(String[] args){
        MyQueue queue = new MyQueue();
        queue.enQueue("김");
        queue.enQueue("시");
        queue.enQueue("연");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

    }
    
}
