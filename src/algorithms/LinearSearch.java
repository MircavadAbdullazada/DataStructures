package algorithms;

public class LinearSearch {
    public static void main(String[] args) {

        //Linear search = Iterate through a collection one element at a time

        //                runtime complexity= O(n)

        //                Disadvantages:
        //                              Slow for large data sets
        //                Advantages:
        //                              Fast for searches of small and medium data sets
        //                              Does not need to sorted
        //                              Useful for data structures that do not have random access (LinkedList)

        int[] array = {9,5, 7, 3, 1, 2, 6, 4, 8};

        System.out.println( linearSearch(array,7));
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]==value)
                return i;
        }
          return -1;
    }

}
