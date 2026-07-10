public class Day5 {
    public static boolean detectChain(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    static class Node {
        int value;
        Node next;
    }

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
        
        myNode3.next =myNode2;
        System.out.println(myNode.next.value);

        

        boolean detect = detectChain(myNode);
        System.out.println(detect);
    }
}
