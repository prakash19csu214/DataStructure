package com.ClassExercise1.SetA;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []ar = new int[5];
        for (int i = 0; i <ar.length ; i++) {
           ar[i]=s.nextInt();
        }
        System.out.println("Sum: "+getsum(ar));
        System.out.println("Sum Alternate: "+sumAlternate(ar));
        System.out.println("Second Highest: "+ secondHighest(ar));
    }

    private static int secondHighest(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = a.length - 2; i >= 0; i--) {
            // if the element is not
            // equal to largest element
            if (a[i] != a[a.length - 1]) {

                return a[i];
            }
        }
       return 0;
    }


    private static int sumAlternate(int[] ar) {
        int sum= 0;
        for (int i = 0; i <ar.length ; i=i+2) sum = sum + ar[i];
        return sum;
    }

    private static int getsum(int[] ar) {
        int sum=0;
        for (int i = 0; i <ar.length ; i++) sum = sum + ar[i];
        return sum;
    }

}
