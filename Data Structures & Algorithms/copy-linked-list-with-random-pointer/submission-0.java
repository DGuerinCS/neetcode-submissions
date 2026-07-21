/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Map<Node, Node> nodeMap = new HashMap<Node, Node>();
        Node tmp = head;
        while(tmp!=null){
            Node copy = new Node(tmp.val);
            nodeMap.put(tmp,copy);
            tmp = tmp.next;
        }
        Node headCopy = nodeMap.get(head);
        tmp = head;
        Node copy = nodeMap.get(tmp);
        while(tmp!=null){
            copy = nodeMap.get(tmp);
            copy.random = nodeMap.get(tmp.random);
            copy.next = nodeMap.get(tmp.next);
            tmp = tmp.next;
        }

        return headCopy;
    }
}
