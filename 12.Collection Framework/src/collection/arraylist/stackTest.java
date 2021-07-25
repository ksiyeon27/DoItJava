package collection.arraylist;

import java.util.ArrayList;

class Mystack{
    private ArrayList<String> arrayStack = new ArrayList<>();
    
    public void push(String data){
        arrayStack.add(data);
    }

    public String pop() {
        int len = arrayStack.size();
        if (len == 0){
            System.out.println("stack is empty.");
            return null;
        }

        return (arrayStack.remove(len-1));
    }
}
public class stackTest {
    public static void main(String[] args){
        Mystack stack = new Mystack();
        stack.push("김");
        stack.push("시");
        stack.push("연");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
