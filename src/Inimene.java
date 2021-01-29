public class Inimene {
    private String nimi;
    private double pikkus;
    private double mass;

    public Inimene(String nimi) {
        this.nimi = nimi;
        this.pikkus = 0.0;
        this.mass = 0.0;
    }

    public String getNimi() {
        return nimi;
    }


    public double kmi() {
        double kehamassiindeks = this.mass / Math.pow(this.pikkus, 2);
        return kehamassiindeks;
    }

    // morphism
    public void suurendakaal() {
        this.mass++;
    }

    public void suurendakaal(double kg) {
        this.mass += kg;
    }

    public void normaalkaal() {
        // kui kmi on 19 - 24.9 - see on norm
        // kui kmi on < 19 - tuleb inimest sööta
        // nii, et on ta võtaks 1 kg juurde  iga kord
        while (kmi() < 19) {
            suurendakaal();
        }

        // kui kmi on suurem siis peab lahudama

        if (kmi() > 19 && kmi() < 24.9) {
            System.out.println("kmi on korras");
        }
        // ja kontrollida, kui on kmi nüüd korras

        // juhul kui suurem kui 24.9 siis suurendan kaalu 1kg võrra
        while (kmi() > 24.9) {
            suurendakaal(-1);
        }
        if (kmi() > 19 && kmi() < 24.9) {
            System.out.println("kmi on korras");
        }


    }

    public double getPikkus() {
        return pikkus;
    }

    public void setPikkus(double pikkus) {
        this.pikkus = pikkus;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

}
