package pl.shonsu.sort;

public class InsertSort {

    public static void sort(int[] tab, SortDirection sortDirection) {
        boolean asc = sortDirection.equals(SortDirection.ASC);

        int key = 0;
        for (int j = 1; j < tab.length; j++) {
            key = tab[j];
            int i = j - 1;
            while (i >= 0 && tab[i] > key == asc) {
                tab[i + 1] = tab[i];
                i--;
            }
            tab[i + 1] = key;
        }
    }

    enum SortDirection {
        ASC, DESC;
    }
}
