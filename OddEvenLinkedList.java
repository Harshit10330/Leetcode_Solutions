class Solution {
    public ListNode oddEvenList(ListNode head) {
        // Edge cases
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            // Link odd nodes
            odd.next = even.next;
            odd = odd.next;

            // Link even nodes
            even.next = odd.next;
            even = even.next;
        }

        // Append even list after odd list
        odd.next = evenHead;

        return head;
    }
}