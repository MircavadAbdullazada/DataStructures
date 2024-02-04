package algorithms.search;

import java.util.Arrays;

public class BinarySearch {

    public static int step = 0;

    public static void main(String[] args) {
        // binary search = Search algorithm that finds the position
        //       of a target value within a sorted array.
        //       Half of the array is eliminated during each "step"

        // runtime complexity= O(log n)


        int[] array = new int[100];


        for (int i = 0; i < array.length; i++) {
            array[i] = i+2;
        }

        System.out.println(binarySearch(array, 42));
        System.out.println(Arrays.binarySearch(array,42));


    }


    private static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;


        while (low <= high) {
            step++;
            int mid = (low + high) / 2;
            int midVal = array[mid];

            if (midVal < value)
                low = mid + 1;
            else if (midVal > value)
                high = mid - 1;
            else
                return mid;
        }

        return -(value + 1);
    }
}
