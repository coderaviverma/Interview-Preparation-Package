package language.java.corebasic.thread;

public class Thread3 implements Runnable {

    private ObjA objA;


    public Thread3(ObjA objA) {
        this.objA = objA;
    }

    @Override
    public void run() {

        objA.m3();
    }
}
