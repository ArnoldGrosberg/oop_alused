/*
 * Ül 2.1
 *
 * */

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        // lubame ksutajale sisestada midagi
        Scanner sisesnd = new Scanner(System.in);
        // Kasutaja andmed
        System.out.println("Sisesta pilvede kõrgus: ");
        Double kõrgus = sisesnd.nextDouble();
        if (kõrgus > 6.0) {
            System.out.println("Need on ülemised pilved");
        } else {
            System.out.println("Need ei ole ülemised pilved");
        }
    }
    }

