package com.ClassExercise1.SetA;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];


        String str;
        do {
            input(ar);
            getodd(ar);
            geteven(ar);
            reverse(ar);
            getfirstlast(ar);
            System.out.print("Enter Y to continue: ");
            str = s.next();
        } while (str.compareTo("Y")==0);

    }

    private static void getfirstlast(int[] ar) {
        System.out.println("First Element: "+ar[0]);
        System.out.println("Last Element: "+ar[ar.length-1]);
    }

    private static void reverse(int[] ar) {
        System.out.println("Reverse Order");
        for (int i = ar.length-1; i >=0 ; i--) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

    private static void getodd(int[] ar) {
        System.out.println("Odd members");
        for (int i = 0; i <ar.length ; i++)
            if ((i % 2) != 0)
                System.out.print(ar[i]+" ");
        System.out.println();
    }
    private static void geteven(int[] ar) {
        System.out.println("Even members");
        for (int i = 0; i <ar.length ; i++)
            if ((i % 2) == 0)
                System.out.print(ar[i]+" ");
        System.out.println();
    }


    private static void input(int[] ar) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i <ar.length ; i++) ar[i] = s.nextInt();
    }
}
