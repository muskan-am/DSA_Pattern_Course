public class linkedLCycle {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static  boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;


            
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        int[] arr = {1};
        int pos = -1;

        Node head = new Node(arr[0]);
        Node current = head;

        Node cycleNode = null;
        if(pos == 0) cycleNode = head;

        for(int i=1; i<arr.length; i++){
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            current = newNode;

            if(i == pos){
                cycleNode = newNode;
            }
        }
        //create cycle(Only if pos != -1)
        if(pos != -1){
            current.next = cycleNode;
        }

        boolean result = hasCycle(head);
            System.out.println(result);
        
    }
}
