/*
 * konto ülesanne täitsa tehtud
 *
 * */

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    // Kas tahad kontot
    static String konto() {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Kas tahad kontot teha (Jah/Ei)?: ");
        String nimiKontole = sisend.nextLine();
        return nimiKontole;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> konto = new HashMap<String, Integer>();
        // Loop, et on kogu aeg bank tööl, kontod olemas.
        while (1 > 0) {
            // Kui tahab siis mis nimi
            if (konto().equals("Jah")) {
                Scanner sisend = new Scanner(System.in);
                System.out.println("Sisestage kontonimi: ");
                String kontoNimi = sisend.nextLine();
                String kontonimi = kontoNimi.toUpperCase();
                konto.put(kontonimi, 0);
                System.out.println(kontonimi + " kontol on " + konto.get(kontonimi) + "€");
            }

            // Kas kontolt raha sisse
            System.out.println("Kas tahad kontole raha panna (Jah/Ei)? ");
            Scanner kontoleRahawSisse = new Scanner(System.in);
            String kontoleRahawSisseNüüd = kontoleRahawSisse.nextLine();
            if (kontoleRahawSisseNüüd.equals("Jah")) {
                Scanner sisend = new Scanner(System.in);
                System.out.println("Sisestage kontonimi: ");
                String kontoNimi = sisend.nextLine();
                String nimi = kontoNimi.toUpperCase();
                try {
                    if (konto.get(nimi).equals("null")) {
                        System.out.println("Katse, et teada, kas on olemas konto või ei ole");
                    }
                } catch (Exception e) {
                    System.out.println("Kontot pole olemas.");
                    System.exit(0);
                }
                System.out.println(nimi + " kontol on " + konto.get(nimi) + "€");
                System.out.println("Sisestage raha summa kontole: ");
                Integer kontoleRaha = sisend.nextInt();
                if (kontoleRaha < 0) {
                    System.out.println("Positiivne arv peab olema, et panna kontole raha.");
                } else {
                    konto.put(nimi, konto.get(nimi) + kontoleRaha);
                    System.out.println(nimi + " kontol on " + konto.get(nimi) + "€");
                }

            }

            // Kas kontolt raha ära
            System.out.println("Kas tahad kontolt raha võtta (Jah/Ei)? ");
            Scanner kontoleRahanüüd = new Scanner(System.in);
            String kontoleRahanüüd2 = kontoleRahanüüd.nextLine();
            if (kontoleRahanüüd2.equals("Jah")) {
                Scanner sisend = new Scanner(System.in);
                System.out.println("Sisestage kontonimi: ");
                String kontoNimi = sisend.nextLine();
                String nimi = kontoNimi.toUpperCase();
                try {
                    if (konto.get(nimi).equals("null")) {
                        System.out.println("Katse, et teada, kas on olemas konto või ei ole");
                    }
                } catch (Exception e) {
                    System.out.println("Kontot pole olemas.");
                    System.exit(0);
                }
                System.out.println(nimi + " kontol on " + konto.get(nimi) + "€");
                System.out.println("Sisestage raha summa kontolt ära võtmiseks: ");
                Integer kontoltRaha = sisend.nextInt();
                if (kontoltRaha < 0) {
                    System.out.println("Positiivne arv peab olema, et võtta kontolt raha.");
                } else {
                    konto.put(nimi, konto.get(nimi) - kontoltRaha);
                    if (konto.get(nimi) < 0) {
                        System.out.println("Pole piisavalt raha.");
                        System.exit(0);
                    }
                    System.out.println(nimi + " kontol on " + konto.get(nimi) + "€");
                }
            }
            System.out.println("Kas tahad kontolt raha ülekanda (Jah/Ei)? ");
            Scanner kontoleRahaTeisele = new Scanner(System.in);
            String kontoleRahaTeisele2 = kontoleRahaTeisele.nextLine();
            if (kontoleRahaTeisele2.equals("Jah")) {
                Scanner sisend = new Scanner(System.in);
                System.out.println("Sisestage kontonimi: ");
                String kontoNimi = sisend.nextLine();
                String nimi = kontoNimi.toUpperCase();
                try {
                    if (konto.get(nimi).equals("null")) {
                        System.out.println("Katse, et teada, kas on olemas konto või ei ole");
                    }
                } catch (Exception e) {
                    System.out.println("Kontot pole olemas.");
                    System.exit(0);
                }
                Scanner sisendÜle = new Scanner(System.in);
                System.out.println("Sisestage kontonimi, kellele raha läheb: ");
                String kontoNimi2 = sisendÜle.nextLine();
                String nimi2 = kontoNimi2.toUpperCase();
                try {
                    if (konto.get(nimi2).equals("null")) {
                        System.out.println("Katse, et teada, kas on olemas konto või ei ole");
                    }
                } catch (Exception e) {
                    System.out.println("Kontot pole olemas.");
                    System.exit(0);
                }
                System.out.println(nimi + " kontol on " + konto.get(nimi) + "€");
                System.out.println("Sisestage raha summa kontolt ülekandmiseks: ");
                Integer kontoltRaha = sisend.nextInt();
                if (kontoltRaha < 0) {
                    System.out.println("Positiivne arv peab olema, et võtta kontolt raha.");
                } else {

                    konto.put(nimi, konto.get(nimi) - kontoltRaha);
                    if (konto.get(nimi) < 0) {
                        System.out.println("Pole piisavalt raha.");
                        System.exit(0);
                    }
                    System.out.println(nimi + " kontol on " + konto.get(nimi) + "€");
                    konto.put(nimi2, konto.get(nimi2) + kontoltRaha);
                    System.out.println("Konto ülekanne " + nimi2 + " kontole on tehtud.");
                }

            }
        }
    }
}


/*
 * Konto ülesanne lahendus OOP kujul
 * Konstruktorid
 * */
/*
public class Test {
    public static void main(String[] args) {
        // loo Konto tüüpi objekt nimega annaKonto
        Konto annaKontoSEB = new Konto("Anna");
        Konto annaKontoSWED = new Konto("Anna");

        // lisan konkreetsed väärtused
        //annaKontoSEB.looKonto("Anna", 0.0);
        //annaKontoSWED.looKonto("Anna", 0.0);

        System.out.println("SEB");
        System.out.println("Konto omanik = " + annaKontoSEB.omanik);
        System.out.println("Konto bilans = " + annaKontoSEB.bilans);

        System.out.println("SWED");
        System.out.println("Konto omanik = " + annaKontoSWED.omanik);
        System.out.println("Konto bilans = " + annaKontoSWED.bilans);

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
*/
         /*
    }
}
*/