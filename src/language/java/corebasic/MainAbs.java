package language.java.corebasic;

public class MainAbs {


    public static void main(String[] args) {


        MyAbstract myAbstract=new MyAbstract() {
            @Override
            public void absM1() {
                super.absM1();
            }
        };


        ChildClass childClass=new ChildClass(2);



    }
}
