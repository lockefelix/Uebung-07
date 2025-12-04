package p1;

public class P1_main {
    public static void main(String[] args) {
        int z1 = 1;
        int z2 = 3;
        int n1 = 4;
        int n2 = 6;

        Bruch a = new Bruch(1, 2);
        Bruch b = new Bruch(4, 2);

        multFrac(z1, n1, z2, n2);
    }

    public static void multFrac(int z1, int n1, int z2, int n2) {
        int zGen = z1 * z2;
        int nGen = n1 * n2;

        String bruch = zGen + ":" + nGen;
        System.out.println(bruch);
    }

    public static void multFrac(Bruch a, Bruch b) {

    }
}