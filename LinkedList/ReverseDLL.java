package LinkedList;

import java.util.Stack;

class Node{
    int data;
    Node next;
    Node back;

    Node(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }

    Node(int data, Node next, Node back){
        this.data = data;
        this.next = next;
        this.back = back;
    }

}

public class ReverseDLL {

    static Node convertArrToDll(int[] a){
        Node head = new Node(a[0]);
        Node prev = head;
        for(int i=1; i<a.length; i++){
            Node n = new Node(a[i], null, prev);
            prev.next = n;
            prev = n;
        }
        return head;
    }

    static Node reverseDll(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node prev = null;
        Node current = head;
        while(current != null){
            prev = current.back;
            current.back = current.next;
            current.next = prev;
            current = current.back;
        }
        return prev.back;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = { 2, 4, 6, 8, 10};
        Node head = convertArrToDll(arr);
        head = reverseDll(head);
        Node temp = head;
        // while(temp != null){
        //     stack.push(temp.data);
        //     temp = temp.next;
        // }

        // temp = head;
        while(temp != null){
            // temp.data = stack.pop();
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
