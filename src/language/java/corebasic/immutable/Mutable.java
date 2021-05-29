package language.java.corebasic.immutable;

public class Mutable extends Immutable {
     private int realValue;

     public Mutable(int value) {
         super(value);

         realValue = value;
     }

     public int getValue() {
         return realValue;
     }
     public void setValue(int newValue) {
         realValue = newValue;
     }

    public static void main(String[] arg){
        Mutable mutable=new Mutable(4);
        Immutable immutable=mutable;

        System.out.println(immutable.getValue());
        mutable.setValue(8);
        System.out.println(immutable.getValue());
    }
}