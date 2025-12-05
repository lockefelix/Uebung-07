package p1;

public class P1_main {
    public static void main(String[] args) {
        int z1 = 1;
        int z2 = 3;
        int n1 = 4;
        int n2 = 6;

        Bruch a = new Bruch(z1, n1);
        Bruch b = new Bruch(z2, n2);

        multFrac(z1, n1, z2, n2);
        multFrac(a, b);
    }

    public static void multFrac(int z1, int n1, int z2, int n2) {
        int zErg = z1 * z2;
        int nErg = n1 * n2;

        String Ergebnis = zErg + ":" + nErg;
        System.out.println(Ergebnis);
    }

    public static void multFrac(Bruch a, Bruch b) {
        int zErg = a.z * b.z;
        int nErg = a.n * b.n;

        String Ergebnis = zErg + ":" + nErg;
        System.out.println(Ergebnis);
    }
}