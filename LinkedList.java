package com.company;

import java.util.ArrayList;

public class LinkedList {
    private Node first = null;

    public void insert (Node node){
        node.setNext(first);
        first = node;
    }
    private int sizeOfLinkedList(){
        int size = 0;
        Node current = first;
        size = size + 1;
        while (current.getNext() != null){
            current = current.getNext();
            size = size + 1;

        }
        return size;
    }
    public void print (){
        Node current = first;
        System.out.println(current.getVal());
        while (current.getNext() != null){
            current = current.getNext();
            System.out.println(current.getVal());

        }
    }
    public int[] getValues(){
        int count = 0 ;
        int[] values = new int[sizeOfLinkedList()];
        Node current = first;
        values[count++] = current.getVal();
        while (current.getNext() != null) {
            current = current.getNext();
            values[count++] = current.getVal();
        }
        return values;
    }
}
