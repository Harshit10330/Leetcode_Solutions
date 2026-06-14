class Solution {
    public ListNode partition(ListNode head, int x) {
        // Dummy nodes for the two partitions
        ListNode smallerDummy = new ListNode(0);
        ListNode greaterDummy = new ListNode(0);

        ListNode smaller = smallerDummy;
        ListNode greater = greaterDummy;

        ListNode current = head;

        while (current != null) {
            if (current.val < x) {
                smaller.next = current;
                smaller = smaller.next;
            } else {
                greater.next = current;
                greater = greater.next;
            }

            current = current.next;
        }

        greater.next = null;
        smaller.next = greaterDummy.next;
        return smallerDummy.next;
    }
}