package language.java.corebasic.thread.classobjectlock;

public class Thread4 implements Runnable {

    private ObjA objA;


    public Thread4(ObjA objA) {
        this.objA = objA;
    }

    @Override
    public void run() {

//        objA.m5();
        objA.m4();
    }
}
