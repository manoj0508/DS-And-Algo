package org.manoj.linked.list.program;

import org.manoj.linked.list.MSinglyLinkedList;

public class AddSingleLinkedList {

    static void main() {
        MSinglyLinkedList<String> singlyLinkedList = new MSinglyLinkedList<>();

        singlyLinkedList.printAllElement();
        singlyLinkedList.addValue("Apple");
        singlyLinkedList.printAllElement();
        singlyLinkedList.addValue("Car");
        singlyLinkedList.addValue("Maruti");
        singlyLinkedList.printAllElement();

        IO.println(singlyLinkedList.size());

        String first = singlyLinkedList.getFirst();
        IO.println("first value of Linked List : " + first);

        IO.println("Last Node of Singley Linked List : "+singlyLinkedList.getLast());

        singlyLinkedList.addValue("This is the last");

        IO.println("Last Node of Singley Linked List : "+singlyLinkedList.getLast());

    }
}
