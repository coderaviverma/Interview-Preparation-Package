package testclass.done;

public class RotateArray {

    //O(n2)
    void leftRotate(int[] arr,int d,int n){
        for (int i = 0; i < d; i++) {
            leftRotateByOne(arr,n);
        }
    }

    void leftRotateByOne(int[] arr,int n){
        int i,temp;
        temp=arr[0];
        for ( i = 0; i < n-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[i]=temp;
    }

    /* utility function to print an array */
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

    }

    public static void way1(){
        RotateArray rotate = new RotateArray();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n=arr.length;
        printArray(arr,n);
        rotate.leftRotate(arr, 2, n);
        rotate.printArray(arr, 7);
    }


    public static void main(String[] args) {
        way1();
    }
}
