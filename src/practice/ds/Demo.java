package practice.ds;

public class Demo {

    public static void main(String[] args) {

        int[] a={1,8,6,2,5,4,8,3,7,1};

        System.out.println(solve(a));
    }

    private static int solve(int[] a){

        if (a!=null && a.length==0) return 0;

        int n=a.length;
        int i=0;
        int j=n-1;

        int max=-1;

        while(i<j){

            int minLevel=Math.min(a[i],a[j]);
            int tempVol=Math.abs(i-j)*minLevel;
            if (tempVol>max){
                max=tempVol;
            }

            if (a[i]>a[j]){
                j--;
            }else if (a[i]<a[j]){
                i++;
            }else if (a[i]==a[j]){

                if (i+1 < j-1){
                    if (a[i+1]>a[j-1]){
                        i++;
                    }else{
                        j--;
                    }
                }
            }

//            int minLevel1=Math.min(a[i],a[j]);
//            int tempVol1=(i+1-j)*minLevel1;
//            if (tempVol1>max){
//                max=tempVol1;
//            }
        }

        return max;
    }


}
