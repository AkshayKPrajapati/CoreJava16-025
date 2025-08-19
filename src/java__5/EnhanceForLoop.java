
import java.util.Arrays;
import java.util.List;

public class EnhanceForLoop {
    public static void main(String[] a) {

        int[] arr = {12, 34, 45, 56, 78};

        // Traditional for loop on array
        System.out.println("Integer Array Elements (using traditional for loop):");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Enhanced for-each loop on integer array
        System.out.println("Integer Array Elements (using enhanced for loop):");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        System.out.println();

        // String array
        String[] str = {"hello", "Hey", "Bye", "Welcome"};
        System.out.println("String Array Elements:");
        for (String string : str) {
            System.out.print(string + ", ");
        }

        System.out.println();

        // Integer List
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("Integer List Elements:");
        for (int val : list) {
            System.out.print(val + " ");
        }

        System.out.println();

        // String List
        List<String> list2 = Arrays.asList("Hello", "Bye", "Welcome", "Good", "Morning", "Evening");
        System.out.println("String List Elements:");
        for (String strings : list2) {
            System.out.print(strings + " ");
        }

        System.out.println("End of the program !!!");
    }
}
