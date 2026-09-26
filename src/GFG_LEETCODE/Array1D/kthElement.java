package GFG_LEETCODE.Array1D;

public class kthElement {

        public static void main(String[] args) {

            int[] arr = {7, 2, 10, 4, 1, 8, 5};
            int k = 3;

            // GFG_LEETCODE.Array1D.Sort the array
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {

                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            int kthSmallest = arr[k - 1];
            int kthLargest = arr[arr.length - k];

            System.out.println("Kth Smallest = " + kthSmallest);
            System.out.println("Kth Largest = " + kthLargest);
        }

}
