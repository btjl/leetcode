// 1 - Recursion

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode newHead = this.reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}

/**
 * Big-O
 * - Time complexity: O(n) - We have to visit all nodes in the linked list.
 * - Space complexity: O(n) - Recursion call stack will contain (n-1) stack frames when we reach the tail of the linked list.
 */