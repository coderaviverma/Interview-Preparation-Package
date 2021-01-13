package language.java.mathquestion;

public class FindGCD {


    public static void main(String[] args) {


        System.out.println(findGCD(12,4));

    }


    private static int findGCD(int a,int b){

        if (b==0){
            return a;
        }else {
            return findGCD(b,a%b);
        }
    }


}
