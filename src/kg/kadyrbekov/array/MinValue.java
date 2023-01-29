package kg.kadyrbekov.array;

public class MinValue {
    public static void main(String[] args) {

        int[] array = new int[]{20, 45, 6, 7, 99, 564, 55};

        int minValue = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                index = i;
            }

        }
        System.out.println("index " + index + " min " + minValue);
        System.out.println("first array " + array[0]);
        System.out.println("final array " + array[minValue]);

    }

}
