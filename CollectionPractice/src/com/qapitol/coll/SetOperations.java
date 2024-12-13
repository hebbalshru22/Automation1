package com.qapitol.day3;

import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> treeHashSet = new TreeSet<Integer>();

        treeHashSet.add(1);
        treeHashSet.add(15);
        treeHashSet.add(2);
        treeHashSet.add(10);
        treeHashSet.add(6);
        treeHashSet.add(7);
        treeHashSet.add(8);

        System.out.println(treeHashSet);
        treeHashSet.remove(8);
        treeHashSet.remove(7);

        System.out.println(treeHashSet.size());
        System.out.println(treeHashSet);


    }

}
