/*
 * konto ülesanne
 *
 * */

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class test {
    // Kas tahad kontot
    static String konto() {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Kas tahad kontot teha (Jah/Ei)?: ");
        String nimiKontole = sisend.nextLine();
        return nimiKontole;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> konto = new HashMap<String, Integer>();

        // Kui tahab siis mis nimi
        if (konto().equals("Jah")) {
            Scanner sisend = new Scanner(System.in);
            System.out.println("Sisestage kontonimi: ");
            String kontoNimi = sisend.nextLine();
            String kontonimi = kontoNimi.toUpperCase();
            konto.put(kontonimi, 0);
            System.out.println(kontonimi + " kontol on " + konto.get(kontonimi));
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
            System.out.println(nimi + " kontol on " + konto.get(nimi));
            System.out.println("Sisestage raha summa kontole: ");
            Integer kontoleRaha = sisend.nextInt();
            konto.put(nimi, +kontoleRaha);
            System.out.println(nimi + " kontol on " + konto.get(nimi));

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
            System.out.println(nimi + " kontol on " + konto.get(nimi));
            System.out.println("Sisestage raha summa kontolt ära võtmiseks: ");
            Integer kontoltRaha = sisend.nextInt();
            konto.put(nimi, -kontoltRaha);
            System.out.println(nimi + " kontol on " + konto.get(nimi));

        }
    }
}
