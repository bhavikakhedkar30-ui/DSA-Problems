package Array1D;

public class MaxAndMin {
    static void main(String[] args) {
        int[] arr = {10,20,30,60,85,75,95,45,5};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max< arr[i]){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum Element:- "+max);
        System.out.println("Minimum element:- "+min);
    }
}
