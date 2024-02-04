package algorithms.sort;

public class SelectionSort {
    public static void main(String[] args) {
        // selection sort = search through an array and keep track of the minimum value during
        //			         each iteration. At the end of each iteration, we swap values.

        //				 Quadratic time O(n^2)
        //				 small data set = okay
        //				 large data set = BAD

        int[] array = {9, 1, 8, 2, 7, 6, 5, 3, 4};

        selectionSort(array);

        for (int a:array){
            System.out.print(a);
        }

    }

    private static void selectionSort(int[] array) {


        for(int i=0;i< array.length-1;i++){
            int minIndex=i;
            for (int j=i+1;j< array.length;j++){
                if (array[minIndex]>array[j]){
                    minIndex=j;
                }
            }
            int temp=array[i];
            array[i]=array[minIndex];
            array[minIndex]=temp;

        }
    }
}
