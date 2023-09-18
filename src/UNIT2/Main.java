package UNIT2;

public class Main {

    public static void main(String[] args) {


       MyLinkedList myList = new MyLinkedList();

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
        myList.insertFirst(1);

        myList.displayList();
        myList.removeDup();
        myList.displayList();

        MyLinkedList myList2 = new MyLinkedList();


        myList2.displayList();
        myList2.removeDup();
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


 
}
