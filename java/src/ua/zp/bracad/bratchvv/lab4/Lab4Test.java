package ua.zp.bracad.bratchvv.lab4;

import java.util.Arrays;

public class Lab4Test {

    public static void main(String[] args) {

        // PART 1
        int[] intArray = {10, 5, 15, 1};

        // 1.1)
        int[] intArrayCopy = {}; // TODO copy "intArray".

        // 1.2)
        // TODO sort "intArrayCopy", use Arrays sort.

        // 1.3)
        // TODO print "intArrayCopy", use Arrays toString.

        // 1.4)
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".


        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        for (int value: testArray) {
            System.out.print(value + " ");
        }

        // 2.1)
        // TODO calc sum of all array elements and print result.

        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.

        // 2.3)
        // TODO find max value in array.


        // PART 3

        //3.1
        // TODO create two-dimensional array with size [3][4]

        //3.2
        // TODO fill array with any numbers in cycles.

        //3.3
        // TODO calc sum of all array elements and print result.

        //4*
        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (long[] row: matrix ) {
            Arrays.fill(row, ++ratio);
        }

        int sum = 0;
        // TODO* calc sum of matrix values by expression: 2 < i <= 6 and only every third j value.
        System.out.println(sum);
    }
}
