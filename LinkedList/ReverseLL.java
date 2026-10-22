package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class ReverseLL {
    static Node convertArrToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1; i<arr.length; i++){
            Node n = new Node(arr[i]);
            temp.next = n;
            temp = n;
        }
        return head;
    }
    static Node reverseNode(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;

    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        Node head = convertArrToLL(arr);
        head = reverseNode(head);
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
