package company.mmt;

public class Question1 {
//    Name : Avinash Verma
//    Current organization : Optum, UnitedHealth Group
//    Total years of experience: 5.5
    private static final String a="";

    public static void main(String[] args) {

        System.out.println(solve(5));
        System.out.println(solve(18));
        System.out.println(solve(21));
        System.out.println(solve(44));
        System.out.println(solve(47));

    }


    private static String solve(int n){
        boolean value=false;

        if (n>2) {
            if (n % 2 == 0) {
                value = true;
            }

            for (int i = 3; i < n/2; i = i + 2) {

                if (n % i == 0) {
                    value = true;
                }
            }
        }
        return value?"Yes":"No";
    }
}
