package com.illuutek.leetcode.addtwonumbers;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2, node1);
        while (isNext(node2)){
            System.out.print("");
        }
    }

    //    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        StringBuilder builder1 = new StringBuilder();
//    }

    private static boolean isNext(ListNode node) {
        return node.next != null;
    }

}
