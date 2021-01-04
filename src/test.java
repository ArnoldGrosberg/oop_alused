/*
 * Ül 1.4b
 *
 * */

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        // lubame ksutajale sisestada midagi
        Scanner sisesnd = new Scanner(System.in);
        // Kasutaja andmed
        System.out.println("Sisestage oma nimi: ");
        String nimi = sisesnd.nextLine();
        System.out.println("Sisestaga lubatud kiirus (km/h): ");
        int kiirus = sisesnd.nextInt();
        System.out.println("Sisestaga tegelik kiirus (km/h): ");
        int tegelikkiirus = sisesnd.nextInt();
// arvutamine
        int vahe = kiirus - tegelikkiirus;
        int trahv = vahe * 3;
// arvestame maksimumiga
        trahv = Math.min(trahv, 190);
// väljastus
        String lauseosa = ", kiiruse ületamise eest on teie trahv ";
        System.out.println(nimi + lauseosa + trahv + " eurot");
    }
}
