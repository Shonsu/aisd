package pl.shonsu.search;

public class Search {
    public static int simpleSearch(int[] tab, int v) {
        int i = 0;
        boolean found = false;

        while (i < tab.length && !found) {
            if (v == tab[i]) {
                found = true;
            }
            i++;
        }
        if (found) {
            return i - 1;
        }
        return -1;

    }
}
