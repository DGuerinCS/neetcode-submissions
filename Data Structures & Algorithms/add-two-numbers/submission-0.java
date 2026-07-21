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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode head = answer;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int a = (l1 !=null) ? l1.val : 0;
            int b = (l2 != null) ? l2.val : 0;
            
            int res = a + b + carry;
            if(res > 9){
                carry = res / 10;  
                res = res % 10;
            }
            else{
                carry =0;
            }
            head.next=new ListNode(res);
            head=head.next;                
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }

        return answer.next;
    }
}
