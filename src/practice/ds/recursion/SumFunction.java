package practice.ds.recursion;

public class SumFunction {

    public static void main(String[] args) {
        int n=5555;
        System.out.println(solve(n));
    }


    static int solve(int n){
        if (n==1) return 1;

        return solve(n-1)+n;
    }
}
