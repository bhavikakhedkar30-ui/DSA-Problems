package GFG_LEETCODE.Array1D;

public class merge2array {
    public static void main(String[] args) {
        int[] a = {2,4,6,9};
        int[] b = {1,3,7,8,10,11};

        int[] res= new int[a.length+b.length];

        int p = 0;
        int q = 0;
        int r =0;
        merge(a,b,res);
        for(int ele : res){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
    public static void merge(int[] a,int[] b,int[] res){
        int p = 0;
        int q = 0;
        int r =0;
        while(p<a.length && q<b.length){
            if(a[p]<b[q]){
                res[r++]=a[p++];
            }
            else if(a[p]>b[q]){
                res[r++]=b[q++];
            }
            else{
                res[r++]=a[p++];
            }

        }




    }



}

