import java.util.ArrayList;

public class JaatiseKiosk extends Restoraan {
    ArrayList<String> jaatiseValik = new ArrayList<>();

    public ArrayList getJaatiseValik() {
        return jaatiseValik;
    }

    public void setJaatiseValik(ArrayList jaatiseValik) {
        this.jaatiseValik = jaatiseValik;
    }

    public void lisaJaatiseValik(String jaatis) {
        this.jaatiseValik.add(jaatis);
    }

    @Override
    public String toString() {
        return "jäätise kioski nimi on " + getRestoraaniNimi() + " ja jäätise valik antud kioskis on " + getJaatiseValik();
    }
}