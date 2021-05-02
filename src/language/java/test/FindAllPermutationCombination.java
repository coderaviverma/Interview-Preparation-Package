package language.java.test;

public class FindAllPermutationCombination {


    public static void main(String[] args) {

        String str="ABC";
        int n=str.length();

        FindAllPermutationCombination permutationCombination=new FindAllPermutationCombination();
        permutationCombination.permute(str,0,n-1);
    }

    private void permute(String string,int l,int r){

        if (l==r){
            System.out.println(string);
        }else {
            for (int i=l;i<=r;i++){

                string=swap(string,l,i);
                permute(string,l+1,r);
                string=swap(string,l,i);
            }

        }
    }

    private String swap(String a,int i,int j){
        char temp;
        char[] chars=a.toCharArray();
        temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
        return String.valueOf(chars);
    }
}
