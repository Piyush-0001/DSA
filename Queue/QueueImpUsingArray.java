package Queue;

public class QueueImpUsingArray {
    int[] arr;
    int start = -1;
    int end = -1;
    int curSize = 0;
    int size;
    QueueImpUsingArray(int size){
        this.size = size;
        arr = new int[size];
    }
    // Add element
    void offer(int value){
        if(curSize == size){
            return ;
        }
        else if(curSize == 0){
            start = 0; end = 0;
            arr[start] = value;
            curSize++;
            
        }else{
            end = (end + 1) % size;
            arr[end] = value;
            curSize++;
        }
    }
    // Remove and return front
    int poll(){
        if(curSize == 0){
            return -1;
        }
        int value = arr[start];
        start = (start + 1) % size;
        curSize--;
        return value;
    }
    // View front without removing
    int peek(){
        if(curSize == 0){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[start];
    }
    boolean isEmpty(){
        return curSize == 0;
    }
    boolean isFull(){
        return curSize == size;
    }
    int size(){
        return curSize;
    }
    public static void main(String[] args) {
        QueueImpUsingArray q = new QueueImpUsingArray(5);
        q.offer(2);
        q.offer(4);
        q.offer(6);
        q.offer(8);
        q.offer(10);
        q.offer(12);
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        q.offer(12);
        System.out.println(q.isFull());
        System.out.println(q.size());
    }
}
