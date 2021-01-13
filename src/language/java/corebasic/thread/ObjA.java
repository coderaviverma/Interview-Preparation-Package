package language.java.corebasic.thread;

public class ObjA  {


     synchronized void m1(){

        try {
            System.out.println("m1 Running....");
            Thread.sleep(10000);
            System.out.println("m1 End....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

     synchronized void m2(){

        try {
            System.out.println("m2 Running....");

            Thread.sleep(10000);
            System.out.println("m2 End....");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    synchronized static void m3(){


        try {
            System.out.println("m3 Running....");

            Thread.sleep(10000);
            System.out.println("m3 End....");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized static void m4(){


        try {
            System.out.println("m4 Running....");

            Thread.sleep(10000);
            System.out.println("m4 End....");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
