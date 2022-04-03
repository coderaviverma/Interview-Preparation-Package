package company;

import java.util.Map;
import java.util.TreeMap;

public class MMT {

    public static void main(String[] args) {
        ///[(1,5), (10, 18), (20, 22),  (34, 40)]
        //(25, 29)
        //(21, 29)
        //(21,35)

        TreeMap<Integer,Integer> tm=new TreeMap<>();
        tm.put(1,5);
        tm.put(10,18);
        tm.put(34,40);
        tm.put(20,22);//19,33


        int[] add=new int[2];
        add[0]=19;
        add[1]=35;


        System.out.println(solve(tm,add).toString());
    }


    private static TreeMap<Integer,Integer> solve(TreeMap<Integer,Integer> tm, int[] add){

        TreeMap<Integer,Integer> res=new TreeMap<>();
        boolean found=false;

        for (Map.Entry<Integer,Integer> tem:tm.entrySet()){

            if (tem.getValue()>add[0] && !found){
                int key=Math.min(tem.getKey(),add[0]);
                int val=Math.max(tem.getValue(), add[1]);
                add[0]=key;
                res.put(key,val);
                found=true;
            }else if (tem.getKey()<add[1]){
                int val=Math.max(tem.getValue(), add[1]);
                res.put(add[0],val);
            }else{
                res.put(tem.getKey(),tem.getValue());
            }

        }

        return res;
    }
}
