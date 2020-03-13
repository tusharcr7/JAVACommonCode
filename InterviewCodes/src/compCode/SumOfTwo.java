package compCode;

import java.util.HashMap;
import java.util.Scanner;

public class SumOfTwo {
	public static void main(String[] args) {

		/*
		 * int x[] = { 1, 2, 5, 11 }; Solution1 objl = new Solution1(); for (int c :
		 * objl.twoSum(x, 7)) { System.out.println(c); }
		 */
		Solution3 obj = new Solution3();
		obj.test();
	}

}

class Solution1 {
	public int[] twoSum(int[] nums, int target) {
		int[] o = new int[2];
		HashMap<Integer, Integer> obj = new HashMap<Integer, Integer>();

		obj.put(nums[0], 0);
		for (int i = 1; i < nums.length; i++) {
			if (obj.containsKey(target - nums[i])) {
				o[0] = obj.get(target - nums[i]);
				o[1] = i;
				break;
			} else {

				obj.put(nums[i], i);
			}

		}
		return o;

	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

class Solution3 {
	public void test() {
		Scanner sc = new Scanner(System.in);
		int xc1 = sc.nextInt();
		int xc2 = sc.nextInt();
		ListNode startl1 = null, currl1 = null, startl2 = null, currl2 = null;
		int countl1 = 0, countl2 = 0;
		while (countl1 != xc1) {
			if (startl1 == null) {

				currl1 = new ListNode(sc.nextInt());
				startl1 = currl1;

			} else {
				currl1.next = new ListNode(sc.nextInt());
				currl1 = currl1.next;
			}
			countl1++;
		}
		while (countl2 != xc2) {
			if (startl2 == null) {

				currl2 = new ListNode(sc.nextInt());
				startl2 = currl2;

			} else {
				currl2.next = new ListNode(sc.nextInt());
				currl2 = currl2.next;
			}
			countl2++;
		}

		ListNode m = addTwoNumbers(startl1, startl2);
		while (m != null) {
			System.out.println(m.val);
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode start = null, curr = null;
		int c = 0, sum = 0;

		while (l1 != null && l2 != null) {
			sum = l1.val + l2.val + c;
			c=0;	
			if ((int) (sum / 10) != 0) {
				c = sum / 10;
				sum = sum % 10;
				ListNode x = new ListNode(sum);
				if (start == null) {
					start = x;
					curr = x;
				} else {
					curr.next = x;
					curr = curr.next;
				}
			} else {
				ListNode x = new ListNode(sum);
				if (start == null) {
					start = x;
					curr = x;
				} else {
					curr.next = x;
					curr = curr.next;
				}

			}
			l1 = l1.next;
			l2 = l2.next;

		}
		while (l1 != null) {
			sum = c + l1.val;
			c = 0;
			if ((int) (sum / 10) != 0) {
				c = sum / 10;
				sum = sum % 10;
				ListNode x = new ListNode(sum);
				if (start == null) {
					start = x;
					curr = x;
				} else {
					curr.next = x;
					curr = curr.next;
				}
			} else {
				ListNode x = new ListNode(sum);
				if (start == null) {
					start = x;
					curr = x;
				} else {
					curr.next = x;
					curr = curr.next;
				}

			}
			l1 = l1.next;
		}
		while (l2 != null) {
			sum = c + l2.val;
			c = 0;
			if ((int) (sum / 10) != 0) {
				c = sum / 10;
				sum = sum % 10;
				ListNode x = new ListNode(sum);
				if (start == null) {
					start = x;
					curr = x;
				} else {
					curr.next = x;
					curr = curr.next;
				}
			} else {
				ListNode x = new ListNode(sum);
				if (start == null) {
					start = x;
					curr = x;
				} else {
					curr.next = x;
					curr = curr.next;
				}

			}
			l2 = l2.next;
		}

		if (c != 0) {
			curr.next = new ListNode(c);

		}
		return start;
	}
}
