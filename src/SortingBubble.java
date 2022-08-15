import java.util.*;

public class SortingBubble {
    public static void main(String[] args) {
        final long N = 100_000_000;

        System.out.println("Сортировка Collections.sort");
        int[] array = new int[]{45, 11, 23, 45, 92358, 92, -12, 0, 98456, 94259023, 1, 35, 2, 9, 495};
        List<Integer> list = new ArrayList<>(array.length);
        for (int i : array) {
            list.add(i);
        }
        System.out.println(list);
        long startTimeCollections = System.currentTimeMillis();
        Collections.sort(list);
        long endTimeCollections = System.currentTimeMillis();
        System.out.println(list);

        System.out.println("Сортировка Пузырьком");
        long startTimeBubble = System.currentTimeMillis();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
                printArray(array);
            }
        }
        long endTimeBubble = System.currentTimeMillis();
        System.out.println("Collections sorting: " + (endTimeCollections - startTimeCollections) + " milliseconds");
        System.out.println("Bubble sorting: " + (endTimeBubble - startTimeBubble) + " milliseconds");
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}




