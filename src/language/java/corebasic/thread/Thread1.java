package language.java.corebasic.thread;

public class Thread1 implements Runnable {

    private ObjA objA;


    public Thread1(ObjA objA) {
        this.objA = objA;
    }

    @Override
    public void run() {

        objA.m1();
    }
}
