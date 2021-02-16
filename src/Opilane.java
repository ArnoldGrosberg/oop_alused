import java.util.ArrayList;

public class Opilane {
    ArrayList<String> teadmised = new ArrayList<>();
    private String nimi;

    public Opilane(String nimi) {
        this.nimi = nimi;
    }

    public void unusta(String mida) {
        this.teadmised.remove(mida);
        Double teadmisedIse = Math.random();
        teadmisedIse = teadmisedIse + (110 * Math.random());
        if (teadmisedIse >= 100.00) {
            ArrayList<String> teadmisedIseList = new ArrayList<>();
            teadmisedIseList.add("OOP");
            teadmisedIseList.add("Pärilus");
            teadmisedIseList.add("Kapseldus");
            teadmisedIseList.add("Kompositsioon");
            int lististSuvakalt = round(Math.random());
            opib(mida);
        }
    }

    public void opib(String mida) {
        this.teadmised.add(mida);
        Double unustamine = Math.random();
        unustamine = unustamine + (110 * Math.random());
        if (unustamine >= 100.00) {
            unusta(mida);
        }
    }

    public String getNimi() {
        return nimi;
    }

    public ArrayList<String> getTeadmised() {
        return teadmised;
    }
}
