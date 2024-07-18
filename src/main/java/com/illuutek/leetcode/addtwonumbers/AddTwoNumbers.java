package com.illuutek.leetcode.addtwonumbers;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(1, new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))))))) );
        var res = addTwoNumbers(node1, node2);
        System.out.println(res);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var number1 = convertFromLinkedList(l1, 0);
        var number2 = convertFromLinkedList(l2, 0);
        var doubleResult = number2 + number1;
        return convertFromDouble( doubleResult);
    }

    private static ListNode convertFromDouble(long result) {
        var digit = result % 10;
        ListNode nodeResult = new ListNode((int) digit);
        if (result / 10 >= 1) {
            var nextDigit = result / 10;
            nodeResult.next = convertFromDouble(nextDigit);
        }
        return nodeResult;
    }


    private static long convertFromLinkedList(ListNode node, long iter) {
        long sum;
        sum = node.val * (long)Math.pow(10, iter);
        if (node.next != null) {
            iter++;
            var recursive = convertFromLinkedList(node.next, iter);
            sum += recursive;
        }
        return sum;
    }
}
