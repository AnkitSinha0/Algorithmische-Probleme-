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
    public ListNode reverseList(ListNode head) {
        return reCur(head);
    }
    public ListNode reCur(ListNode head){
       ListNode curr = head;

       if(curr == null || curr.next == null){
        head = curr;
        return head;

       }
       head = reCur(head.next);
       
       curr.next.next = curr;
       curr.next = null;
       return head;

    }
    
}
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         return reverse(head);
//     }
//     public ListNode reverse(ListNode head){
//        ListNode prev = null;
//        ListNode curr = head;
//        while(curr!=null){
//         ListNode next = curr.next;
//         curr.next = prev;
//         prev = curr;
//         curr = next;

//        }
//        return prev;
//     }
    
// }