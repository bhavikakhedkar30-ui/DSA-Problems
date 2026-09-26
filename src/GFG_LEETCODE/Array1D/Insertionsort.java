package GFG_LEETCODE.Array1D;
import java.util.Arrays;

public class Insertionsort {
    static void main(String[] args) {
        int[] arr  = {10, 5, 4, 3, 48, 2, 33, 53, 10};
        int n = arr.length-1;
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                while ( j >= 0 &&arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    j--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
