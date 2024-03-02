package main.neetCodeIO;

public class LinkedListReverse {


    // stack can be used but there is a more efficient way
    public ListNode reverseList(ListNode head) {

        ListNode previousNode = null;
        ListNode currNode = head;

        while (currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = previousNode;
            previousNode = currNode;
            currNode = nextNode;
        }

        head = previousNode;

        return head;
    }
}
