package lesson;

import java.io.*;
import java.util.Objects;

public class Lesson_Two {


    public static void main(String[] args) {
//        System.out.println(exampleOne(21, 'X', 'W'));
        dirList();
    }

//    public static String exampleOne(int num, char c1, char c2) {
//        StringBuilder res = new StringBuilder();
//        int tmp = num;
//        while (num > 0) {
//            res.append(c1);
//            res.append(c2);
//            num -= 2;
//        }
//        if (num % 2 != 0) {
//            res.deleteCharAt(tmp);
//        }
//        return res.toString();
//    }

//    public static boolean isPalindrome(String text) {
//        int n = text.length();
//        String newText = text.toLowerCase().replaceAll(" ", "").replaceAll(",", "");
//
//        for (int i = 0; i < (n / 2); ++i) {
//            if (newText.charAt(i) != newText.charAt(n - i - 1)) return false;
//        }
//        return true;
//    }


//    public static void writeFile(String text) {
//        try {
//            PrintWriter file = new PrintWriter("log.txt");
//            file.println(text);
//            file.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }

    public static void dirList() {
        File file = new File(".");
        String[] directories = file.list((current, name) -> new File(current, name).isDirectory());
        System.out.println(String.join(",", Objects.requireNonNull(directories)));
    }


}
