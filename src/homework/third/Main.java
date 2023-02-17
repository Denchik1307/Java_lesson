package homework.third;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        List<Integer> listRandomValue = createListRandomValue(0, 100, 30);
        show(listRandomValue, true);

        Collections.sort(listRandomValue);
        show("min→ " + listRandomValue.get(0) + " | " + listRandomValue.get(listRandomValue.size() - 1) + " ←max", false);
        show("average→ " + getAverage(listRandomValue), true);


        listRandomValue.removeIf(item -> item % 2 == 0);
        show("only odd→ " + listRandomValue, false);
    }

    public static List<Integer> createListRandomValue(int minValue, int maxValue, int size) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(minValue, maxValue));
        }
        return list;
    }

    public static float getAverage(List<Integer> list) {
        AtomicInteger summa = new AtomicInteger();
        list.forEach(summa::addAndGet);
        return (float) summa.get() / (float) list.size();

    }

    public static void show(Object something, boolean addSpase) {
        System.out.println(something);
        if (addSpase) System.out.println();
    }
}
