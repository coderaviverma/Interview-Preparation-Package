package testclass.done;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class IHSDemo {

    public static void main(String[] args) {

        int[] A={5,6,3,2,1,2,4,1,2};
        int n=A.length;
        //1,2,3,4,5,6,-1,-1,-1
        //1,1,2,2,2,3,4,5,6
        //1,2,-1,2,2,3,4,5,6,-1
        //1,2,-1,2,
        //1,2,2,-1
        Arrays.sort(A);

        //select

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {

                if (i!=j){
                    if (A[i]==A[j]){
                        A[j]=-1;
                    }
                    if (A[j]==-1){
                        swap(A,j);
                    }
                }

            }
        }


       Arrays.stream(A).forEach(System.out::println);
    }

    public static void swap(int A[],int j){

        if (A[j]==-1){
            int temp=A[j+1];
            A[j]=temp;
            A[j+1]=-1;
        }

    }

}

