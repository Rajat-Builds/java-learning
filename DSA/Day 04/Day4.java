public class Day4 {

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

        Node newHead = reverseChain(myNode);
        printChain(newHead);
    }

    public static Node reverseChain(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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
