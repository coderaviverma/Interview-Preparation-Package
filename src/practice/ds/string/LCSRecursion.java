package practice.ds.string;

import java.util.Map;

public class LCSRecursion {
    //Longest common subsequence;

    public static void main(String[] args) {

//        String a="ABABABAB";
//        String b="BABBAB";
        String a = "AGGTAB";
        String b = "GXTXAYB";

        char[]achar=a.toCharArray();
        char[] bchar=b.toCharArray();
        int n=a.length();
        int m=b.length();

        System.out.println(LCSrec(achar,n,bchar,m));

    }

    private static int LCSrec(char[] a,int n,char[] b, int m){
        if (m==0 || n==0) return 0;

        if (a[n-1]==b[m-1]){
//            System.out.println(a[n-1]);
            return 1+LCSrec(a,n-1,b,m-1);
        }else {
            return Math.max(LCSrec(a,n,b,m-1),LCSrec(a,n-1,b,m));
        }
    }
}
