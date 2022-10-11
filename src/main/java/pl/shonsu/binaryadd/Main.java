package pl.shonsu.binaryadd;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        short[] a = new short[]{1, 1, 1, 0, 1, 1};
        short[] b = new short[]{1, 0, 1, 1, 0, 1};
        short[] result = binaryAdd(a, b);

        System.out.println("   " + Arrays.toString(a));
        System.out.println("   " + Arrays.toString(b));
        System.out.println(Arrays.toString(result));
    }
    private static short[] binaryAdd(short[] a, short[] b){
        short[] c = new short[a.length+1];
        short carry = 0;
        int i = 0;
        for (i = a.length - 1; i >= 0; i--) {
            c[i+1] = (short) ((a[i] + b[i] + carry) % 2);
            carry = (short) ((a[i] + b[i] + carry) / 2);
        }
        if (carry > 0) c[0] = 1;
        return c;
    }
}
