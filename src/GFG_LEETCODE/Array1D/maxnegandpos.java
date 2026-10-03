package GFG_LEETCODE.Array1D;

public class maxnegandpos {
    static void main(String[] args) {
        int[] arr = {-5,-4,-3,-1,0,0,1,2,6,8,9,10};

        int low = 0;
        int high = arr.length - 1;
        int firstZero = arr.length;

// Find first 0
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= 0) {
                firstZero = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int neg = firstZero;


// Find first positive
        low = 0;
        high = arr.length - 1;
        int firstPositive = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > 0) {
                firstPositive = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int pos = arr.length - firstPositive;

        System.out.println("Negative = " + neg);
        System.out.println("Positive = " + pos);

    }
}
