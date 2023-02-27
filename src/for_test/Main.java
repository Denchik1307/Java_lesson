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

class Array {

    public static String findEqualsSubarray(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int count = 0;

        for (int i = 0; i <= arr1.length; i++) {
            for (int j = i; j <= arr1.length; j++) {
                int[] tmp = Arrays.copyOfRange(arr1, i, j);
                if (tmp.length > 1 && count < tmp.length && isContains(tmp, arr2)) {
                    result.clear();
                    for (int item : tmp) {
                        result.add(item);
                    }
                    count = tmp.length;
                }
            }
        }
        if (result.size() < 2) {
            return "Чёт ничего не нашлось :( ";
        } else {
            return "Повторяющийся подмассив с максимальной длиной " + result + " и содержит " + count + " элементов";
        }
    }

    public static boolean isContains(int[] arr, int[] arr2) {
        for (int i = 0; i <= arr2.length; i++) {
            for (int j = i; j <= arr2.length; j++) {
                int[] tmp = Arrays.copyOfRange(arr2, i, j);
                if (arr.length == tmp.length && Arrays.equals(arr, tmp)) {
                    return true;
                }
            }
        }
        return false;
    }
}


