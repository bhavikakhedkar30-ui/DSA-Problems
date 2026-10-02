package GFG_LEETCODE.Array1D;

public class singleamongdouble {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,50,50,65,65};
        int n = arr.length;

        if (n == 1) System.out.println(arr[0]);

        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            if (arr[mid] == arr[mid + 1]) {
                // Pair is correct, single element is on the right
                low = mid + 2;
            } else {
                // Pair is broken, single element is on the left or is mid
                high = mid;
            }
        }

        System.out.println(arr[low]);
    }
}
