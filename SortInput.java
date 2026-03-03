import java.util.*;

public class SortInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько чисел? ");
        int n = scanner.nextInt();

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число: ");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Возрастание: " + Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Убывание: " + Arrays.toString(arr));
    }
}