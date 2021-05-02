package practice.ds.string;

public class StringCompression {

    public static void main(String[] args) {

//        String a = "aaabbcdda";
        String a = "a";

        System.out.println(compress(a));
    }

    public static String compress(String a) {

        String out = "";
        int sum = 1;

        for (int i = 0; i < a.length() - 1; i++) {

            if (a.charAt(i) == a.charAt(i + 1)) {
                sum++;
            } else {
                out = out + a.charAt(i) + sum;
                sum = 1;
            }
        }
        out = out + a.charAt(a.length() - 1) + sum;

        return out.length() < a.length() ? out : a;
    }
}
