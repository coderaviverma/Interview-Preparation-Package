package practice.ds.matrix;// Input:  1    2   3   4
//         5    6   7   8
//         9   10  11  12
//         13  14  15  16
// Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
// Explanation: The output is matrix in spiral format. 

// Input:  1   2   3   4  5   6
//         7   8   9  10  11  12
//         13  14  15 16  17  18
// Output: 1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11
// Explanation :The output is matrix in spiral format.

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello LeetCoder");
        int[][] a={{1,2 ,3 ,4 }
        ,{5  ,  6 ,  7 ,  8}
        ,{9 ,  10 , 11 , 12}
        ,{13 ,14 ,15 ,16}};
        
        solve(a);

    }

    private static void solve(int[][] a){
        int i,j,k,l = 0;
        int m=a.length;
        int n=a[0].length;

        for(i =0;i<m;i++){
            
            for(j=0;j<n;++j){
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            n--;

            for(k=i;k<m;k++){
                System.out.print(" k "+ k +" j "+ j+" n "+ n+" m "+ m);
                System.out.print(a[k][j]);
                System.out.print(" ");
            }
            m--;

            for(j=k;j>l;j--){
                System.out.print(a[k][j]);
                System.out.print(" ");
            }
            
            for(l=m;l>i;l--){
                System.out.print(a[l][j]);
                System.out.print(" ");
            }

        }



    }
}