package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next1){
        this.data = data;
        this.next = next1;
    }
}

public class LinkedListDeletion {

    static Node convertArrayToLL(int[] a){
        if(a.length == 0){
            return null;
        }
        Node head = new Node(a[0]);
        Node mover = head;
        for(int i=1; i<a.length; i++){
            Node n = new Node(a[i]);
            mover.next = n;
            mover = n;
        }
        return head;
    }

    static Node deleteHead(Node head){
        if(head == null){
            return head;
        }
        head = head.next;
        return head;
    }

    static Node deleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    static Node deleteKthPosition(Node head, int k){
        if (head == null) {
            return head;
        }
        if(k == 1){
            head = head.next;
            return head;
        }
        int count = 0;
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }


    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6};
        Node head = convertArrayToLL(arr);
        head = deleteHead(head);
        head = deleteTail(head);
        head = deleteKthPosition(head, 3);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
