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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy; // 현재 노드를 가리키는 포인터
        int carry = 0; // 올림값 초기화

        // l1과 l2를 순회하면서 더하기
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            // l1이 null이 아니면 현재 노드 값을 더하고 다음 노드로 이동
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // l2가 null이 아니면 현재 노드 값을 더하고 다음 노드로 이동
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }
}