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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        ListNode curr = dummy.next;
        int cnt  = 0;
        while(curr!=null){
            cnt++;
            curr = curr.next;
        }
        if(cnt == k || k % cnt  == 0 ){ return head;}
        for(int i = 0 ; i < k % cnt ; i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next =null;
        fast.next = dummy.next;
        dummy.next = temp;
        return dummy.next;
    }
}