// vana lahendus listiga ja pindala salvestamisega
import java.util.ArrayList;

public class Tuba extends AknadUksed {
    private Double pikkus = 0.0;
    private Double laius = 0.0;
    private Double kõrgus = 0.0;
    ArrayList<Double> aknad_uksed = new ArrayList<Double>();
    private Double pindala = 0.0;

    public void lisaAkkenUks(Double laius, Double kõrgus) {
        AknadUksed aknadUksed = new AknadUksed();
        aknadUksed.setLaius(laius);
        aknadUksed.setKõrgus(kõrgus);
        //aknadUksed.setPindala();
        this.aknad_uksed.add(aknadUksed.getPindala());
    }

    public Double tööPind() {
        Double uus_pindala = this.getPindala();
        for (int element = 0; element < aknad_uksed.size(); element++) {
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

    public void setPindala() {
        this.pindala = this.getKõrgus() * (this.getPikkus() * this.getLaius());
    }
}