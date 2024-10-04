public class QueueImplementation {

    int front, rear, capacity;
    int[] queue ;
    QueueImplementation(int c){
         front = 0;
         rear = -1;
         capacity = c;
         queue = new int[capacity];
    }

    void  enqueue(int val){
        if(rear == capacity - 1){
            System.out.println("Queue is full!!");
            return;
        }

        queue[++rear] = val;

    }

    void dequeue(){
        if(front  > rear){
            System.out.println("Queue is empty!");
            return;
        }

        //shift all elements to the left by one position
        for(int i=0; i<rear; i++){
            queue[i] = queue[i+1];
        }
        rear--;
    }

    void display(){
        if(front > rear){
            System.out.println("Queue is empty!");
            return;
        }

        for(int i=front; i<=rear; i++){
            System.out.print(queue[i] + "<-- ");
        }
    }


    public static void main(String[] args) {

        QueueImplementation queue = new QueueImplementation(4);

        queue.display();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.display();



    }
}