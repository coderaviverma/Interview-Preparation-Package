package company.gs;

public class GsMainDemo {


    public static void main(String[] args) {


//        LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
//        LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.

        String X = "AGGTAB";
        String Y = "GXTXAYB";
        int m = X.length();
        int n = Y.length();


    }

    static void lcs(String X,String Y,int m,int n){

        int[][] L = new int[m+1][n+1];
// Following steps build L[m+1][n+1] in bottom up fashion. Note
        // that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1]
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X.charAt(i-1) == Y.charAt(j-1))
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }

        int index = L[m][n];
        int temp = index;
        // Create a character array to store the lcs string
        char[] lcs = new char[index+1];

        lcs[index] = '\u0000'; // Set the terminating character
        // Start from the right-most-bottom-most corner and
        // one by one store characters in lcs[]
        int i = m;
        int j = n;

    }

}
