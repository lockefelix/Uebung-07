package p1;

public class Bruch {

    public int z;
    public int n;

    public Bruch(int zaehler, int nenner) {
        z = zaehler;
        n = nenner;
        System.out.println(toString());
    }

    public String toString() {
        return this.z + ":" + this.n;
    }
}