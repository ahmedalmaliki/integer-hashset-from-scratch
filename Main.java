package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        for (var i = 0; i < 100 ; i++){
            hashTable.insert(i);
        }

        hashTable.print();
        System.out.println(Arrays.toString(hashTable.get(2)));


    }
}
