package company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import static java.lang.Long.sum;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Test {

    public static void main(String[] args) {
//        List<Integer> ls = new ArrayList<>();
//        for (int i = 0; i < 21; i++) {
//            ls.add(i);
//        }
//        AtomicInteger integer = new AtomicInteger(10);
//
//        integer.getAndAdd(10);
//
////        ls.stream().filter(o -> o % 2 == 0).forEach();
//        BiConsumer<Test, String> test = Test::test;
//
////        System.out.println(total);
//
//
////        Map<String,Integer> mp=ls.stream().collect(groupingBy(String.class,));
//    //T1
//        //T2
//
//
////        --------
//        Array  = [3, 4, 1, 3, 2, 1,5, 2, 4,6]

        int[] arr={3, 4, 1, 3, 2, 1,5, 2, 4,6};
        int k =4;
        solve(arr,k);
    }

    private static void solve(int[] arr,int k){

        int start=0;
        int end = 0;
        int n=arr.length;


        Map<Integer, Integer> hm=new HashMap<>();

        while(end<n){


            if(hm.containsKey(arr[end])){
                hm.put(arr[end],hm.get(arr[end])+1);
            }else{
                hm.put(arr[end],1);
            }
            int temp = end - start +1;

            if(temp == k){

                //sout(hm.size());
                System.out.println(hm.size());

                if(hm.containsKey(arr[start])){
                    hm.put(arr[start],hm.get(arr[end])-1);

                    if(hm.get(arr[start])==0){
                        hm.remove(arr[start]);
                    }
                }

                start++;
            }

            end++;

        }


    }



}
