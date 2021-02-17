public class Restoraan {
    private String restoraaniNimi = "pole";
    private String soogiTyyp = "pole";
    private int kylalisteArv = 0;

    public void teenindatudKylalisedPaevas(int kylalised) {
        this.kylalisteArv = this.kylalisteArv + kylalised;
    }

    public int getKylalisteArv() {
        return kylalisteArv;
    }

    public void setKylalisteArv(int kylalisteArv) {
        this.kylalisteArv = kylalisteArv;
    }

    public String getRestoraaniNimi() {
        return restoraaniNimi;
    }

    public void setRestoraaniNimi(String restoraaniNimi) {
        this.restoraaniNimi = restoraaniNimi;
    }

    public String getSoogiTyyp() {
        return soogiTyyp;
    }

    public void setSoogiTyyp(String soogiTyyp) {
        this.soogiTyyp = soogiTyyp;
    }

    public String avaRestoraan() {
        return "Restoraan on lahti!";
    }

    @Override
    public String toString() {
        return "Tulid restoraani " + this.restoraaniNimi + " ja menüüs on " + this.soogiTyyp;
    }
}