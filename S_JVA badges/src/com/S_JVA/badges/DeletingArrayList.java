package com.S_JVA.badges;

import java.util.ArrayList;

public class DeletingArrayList {

    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<Integer> ();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        ArrayList <Integer> numbers12 = new ArrayList<Integer>();

        for (int i : numbers)
        {
            System.out.println(i);
        }
    }
}
