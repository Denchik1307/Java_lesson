package for_test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = {1, 3, 2, 1, 7};
        int[] nums2 = {3, 2, 1, 4, 7};

        int[] nums3 = {0, 0, 0, 0, 0};
        int[] nums4 = {0, 0, 0, 0, 0};

        int[] nums5 = {1, 2, 4, 3, 2};
        int[] nums6 = {2, 3, 1, 3, 5};

        System.out.println(Array.findEqualsSubarray(nums1, nums2));
        System.out.println(Array.findEqualsSubarray(nums3, nums4));
        System.out.println(Array.findEqualsSubarray(nums5, nums6));

    }
}

abstract class Array {

    private static final int MIN_LENGTH_SUBARRAY = 2;

    public static String findEqualsSubarray(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int count = 0;

        long timeStart = System.currentTimeMillis();

        for (int startIndex = 0; startIndex <= arr1.length; startIndex++) {
            for (int endIndex = startIndex; endIndex <= arr1.length; endIndex++) {
                int[] tmp = Arrays.copyOfRange(arr1, startIndex, endIndex);
                if (tmp.length >= MIN_LENGTH_SUBARRAY && count < tmp.length && isContains(tmp, arr2)) {
                    result.clear();
                    for (int item : tmp) {
                        result.add(item);
                    }
                    count = tmp.length;
                }
            }
        }
        System.out.printf("Time working %s\n",System.currentTimeMillis() - timeStart);

        if (result.size() < MIN_LENGTH_SUBARRAY) {
            return "Чёт ничего не нашлось :( ";
        } else {
            return "Повторяющийся подмассив с максимальной длиной " + result + " и содержит " + count + " элементов";
        }
    }

    private static boolean isContains(int[] arr, int[] arr2) {
        for (int startIndex = 0; startIndex <= arr2.length; startIndex++) {
            for (int endIndex = startIndex; endIndex <= arr2.length; endIndex++) {
                int[] tmp = Arrays.copyOfRange(arr2, startIndex, endIndex);
                if (arr.length == tmp.length && Arrays.equals(arr, tmp)) {
                    return true;
                }
            }
        }
        return false;
    }
}


