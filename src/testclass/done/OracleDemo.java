package testclass.done;

public class OracleDemo {

    public static void main(String[] args) {

        int n = 20;
        int a = 0;
        int b = 1;


        System.out.print(a + " " + b + " ");

        for (int i = 0; i <= n; i++) {

            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }


    }
}
