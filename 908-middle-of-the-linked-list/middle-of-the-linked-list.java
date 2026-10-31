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
    public ListNode middleNode(ListNode head) {
        int count = 0;

        ListNode currNode = head;
        while( currNode.next != null){
            count++;
            currNode = currNode.next;
        }
    
        ListNode curr = head;
        int mid = count/2;
        for(int i = mid ; i < count ; i++){
        curr = curr.next;
    }
    return curr;
    }
}