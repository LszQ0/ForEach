package com.exercise;

public class Main {

    public static void main(String[] args) {

        int[] tablica = new int[] {2, 4, 6, 8, 10}; //tablica 1-wymiarowa
        int[][] tablica2 = new int[][] {{2, 4, 6, 8, 10}, {1, 3, 5, 7, 9}}; //tablica 2-wymiarowa

        for (int i: tablica) {
            System.out.println("Tablica: " + i);
        }

        for (int[] j : tablica2) { //tyle powtórzeń ile wymiarów w tablicy
            for (int k: j){  //z każdego wymiaru wymieniane są wartości komórek
                System.out.println("Tablica2: " + k);
            }
        }
    }
}
