package language.java.corebasic.polymorphism;

import java.io.IOException;

public class B extends C{

    public static void m1() {

        System.out.println("Class A m1");
    }

    @Override
    public String m2() throws IOException {
        return null;
    }
}
