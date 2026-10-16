// SinglyLinkedList.java

/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 */
public class SinglyLinkedList {

    // Instance variable
    private Node head;

    // Constructor
    public SinglyLinkedList() {
        head = null;
    }

    // use it from Exercise 1
    // Add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // use it from Exercise 1
    // Display the linked list
    public void display() {
        if (head == null) {
            System.out.println("NULL");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // -------------------------------------------------------
    // Delete the middle node
    public void deleteMiddle() {

        // If the list is empty, do nothing
        if (head == null) {
            return;
        }

        // If there is only one node, the list becomes empty
        if (head.next == null) {
            head = null;
            return;
        }

        // Step 1: Count the total number of nodes.
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        // Step 2: Find the node before the middle node.
        // For size N, the middle is at index N/2.
        // We need to stop at index (N/2) - 1.
        int middleIndex = count / 2;
        current = head;
        for (int i = 0; i < middleIndex - 1; i++) {
            current = current.next;
        }

        // change its next reference so that the middle node is removed
        current.next = current.next.next;
    }

    // Get the head
    public Node getHead() {
        return head;
    }
}