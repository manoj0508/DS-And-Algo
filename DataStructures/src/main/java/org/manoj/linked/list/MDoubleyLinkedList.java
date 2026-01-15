package org.manoj.linked.list;

import java.io.Serializable;

public class MDoubleyLinkedList<T> implements Serializable {

    private int size = 0;
    private Node<T> header;
    private Node<T> prev = null;
    private Node<T> nextNode ;


    public MDoubleyLinkedList(T data){
        Node<T> firstNode = new Node<>(data);
        header = firstNode;
        nextNode = firstNode;
        size++;
    }
}


