package codingsites.hackerank;

import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // String s = scan.nextLine();
        int count = scan.nextInt();

        for(int j=0;j<count;j++){
            int s = scan.nextInt();
            int flag=0;

            if(s==0 || s==1){
                flag=1;
            }
            

            for(int i=2;i<s/2;i++){
                
                if(s%i==0){
                    flag=1;
                    break;
                }
            }


            if(flag==0){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }
        
    }
}


