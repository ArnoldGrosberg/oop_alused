public class yl4_omaeesnimi_perenimi {
    private int id;
    private String nimi;
    private double pikkus;
    private double mass;
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo() {
        this.info = this.nimi + "\n" + this.pikkus + "\n" + this.mass + "\n" + this.id;
    }

    public void Inimene(String nimi) {
        this.nimi = nimi;
        this.pikkus = 0.0;
        this.mass = 0.0;
        this.id = 0;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
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
        // kui kmi on suurem siis peab lahudama
        // ja kontrollida, kui on kmi nüüd korras
        // juhul kui suurem kui 24.9 siis suurendan kaalu 1kg võrra
        while (this.kmi() < 19.0) {
            this.suurendakaal();
        }

        if (this.kmi() >= 19.0 && this.kmi() < 25) {
            System.out.println("kmi on korras");
        }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}