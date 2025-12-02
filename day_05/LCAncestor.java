


import java.util.*;

class Node {

    int val;
    Node left, right, parent;

    Node(int val) {
        this.val = val;
    }
}

public class LCAncestor {
   
    public Node lowestCommonAncestor(Node p, Node q) {   //TC:O(n), SC:O(n)
        Set<Node> set = new HashSet<>();

        while (p != null) {
            set.add(p);
            p = p.parent;
        }

        while (q != null) {
            if (set.contains(q)) {
                return q;
            }
            q = q.parent;
        }
        return null;
    }

    //build sample tree with parent pointer
    public static Node buildTree(Map<Integer, Node> map) {
        Node n3 = new Node(3);
        Node n5 = new Node(5);
        Node n1 = new Node(1);
        Node n6 = new Node(6);
        Node n2 = new Node(2);

        n3.left = n5;
        n3.right = n1;
        n5.left = n6;
        n5.right = n2;

        // Parent pointers
        n5.parent = n3;
        n1.parent = n3;
        n6.parent = n5;
        n2.parent = n5;

        // Store nodes in map for easy access by value
        map.put(3, n3);
        map.put(5, n5);
        map.put(1, n1);
        map.put(6, n6);
        map.put(2, n2);

        return n3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Node> map = new HashMap<>();
        buildTree(map);

        System.out.print("Enter value of p: ");
        int pVal = sc.nextInt();

        System.out.print("Enter value of q : ");
        int qVal = sc.nextInt();

        Node p = map.get(pVal);
        Node q = map.get(qVal);

        if (p == null || q == null) {
            System.out.println("Invalid input node!");
            return;
        }

        LCAncestor obj = new LCAncestor();
        Node ans = obj.lowestCommonAncestor(p, q);

        System.out.println("Lowest Common Ancestor = " + ans.val);

    }
}
