package practice.ds.string;

public class TwoAnagramStrings {

    public static void main(String[] args) {

        String a="banana";
        String b="ananab";

        System.out.println(isAnagram(a,b));

    }

    public static boolean isAnagram(String s1,String s2){

        if (s1.length()!=s2.length()) return false;

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        int[] ch=new int[1<<8];

        for (char a:s1.toCharArray()) {
            ch[a]++;
        }
        for (char a:s2.toCharArray()) {
            ch[a]--;
        }

        for (int a:ch){
            if (a!=0) return false;
        }

        return true;
    }
}
