package company.oracle;

public class StringDemo {

    private static int a=0;

    static {
        a=5;
        System.out.println(a);
    }

    public static void main(String[] args) {
        a=10;

        System.out.println(" called "+a);
    }
}
