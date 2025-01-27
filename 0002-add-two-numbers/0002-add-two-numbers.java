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
                // 결과를 저장할 더미 노드 생성
        ListNode dummy = new ListNode(0);
        ListNode current = dummy; // 현재 노드를 가리키는 포인터
        int carry = 0; // 올림값 초기화

        // l1과 l2를 순회하면서 더하기
        while (l1 != null || l2 != null || carry != 0) {
            // l1과 l2의 현재 노드 값 더하기 (null이면 0으로 처리)
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sum / 10; // 올림값 계산
            current.next = new ListNode(sum % 10); // 현재 자릿수 결과 저장
            current = current.next; // 다음 노드로 이동

            // l1과 l2를 다음 노드로 이동
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // 더미 노드의 다음 노드가 결과의 시작점
        return dummy.next;
    }
}