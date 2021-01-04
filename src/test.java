/*
 * Ül 2.2
 *
 * */

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        // lubame ksutajale sisestada midagi
        Scanner sisesnd = new Scanner(System.in);
        // Kasutaja andmed
        System.out.println("Sisesta punktide summa: ");
        Double punktid = sisesnd.nextDouble();
        if (punktid >= 0 && punktid < 66) {
            System.out.println("Vähem kui kandideerimiseks vajalik");
        } else if (punktid >= 66 && punktid < 85) {
            System.out.println("Kandideerimine vastuvõtule");
        } else if (punktid >= 85 && punktid <= 100) {
            System.out.println("Vastuvõtt tagatud");
        } else if (punktid < 0 || punktid > 100) {
            System.out.println("Vigane punktisumma");

        }
    }
    }

