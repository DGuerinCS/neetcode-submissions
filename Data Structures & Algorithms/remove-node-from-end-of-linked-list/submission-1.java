/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode laggy = head;
        ListNode first = head;
        int c = 0;
        while(c < n){
            first = first.next;
            c++;
        }
       if (first == null) {
            return head.next;
        }
        while(first.next!=null){
            first = first.next;
            laggy = laggy.next;
        }
        laggy.next = laggy.next.next;
        return head;
    }
}
