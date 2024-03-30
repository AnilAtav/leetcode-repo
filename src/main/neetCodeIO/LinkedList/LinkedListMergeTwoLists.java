package main.neetCodeIO.LinkedList;

public class LinkedListMergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode newList = new ListNode(Integer.MIN_VALUE);

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                newList.next = list1;
                list1 = list1.next;
            } else {
                newList.next = list2;
                list2 = list2.next;
            }
            newList = newList.next;
        }

        return newList.next;
    }
}
