package practice.ds.matrix;

public class SearchInMatrix {
    //Search in matrix using binary search;
    //https://www.youtube.com/watch?v=41ON2EghJi0
    public static void main(String[] args) {

        int[][] a = {{1, 2, 3, 4, 5},
                    {6, 7, 8, 9, 10},
                    {11, 12, 13, 14, 15}};

        System.out.println(solve(a,11));
        System.out.println(solve(a,22));
    }


    private static boolean solve(int[][] b, int n) {

        int row_len = b.length;
        int col_len = b[0].length;

        int low = 0;
        int high = row_len * col_len;

        while (low<high){

            int mid=(low+high)/2;

            if (b[mid/col_len][mid%col_len]==n){
                return true;
            }else if (b[mid/col_len][mid%col_len]<n){
                low=mid+1;
            }else {
                high=mid;
            }

        }

        return false;
    }
}
