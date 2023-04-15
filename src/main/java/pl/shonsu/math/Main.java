package pl.shonsu.math;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] tab = new int[]{2, 7, 3, 2};
        int x = 5;
        int result = Horner.calculate(tab, 5);
        int result2 = Horner.calculateRecursive(tab, 5, 3);
        System.out.println(result);
        System.out.println(result2);

        System.out.println("Erastotenes:");
        Erastotenes er= new Erastotenes(new boolean[100]);
        er.crossOutNonPrime();
        System.out.println(Arrays.toString(er.returnPrimes()));
    }
}
