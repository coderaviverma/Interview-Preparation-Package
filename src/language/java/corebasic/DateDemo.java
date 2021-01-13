package language.java.corebasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String add=scan.nextLine();

        String edd=scan.nextLine();


//        System.out.print(calculateTheFine(add,edd));


        System.out.print(get_array());


    }


        public static int[] get_array() {
            return new int[]{1,2,3};
        }


        private static int calculateTheFine(String actualDate,String expDate){

        String dateFor="dd MM yyyy";
        SimpleDateFormat adate=new SimpleDateFormat(dateFor);
        Date ad,ed;
        try {
            ad = adate.parse(actualDate);
            ed = adate.parse(expDate);

            if(ad.equals(ed) || ad.before(ed)){
                return 0;
            }else if (ad.after(ed)){
                if (ad.getYear()>ed.getYear()){
                    return 10000;
                }else {
                    if (ad.getMonth()>ed.getMonth()){

                        return 500 *(ad.getMonth()-ed.getMonth());
                    }else {

                        //Comparing dates
                        long difference = Math.abs(ad.getTime() - ed.getTime());
                        long differenceDates = difference / (24 * 60 * 60 * 1000);

                        return (int) differenceDates * 15;

                    }
                }
            }

        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }


        return 0;
    }
}
