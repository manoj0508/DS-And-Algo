package org.manoj.linked.list;

import java.io.Serializable;

public class MDoubleyLinkedList<T> implements Serializable {

    private int size = 0;
    private Node<T> head, tail;


    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void addFirst(T value) {
        Node<T> node = new Node<>(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }


    public void addLast(T value) {
        Node<T> node = new Node<>(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }



    private static class Node<T> {
        T data;
        Node<T> prev, next;

        Node(T data) { this.data = data; }
    }

}


