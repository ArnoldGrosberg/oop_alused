/*
 * Ül 2.3d
 *
 * */

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        // lubame ksutajale sisestada midagi
        Scanner sisesnd = new Scanner(System.in);
        // Kasutaja andmed
        System.out.println("Sisestage kirja suurus: ");
        Double suurus = sisesnd.nextDouble();
        System.out.println("Sisestage kirja teema pealkiri: ");
        String pealkiri = sisesnd.nextLine();
// Miks mõlemat näitab?
        System.out.println("Kas kirjaga on kaasas fail? ");
        String fail = sisesnd.nextLine();
        if (suurus > 1 && fail == "Jah") {
            System.out.println("Kiri on spämm");
        } else if (pealkiri == "") {
            System.out.println("Kiri on spämm");
        } else if (pealkiri != "") {
            System.out.println("Kiri ei ole spämm");
        }
    }
    }

