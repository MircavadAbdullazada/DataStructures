package datastructures;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //Array = used to  store multiple variable in a single variable

        //Creation of arrays
        // String[] car = new String[3];
        String[] cars = new String[]{"BMW", "Camaro", "Tesla"};
        // String[] cars = {"BMW", "Camaro", "Tesla"};

        int numbers[] = {5, 4, 9, 7};
        System.out.println(cars[0]);
        System.out.println(Arrays.toString(cars));

//        java.util.Arrays.sort(numbers);
////        for (String a : cars) {
////            System.out.println(a);
////        }

        for (int a : numbers) {
            System.out.println(a);
        }
        System.out.println(java.util.Arrays.binarySearch(numbers, 7));

        //2D arrays
        int[][] matris = new int[3][3];

        matris[0][0] = 1;
        matris[0][1] = 3;
        matris[0][2] = 5;
        matris[1][0] = 7;
        matris[1][1] = 9;
        matris[1][2] = 11;
        matris[2][0] = 13;
        matris[2][1] = 15;
        matris[2][2] = 17;

        for (int i = 0; i < matris.length; i++) {
            for (int k = 0; k < matris[i].length; k++) {
                System.out.print(matris[i][k] + " ");
            }
        }

        System.out.println("\n-----------------------");

        System.out.println(Arrays.toString(matris));
       // Arrays.toString(matris);
    }

}
