package language.java.corebasic.thread;

public class Thread4 implements Runnable {

    private ObjA objA;


    public Thread4(ObjA objA) {
        this.objA = objA;
    }

    @Override
    public void run() {

//        objA.m3();
        objA.m4();
    }
}
