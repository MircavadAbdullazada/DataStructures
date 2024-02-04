package algorithms.sort;

public class InsertionSort {
    public static void main(String[] args) {
        // Insertion sort = after comparing elements to the left,
        //				shift elements to the right to make room to insert a value

        //				Quadratic time O(n^2)
        //				small data set = decent
        //				large data set = BAD

        //				Less steps than Bubble sort
        //				Best case is O(n) compared to Selection sort O(n^2)

        int[] array = {9, 1, 8, 2, 7, 6, 5, 3, 4};

        insertionSort(array);

        for (int i: array){
            System.out.print(i);
        }

    }

    private static void insertionSort(int[] array) {

        for(int i=1;i<array.length;i++){
            int cursor=i;

            while(cursor>0 && array[cursor-1]>array[cursor]){
                int temp=array[cursor];
                array[cursor]=array[cursor-1];
                array[cursor-1]=temp;
                cursor--;
            }

        }

    }
}
