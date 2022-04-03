package company.mmt;

/*
* Opening and closing hours for a store:
Given two arrays of size seven that respectively indicate opening and closing hours over days of week for a store, print the store hours in friendly format.
Special Conditions:
1. If opening hours are greater than closing hours, the store is assumed closed on that day.
2. If opening/closing hours are greater than 2400 hours or for any other error condition, the store is assumed closed that day.
3. If opening hours are equal to closing hours, the store is open for 24 hours.
Example:
Open - [900,1000,1000,1000,2700,1200,800]
Close - [1700,1600,1600,1600,1600,1200,800]
Output:
Mon: 900-1700
Tue-Thur: 1000-1600
Fri: Closed
Sat-Sun: Open 24 Hours
* */

import java.util.HashMap;
import java.util.Map;

public class Jan21 {

    public static void main(String[] args) {
//
//       int[] open ={900,1000,1000,1000,2700,1200,800};
//       int[] close ={1700,1600,1600,1600,1600,1200,800};

//       int[] open ={2700,2700,2700,2700,2700,2700,2700};
//       int[] close ={1700,1600,1600,1600,1600,1200,800};
//
//        int[] open = {900, 900, 900, 900, 900, 900, 900};
//        int[] close = {1700, 1600, 1600, 1600, 1600, 1200, 1200};

        int[] open = {1600, 1600, 1600, 1600, 1600, 1600, 800};
        int[] close = {1700, 1600, 1600, 1600, 1600, 1200, 1200};

        solve(open, close);
    }

    private static void solve(int[] open, int[] close) {
        String startDay = "";
        String endDay = "";
        int prevOpen = -1;
        int prevClose = -1;
        String prevStatus = "";
        String status = "";
        Map<Integer, String> hm = new HashMap<>();
        hm.put(0, "Mon");
        hm.put(1, "Tue");
        hm.put(2, "Wed");
        hm.put(3, "Thur");
        hm.put(4, "Fri");
        hm.put(5, "Sat");
        hm.put(6, "Sun");

        for (int i = 0; i < open.length; i++) {
            int ot = open[i];
            int ct = close[i];


            if ((prevOpen == ot && prevClose == ct) || (prevOpen == prevClose && ot == ct)
                    || ((prevOpen > 2400 || prevClose > 2400)&&(ot > 2400 || ct > 2400))) {
                endDay = hm.get(i);
                if (i == open.length - 1) {
                    System.out.println(startDay + "-" + endDay + ":" + status);
                }
            } else {
                if (!endDay.isEmpty()) {
                    System.out.println(startDay + "-" + endDay + ":" + status);
                    startDay = "";
                    endDay = "";
                } else if (!startDay.isEmpty()) {
                    if (prevOpen != ot || prevClose != ct) {
                        System.out.println(startDay + ":" + status);
                        startDay = "";
                    }
                }

                if (ot == ct) {
                    status = "Open 24 Hours";
                } else if (ot > ct || ot > 2400 || ct > 2400) {
                    status = "closed";
                } else {
                    status = ot + "-" + ct;
                }

                if (startDay.isEmpty())
                    startDay = hm.get(i);

                prevOpen = ot;
                prevClose = ct;

                if (i == open.length - 1) {
                    if (!endDay.isEmpty()) {
                        System.out.println(startDay + "-" + endDay + ":" + status);
                    } else if (!startDay.isEmpty()) {
                        System.out.println(startDay + ":" + status);

                    }
                }
            }


        }


    }


}
