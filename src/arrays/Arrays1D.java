package arrays;

import java.util.Scanner;

public class Arrays1D {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5}; // here arr variable is stored in stack and has the first memory index of the complete arr {1, 2, 3, 4, 5} which is stored into Heap memory.
        /* Index:    0   1   2   3   4
           Value:    1   2   3   4   5 */

        /* STACK                         HEAP
┌──────────────┐             ┌──────────────────┐
│ arr          │             │ int[]            │
│              │────────────►│ 1  2  3  4  5    │
│ reference    │             │                  │
└──────────────┘             └──────────────────┘ */

        int[] array = new int[10]; /* Create an integer array with 10 spaces. Initially, Java automatically puts 0 in every position because int has a default value of 0.
        Index:    0   1   2   3   4   5   6   7   8   9
        Value:    0   0   0   0   0   0   0   0   0   0*/

        /* STACK                         HEAP
┌──────────────┐             ┌────────────────────────┐
│ arr          │             │ int[]                  │
│              │────────────►│ 0 0 0 0 0 0 0 0 0 0    │
│ reference    │             │                        │
└──────────────┘             └────────────────────────┘ */

        System.out.println(array.length); //Note: here length is not a method rather it is a property. Like a class, an object has properties the same way.

        for(int i: array)
        {
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();

        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]);
            System.out.print(" ");
        }

        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arrays values: ");
        for(int i =0; i< array.length; i++)
        {
            array[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("here are the entered arrays values: ");
        for (int i: array)
        {
            System.out.println(i);
        }

//        Finding max value in array.
        int max = Integer.MIN_VALUE;
        for(int i: array)
        {
            if( i > max)
            {
                max = i;
            }
        }
        System.out.println("max no in array: " + max);

//        Printing the array in reverse
        int a = 0;
        int b = array.length-1;
        while(a <= b)
        {
            int c = array[a];
            array[a] = array[b];
            array[b] = c;
            a++;
            b--;
        }
        System.out.println("here is the reversed array");
        for(int i: array)
        {
            System.out.println(i);
        }
//        Printing Sum of array;
        int sum = 0;
        for(int i: array)
        {
            sum+= i;
        }
        System.out.println("Sum of array values is: " + sum );
    }
}
