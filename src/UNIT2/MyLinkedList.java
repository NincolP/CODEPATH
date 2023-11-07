package UNIT2;

import java.security.PublicKey;

public class MyLinkedList {

    private Link first;            // ref to first link on list

    private Link last;

    private int size;


    // -------------------------------------------------------------
    public MyLinkedList()              // constructor
    {
        first = null;               // no links on list yet

    }

    public  MyLinkedList(Link head) {
        first = head;
    }
    // -------------------------------------------------------------
    public boolean isEmpty() {

        return(first ==null);
    }   //Returns true if first is null, meaning it does not point
    //to anything yet

    public void insertFirst(int value)
    {                           // make new link
        Link newLink = new Link(value);
        newLink.next = first;       // it points to old first link
        first = newLink;            // now first points to this

        size++;
    }



    public void removeDup () {
        Link current = first;

        while(current != null && current.next != null) {
            while(current.data == current.next.data) {
                current.next = current.next.next;
            }
            current = current.next;
            current.next = current.next.next;

        }
    }

    //Display the list
    public void displayList()      {
        Link current = first;       // start at beginning of list
        System.out.print("[");
        while(current != null)      // until end of list,
        {
            current.displayLink();   // print data
            System.out.print("-->");
            current = current.next;  // move to next link
        }
        System.out.print("]");
        System.out.println();// spacing between lines for multiple calls of this method
        System.out.println();
    }

    public void displayWithHead(Link current) {
        System.out.print("[");
        while(current != null)      // until end of list,
        {
            current.displayLink();   // print data
            System.out.print("-->");
            current = current.next;  // move to next link
        }
        System.out.print("]");
        System.out.println();// spacing between lines for multiple calls of this method
        System.out.println();
    }

    public Link reverse () {
        //Initiate previous and current nodes. Initially previous is initiated to point to null
        Link previous = null;
        Link current = first;

        while(current != null) {
            //Need to capture the next node before we point current.next to previous
            Link nextNode = current.next;

            //Pointing next backwards
            current.next = previous;

            //Move nodes forward
            previous = current;
            current = nextNode;
        }
        //previous will end up being the new first at the end of the while loop. THis is what we are returning.
        return previous;
    }

    public Link removeValue(int v) {
       Link dummy = new Link(0);
       dummy.next = first;
       Link current = dummy;
       while (current.next!= null) {
           if (current.next.data == v)
               current.next = current.next.next;
           else
               current = current.next;
       }
        return dummy.next;
    }

}
