package Stack;


public class StackImpUsingArray {
    int[] a;
    int top;
    int capacity;

    StackImpUsingArray(int capacity){
        this.capacity = capacity;
        a = new int[capacity];
        top = -1;
    }

    void push(int value) {
        if (top == capacity - 1) {
            System.out.println("stack overflow");
            return;
        }
        a[++top] = value;
    }

    // Remove top element
    int pop() {
        if (top == -1) {
            System.out.println("stack is empty");
            return -1;
        }
        int value = a[top];
        top--;
        return value;
    }

    // See top element without removing
    int peek() {
        if (top == -1) {
            System.out.println("stack is empty");
            return -1;
        }
        return a[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
    boolean isFull(){
        return top == capacity-1;
    }
    int size(){
        return top + 1;
    }
    public static void main(String[] args) {
        StackImpUsingArray s = new StackImpUsingArray(5);
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);
        s.push(10);
        s.push(12);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        System.out.println(s.size());
    }
}
