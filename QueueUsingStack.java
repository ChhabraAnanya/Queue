import java.util.*;

public class QueueUsingStack {

     Stack<Integer> s1 = new Stack<Integer>();
     Stack<Integer> s2 = new Stack<Integer>();

    public void enQueue(int x){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        s1.push(x);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int deQueue(){
        if(s1.isEmpty()){
            return -1;
        }
        int x  = s1.peek();
        s1.pop();
        return x;
    }

    public static void main(String[] args) {
        QueueUsingStack queueStack = new QueueUsingStack();
        queueStack.enQueue(1);
        queueStack.enQueue(2);
        queueStack.enQueue(3);
        queueStack.enQueue(4);
    }
}
