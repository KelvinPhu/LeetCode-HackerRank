import java.util.LinkedList;

/**
 * 
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example 1:
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * 
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 * 
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * 
 * Solution
 * - create a new LinkedList to store the sum
 * - create head node same value with the new linkedList just create
 * - traverse to each LinkedList
 * - sum of each list val and carry
 * - calculate carry by sum / 10
 * - add head to the new LinkedList by sum % 10 and move to next node
 * - check if list1 or list2 is not null then add the value to sum
 * - check if carry is not 0 then add the carry to the new LinkedList
 * - return next node of head
 * 
 */

// create ListNode
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode naxt) {
        this.val = val;
        this.next = next;
    }

}

public class AddTwoNumbers {
    public ListNode addTwoNumber(ListNode l1, ListNode l2) {
        // create a new LinkedList to store the sum
        ListNode l3 = new ListNode(0);

        // create head node same value with the new linkedList just create
        ListNode head = l3;

        int carry = 0;

        // traverse to each LinkedList
        while (l1 != null && l2 != null) {
            // sum of each list val and carry
            int sum = l1.val + l2.val + carry;

            // calculate carry by sum / 10
            carry = sum / 10;

            // add head to the new LinkedList by sum % 10 and move to next node
            l3.next = new ListNode(sum % 10);
            l3 = l3.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        // check if list1 or list2 is not null then add the value to sum
        while (l1 != null) {
            int sum = l1.val + carry;
            carry = sum / 10;
            l3.next = new ListNode(sum % 10);
            l3 = l3.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = l2.val + carry;
            carry = sum / 10;
            l3.next = new ListNode(sum % 10);
            l3 = l3.next;
            l2 = l2.next;
        }

        // check if carry is not 0 then add the carry to the new LinkedList
        if (carry != 0) {
            l3.next = new ListNode(carry);
        }

        // return next node of head
        return head.next;
    }
}
