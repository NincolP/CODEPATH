package UNIT2;

public class MyLinkedList {

    private Link first;            // ref to first link on list

    private Link last;

    private int size;


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


    public void displayList()      // display the list
    {
        Link current = first;       // start at beginning of list
        System.out.print("[");
        while(current != null)      // until end of list,
        {
            current.displayLink();   // print data
            current = current.next;  // move to next link
        }
        System.out.print("]");
        System.out.println();// spacing between lines for multiple calls of this method
        System.out.println();
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

    public void removeValue(int v) {
        Link current = first ;
        Link previous;

       for(int i = 0; i < size; ++i) {

           //This takes care of am empty list
           if(size == 0)
               break;

            //This take care of the first item being equal to value and there is a next value that
           //is not null to link as first
           if(first.data == v && first.next != null) {
               first = first.next;
               //System.out.println("first");
           }
            //This takes care of when the only item left is also the value that needs to be deleted.
           else if (first.data == v) {
               first = null;
               //System.out.println("First is the only one");
               //break;
           }
           // This take care of all other cases where there are items
           //before and after that do not have the value we are looking for
           else if (current.next != null) {
               previous = current;
               current = current.next;

               //this take care of the first test case where the value is in the middle
               //and even at the end
           if (current.data == v) {
                   previous.next = current.next;
                   //System.out.println("current");

               }
           }
        }

    }









}
