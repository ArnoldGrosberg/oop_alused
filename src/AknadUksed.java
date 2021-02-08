public class AknadUksed {
    private Double laius = 0.0;
    private Double kõrgus = 0.0;
    private Double pindala = 0.0;

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

    public Double getPindala() {
        return pindala;
    }

    public void setPindala() {
        this.pindala = this.getLaius() * this.getKõrgus();
        ;
    }
}
