public class AknadUksed {
    private Double pikkus = 0.0;
    private Double laius = 0.0;
    private Double pindala = this.pikkus * this.laius;

    public Double getPikkus() {
        return pikkus;
    }

    public void setPikkus(Double pikkus) {
        this.pikkus = pikkus;
    }

    public Double getLaius() {
        return laius;
    }

    public void setLaius(Double laius) {
        this.laius = laius;
    }

    public Double getPindala() {
        return pindala;
    }
}
