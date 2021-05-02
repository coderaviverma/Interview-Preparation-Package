package practice.ds.array;

public class Sort012Array {

    public static void main(String[] args) {
        //sort the array with lowest sorting posible
        //On
        int[] a={0,2,1,2,0,1,2};

            solve(a);
        for (int b:a){
            System.out.print(b);
        }

    }

    public static void solve(int[] a){
        int low=0,mid=0,temp=0,high=a.length-1;

        while (mid<=high){
            switch (a[mid]){
                case 0:{
                    temp=a[low];
                    a[low]=a[mid];
                    a[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=a[high];
                    a[high]=a[mid];
                    a[mid]=temp;
                    high--;
                    break;
                }

            }
        }


    }

    public static void swap(int[] a,int p1,int p2){
        int temp=a[p1];
        a[p1]=a[p2];
        a[p2]=temp;
    }

}
