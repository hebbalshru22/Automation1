package com.qapitol.day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapOpertations {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "ABCD1");
        map.put(2, "ABCD2");
        map.put(3, "ABCD3");
        map.put(4, "ABCD4");

        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.containsValue("ABCD2"));

        System.out.println(map.keySet());
        System.out.println(map.values());

//		map.remove(1);

        System.out.println(map);

        for(Entry<Integer, String> value : map.entrySet() ) {
            System.out.println(value);
        }





    }

}
