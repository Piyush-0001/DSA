package LinkedList;

public class Node {
    int data;
    Node next;

    Node(int data, Node next1) {
        this.data = data;
        this.next = next1;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    static Node covertArraytoLL(int[] a) {
        if (a.length == 0) {
            return null;
        }
        Node head = new Node(a[0]);
        Node mover = head;
        for (int i = 1; i < a.length; i++) {
            Node n = new Node(a[i]);
            mover.next = n;
            mover = n;
        }
        return head;
    }

    static int lengthofLL(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    static boolean searchElemInLL(Node head, int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    static Node deleteHeadNode(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }

    static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    static Node deleteKthPosition(Node head, int k) {
        if (head == null) {
            return head;
        }
        if (k == 1) {
            head = head.next;
            return head;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    static Node insertHead(Node head, int value){
        return new Node(value, head);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // Node n1 = new Node(arr[0]);
        // Node n2 = new Node(arr[1]);
        // n1.next = n2;
        // System.out.println(n1.data);
        // System.out.println(n1.next);
        // System.out.println(n2.data);
        // System.out.println(n2.next);

        Node head = covertArraytoLL(arr);
        head = deleteHeadNode(head);
        head = deleteTail(head);
        head = insertHead(head, 100);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        System.out.println(lengthofLL(head));
        System.out.println(searchElemInLL(head, 3));

        // System.out.println(head.data);
        // System.out.println(head.next);
    }
}
