package LinkedList;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class DLL_Insertion {

    static Node convertArrToDll(int[] a) {
        Node head = new Node(a[0]);
        Node prev = head;
        for (int i = 1; i < a.length; i++) {
            Node n = new Node(a[i], null, prev);
            prev.next = n;
            prev = n;
        }
        return head;
    }

    static Node insertBeforeHead(Node head, int value) {
        Node newNode = new Node(value, head, null);
        head.back = newNode;
        return newNode;
    }

    static Node insertBeforeTail(Node head, int value) {
        if (head.next == null) {
            return insertBeforeHead(head, value);
        }

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node prev = tail.back;
        Node newNode = new Node(value, tail, prev);
        prev.next = newNode;
        tail.back = newNode;
        return head;
    }

    static Node insertBeforeKthElement(Node head, int k, int value) {
        if (k == 1) {
            return insertBeforeHead(head, value);
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k) {
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            return head;
        }
        Node prev = temp.back;
        Node newNode = new Node(value, temp, prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }

    static void insertBeforeNode(Node node, int value){
        Node prev = node.back;
        Node newNode = new Node(value, node, prev);
        prev.next = newNode;
        node.back = newNode;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14 };
        Node head = convertArrToDll(arr);
        head = insertBeforeHead(head, 0);
        head = insertBeforeTail(head, 13);
        head = insertBeforeKthElement(head, 6, 9);
        insertBeforeNode(head.next, 1);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
