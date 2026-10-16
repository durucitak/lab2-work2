// DeleteMiddleDemo.java

/**
 * DeleteMiddleDemo.java
 *
 * Tests deleting the middle node of a singly linked list.
 */
public class DeleteMiddleDemo {

    public static void main(String[] args) {

        System.out.println("=== Delete Middle Node Demo ===\n");

        // -------------------------------------------------------
        // Test 1: Odd number of nodes
        System.out.println("Original List 1:");

        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.display();

        System.out.println("After deleting middle:");
        list1.deleteMiddle();
        list1.display();
        System.out.println();

        // -------------------------------------------------------
        // Test 2: Even number of nodes
        System.out.println("Original List 2:");

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.display();

        System.out.println("After deleting middle:");
        list2.deleteMiddle();
        list2.display();
        System.out.println();

        // -------------------------------------------------------
        // Test 3: One node
        System.out.println("Original List 3:");

        SinglyLinkedList list3 = new SinglyLinkedList();
        list3.add(999);
        list3.display();

        System.out.println("After deleting middle:");
        list3.deleteMiddle();
        list3.display();

    }
}