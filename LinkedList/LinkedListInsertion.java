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

public class LinkedListInsertion {

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

    static Node insertHead(Node head, int value){
            return new Node(value, head);
    }

    static Node insertTail(Node head, int value){
        if(head == null){
            return new Node(value);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(value);
        temp.next = newNode;
        return head;
    }

    static Node insertKthPosition(Node head, int value, int k){
        if(head == null){
            if(k == 1){
                return new Node(value);
            }else{
                return null;
            }
            
        }
        if(k == 1){
            return new Node(value, head);
        }
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            if(count == k-1){
                Node newNode = new Node(value);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        } 
        return head;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = convertArrayToLL(arr);
        head = insertHead(head, 10);
        head = insertTail(head, 20);
        head = insertKthPosition(head, 15, 3);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
    }
}
