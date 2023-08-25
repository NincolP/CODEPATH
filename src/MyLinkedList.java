public class MyLinkedList {

    private Node first;            // ref to first link on list

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
        Node newLink = new Node(value);
        newLink.next = first;       // it points to old first link
        first = newLink;            // now first points to this
    }



    public void removeDup () {
        Node current = first;

        while(current.next != null) {
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
        Node current = first;       // start at beginning of list
        while(current != null)      // until end of list,
        {
            current.displayNode();   // print data
            current = current.next;  // move to next link
        }
        System.out.println("");
    }







}
