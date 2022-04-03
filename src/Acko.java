import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Acko {


    public static void main(String[] args) {

        //Input : arr[] = {0, -1, 2, -3, 1, 3, -2, -3, 6}

        int arr[] = {0, -1, 2, -3, 1, 3, -2, -3, 6};

        solve(arr);
    }

    private static void solve(int[] arr){

        int n = arr.length;

        Map<Integer, List<Integer>> hm=new HashMap<>();

        for(int i=0 ;i< n;i++){

            if (hm.containsKey(arr[i])){
                List<Integer> ls=hm.get(arr[i]);
                ls.add(i);
                hm.put(arr[i],ls);
            }else {
                List<Integer> ls=new ArrayList<>();
                ls.add(i);
                hm.put(arr[i],ls);

            }
        }

        for(int i=0;i<n;i++){

            for(int j =i+1 ; j<n-1;j++){
                int temp = arr[i]+arr[j];
                int search= -temp;
                if(hm.containsKey(search)){
                    List<Integer> ls=hm.get(search);
                    if (ls.contains(i)){
                        ls.remove(i);
                    }
                    if (ls.contains(j)){
                        ls.remove(j);
                    }
                    if (ls.size()>0){
                        System.out.println(""+ arr[i]+","+arr[j]+","+search);
                    }

                }

            }


        }

    }

}
