/*
 * Ül 1.3
 *
 * */

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        // defineerime muutujad2
        // lubame ksutajale sisestada midagi
        Scanner sisesnd = new Scanner(System.in);
        // selvestame kasutaja sisestatud väärtus
        System.out.println("Sisestage astme alus: ");
        int astmeAlus = sisesnd.nextInt();
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage astendaja: ");
        // salvestame ksutaja sisestatud väärtus
        int astendaja = sisesnd.nextInt();
        // arvutamine
        int tulemus = (int) Math.pow(astmeAlus, astendaja);
        // väljastamine
        System.out.println(tulemus);
    }
}
