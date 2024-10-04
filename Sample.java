import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) {
        
        this.data = data;
        this.next = null;
    }
}

 class LinkedList {
    Node head;

       public Node reverseInGroups(Node head, int k) {
        if (head == null || k == 1) return head;
        
        Node dummy = new Node(0);
        dummy.next = head;
        Node prevGroupEnd = dummy;
        Node current = head;

        while (current != null) {
            Node groupStart = current;
            int count = 0;
            
                       while (count < k && current != null) {
                current = current.next;
                count++;
            }
            
                        if (count == k) {
                Node reversedGroup = reverse(groupStart, k);
                prevGroupEnd.next = reversedGroup;
                groupStart.next = current;  
                prevGroupEnd = groupStart;
            }
        }

        return dummy.next;
    }

    
    private Node reverse(Node head, int k) {
        Node prev = null;
        Node current = head;
        Node next = null;
        int count = 0;

        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        
        return prev;      }

 
    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + (node.next != null ? ">" : "NULL\n"));
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
        list.head.next.next.next.next.next.next.next = new Node(8);
        
        System.out.println("Original Linked List:");
        list.printList(list.head);
        

        int k = 3;
        list.head = list.reverseInGroups(list.head, k);
        
        System.out.println("Reversed Linked List in groups of size " + k + ":");
        list.printList(list.head);
    }
}
