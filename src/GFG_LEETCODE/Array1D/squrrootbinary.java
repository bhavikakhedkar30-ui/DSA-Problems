package GFG_LEETCODE.Array1D;

public class squrrootbinary {
    static void main(String[] args) {
        int n = 4 ;
        int root = 0 ;
        for (int i = 1; i < n ; i++) {
            if(i*i > n)break;
            root = i;


        }
        System.out.println(root);
    }
}
