import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Яна on 24.02.2015.
 */
public class BubbleSort {

    public static void main(String... args) {

        int[] arr =
                {23, 7, 85, 207, 96, 16, 65, 83, 188, 709, 82, 12, 4, 50, 441};

        // неотсортированный массив
        System.out.println("Hе отсортированный массив: ");
        for (int q = 0; q < arr.length; q++) {
            System.out.print(arr[q] + " ");

        }

        System.out.println("\n" + "Введите число, для поиска индекса его");
        Scanner sc = new Scanner(System.in);
        int numberInArray = sc.nextInt();

        // поиск индекса
        boolean isFound = true;
        for (int w = 0; w < arr.length; w++) {
//            isFound = true;
            if (arr[w] == numberInArray) {
                System.out.println("Индекс числа " + numberInArray + " равен " + w);
                isFound = true;
//                 break;
            } else if (isFound != true)
                System.out.println("Индекс введенного числа не найден! ");
        }

        // сортировка пузырьком
        boolean Stop;
        for (int j = 0; j < arr.length - 1; j++) {
            Stop = true;
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    Stop = true;
                }
            }
        }
        System.out.println("\n" + "Отсортированный массив: ");
        for (int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + " ");
        }
        // поиск индекса числа в отсортированном массиве
        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;
        while (start <= end) {
            if (arr[middle] < numberInArray)
                start = middle + 1;
            else if (arr[middle] == numberInArray) {
                System.out.println("\n" + "Индекс числа " + numberInArray + " в отсортированном массиве равен " + middle);
                break;
            } else
                end = middle - 1;
            middle = (start + end) / 2;
        }
    }
}
//  тут каша) я не разобралась с ней
//        while (arr[(start + end) / 2] != numberInArray) {
//            if (arr[(start + end) / 2] < numberInArray) {
//                start = (start + end) / 2;
//              start = middle + 1;
//                    System.out.println(" ");
//                System.out.println("\n" + "Индекс числа " + numberInArray + " в отсортированном массиве равен " + start);
//                break;
//            } else {
//                end = (end + start) / 2;
//                System.out.println("\n" + "Индекс числа " + numberInArray + " в отсортированном массиве равен " + end);
//                break;
//            }













