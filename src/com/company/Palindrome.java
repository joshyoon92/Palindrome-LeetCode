package com.company;
import java.util.LinkedList;

public class Palindrome {
    public boolean isPalindrome(LinkedList head){
        LinkedList reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }
    public LinkedList reverseAndClone(LinkedList node) {
        LinkedList head = null;
        while (node != null) {
            LinkedList n = new LinkedList(node.val);
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }
    public boolean isEqual(LinkedList one, LinkedList two) {
        while (one != null && two != null) {
            if (one.val != two.val) {
                return false;
            }
            one = one.next;
            two = two.next;
        }
        return one == null && two == null;
    }
}
