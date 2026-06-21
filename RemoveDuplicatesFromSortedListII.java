class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (head != null) {
            // Check if current node is a duplicate
            if (head.next != null && head.val == head.next.val) {
                int duplicateValue = head.val;

                // Skip all nodes with the duplicate value
                while (head != null && head.val == duplicateValue) {
                    head = head.next;
                }

                prev.next = head;
            } else {
                prev = prev.next;
                head = head.next;
            }
        }

        return dummy.next;
    }
}