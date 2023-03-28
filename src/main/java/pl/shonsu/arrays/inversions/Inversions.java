package pl.shonsu.arrays.inversions;

import java.util.ArrayList;
import java.util.List;

class Inversions {

    public static List<String> determine(int[] tab) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] > tab[j]) {
                    result.add(stringBuilder(tab[i], tab[j]));
                }
            }
        }
        return result;
    }

    private static String stringBuilder(int a, int b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(',');
        sb.append(b);
        return sb.toString();
    }

}
