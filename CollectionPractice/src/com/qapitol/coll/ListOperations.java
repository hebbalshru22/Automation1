package com.qapitol.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class ListOperations {

    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();


		stack.push(12);

		stack.push(13);
		stack.push(20);
		stack.push(21);
		stack.push(25);

		System.out.println(stack);

		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);

        // Add Element
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(4);


        list2.add(10);
        list2.add(31);
        list2.add(41);
        list2.add(55);
        list2.add(43);

        System.out.println(list);
        System.out.println(list2);

        list.remove(1);
        System.out.println(list2.get(4));

        // 		list.get(0)

        System.out.println(list.contains(10));
        list.addAll(list2);
        System.out.println(list);

        Iterator<Integer>itr = list.iterator();

        ListIterator<Integer> itr1 =  (ListIterator<Integer>) list.iterator();
//
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//
//		}

        System.out.println(itr1.hasNext());

        System.out.println("Next "+itr1.next());
        System.out.println("Next "+ itr1.next());

        System.out.println("Previous "+itr1.previous());
        System.out.println("Previous "+itr1.previous());
        Collections.sort(list);

        System.out.println(list);


        //		while (itr1.hasNext()) {
//
////			System.out.println("Next "+itr1.next());
////			System.out.println("Previoues"+ itr1.previous());
////			if(itr1.next().equals(5)) {
////				System.out.println("Print "+itr1.previous());
////			}
//		}

    }

}
