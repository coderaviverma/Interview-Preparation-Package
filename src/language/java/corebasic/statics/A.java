package language.java.corebasic.statics;

public class A {

    public static void main(String[] args) {
        Def a=new Def(10);
        Def b=new Def(20);
        swap(a,b);
        System.out.println(a.val);
        System.out.println(b.val);
    }

    public static void swap(Def a,Def b){
        Def temp=a;
        a=b;
        b=temp;
    }


    public static void m1(){
        System.out.println("Class A static method ");
    }

    public static void m1(int val){
        System.out.println("Class A static method param "+val);
    }


    public void m2(){
        System.out.println("Class A non static method ");
    }

}


class Def{
    int val;

    public Def(int val) {
        this.val = val;
    }
}