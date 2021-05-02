package language.java.corebasic.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionBasic {


    public static void main(String[] args) {

        try (FileInputStream f = new FileInputStream(""))
        {
            System.out.println("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(tryCatch1());
    }


    private static int tryCatch1(){

        try{
//            int a=5/0;

//            System.exit(0);
            System.out.println("try");
            return 1;
        }catch (Exception e){
            System.out.println("catch ");
            return 2;
        }finally {
            System.out.println("finally");
            return 3;
        }
    }
}
