package language.java.corebasic.thread;

public class Thread2 implements Runnable {

    private ObjA objA;


    public Thread2(ObjA objA) {
        this.objA = objA;
    }

    @Override
    public void run() {

        objA.m2();
    }
}
