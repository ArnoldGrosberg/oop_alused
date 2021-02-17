public class Voodi {
    private String stiil;
    private int padjad;
    private int tekid;
    private int lina;
    private int korgus;

    public Voodi(String stiil, int padjad, int tekid, int lina, int korgus) {
        this.stiil = stiil;
        this.padjad = padjad;
        this.tekid = tekid;
        this.lina = lina;
        this.korgus = korgus;
    }

    public String getStiil() {
        return stiil;
    }

    public int getPadjad() {
        return padjad;
    }

    public int getTekid() {
        return tekid;
    }

    public int getLina() {
        return lina;
    }

    public int getKorgus() {
        return korgus;
    }

    public void valmis() {
        System.out.println("Voodi on valmis");
    }
}