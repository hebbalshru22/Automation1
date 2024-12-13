package com.qapitol.coll;

import java.util.LinkedList;

public class LinkedListOperation {
     public static void main(String[] args) {
         LinkedList<Integer> list=new LinkedList<>();
         LinkedList<Integer> list1=new LinkedList<>();
         list1.add(12);
         list1.add(14);


         list.add(22);
         list.add(29);
         list.add(25);
         list.add(24);

        System.out.println(list);
         list.add(2,70);
         System.out.println(list);



    }
}
