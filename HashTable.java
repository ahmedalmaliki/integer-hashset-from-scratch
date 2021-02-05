package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class HashTable {
    private LinkedList[] hashtable ;
    private static int init = 8;
    private static float LF =  0.7F;



    public HashTable() {
        this.hashtable = new LinkedList[8];
    }

    private int equation (int num ){
        return num % init ;
    }
    private int numberOfFilledBuckets() {
        int numberOfFilledBuckets = 0;
        for(var i = 0; i < hashtable.length; i++){
            if(hashtable[i] != null){
                numberOfFilledBuckets = numberOfFilledBuckets + 1;
            }
        }

        return numberOfFilledBuckets;
    }
    public void insert(int item){
        if((numberOfFilledBuckets()/ init) >  LF){
            copying();
        }
        try {
            hashtable[equation(item)].insert(new Node(item));
        }catch (Exception e ){
            hashtable[equation(item)] = new LinkedList();
            hashtable[equation(item)].insert(new Node(item));


        }



    }

    private void copying() {
        int count = 0;
        init = init * 2;
        LinkedList[] nHashtable = new LinkedList[init];
        for(var item: hashtable) {
            nHashtable[count++] = item;
        }
        this.hashtable = nHashtable;
        System.out.println("Doubled");

    }

    public void print(){
        for (int i = 0 ; i < hashtable.length; i++){
            if(hashtable[i] != null) {
                System.out.println("[-------------------"+i+"--------------------]");
                hashtable[i].print() ;
            }
        }
    }

    public int[] get (int index){
        return  hashtable[index].getValues();
    }



}
