//package practice.ds.array;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Oracle {
//
//
//    public static void main(String[] args) {
////int[][]a={{1,3},{2,4},{5,7},{6,8}};
//int[][]a={{1,3}};
////        int[][] a = {{5, 6}, {6, 8}};
////        int[][] a = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
//
//        Integer[][] res = merge(a);
//
//        for (int i = 0; i < res.length; i++) {
//            System.out.println(res[i][0] + "," + res[i][1]);
//        }
//
//
//
//    }
//
//    public static int[][] merge(int[][] interval) {
////[[1,6],[3,4],[4,7],[6,8]]
////[[1,3],[2,4],[5,7],[6,8]]
////1,3,[10,12]
//        List<int[]> ls = new ArrayList<>();
//        int n = interval.length;
//
//        int[] temp = new int[2];
//        temp[0] = -1;//1
//        temp[1] = -1;//3
//        boolean addLast = true;
//
//        for (int i = 0; i < n; i++) {
//            int[] arr = interval[i];
//
//            if (temp[0] == -1) {
//                temp[0] = arr[0];
//                temp[1] = arr[1];
//                if (i == n - 1) {
//                    addLast = false;
//                }
//            } else if (temp[1] >= arr[0]) {
//                if (temp[1] < arr[1]) {
//                    temp[1] = arr[1];
//                }
//                if (i == n - 1) {
//                    addLast = false;
//                }
//            } else {
//                ls.add(temp);
//                temp = new Integer[2];
//                temp[0] = arr[0];
//                temp[1] = arr[1];
//                if (i == n - 1) {
//                    addLast = false;
//                }
//            }
//
//
//        }
//
//        if (!addLast) {
//            ls.add(temp);
//        }
//
//        return ls.toArray(new Integer[ls.size()][]);
//    }
//
//}
