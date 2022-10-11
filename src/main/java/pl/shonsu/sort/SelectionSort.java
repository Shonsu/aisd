package pl.shonsu.sort;

public class SelectionSort {

    public static void selectionSort3(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[min_index]) {
                    min_index = j;
                }
            }
            if(min_index!=i) {
                int tmp = tab[min_index];
                tab[min_index] = tab[i];
                tab[i] = tmp;
            }
        }
    }


    public static void selectionSort2(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[min_index]) {
                    min_index = j;
                }
            }
            int tmp = tab[min_index];
            tab[min_index] = tab[i];
            tab[i] = tmp;
        }
    }

    public static void selectionSort(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            int min = tab[i];
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < min) {
                    min = tab[j];
                    tab[j] = tab[i];
                    tab[i] = min;
                }
            }
        }
    }
}
