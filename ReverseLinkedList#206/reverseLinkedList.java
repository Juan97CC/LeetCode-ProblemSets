/**
 * Definition for singly-linked list node
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    static ListNode reverseList(ListNode head) {
        // Solution code here
        ListNode current = head;
        ListNode prev = null;

        while (current != null){
            ListNode temp = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = temp; // Move to next node    
        }


        return prev;
    }

     public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode reversedHead = reverseList(head);
        
      
        ListNode current = reversedHead;
        while (current != null) {
            System.out.print( current.val + ", ");
            current = current.next;
        }
}
}
