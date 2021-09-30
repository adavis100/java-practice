package com.javapractice.scratch;

import java.util.Arrays;

public class Java16Stuff {
    private record Person(String name, String occupation) {};

    public static void main(String[] args) {
        Person p1 = new Person("Bob", "janitor");
        Person p2 = new Person("Bill", "sanitation engineer");
        System.out.println(p1);
        System.out.println(switch (p2.name()) {
            case "Bill" -> "foo";
            case "Bob" -> "bar";
            default -> "baz";
        });

        System.out.println("""
                Here is my text block.
                  Indented
                  Yes
                  Stuff
               More stuff
                """);
        Arrays.copyOf(new int[] {3,4,5}, 3);
    }
}
