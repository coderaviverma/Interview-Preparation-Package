package practice.ds;

import java.util.Arrays;

public class Chars {


    public static void main(String[] args) {
        String req="a**b$$$c";

        System.out.println(reverString(req));

    }

    private static String reverString(String s){
        char[] a=s.toCharArray();
        int n=a.length;
        int start=-1;
        int end =-1;
        int i=0;
        int j=n-1;
        char startA='a';

        while (i<j){

            if ((a[i]-startA)<26 && (a[i]-startA)>=0){
                start=i;
            }
            if ((a[j]-startA)<26 && (a[j]-startA)>=0){
                end=j;
            }

            if (start!=-1 && end !=-1){
                swap(a,start,end);
                start=-1;
                end=-1;
            }

            i++;
            j--;
        }
        return new String(a);
    }

    private static void swap(char[] a,int start,int end){
        char temp=a[start];
        a[start]=a[end];
        a[end]=temp;
    }

}
