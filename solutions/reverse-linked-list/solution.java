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
        if(head == null) return null;
     ListNode prev = head;
     ListNode next = head.next;
     prev.next = null;
     while(next != null){
        ListNode temp = next.next;
        next.next = prev;
        
        prev = next;
        next = temp;
     
     }
     return prev; 
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