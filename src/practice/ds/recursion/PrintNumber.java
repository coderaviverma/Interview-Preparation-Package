package practice.ds.recursion;

public class PrintNumber {

    public static void main(String[] args) {

        int n=10;

       //printNumber(n);
        printNumber2(n);
    }

    private static void printNumber(int n){

        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }

    private static void printNumber2(int n){

        if (n==1){
            System.out.println(n);
            return;
        }
        printNumber2(n-1);
        System.out.println(n);

    }
}
