package algorithms.search;

public class InterpolationSearch {

    public static void main(String[] args) {
      /*  -Interpolation Search - is a searching algorithms which works on sorted array.
        -It works best for arrays where elements are uniformly distributed.
        -At every iteration it finds the position to search using

                    pos= low + ((key - Array[low]) * (high - low)) / (Array[high] - Array[low])

        -If element at the position is equal to the key, search stops.
        -If the element at position is greater than the key, search continues in the first part.
         -Otherwise search continues in the second part.
        It has best case complexity of O(1),
         average case complexity of O(log(log n)) and worst case complexity of O(n).
    */

        int[] array = {1, 3, 7, 10, 14, 15, 16, 18, 20, 21, 22, 23, 25, 33, 35, 42, 45, 47, 50, 52};

        System.out.println(interpolationSearch(array, 33));

    }

    private static int interpolationSearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            int pos=low+((value-array[low])*(high-low))
                    /(array[high]-array[low])    ;      //pos==mid(same meaning)
            int target=array[pos];

            if(target<value)
                low=pos+1;
            else if (target>value)
                high=pos-1;
            else
                return pos;
        }


        return -1;
    }

}
