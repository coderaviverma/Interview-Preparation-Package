package practice.ds.dp;

public class SubsetSumCount {

    public static void main(String[] args) {

        int set[] = {3, 11, 4, 12, 5, 2};
        int n=set.length;
        int sum=11;

        System.out.println(solve(set,n,sum));
    }

    private static int solve(int[] set, int n,int sum){

        int[][] res=new int[sum+1][n+1];

        res[0][0]=1;

        for (int i = 1; i <= sum; i++) {
            res[i][0]=0;
        }

        for (int i = 0; i <= n; i++) {
            res[0][i]=0;
        }

        for (int i = 0; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {

                if (i>=set[j-1]){
                    res[i][j]=res[i-1][j] + res[i-set[j-1]][j-1];
                }else{
                    res[i][j]=res[i][j-1];
                }


            }
        }

        return res[sum][n];
    }
}
