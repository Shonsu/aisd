package pl.shonsu.math;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] tab = new int[]{2, 7, 3, 2};
        int x = 5;
        int result = Horner.calculate(tab, 5);
        int result2 = Horner.calculateRecursive(tab, 5, 3);
        System.out.println(result);
        System.out.println(result2);
    }
}
