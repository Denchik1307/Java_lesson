package lesson;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Lesson_third {
    public static void main(String[] args) {
        HashMap<String, HashSet<Integer>> phoneBook = new HashMap<>();
        HashSet<Integer> phones = new HashSet<>();
        phoneBook.forEach((key,value)-> {
            System.out.println(value);
        });
    }
}
