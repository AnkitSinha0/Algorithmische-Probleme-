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
// class Solution {
//     public ListNode reverseKGroup(ListNode head, int k) {
        
//     ListNode dummyNode = new ListNode(0);
//     ListNode preGrp = dummyNode;
//     dummyNode.next  = head;
//     ListNode curr = head;;
//     int cnt = 0;
//     while(curr!=null){
//         cnt++;
//         curr=curr.next;
//     }
//    curr = dummyNode.next;
//     int limit = cnt/k;
//     for(int i = 0 ; i < limit ; i++){
//         int it = 0;
//         preGrp.next = curr;
//         ListNode prev = null;
//         ListNode endGrp = curr;
//         while(it < k){
//             ListNode temp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = temp;
//             it++;

            
//         }
//         preGrp.next = prev;
//         preGrp = endGrp;
//     }

//     if(curr!=null){
//         preGrp.next = curr;
//     }

//     return dummyNode.next;
//     }

// }
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
    ListNode dummyNode = new ListNode(0);
    dummyNode.next = head;
    ListNode curr = head;
    ListNode preGrp = dummyNode;

    while(true){
     
     ListNode check = curr;
     for(int i = 0 ; i < k ; i++){
        if(check==null){
            return dummyNode.next; 
        }
        check=check.next;
     }
     ListNode prev = null;
     ListNode endGrp = curr;
    
     for(int i = 0 ; i < k ; i++){
     ListNode temp = curr.next;
     curr.next = prev;
    prev = curr;
    curr = temp;

     }

     preGrp.next = prev;
     preGrp = endGrp;
     endGrp.next = curr;

    }

    
    }

}

// recursion way is left