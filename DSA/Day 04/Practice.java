public class Practice {

    public static void main(String[] args) {
        Node myNode = new Node();
        myNode.value = 10;
        System.out.println(myNode.value);

        Node myNode2 = new Node();
        myNode.next = myNode2;
        myNode2.value = 20;
        System.out.println(myNode.next.value);

        Node myNode3 = new Node();
        myNode2.next = myNode3;
        myNode3.value = 30;
        System.out.println(myNode.next.value);

        Node myNode4 = new Node();
        myNode3.next = myNode4;
        myNode4.value = 40;
        System.out.println(myNode.next.value);

        Node myNode5 = new Node();
        myNode4.next = myNode5;
        myNode5.value = 50;
        System.out.println(myNode.next.value);

        Node middle = middleChain(myNode);
        System.out.println(middle.value);

    }

    public static Node middleChain(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static class Node {
        int value;
        Node next;
    }

    public static void printChain(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}
