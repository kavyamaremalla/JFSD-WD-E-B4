package com.advanced;

import java.util.*;
import java.util.stream.Collectors;

public class ImmutableCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(67);
        list.add(18);
        list.add(4);

        list.sort(Collections.reverseOrder());

        System.out.println(list);

        List<Integer> evenList = list.stream()
                .filter(n -> n %2==0)
                .collect(Collectors.toUnmodifiableList());

        //.toList or  .collect(Collectors.toUnmodifiableList());-> immutable list
        //.collect(Collectors.toList()); -> mutable

//        evenList.add(3);

//        System.out.println(evenList);
//
//        System.out.println(list);

        List<Integer> list1 = List.of(16, 12, 3, 49, 78, 56);
//                Arrays.asList(1,2,3);
//        list1.add(5);
//        list1.remove(0);
//        Collections.sort(list1);

//        System.out.println(list1);

        Set.of();

        Map.of();
    }
}
