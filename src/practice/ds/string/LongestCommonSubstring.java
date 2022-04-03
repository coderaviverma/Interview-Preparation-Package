package practice.ds.string;

public class LongestCommonSubstring {

    public static void main(String[] args) {
        String s1="ABAB";
        String s2="BABA";

       String res= longestSubstring(s1,s2);

        System.out.println(res);
    }

    //Top Down Approach
    public static String longestSubstring(String s2,String s1){
        String out="";

        if (s1.length()==0 || s2.length()==0){
            return out;
        }

        int[][] cache=new int[s1.length()][s2.length()];

        for (int i = 0; i < s1.length(); i++) {

            for (int j = 0; j < s2.length(); j++) {

                if (s1.charAt(i)==s2.charAt(j)){

                    if (i==0 || j==0){
                        cache[i][j]=1;
                    }else {
                        cache[i][j]=cache[i-1][j-1]+1;
                    }

                    if (cache[i][j]>out.length()){
                        int strt=i-cache[i][j]+1;
                        out=s1.substring(strt,i+1);
                    }
                }

            }

        }

        return out;
    }
}
