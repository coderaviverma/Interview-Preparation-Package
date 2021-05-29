package practice.ds.greedyapproach;

import java.util.ArrayList;
import java.util.Arrays;

public class MeetingRoom {
//https://www.interviewbit.com/problems/meeting-rooms/
    public static void main(String[] args) {




    }


    private static int solve(ArrayList<ArrayList<Integer>> A){

        int[] start=new int[A.size()];
        int[] end=new int[A.size()];

        for (int i = 0; i < A.size(); i++) {
            start[i]=A.get(i).get(0);
            end[i]=A.get(i).get(1);
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int ind=0;
        for (int i = 0; i < A.size(); i++) {

            if (start[i]>=end[ind]){
                ind++;
            }
        }

        return end.length-ind;
    }
}
