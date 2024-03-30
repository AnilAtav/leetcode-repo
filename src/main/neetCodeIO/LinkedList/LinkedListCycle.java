package main.neetCodeIO.LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        ListNode slwPointer = head;
        ListNode fstPointer = head;

        while (slwPointer != null && fstPointer != null && fstPointer.next != null) {
            slwPointer = slwPointer.next;
            fstPointer = fstPointer.next.next;

            if (slwPointer == fstPointer)
                return true;
        }

        return false;
    }
}
