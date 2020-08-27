package com.ClassExercise1.SetA;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) ar[i] = s.nextInt();
        Bubblesort(ar);
        System.out.println(difference(ar));
    }

    private static int difference(int[] ar) {
        return ar[ar.length-1]-ar[0];
    }

    public static void Bubblesort(int ar[])
    {
        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j < ar.length-1-i ; j++) {
                if(ar[j]>ar[j+1])
                {
                    swap(j,j+1,ar);
                }
            }
        }
    }
    public static void swap(int first,int second,int ar[])
    {
        int temp;
        temp= ar[first];
        ar[first] = ar[second];
        ar[second]=temp;
    }

}
