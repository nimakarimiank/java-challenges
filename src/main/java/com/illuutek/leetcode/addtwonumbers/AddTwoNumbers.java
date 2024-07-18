package com.illuutek.leetcode.addtwonumbers;

import java.math.BigInteger;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(1, new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))))))) );
        var res = addTwoNumbersStrings(node1, node2);
        System.out.println(res.toString());
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
    private static ListNode addTwoNumbersStrings(ListNode l1, ListNode l2) {
        // Convert linked lists to string representations
        String number1 = convertFromLinkedListToString(l1);
        String number2 = convertFromLinkedListToString(l2);

        // Add the string representations of the numbers
        String resultString = addStrings(number1, number2);

        // Convert the result string back to a ListNode
        return convertStringToListNode(resultString);
    }

    private static String convertFromLinkedListToString(ListNode node) {
        StringBuilder numberBuilder = new StringBuilder();
        while (node != null) {
            numberBuilder.insert(0, node.val); // Prepend digits to preserve order
            node = node.next;
        }
        return numberBuilder.toString();
    }

    private static String addStrings(String number1, String number2) {
        BigInteger convertedNum1 = new BigInteger(number1);
        BigInteger convertedNum2 = new BigInteger(number2);
        return convertedNum2.add(convertedNum1).toString();
    }

    private static ListNode convertStringToListNode(String arg) {
        String numberString =new StringBuilder(arg).reverse().toString();
        ListNode head = null;
        ListNode current = null;
        for (char digitChar : numberString.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            ListNode newNode = new ListNode(digit);
            if (head == null) {
                head = newNode;
                current = head;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }
        return head;
    }

}
