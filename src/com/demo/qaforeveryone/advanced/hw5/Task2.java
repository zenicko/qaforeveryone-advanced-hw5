package com.demo.qaforeveryone.advanced.hw5;

public class Task2 {

    public static void main(String[] args) {
        int n = 10; // strings

        for (int i = 0; i < n; i++) {

            for (int i1 = 0; i1 < i; i1++)
                System.out.print(" ");

            for (int i1 = n - 1 - i; i1 > 0; i1--)
                System.out.print(i1);

            for (int i1 = 0; i1 < n - i; i1++)
                System.out.print(i1);

            System.out.println();

        }
        System.out.println("dkfndjfhdjfhdjfh");
    }
}
