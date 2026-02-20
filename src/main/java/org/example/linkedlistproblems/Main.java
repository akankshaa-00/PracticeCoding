package org.example.linkedlistproblems;

import java.util.Arrays;

import static org.example.linkedlistproblems.Linkedlistt.*;

public class Main {

    public static void main(String[] args) {
        Linkedlistt<Integer> ll=new Linkedlistt<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(0);

        //ll.removeNthnodefromEndoflist(2);
        //ll.insertAt(3,99);

        Linkedlistt<Integer> l2=new Linkedlistt<>();
        l2.add(4);
        l2.add(2);
        l2.add(3);

        Linkedlistt<Integer> l3=new Linkedlistt<>();
        l3.add(9);
        l3.add(8);
        l3.add(7);

//        int[] ans=addtwonumInLinkedLists(l2, l3);
//        System.out.println(Arrays.toString(ans));

//        Node reversed=reverselinkedlist(ll);
//
//        while(reversed!=null)
//        {
//            System.out.println(reversed.val);
//            reversed=reversed.next;
//        }

        System.out.println(findmidofLinkedlist(ll));
    }
}
