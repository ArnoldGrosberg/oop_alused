import java.util.ArrayList;

public class Tuba extends AknadUksed {
    ArrayList<Double> aknad_uksed = new ArrayList<Double>();
    private Double pikkus = 0.0;
    private Double laius = 0.0;
    private Double kõrgus = 0.0;
    private Double pindala = 2 * kõrgus * (this.pikkus * this.laius);

    public void lisaAkkenUks(Double laius, Double kõrgus) {
        this.aknad_uksed.add(laius);
        this.aknad_uksed.add(kõrgus);
    }

    public Double tööPind() {
        Double uus_pindala = this.pindala;
        for (int element = 0; element > aknad_uksed.size(); element++) {
            uus_pindala = uus_pindala - aknad_uksed.get(element);
        }
        return uus_pindala;
    }

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

    public Double getPindala() {
        return pindala;
    }
}
