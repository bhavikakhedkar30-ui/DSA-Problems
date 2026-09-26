package GFG_LEETCODE.Array1D;

public class firstandlastoccerence {
    static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;
        int firstOcc = -1;
        int lastOcc = -1;
        int n = arr.length;

        //last occurrence
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == x) {
                lastOcc = i;
            }
        }
        // System.out.println(firstOcc);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == x) {
                firstOcc = i;
                break;
            }
        }
        System.out.println("[" + firstOcc + " , " + lastOcc + "]");
    }
}




