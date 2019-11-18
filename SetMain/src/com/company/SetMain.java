package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }
        System.out.println("There are:  " + squares.size() + " squares size  and   " + cubes.size() + " cubes");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("union contains " + union.size() + " elements");
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains  " + intersection.size() + "  elements");
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube og match  " + Math.cbrt(i));
        }
        Set<String> words = new HashSet<>();
        String sentence = " one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));
        for (String s : words) {
            System.out.println(s);
        }
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] NatureWords = {"all", "nature", "is", "but", "art", "unknpwn", "to", "thee"};
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        nature.addAll(Arrays.asList(NatureWords));
        divine.addAll((Arrays.asList(divineWords)));

        System.out.println(" nature -divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll((divine));
        printSet(diff1);
        System.out.println("divine - nature;");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        System.out.println(" union test");
        printSet(unionTest);
        Set<String> intersectionTest = new HashSet<>(nature);
        System.out.println("inter pezed retain : ");
        printSet(intersectionTest);
        intersectionTest.retainAll(divine);
        System.out.println("intersection :");
        printSet(intersectionTest);
        unionTest.retainAll(intersection);

        if (nature.containsAll(divine)) {
            System.out.println(" divine is a subset of nature");

        }
        if (nature.containsAll(intersectionTest)) {
            System.out.println(" intersection is subset of nature");
        }
        if (divine.containsAll((intersectionTest))) {
            System.out.println("intesection is a subset of divine");
        }
        if (divine.containsAll((unionTest))) {
            System.out.println("divine is a subset of unionTest");
        }


    }

    private static void printSet(Set<String> set) {
        System.out.print("\t");
        for (String s : set) {
            System.out.print(s + " ");

        }
        System.out.println();
    }
}

