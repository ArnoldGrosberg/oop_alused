/*
 * meetod + return - näide
 * Ül 6.2
 * */
import java.util.Scanner;

public class test {
    // bänner meetod
    static double mahlapakkideArv(double ounteKogus) {
        double pakkideArv = (int) Math.round(ounteKogus * 0.4 / 3);
        return pakkideArv;
    }

    //main meetod
    public static void main(String[] args) {
        // defineerime muutujad

        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage õunte kogus kilogrammides: ");
        //lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // salvestame kasutaja sisestatud väärtus
        double ounteKogus = sisend.nextDouble();
        // arvutamine
        System.out.println(mahlapakkideArv(ounteKogus));
    }
}