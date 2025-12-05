package h3;

public class H3_main {
    public static void main(String[] args) {

        Mensch Elsa = new Mensch();
        Elsa.setName("Elsa");
        Elsa.setGebJahr(2001);
        Elsa.setAlter();
        System.out.println(Elsa.getName());
        System.out.println(Elsa.getAlter());

    }
}
