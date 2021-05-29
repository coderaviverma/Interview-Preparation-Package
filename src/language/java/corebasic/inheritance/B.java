package language.java.corebasic.inheritance;

public class B extends A {

    B(){
        System.out.println("B constructor");
    }

//    public void m1(){
//        System.out.println("M1 B");
//    }


    public void m2(){
        System.out.println("M2 A");
    }

    void m3(){
        System.out.println("M3 A");
    }


    void m5() throws NullPointerException{
        System.out.println("M3 A");
    }
}
