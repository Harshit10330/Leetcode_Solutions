class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            int gcdValue = gcd(current.val, current.next.val);

            // Create a new node with gcd value
            ListNode newNode = new ListNode(gcdValue);

            // Insert it between current and current.next
            ListNode nextNode = current.next;
            current.next = newNode;
            newNode.next = nextNode;

            // Move to the next original node
            current = nextNode;
        }

        return head;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}