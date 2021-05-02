package language.java.test;

public class FirstDuplicate {

    public static void main(String[] args) {

        int[] a={2,1,3,5,2,3};



        //best solution

        for (int i=0;i<a.length;i++){

            if (a[Math.abs(a[i])-1]<0){
                return;
            }

        }

    }


}
