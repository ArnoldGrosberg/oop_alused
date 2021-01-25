/*
 * Ristkülik kapseldus
 *
 */
public class Ristkylik {
    private double laius;
    private double korgus;

    // getter laius (annab väärtus, ise ei taha)
    public double getLaius() {
        return laius;
    }

    // setter laius (omistab konkreetne väärtus)
    public void setLaius(double laius) {
        this.laius = this.vaartuseKontroll(laius);
    }

    // getter korgus
    public double getKorgus() {
        return korgus;
    }

    // setter korgus
    public void setKorgus(double korgus) {
        this.korgus = this.vaartuseKontroll(korgus);
    }

    // funktsioon teeb negatiivsed väärtused positiivseks
    private double vaartuseKontroll(double vaartus) {
        if (vaartus < 0.0) {
            return Math.abs(vaartus);
        }
        return vaartus;
    }

    // väljastab toString vormis
    @Override
    public String toString() {
        return "Ristkylik: " + this.laius + " x " + this.korgus;
    }
}