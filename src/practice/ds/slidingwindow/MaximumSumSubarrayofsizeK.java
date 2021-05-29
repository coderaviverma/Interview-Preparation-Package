package practice.ds.slidingwindow;

public class MaximumSumSubarrayofsizeK {
//https://www.geeksforgeeks.org/find-maximum-minimum-sum-subarray-size-k/
    //Complexity - On
    public static void main(String[] args) {

        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        int n = arr.length;

        System.out.println(maxSum(arr,n,k));
    }


    private static int maxSum(int[] a,int n,int k){

        if (n<k){
            System.out.println("Can't print number");
            return -1;
        }

        //Calculate sum of first window
        int res=0;
        for (int i = 0; i < k; i++) {
            res+=a[i];
        }

        //Calculate sum of other window by removing the sum

        int curr_sum=res;

        for (int i = k; i < n; i++) {

            curr_sum+=a[i]-a[i-k];
            res=Math.max(res,curr_sum);
        }

        return res;
    }


}
