public class middleLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node middlNode(Node head){   //TC : O(n), SC : O(1)
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == null){
                return slow;
            }
        }
        return slow;
    }
    public static void main(String[] args) {
           Node head = new Node(1);
           head.next = new Node(2);
           head.next.next = new Node(3);
           head.next.next.next = new Node(4);
           head.next.next.next.next = new Node(5);
           head.next.next.next.next.next = new Node(6);

           Node mid = middlNode(head);
           System.out.println(mid.data);

        
    }
}

