public class Inimene {
    public String nimi;
    private double pikkus = 0;
    private double mass = 0;

    public Inimene(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }


    public double kmi() {
        double kehamassiindeks = this.mass / (this.pikkus * this.pikkus);
        return kehamassiindeks;
    }

    public double getPikkus() {
        return pikkus;
    }

    public void setPikkus(double pikkus) {
        // pean jagama 100, sest muidu on liiga suured väärtused, meetrides peab olema
        this.pikkus = pikkus / 100;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

}
