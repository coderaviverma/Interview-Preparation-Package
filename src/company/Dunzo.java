package company;

import java.util.HashMap;
import java.util.Map;

public class Dunzo {
//    hr@interviewvector.com
    public static void main(String[] args) {

        addAmount("M","N",20.0);
        addAmount("L","M",70.0);
        addAmount("N","L",40.0);
        addAmount("N","K",100.0);

        System.out.println(findMostDebt());
        System.out.println(findMostOwed());
        System.out.println(findOwedMoney("N"));

    }
//M - N - L
    //
    private static Map<String,Double> sheet=new HashMap<>();
    private static Map<String,Map<String,Double>> pairsheet=new HashMap<>();

    private static void addAmount1(String a,String b, Double amount){

//        if (pairsheet.containsKey(a)){
//            pairsheet.put(a,pairsheet.get(a));
//        }else {
//            pairsheet.put(a,amount-(amount*2));
//        }
//
//        if (sheet.containsKey(b)){
//            sheet.put(b,sheet.get(b)+ amount);
//        }else {
//            sheet.put(b,amount);
//        }

    }

    private static void addAmount(String a, String b, Double amount) {

        if (sheet.containsKey(a)) {
            sheet.put(a, sheet.get(a) + (amount - (amount * 2)));
        } else {
            sheet.put(a, amount - (amount * 2));
        }

        if (sheet.containsKey(b)) {
            sheet.put(b, sheet.get(b) + amount);
        } else {
            sheet.put(b, amount);
        }

    }

    private static String findMostDebt(){
        String name = "";
        Double amount=Double.MAX_VALUE;
        for (Map.Entry<String, Double> mp :sheet.entrySet()) {

            if (amount>mp.getValue()){
                amount=mp.getValue();
                name= mp.getKey();
            }

        }
        return name;
    }

    private static String findMostOwed(){
        String name = "";
        Double amount=Double.MIN_VALUE;
        for (Map.Entry<String, Double> mp :sheet.entrySet()) {

            if (amount<mp.getValue()){
                amount=mp.getValue();
                name= mp.getKey();
            }

        }
        return name;
    }

    private static Double findOwedMoney(String name){
        return sheet.get(name);
    }


}
