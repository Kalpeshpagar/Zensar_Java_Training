import java.util.*;
public class SecondArrElement {

    public static void second_arr(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        // int arr1[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }
        System.out.println(secMax);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


         System.out.println("Enter the number of elements in the array: ");
         int n = sc.nextInt();
 
         // Create an array of the specified size
         int[] array = new int[n];
 
         // Prompt the user to enter the elements
         System.out.println("Enter the elements of the array:");
 
         for (int i = 0; i < n; i++) {
             array[i] = sc.nextInt();
         }
        second_arr(array);
    }
}
