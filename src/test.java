/*
 * Ül 3.4c
 *
 * */

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        // lubame ksutajale sisestada midagi
        Scanner sisesnd = new Scanner(System.in);
        // Kasutaja andmed
        System.out.println("Sisestage täisarv: ");
        int sisestus = sisesnd.nextInt();
        int nisuteri = 1;
        int korrudaja = 2;
        int malenupp = 1;
        // arvutamine
        while (malenupp < sisestus) {
            nisuteri = nisuteri * korrudaja;
            malenupp += 1;
        }
        //väljastus
        System.out.println("Nisuteri " + sisestus + ". ruudu eest: " + nisuteri);
    }
    }

