/*
 * hashMap tüüpi object
 * võti ja väärtus String või int või muu
 * inimese nimi võti ja hüüdnimi väärtused
 *
 * matti - mage
 * mihhail - mixu
 * artu -arppa
 *
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

    public static void main(String[] args) {
        HashMap<String, String> grupp = new HashMap<String, String>();
        grupp.put("matti", "mage");
        grupp.put("mihhail", "mixu");
        grupp.put("artu", "arppa");
        System.out.println(grupp.values());
        for (String nimi : grupp.keySet()) {
            System.out.println(nimi + " - " + grupp.get(nimi));
        }
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisestage nimi: ");
        String nimi = sisend.nextLine();
        nimi = nimi.toLowerCase();
        System.out.println(nimi + " - " + grupp.get(nimi));
    }
}
