package org.manoj.linked.list;

import java.io.Serializable;

public class MSinglyLinkedList<T> implements Serializable {
    private Node<T> header = null;
    private Node<T> nextNode = header;
    private int size = 0;

    public MSinglyLinkedList() {

    }

    public MSinglyLinkedList(T value) {
        Node<T> firstNode = new Node<>(value);
        header = firstNode;
        nextNode = firstNode;
        size++;
    }

    public void addValue(T value) {
        Node<T> newNode = new Node<>(value);
        if (header != null) {
            nextNode.next = newNode;
            nextNode = newNode;
            size++;
        } else {
            header = newNode;
            nextNode = newNode;
            size++;

        }
    }

    public void printAllElement() {
        IO.print("[");
        Node<T> node = header;
        while (node != null) {
            IO.print(" " + node.data);
            node = node.next;
        }
        IO.println(" ]");
    }


    public int size() {
        return size;
    }

}

class Node<T> {
    T data;
    Node<T> next;

    Node(T value) {
        data = value;
        next = null;
    }

}
