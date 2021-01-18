/*
 * Konto ülesanne lahendus OOP kujul
 *
 * */
public class Test {
    public static void main(String[] args) {
        // loo Konto tüüpi objekt nimega annaKonto
        Konto annaKontoSEB = new Konto();
        Konto annaKontoSWED = new Konto();
        // lisan konkreetsed väärtused
        annaKontoSEB.looKonto("Anna", 0.0);
        annaKontoSWED.looKonto("Anna", 0.0);
        annaKontoSEB.voteRaha(10.0);

        annaKontoSEB.lisaRahaSelgitus(annaKontoSEB.lisaRaha(20.0));
        annaKontoSWED.lisaRahaSelgitus(annaKontoSWED.lisaRaha(-50.0));
        // väljastame tulemused
        System.out.println("SEB");
        System.out.println("Konto omanik = " + annaKontoSEB.omanik);
        System.out.println("Konto bilans = " + annaKontoSEB.bilans);
        annaKontoSEB.voteRaha(10.0);
        System.out.println("Konto bilans = " + annaKontoSEB.bilans);
        annaKontoSEB.voteRaha(20.0);
        System.out.println("Konto bilans = " + annaKontoSEB.bilans);
        annaKontoSEB.teeYlekanne(annaKontoSEB, 10.0);
        System.out.println();
        System.out.println("SWED");
        System.out.println("Konto omanik = " + annaKontoSWED.omanik);
        System.out.println("Konto bilans = " + annaKontoSWED.bilans);
        annaKontoSEB.voteRaha(10.0);
    }
}
