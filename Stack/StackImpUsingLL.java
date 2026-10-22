package Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackImpUsingLL {
    Node top;
    int size = 0;

    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    int pop() {
        if (top == null) {
            System.out.println("stack is empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        size--;
        return value;
    }

    int peek() {
        if (top == null) {
            System.out.println("stack is empty");
            return -1;
        }
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }

    int size() {
        return size;
    }

    public static void main(String[] args) {
        StackImpUsingLL s = new StackImpUsingLL();
        s.push(1);
        s.push(3);
        s.push(5);
        s.push(7);
        s.push(9);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.size());

    }
}
