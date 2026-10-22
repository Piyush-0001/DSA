package Queue;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class QueueImpUsingLL {
    Node start;
    Node end;
    int size = 0;
    void offer(int value){
        Node newNode = new Node(value);
        if(start == null){
            start = newNode;
            end = newNode;
        }else{
            end.next = newNode;
            end = newNode;
        }
        size++;
    }
    int poll(){
        if(start == null){
            System.out.println("queue is empty");
            return -1;
        }
        int value = start.data;
        start = start.next;
        if(start == null){
            end = null;
        }
        size--;
        return value;
    }
    int peek(){
        if(start == null){
            System.out.println("queue is empty");
            return -1;
        }
        return start.data;
    }
    boolean isEmpty(){
        return start == null;
    }
    int size(){
        return size;
    }
    public static void main(String[] args) {
        QueueImpUsingLL q = new QueueImpUsingLL();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
    }

}
