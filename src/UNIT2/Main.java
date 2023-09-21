package UNIT2;

public class Main {

    public static void main(String[] args) {


      /* MyLinkedList myList = new MyLinkedList();

        myList.insertFirst(9);
        myList.insertFirst(9);
        myList.insertFirst(7);
        myList.insertFirst(5);
        myList.insertFirst(4);
        myList.insertFirst(4);
        myList.insertFirst(4);
        myList.insertFirst(4);
        myList.insertFirst(3);
        myList.insertFirst(2);
        myList.insertFirst(2);
        myList.insertFirst(1);
        myList.insertFirst(1);
        myList.insertFirst(1);
        myList.insertFirst(1);*/

        //myList.displayList();
        //myList.removeDup();
        //myList.displayList();

        //MyLinkedList myList2 = new MyLinkedList();


        //myList2.displayList();
        //myList2.removeDup();


        //PROBLEM 3 IMPLEMENTATION

      /* MyLinkedList original = new MyLinkedList();

       original.insertFirst(5);
       original.insertFirst(4);
       original.insertFirst(3);
       original.insertFirst(2);
       original.insertFirst(1);
       original.displayList();


       original.reverse();*/

       //original.displayList();


       MyLinkedList j = new MyLinkedList();
        j.insertFirst(6);
        j.insertFirst(5);
        j.insertFirst(4);
        j.insertFirst(3);
        j.insertFirst(6);
        j.insertFirst(2);
        j.insertFirst(1);

        j.displayList();

        j.removeValue(6);

        j.displayList();

        //case where we need to remove first and all values need to be removed
        MyLinkedList k = new MyLinkedList();
        k.insertFirst(7);
        k.insertFirst(7);
        k.insertFirst(7);
        k.insertFirst(7);


        k.displayList();

        k.removeValue(7);

        k.displayList();

        MyLinkedList zero = new MyLinkedList();

        zero.displayList();

        zero.removeValue(8);

        zero.displayList();




    }


    /*
    Problem 1
    Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
    Return the linked list sorted as well.

    UNDERSTAND
    So we are give and a sorted list that potentially has duplicate. We are to delete duplicates and return the list
    sorted.
    Question
    -If give an empty list_ what is the expected output

    MATCH
    We are use linked list and this will allow us to use the same list and not have to use auxiliary data structure

    PLAN
    We are going to iterate over the list and if we are be using two iterators, Current and current.next
    We start with the first and make this node = Current
    Outside while loop that is going to go as long as current and current.next are not point to null-checking all nodes
     inside while loop that will be checking for duplicates for given number until no duplicates for that number are
     found, then we will move to check the next integer
     if a duplicate is found : if current  == current.next
       then we will bypass current.next and we will connect current to current.next.next
     at this point the next integer become current
     and the number after that node is current.next
     and we will go back to the inside while loop

    IMPLEMENT
    SEE classes: Link and MyLinkedList

    REVIEW
    Main class has two examples
    one if a list that have multiple duplicates, and they have been eliminated. We also preserve the sorted list
    the second example is an empty list that produce empty output

    EVALUATE
    TIME COMPLEXITY
    O(N) as we have to visit all the element to check for all duplicates

    SPACE COMPLEXITY
    O(1) because we are doing this in place, meaning we do not need an extra data structure

     */



    /*
    Problem 3 : Given the head of a singly linked list, reverse the list, and return the reversed list.

    UNDERSTAND
    -Are we creating a new list that is the reverse of the initial list. Are we allow to use a additional data structure
     in other words , is space complexity of O(N) acceptable
            NOT ACCEPTABLE AS SPACE COMPLEXITY HAS TO BE O(1)

    MAP
    We have to use the same LinkedList

    PLAN
    We are going to iterate over the LinkedList and set up each node previous so that we can go backwards on the
    LinkedList.
        While the node is not the last note: node != null
        make current.next the current
        make current the previous

        move along by making current = current.next;
        Once we get to the end of the list, marked the last Node as last

       Then we will use a second while loop to go from last note backwards to the first


    IMPLEMENT
    Implemented in MyLinkedList class

    REVIEW
    This was tested

    EVALUATE
    TIME COMPLEXITY
    O(N) we are using the reverse method that is O(N) visit all the nodes from the original list to mark previous nodes.
    We also have to display the new reverse list, which is also O(N)
    so O(N) + O(N) = 2O(N) but we eliminate the constants, and we end up with a time complexity of O(N)

    SPACE COMPLEXITY
    O(1) because this needs to be done in place without the use of an additional data structure.
    */

    /*
    Problem 5
    Given the head of a linked list and an integer val, remove all the nodes of the linked list that has
    Node.val == val, and return the new head.

    UNDERSTAND
    We are an integer value, and we have to remove all the nodes that have that value
    Q - What if the value is not found - what should we return?
        Since we are returning the new head we would be able to return the same LinkedList

    MAP
    We need to add a new method in the MyLinkedList class to remove nodes or links

    PLAN
    -Create a new method call remove or delete
    -While current node is not null
        if the item is found
            then link current to the following next : current. next will be current.next.next
     */

}
