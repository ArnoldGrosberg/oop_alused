/*
 * Ül 6.1
 *
 * */
import java.util.Scanner;

public class test {
    // bänner meetod
    static String bänner(String reklaamlause) {
        String reklaamlauseSuurteTähtedega = reklaamlause.toUpperCase();
        return reklaamlauseSuurteTähtedega;
    }

    //main meetod
    public static void main(String[] args) {
        // defineerime muutujad
        //lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Mitu korda kuvada reklaamlauset: ");
        // salvestame kasutaja sisestatud väärtus
        int kordamine = sisend.nextInt();
        // samuti sisendid
        sisend = new Scanner(System.in);
        System.out.println("Sisesta reklaamlauset: ");
        String lause = sisend.nextLine();
        // kordamine
        int kord = 0;
        while (kord < kordamine) {
            //väljastus
            System.out.println(bänner(lause));
            kord++;
        }
    }
}