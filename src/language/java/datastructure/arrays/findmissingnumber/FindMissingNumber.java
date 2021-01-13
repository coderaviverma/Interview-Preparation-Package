package language.java.datastructure.arrays.findmissingnumber;

import java.util.BitSet;

public class FindMissingNumber {

    public static void main(String[] args) {


        BitSet bitSet=new BitSet();
        bitSet.set(0);
        bitSet.set(1);
        bitSet.set(3);
        bitSet.set(5);


//        int value=bitSet.nextClearBit(0);
        System.out.println(bitSet.previousClearBit(0));
        System.out.println(bitSet.previousClearBit(1));
        System.out.println(bitSet.previousClearBit(2));
        System.out.println(bitSet.previousClearBit(3));
        System.out.println(bitSet.previousClearBit(4));
        System.out.println(bitSet.previousClearBit(5));
        System.out.println(bitSet.previousClearBit(6));
        System.out.println(bitSet.previousClearBit(7));


    }


    private static void findMissingNumber(){

    }
}
