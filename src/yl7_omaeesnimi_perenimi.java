public class yl7_omaeesnimi_perenimi {
    private Double laius = 0.0;
    private Double pikkus = 0.0;
    private Double kõrgus = 0.0;
    private Double aknad_uksed = 0.0;

    // Tapeedirullide meetod
    public int tapeedirull(Double laius, Double pikkus) {
        Double tapeedirull = laius * pikkus;
        Double tapeedirullid = 0.0;
        int miturulli = 0;
        while (tapeedirullid <= this.tööPind()) {
            tapeedirullid += tapeedirull;
            miturulli++;
        }
        return miturulli;
    }

    // Akna ja ukse lisamise meetod
    public void lisaAkkenUks(Double laius, Double kõrgus) {
        AknadUksed aknadUksed = new AknadUksed();
        aknadUksed.setLaius(laius);
        aknadUksed.setKõrgus(kõrgus);
        setAknad_uksed(getAknad_uksed() + aknadUksed.getPindala());
    }

    // Pindala arvutamise meetod
    public Double pindala() {
        return this.getKõrgus() * (this.getPikkus() * this.getLaius());
    }

    // Tööpinna arvutamise meetod
    public Double tööPind() {
        Double uus_pindala = pindala() - aknad_uksed;
        return uus_pindala;
    }

    // Getterid ja setterid
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

    public Double getKõrgus() {
        return kõrgus;
    }

    public void setKõrgus(Double kõrgus) {
        this.kõrgus = kõrgus;
    }

    public Double getAknad_uksed() {
        return aknad_uksed;
    }

    public void setAknad_uksed(Double aknad_uksed) {
        this.aknad_uksed = aknad_uksed;
    }
}
