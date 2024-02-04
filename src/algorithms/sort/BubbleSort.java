package algorithms.sort;

public class BubbleSort {
    public static void main(String[] args) {
        // bubble sort = pairs of adjacent elements are compared and swapped if elements are out of order. (larger value is moved last)
        //				 Quadratic time O(n^2)
        //				 small data set = okay-ish
        //				 large data set = BAD

        int[] array = {9, 1, 8, 2, 7, 6, 5, 3, 4};

        bubbleSort(array);

        for (int a:array){
            System.out.print(a);
        }

    }

    private static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;

                }
            }
        }
    }
}
