package pl.shonsu.search;

public class BinarySearch {
    public static int binarySearch(int[] tab, int search) {
        int startIdx = 0;
        int endIdx = tab.length - 1;
        int mid;
        while (startIdx <= endIdx) {
            mid = (startIdx + endIdx) / 2;

            if (search == tab[mid]) {
                return mid;
            } else if (search < tab[mid]) {
                //startIdx = startIdx;
                endIdx = mid - 1;
            } else {
                startIdx = mid + 1;

            }
        }
        return -(startIdx) - 1;
    }

    public static int binarySearch(int[] tab, int search, int startIdx, int endIdx) {
        int mid;
        while (startIdx <= endIdx) {
            mid = (startIdx + endIdx) / 2;

            if (search == tab[mid]) {
                return mid;
            } else if (search < tab[mid]) {
                endIdx = mid - 1;
            } else {
                startIdx = mid + 1;

            }
        }
        return -(startIdx) - 1;
    }

    public static int binarySearchRecursive(int[] tab, int search, int startIdx, int endIdx) {
        if (startIdx <= endIdx) {
            int mid = (startIdx + endIdx) / 2;
            if (search == tab[mid]) {
                return mid;
            } else if (search < tab[mid]) {
                return binarySearchRecursive(tab, search, startIdx, mid - 1);
            } else {
                return binarySearchRecursive(tab, search, mid + 1, endIdx);
            }
        }
        return -(startIdx) - 1;
    }

}
