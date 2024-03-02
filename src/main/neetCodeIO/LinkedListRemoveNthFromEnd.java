package main.neetCodeIO;

import java.util.LinkedList;
import java.util.List;

public class LinkedListRemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode firstPointer = dummy;
        ListNode secondPointer = dummy;

        for (int i = 0; i < n; i++) {
            secondPointer = secondPointer.next;
        }

        while (secondPointer.next != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

        firstPointer.next = firstPointer.next.next;

        return dummy.next;
    }
}
