package h2;

import static java.util.Arrays.*;

public class H2_main {
    public static void main(String[] args) {

        int start = 0;
        int end = 1;

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {54, 2, 3, 4, 5};

    }

    public static int[] change(int[] a, int[] b, int start, int end) {
        if (end > start) {

            if (compare(a, b) == 0) {

                sort(a);
                int[] newArr = copyOfRange(a, start, end);
                return newArr;

            } else {

                int from = 0;
                int to = a.length;

                int[] newArr = copyOfRange(a, from, to);
                return newArr;

            }

        } else {

            return new int[0];

        }

    }

    /*public static boolean arrayIdentisch(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a.length != b.length) {
                return false;
            }
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] cloneArray(int[] a) {
        int[] newArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            newArr[i] = a[i];
        }
        return newArr;
    }*/
}