// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;

public class Bubble_Sort {


    public static  void bubbleSort(int[] arr) {
        boolean swapped = true;
        int temp;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
        }

    }

    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int[] test1 = {3,2,5,1};

        System.out.println(Arrays.toString(test1));

        bubbleSort(test1);


        System.out.println(Arrays.toString(test1));


    }
}