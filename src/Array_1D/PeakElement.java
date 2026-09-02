package Array_1D;

//Peak Element: An element that is greater than its immediate neighboring
// elements. If there are multiple peaks, you can return any one of them.
public class PeakElement {

    static void main(String[] args) {
        int[] arr = {1, 8, 9, 6, 7, 2};
        int peak = 0;
        int n = arr.length;

        if (n == 1) {
            peak = arr[0];
        } else if (arr[0] > arr[1]) {
            peak = arr[0];
        }
        else if (arr[n-1] > arr[n-2]) {
            peak = arr[n-1];
        }
        else {
            for (int i = 1; i < n-2; i++) {
                if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                    peak = arr[i];
                }
            }
            System.out.println(peak);


        }
    }
}
