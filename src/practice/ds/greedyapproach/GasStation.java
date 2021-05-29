package practice.ds.greedyapproach;


import java.util.ArrayList;
import java.util.List;

public class GasStation {
    //https://www.interviewbit.com/problems/gas-station/
    //https://www.youtube.com/watch?v=zcnVaVJkLhY

    public static void main(String[] args) {
        List<Integer> gas=new ArrayList<>();
        List<Integer> cost=new ArrayList<>();

//        gas.add(1);
//        gas.add(2);
//        cost.add(2);
//        cost.add(1);


        gas.add(6);
        gas.add(7);
        gas.add(4);
        gas.add(10);
        gas.add(6);
        gas.add(5);

        cost.add(5);
        cost.add(6);
        cost.add(7);
        cost.add(8);
        cost.add(6);
        cost.add(4);

        System.out.println(solve(gas,cost));
    }

    private static int solve(final List<Integer> gas,final List<Integer> cost){
        int curretFuel=0;
        int remaning=0;
        int total=0;
        int start=0;

        for (int i = 0; i < gas.size(); i++) {

            remaning=gas.get(i)-cost.get(i);

            if (curretFuel>=0){
                curretFuel+=remaning;
            }else{
                curretFuel=remaning;
                start=i;
            }
            total+=remaning;

        }
        return total>=0?start:-1;

    }
}
