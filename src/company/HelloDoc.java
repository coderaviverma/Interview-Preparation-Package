package company;

import sun.tools.tree.Node;

import java.util.TreeMap;

public class HelloDoc {

    public static void main(String[] args) {

/*Consider you are given 2 strings S and T in that if the following condition is satisfied then you have to return true or return false. In S some n number of characters have to be replaced with number n itself in T.

For example: Halodoc  = H5c .. this is correct
Healthcare = H3thc3e .. this is incorrect
O(1)
O(n) - n larger string Halodoc
*/
//        String a="Halodoc";
//        String b="H5c";
        String a="Healthcare";
        String b="H3thc3e";

        System.out.println(solve(a,b));

        String demo="Welcome";

//        demo.substring(0,)


    }
//				45
//		30		     60
//	23 		    35.        55
//12           67
//[ 45, 60, 55, 12]
    TreeMap tm=new TreeMap();
    private void solve2(Node node, int level){//0 -45
        if (node==null)

        if (!tm.containsKey(level)){
            tm.put(level,node);//0,45 // 1,60 // 2,55 //3 67

        }else{

        }
//        solve2(node.right,level+1);
//        solve2(node.left,level+1);
    }



    private static boolean solve(String str,String req){

        if (str==null || str.isEmpty() || req == null || req.isEmpty()) return false;

        boolean result=true;

        char[] chars=str.toCharArray();
        char[] reqC=req.toCharArray();
        int counter=0;

        for(int i=0;i<chars.length;i++){//1

            if (chars[i]==reqC[counter]){//Ha  -> H5
                counter++;//1
            }else if (reqC[counter]<'A'){//65 //93
                int temB=reqC[counter]-'1';
                i=i+temB;
                counter++;
//                if (i==chars.length-1){
//                    return true;
//                }
            }else{
                return false;
            }

        }

        return result;
    }



}
