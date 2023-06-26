package com.learn.problems.lcode;

/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4] Output: [7,0,8] Explanation: 342 + 465 =
 * 807.
 * 
 * 
 * 
 * Input: l1 = [0], l2 = [0] Output: [0]
 * 
 * @author manojkumar
 *
 */
public class AddTwoNumberLinkedList {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		// System.out.println(l1 + " " + l2);

		ListNode addTwoNumbers = addTwoNumbers(l1, l2);

		System.out.println(addTwoNumbers);
		
		ListNode addTwoNumbers2 = addTwoNumbers(l1, l2);
		
		
		System.out.println(addTwoNumbers2);

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int remainder = 0;

		ListNode l3 = null;
		ListNode l4 = l3;

		while (l1 != null) {
			int newVal = l1.val + l2.val;

			if (newVal > 9) {
				int val = newVal % 10;
				val = val + remainder;

				if (val > 9) {
					remainder = val / 10;
					val = val % 10;
				} else {
					remainder = 0;
				}
				remainder = newVal / 10;
				newVal = val;

			} else {

				newVal = newVal + remainder;

			}

			if (l1 != null)
				l1 = l1.next;

			if (l2 != null)
				l2 = l2.next;

			if (l3 == null && l4 == null) {
				l3 = new ListNode(newVal);
				l4 = l3;
				l3.next = new ListNode();
			} else {
				l3.val = newVal;

				if (l1 != null) {
					l3.next = new ListNode();
				}
			}

			l3 = l3.next;

		}

		return l4;
	}

	public static ListNode addTwoNumbersSolution(ListNode l1, ListNode l2) {

		ListNode dummeyHead = new ListNode();
		ListNode current = dummeyHead;
		int carry = 0;

		while (l1 != null || l2 != null || carry != 0) {

			int val1 = (l1 != null) ? l1.val : 0;
			int val2 = (l2 != null) ? l2.val : 0;

			int sum = val1 + val2;

			carry = sum / 10;

			current.next = new ListNode(sum % 10);
			current = current.next;

			if (l1 != null) {
				l1 = l1.next;
			}

			if (l2 != null) {
				l2 = l2.next;
			}

		}

		return dummeyHead.next;
	}
}
