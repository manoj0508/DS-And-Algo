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
    }
}
