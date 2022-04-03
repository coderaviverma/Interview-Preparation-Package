package language.java.corebasic.statics;

public class B extends A{

    public static void m1(){
        System.out.println("Class B static method ");
    }

    public void m2(){
        System.out.println("Class B non static method ");
    }
    public static void main(String[] args) {
        B b=new B();
        b.m2();
        b.m1();
        b.m1(10);
        A a=new B();
        a.m1();
        a.m2();
        B.m1(20);
    }
}
