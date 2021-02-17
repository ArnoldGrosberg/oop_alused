public class AknadUksed {
    private Double laius = 0.0;
    private Double kõrgus = 0.0;
    // Getterid ja setterid
    public Double getLaius() {
        return laius;
    }

    public void setLaius(Double laius) {
        this.laius = laius;
    }

    public Double getKõrgus() {
        return kõrgus;
    }

    public void setKõrgus(Double kõrgus) {
        this.kõrgus = kõrgus;
    }

    // Akna või ukse pindala arvutamise meetod
    public Double getPindala() {
        return this.getLaius() * this.getKõrgus();
    }
}