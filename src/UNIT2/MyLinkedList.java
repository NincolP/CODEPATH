package UNIT2;

public class MyLinkedList {

    private Link first;            // ref to first link on list

    private Link last;


    // -------------------------------------------------------------
    public MyLinkedList()              // constructor
    {
        first = null;               // no links on list yet

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


    public void displayList()      // display the list
    {
        System.out.println();
        Link current = first;       // start at beginning of list
        while(current != null)      // until end of list,
        {
            current.displayLink();   // print data
            current = current.next;  // move to next link
        }
        System.out.println();// spacing between lines for multiple calls of this method
    }

    public void reverse () {
        Link current = first;

        //This while loop sets the previous node for each node
        while(current.next != null) {
            current.next.previous = current;
            current = current.next;

            if(current.next == null) {
                last = current;
            }
        }

        Link newCurrent = last ;
        //This while loop prints the nodes in reverse
        while(newCurrent != null) {
            System.out.print(newCurrent.data + " ");
            newCurrent = newCurrent.previous;
        }
    }







}
