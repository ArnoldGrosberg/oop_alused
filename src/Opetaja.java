public class Opetaja {
    private String nimi;
    // Õpetaja nimi
    public Opetaja(String nimi) {
        this.nimi = nimi;
    }

    // getter
    public String getNimi() {
        return nimi;
    }

    // õpetaja õpetab õpilasi
    public void opetab(Opilane nimi, String teema) {
        nimi.opib(teema);
    }
}
