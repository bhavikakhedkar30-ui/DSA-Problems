package GFG_LEETCODE.Array1D;

public class peakmountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,7,5,4};
        int n = arr.length;
        int peak = -1;
        for (int i = 1; i < n; i++) {
            if(arr[i]>arr[i-1] &&  arr[i]>arr[i+1]){
                peak = i;
            }
        }
        System.out.println(peak);

    }

}

