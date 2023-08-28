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
}
