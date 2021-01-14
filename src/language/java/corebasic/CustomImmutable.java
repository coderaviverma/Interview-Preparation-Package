package language.java.corebasic;

public final class CustomImmutable {

    private final String test;

    public CustomImmutable(String test) {
        //Set data from constructor
         //No setter only getter
        this.test = test;
    }


    public String getTest() {
        return test;
    }
}
