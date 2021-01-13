package language.java.datastructure.bitwisE;

public class ArithematicUsingBitwise {


    public static void main(String[] args) {


        System.out.println(addWithoutOperator(5,4));
        System.out.println(multiplicationWithoutOperator(5,4));

    }


    private static int addWithoutOperator(int a, int b){


        while (b!=0){

            int carry=a&b;

            a=a^b;

            b=carry<<1;

        }


        return a;
    }


    private static int multiplicationWithoutOperator(int a,int b){

        int res=0;

        while (b>0){

            if ((b&1)!=0){
                res=res+a;
            }

            a=a<<1;
            b=b>>1;
        }

        return res;
    }

}
