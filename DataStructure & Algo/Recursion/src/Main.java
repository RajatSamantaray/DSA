import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/* <!--
Copyright (c) $originalComment.match("Copyright \(c\) (\d+)", 1, "-", "$today.year")$today.year NXGN Management, LLC. All Rights Reserved.
--> */// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int l1Length = getNodes(l1, 0);
        int l2Length = getNodes(l2, 0);
        return add(l1, l2, 0);
    }

    public int getNodes(ListNode l, int sum) {
        if (l.next == null) {
            return sum + 1;
        }
        return getNodes(l.next, sum + 1);
    }

    public ListNode add(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 != null) {
            int sum = carry + l2.val;
            if (sum >= 10) {
                sum = (carry + l2.val) % 10;
                carry = (carry + l2.val) / 10;
            } else {
                carry = 0;
            }
            return new ListNode(sum, add(null, l2.next, carry));
        } else if (l2 == null && l1 != null) {
            int sum = carry + l1.val;
            if (sum >= 10) {
                sum = (carry + l1.val) % 10;
                carry = (carry + l1.val) / 10;
            } else {
                carry = 0;
            }
            return new ListNode(sum, add(l1.next, null, carry));
        } else if (l1 != null && l2 != null) {
            int sum = (carry + l1.val + l2.val);
            if (sum >= 10) {
                sum = (carry + l1.val + l2.val) % 10;
                carry = (carry + l1.val + l2.val) / 10;
            } else {
                carry = 0;
            }
            return new ListNode(sum, add(l1 == null ? null : l1.next, l2 == null ? null : l2.next, carry));
        } else {
            if (carry > 0)
                return new ListNode(carry, null);
            else
                return null;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
            } else if (list1.val > list2.val) {
                return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
            } else {
                return new ListNode(list1.val, new ListNode(list2.val, mergeTwoLists(list1.next, list2.next)));

            }

        }
        if (list1 == null && list2 != null) {
            return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
        }
        if (list2 == null && list1 != null) {
            return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
        } else {
            return null;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head != null) {
            if (head.next != null) {

                return swap(head, 0, head.val);
            } else {
                return new ListNode(head.val, null);
            }
        } else {
            return null;
        }
    }

    public ListNode swap(ListNode node, int count, int lastValue) {
        if (node.next == null) {
            count += 1;
            if (count % 2 == 0)
                return new ListNode(lastValue, null);
            else
                return new ListNode(node.val, null);
        }
        count += 1;
        ListNode lNode = null;
        if (count % 2 == 0) {
            return new ListNode(lastValue, swap(node.next, count, lastValue));
        } else {
            return new ListNode(node.next.val, swap(node.next, count, node.val));
        }

    }

    public ListNode reverse(ListNode node) {
        ListNode prevNode = null;
        ListNode curr = node;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = next;
        }
        return prevNode;
    }

    public ListNode recursiveReverse(ListNode node) {

        if (node == null || node.next == null)
            return node;
        ListNode prev = recursiveReverse(node.next);
        node.next.next = node;
        node.next = null;

        return prev;
    }
    public boolean isPalindrome(ListNode head){
        LinkedList<Integer> list = new LinkedList();
        ListNode node1 = head;
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        ListNode reverseHead = recursiveReverse(node1);

       return checkPalindrome(reverseHead,list);
    }
    public boolean checkPalindrome(ListNode node,LinkedList<Integer> list){
        boolean flag = true;
        if(node == null){
            return flag;
        }
        if(node.val == list.removeFirst()){
            flag = true;
        }else{
            return false;
        }
         boolean flag1 = checkPalindrome(node.next,list);
        if(flag1 ==false){
            flag = false;
        }
        return flag;
    }

}


public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(4, node1);
        ListNode node3 = new ListNode(3, node2);
        ListNode node4 = new ListNode(4, node3);
        ListNode node5 = new ListNode(5,node4);
        ListNode node6 = new ListNode(3, node5);
        ListNode node7 = new ListNode(2, node6);
        ListNode node8 = new ListNode(1, node7);
        Solution sol = new Solution();
        System.out.println(node4);
        System.out.println(node7);
        // ListNode x = sol.addTwoNumbers(node4, node7);
        // ListNode x = sol.mergeTwoLists(null,node5);
        // ListNode x = sol.swapPairs(node4);
      //  ListNode x = sol.recursiveReverse(node4);
        boolean out = sol.isPalindrome(node5);
        System.out.println(out);
    }
}