package pl.shonsu.sort;

import pl.shonsu.search.BinarySearch;

public class InsertSort {

    public static void sort(int[] tab, SortDirection sortDirection) {
        boolean asc = sortDirection.equals(SortDirection.ASC);

        int key;
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

    public static void sortWithBinary(int[] tab) {
        int key;
        for (int j = 1; j < tab.length; j++) {
            key = tab[j];

            int result = BinarySearch.binarySearch(tab, key, 0, j - 1);
            int ins = Math.abs(result + 1);

            for (int i = j - 1; i >= ins; i--) {
                tab[i + 1] = tab[i];
            }
            tab[ins] = key;

        }
    }

    public static void insertionSortRecursive(int[] arr, int n) {
        if (n <= 1)
            return;

        insertionSortRecursive(arr, n - 1);

        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }


    enum SortDirection {
        ASC, DESC
    }
}
