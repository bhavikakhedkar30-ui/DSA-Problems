package GFG_LEETCODE.Array1D;

public class floorinsortted {
    static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int low = 0;
        int high = arr.length - 1;
        int x = 11;

        int ans = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] <= x) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println("Floor value on index " + ans);

        if (ans != -1) {
            System.out.println("Floor value = " + arr[ans]);
        }
    }

}
