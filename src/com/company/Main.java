package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(45, 226, 93, 14, 45, 86, 27, 78, 9, 10));
        arrayList1.stream().filter(x -> x % 2 == 0).
                map(x -> x * x).max(Integer::compare).
                ifPresent(System.out::println);
        
    }
}
