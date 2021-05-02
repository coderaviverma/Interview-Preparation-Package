package practice.ds.recursion;

public class PrintPowerSetString {

    public static void main(String[] args) {

        String a="abcd";
        int index=-1;
        String curr="";

        solve(a,index,curr);

    }


    static void solve(String s,int index,String curr){
        int n=s.length();
        if (index==n){
            return;
        }
        //Print first subset
        System.out.println(curr);

        for (int i = index+1; i <n; i++) {

            curr+=s.charAt(i);

            solve(s,i,curr);

            curr=curr.substring(0,curr.length()-1);
        }

    }
}
