package h3;

public class Mensch {

    public String name = "Felix";
    public int gebJahr = 2005;
    public int alter = 20;

    public void setName(String name1) {
        name = name1;
    }

    public void setGebJahr(int gebJahr1) {
        gebJahr = gebJahr1;
    }

    public void setAlter() {
        alter = 2025 - gebJahr;
    }

    public String getName() {
        return name;
    }

    public int getGebJahr() {
        return gebJahr;
    }

    public int getAlter() {
        return alter;
    }

}
