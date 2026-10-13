package GFG_LEETCODE.Array1D;

public class PrintColumnfirst {
    static void main(String[] args) {
        int [][] arr = {{1,4,8},{3,6,9},{2,4,8}};
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
