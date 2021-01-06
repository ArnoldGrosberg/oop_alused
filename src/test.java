/*
 * Ül 3.1
 *
 * */

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        // lubame ksutajale sisestada midagi
        Scanner sisesnd = new Scanner(System.in);
        // Kasutaja andmed
        System.out.println("Sisestage, mitu korda tuleb äratada: ");
        int kuipalju = sisesnd.nextInt();
        // While loop
        while (kuipalju > 0) {
            // väljastab
            System.out.println("Tõuse ja sära!");
            kuipalju--;
        }

        /*System.out.println("Sisestage kirja teema pealkiri: ");
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

         */
    }
    }

