import java.util.HashSet;
/**
 * Innercollections
 */
import java.util.Iterator;

public class collections {

    public static void main(String args[]) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("change here");
        HashSet<String> set2 = new HashSet<>();

        set2.add("e");
        set2.add("f");

        set.addAll(set2);
        Iterator<String> i1 = set.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }

        System.out.println("change here");
        set.removeAll(set2);
        Iterator<String> i2 = set.iterator();
        while (i2.hasNext()) {
            System.out.println(i2.next());
        }

        int[] arr1 = new int[] { 5, 6, 7, 8, 9, 4, 2, 1, 5 };
        int countEven = 0;
        int countOdd = 0;

        for (int j = 0; j < arr1.length; j++) {
            if (arr1[j] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

        }
        System.out.println("even number in arr=" + countEven + "odd number in array=" + countOdd);
        int[] arr2 = new int[] { 5, 6, 7, -8, 9, 4, 2, -1, -5 };

        int countNegNum = 0;
        for (int j = 0; j < arr2.length; j++) {
            if (arr2[j] < 0) {
                System.out.println(arr2[j]);
            }
        }
        // System.out.println("NegNum=" + countNegNum);

        int[] arr3 = new int[] { 5, 6, 7, -8, 9, 4, 2, -1, -5 };
        for (int j = 0; j < arr3.length; j++) {
            int temp = arr2[j];
            arr2[j] = arr2[arr2.length - 1 - j];
            arr2[arr2.length - 1 - j] = temp;
        }
        for (int j = 0; j < arr3.length; j++) {
            System.out.println(arr3[j]);
        }

    }
}
