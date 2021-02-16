import java.util.ArrayList;
import java.util.Random;

public class Opilane {

    // list teadmistest
    ArrayList<String> teadmised = new ArrayList<>();
    private String nimi;

    // nimi õpilasele
    public Opilane(String nimi) {
        this.nimi = nimi;
    }

    // Õpilane unustab midagi ja on võimalus, et ta õpib midagi
    public void unusta(String mida) {
        this.teadmised.remove(mida);
        // võimalus ise õppida midagi
        Double teadmisedIse = Math.random();
        teadmisedIse = teadmisedIse + (220 * Math.random());
        // suvakas arv peab olema üle 100 või 100.00, et õppida iseseisvalt
        if (teadmisedIse >= 100.00) {
            // list mida õppida iseseisvalt
            ArrayList<String> teadmisedIseList = new ArrayList<>();
            teadmisedIseList.add("OOP");
            teadmisedIseList.add("Pärilus");
            teadmisedIseList.add("Kapseldus");
            teadmisedIseList.add("Kompositsioon");
            Random rand = new Random();
            // suvakas arv 0-3, et õppida iseseisvalt midagi listist
            int lististSuvakalt = rand.nextInt(4);
            // lisab õppitud asja listi
            opib(teadmisedIseList.get(lististSuvakalt));
        }
    }

    // Õpilane õpib
    public void opib(String mida) {
        this.teadmised.add(mida);
        // Võimalus unustada ära, mida õpilane just õppis
        Double unustamine = Math.random();
        unustamine = unustamine + (110 * Math.random());
        // Kui suvakas arv on üle 100 või 100 siis õpilane unustab ära teadmise
        if (unustamine >= 100.00) {
            unusta(mida); // Lisaks ta võib õppida midagi juurde, kui unustas midagi ära
        }
    }

    // getter
    public String getNimi() {
        return nimi;
    }

    // getter
    public ArrayList<String> getTeadmised() {
        return teadmised;
    }
}
