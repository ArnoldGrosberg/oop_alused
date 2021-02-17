// Toode
// hinnaga
// kogusega
// nimetusega
public class Toode {
    public Double hind;
    public int kogus;
    public String nimetus;

    // konstruktor
    public Toode(String nimetus, double hind, int kogus) {
        this.nimetus = nimetus;
        this.hind = hind;
        this.kogus = kogus;

    }

    // meetod
    public void valjastaToode() {
        System.out.println(this.nimetus + ", " + "hind " + this.hind + "€, " + "kogus " + this.kogus);
    }

}