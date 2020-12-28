package com.java;

import java.util.HashSet;

public class hashset_practice {
    public static void main(String[] args) {

        HashSet<String> sett = new HashSet<>();
        sett.add("1");
        sett.add("4");
        sett.add("3");
        for (String s : sett) {
            System.out.println(s);
        }
    }
}
