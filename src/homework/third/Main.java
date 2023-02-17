package homework.third;

import java.util.*;
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


        // Try to merge sort
        List<Integer> listRandomValueForTestMergeSort = createListRandomValue(0, 100, 20);
        int[] arrayForTesting = new int[listRandomValueForTestMergeSort.size()];
        for(int i = 0; i < listRandomValueForTestMergeSort.size(); i++) {
            arrayForTesting[i] = listRandomValueForTestMergeSort.get(i);
        }
        MergeSort.mergeSort(arrayForTesting);
        System.out.println(Arrays.toString(arrayForTesting));
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

abstract class MergeSort {


    public static void mergeSort(int[] arrayToSort) {
        if (arrayToSort.length < 2) {
            return;
        }
        int sizeLeftHalf = arrayToSort.length/2;
        int sizeRightHalf = arrayToSort.length - sizeLeftHalf;

        int[] leftHalfArray = new int[sizeLeftHalf];
        int[] rightHalfArray = new int[sizeRightHalf];

        System.arraycopy(arrayToSort, 0, leftHalfArray, 0, sizeLeftHalf);
        System.arraycopy(arrayToSort, sizeLeftHalf, rightHalfArray, 0, sizeRightHalf);

        mergeSort(leftHalfArray);
        mergeSort(rightHalfArray);

        merge(arrayToSort, leftHalfArray, rightHalfArray);
    }

    private static void merge(int[] arrayToSort, int[] leftHalfArray, int[] rightHalfArray){
        int x = 0, y = 0, z = 0;
        while (x < leftHalfArray.length && y < rightHalfArray.length) {
            if (leftHalfArray[x] <= rightHalfArray[y]) {
                arrayToSort[z++] = leftHalfArray[x++];
            }
            else {
                arrayToSort[z++] = rightHalfArray[y++];
            }
        }
        while (x < leftHalfArray.length) {
            arrayToSort[z++] = leftHalfArray[x++];
        }
        while (y < rightHalfArray.length) {
            arrayToSort[z++] = rightHalfArray[y++];
        }
    }
}
