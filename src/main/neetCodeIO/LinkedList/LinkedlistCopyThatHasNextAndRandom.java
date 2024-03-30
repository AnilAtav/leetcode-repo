package main.neetCodeIO.LinkedList;

import java.util.*;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class LinkedlistCopyThatHasNextAndRandom {

    public Node caller(){
        Node head = new Node(7);
        head.next = new Node(13);
        head.next.next = new Node(11);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(1);

        // Set random pointers
        head.random = null;
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head;

        return copyRandomList(head);
    }

    public Node copyRandomList(Node head) {

        Map<Node,Node> oldToCopy = new HashMap<>();
        Node cur = head;

        while(cur != null)
        {
            Node copy = new Node(cur.val);
            oldToCopy.put(cur,copy);
            cur = cur.next;
        }

        cur = head;
        while(cur != null){
            Node copy = oldToCopy.get(cur);
            copy.next = oldToCopy.get(cur.next);
            copy.random = oldToCopy.get(cur.random);
            cur = cur.next;
        }

        return oldToCopy.get(head);
    }
}
