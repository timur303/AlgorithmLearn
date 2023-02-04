package kg.kadyrbekov.sort;
/**
 * @author Timur Kadyrbekov
 */

public class SortWithPuzur {
    public static void main(String[] args) {

        int[] array = new int[]{22, 34, 12, 2, 3, 2, 23};

        printSort(array);

        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSort = false;
                }

            }
            printSort(array);
        }

    }

    private static void printSort(int[] arr) {
        System.out.println("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }

    }
}
