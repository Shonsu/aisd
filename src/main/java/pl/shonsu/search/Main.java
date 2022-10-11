package pl.shonsu.search;

import static pl.shonsu.search.Search.simpleSearch;

public class Main {
    public static void main(String[] args) {

        int[] tab = new int[]{7, 3, 4, 89, 43, 2, 34, 5, 8, 4, 45};
        int v = 48;
        int index = simpleSearch(tab, v);
        System.out.println(index);

    }

}
