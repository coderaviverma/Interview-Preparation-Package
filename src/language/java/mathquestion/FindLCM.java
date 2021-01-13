package language.java.mathquestion;

public class FindLCM {


    public static void main(String[] args) {


        System.out.println(findLCM(15,20));
    }


    private static int findLCM(int a,int b){

        return (a*b)/findGCD(a,b);
    }

    private static int findGCD(int a,int b){

        if (b==0){
            return a;
        }else {
            return findGCD(b,a%b);
        }
    }
}
