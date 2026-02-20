package org.example.linkedlistproblems;

public class Linkedlistt<E> {

    Node head;
    Node tail;

    void add(int val)
    {
        Node newnode=new Node(val);

        if(head==null)
        {
            head=newnode;
            tail=head;
        }else{


            tail.next=newnode;

            tail=newnode;

        }

    }

    void deletelast()
    {
        Node temp=head;
        Node lasttemp=head;
        while(temp.next!=null)
        {

            if(temp.next==null)
            {
                lasttemp.next=null;
            }
            temp=lasttemp;
            temp=temp.next;
        }
    }

    void insertAt(int k,int val){
        Node newNode=new Node(val);
        Node dummy=head;
        int i=0;
        while(i<k+1)
        {
            if(i==k-1)
            {
                Node temp=dummy.next;
                dummy.next=newNode;
                newNode.next=temp;
            }
            dummy=dummy.next;
        }
        display(head);

    }

    void display(Node head){

        Node dummy=head;

        while(dummy!=null)
        {
            System.out.println(dummy.val);
            dummy=dummy.next;
        }
    }

    void removeNthnodefromEndoflist(int k)
    {
        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

        // Move fast pointer k steps ahead
        for (int i = 0; i < k; i++) {
            fast = fast.next;
            if (fast == null) {
                throw new IllegalArgumentException("k is greater than list length");
            }
        }

        // Move both pointers until fast reaches the last node
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete node
        slow.next = slow.next.next;

        // Update head
        head = dummy.next;
    }

    public static int[] addtwonumInLinkedLists(Linkedlistt head1,Linkedlistt head2)
    {
        //find size of linkedlist
        Node temp=head1.head;
        int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;

        }
        //create list
        int[] anslist=new int[size];
        //Two linked lists represent numbers in reverse order. Add them and return the sum as a list.
        int i=0;
        Node temp1=head1.head;
        Node temp2=head2.head;
        while(i<size)
        {

            int val= temp1.val+ temp2.val;
            anslist[i]=val;

            i++;
            temp1=temp1.next;
            temp2=temp2.next;

        }
        return anslist;
    }
    public static Node reverselinkedlist(Linkedlistt l1)
    {
        Node temp=l1.head;
        Node prev=null;

        while(temp!=null)
        {
            Node next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }

    public static int findmidofLinkedlist(Linkedlistt<Integer> l1)
    {
        Node slow=l1.head;
        Node fast=l1.head;

        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow.val;
    }

}
class Node{

    int val;
    Node next;

    Node(int val)
    {
        this.val=val;
        this.next=null;
    }
}
