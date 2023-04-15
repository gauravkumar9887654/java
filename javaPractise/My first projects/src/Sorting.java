import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class BubbleSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println(arr);

    }

    public void checkPrime() {
        Scanner st = new Scanner(System.in);
        System.out.println("enter any num");
        int num = st.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
    }
}

public class Sorting {
    public static void main(String[] args) {

        // Bubble Sort

        // BubbleSort b = new BubbleSort();
        // b.sort(arr);

        // while (i < arr.length) {
        // System.out.println(arr[i]);
        // i++;
        // }
        BubbleSort b = new BubbleSort();
        b.checkPrime();
        Scanner sc = new Scanner(System.in);

        System.out.println("Java Program to insert element at end of Array");
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter the value for index " + i + ":");
            arr1[i] = sc.nextInt();
        }

        // 6 5 4 3 2 1
        // 5 4 3 2 1
        for (int i = 6; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 9; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println(5);
        }
        int[] arr2 = { 5, 6, 7, 3, 2 };
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
