package com.nice.domain;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
//        List list = new ArrayList(Arrays.asList());
//////        list.add("nice");
//////        System.out.println(list);
/*        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        Collections.reverse(list);
        System.out.println(list);*/
        Map map = new HashMap();
        map.put("name","nice");
        map.forEach( (k,v) -> {
            System.out.println(k + "---------------------" + v);
        });
    }
}
