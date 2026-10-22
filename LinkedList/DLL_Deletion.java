package LinkedList;

class Node{
    int data;
    Node next;
    Node back;

    Node(int data, Node next, Node back){
        this.data = data;
        this.next = next; 
        this.back = back;
    }
    Node(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }
}
public class DLL_Deletion {
    static Node convertArrToDLL(int[] a){
        Node head = new Node(a[0]);
        Node prev = head;
        for(int i=1; i<a.length; i++){
            Node temp = new Node(a[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    static Node deleteHead(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;

        return head;
    }

    static Node deleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node tail = head; 
        while(tail.next != null){
            tail = tail.next;
        }
        Node temp = tail.back;
        temp.next = null;
        tail.back = null;
        return head;
    }

    static Node deleteKthNode(Node head, int k){
        if(head == null || k <= 0){
            return null;
        }
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            if(count == k){
                break;
            }
            temp = temp.next;
        }
        if(temp == null){
            return head;
        }
        Node prev = temp.back;
        Node front = temp.next;
        if(prev == null && front == null){
            return null;
        }
        else if(prev == null){
            return deleteHead(head);
        }
        else if(front == null){
            return deleteTail(head);
        }
        prev.next = front;
        front.back = prev;

        temp.next = null;
        temp.back = null;
        return head;
    }

    static void deleteNode(Node temp){
        Node prev = temp.back;
        Node front = temp.next;
        if(front == null){
            prev.next = null;
            temp.back = null;
            return ;
        }
        prev.next = front;
        front.back = prev;
        temp.next = temp.back = null;
        return ;
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 11, 13, 15, 17};
        Node head = convertArrToDLL(arr);
        head = deleteHead(head);
        head = deleteTail(head);
        head = deleteKthNode(head, 3);
        deleteNode(head.next.next);
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
    }
}
