package practice.ds.dp;

public class SubsetSum {

    public static void main(String[] args) {
        int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;
        if (isSubsetSum(set, n, sum) == true)
            System.out.println("Found a subset"
                    + " with given sum");
        else
            System.out.println("No subset with"
                    + " given sum");
    }

    private static boolean solve(int[] arr, int n, int sum) {
        if (sum == 0) return true;
        if (n == 0) return false;


        if (arr[n - 1] > sum) {
            return solve(arr, n - 1, sum);
        } else {
            return solve(arr, n - 1, sum) || solve(arr, n - 1, sum - arr[n - 1]);
        }

    }

    // Returns true if there is a subset
    // of set[] with sum equal to given sum
    static boolean isSubsetSum(int set[],
                               int n, int sum) {
        boolean[][] subsetTB = new boolean[sum + 1][n + 1];


        for (int i = 0; i <= n; i++) {
            subsetTB[0][i] = true;
        }

        for (int i = 0; i <= sum; i++) {
            subsetTB[sum][0] = false;
        }

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                if (i>=set[j-1]){
                    subsetTB[i][j]=subsetTB[i][j] || subsetTB[i-set[j-1]][j-1];
                }else{
                    subsetTB[i][j]=subsetTB[i][j-1];
                }
            }
        }

        return subsetTB[sum][n];
    }


//
//    // Returns true if there is a subset
//    // of set[] with sum equal to given sum
//    static boolean isSubsetSum(int set[],
//                               int n, int sum)
//    {
//        // Base Cases
//        if (sum == 0)
//            return true;
//        if (n == 0)
//            return false;
//
//        // If last element is greater than
//        // sum, then ignore it
//        if (set[n - 1] > sum)
//            return isSubsetSum(set, n - 1, sum);
//
//        /* else, check if sum can be obtained
//        by any of the following
//            (a) including the last element
//            (b) excluding the last element */
//        return isSubsetSum(set, n - 1, sum)
//                || isSubsetSum(set, n - 1, sum - set[n - 1]);
//    }
//
//    /* Driver code */
//    public static void main(String args[])
//    {
//        int set[] = { 3, 34, 4, 12, 5, 2 };
//        int sum = 9;
//        int n = set.length;
//        if (isSubsetSum(set, n, sum) == true)
//            System.out.println("Found a subset"
//                    + " with given sum");
//        else
//            System.out.println("No subset with"
//                    + " given sum");
//    }
}
