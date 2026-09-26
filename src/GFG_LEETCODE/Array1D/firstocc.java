package GFG_LEETCODE.Array1D;

public class firstocc {
    public static void main(String[] args) {

            int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int ans = -1;
            int low = 0;
            int high =arr.length-1;
            int k = 8;

            while(low <= high){
                int mid = (low + high) / 2;

                if(k == arr[mid]){
                    ans = mid;
                    high = mid - 1;   // search left
                }

                if(k > arr[mid]){
                    low = mid + 1;
                }

                if(k < arr[mid]){
                    high = mid - 1;
                }
            }

            System.out.println(ans);
        }

    }

