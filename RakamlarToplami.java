package Donguler;

import java.util.Scanner;

public class RakamlarToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam = 0;

        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        while (sayi != 0) {
            toplam = toplam + (sayi % 10);
            sayi = sayi / 10;
        }
        System.out.println(toplam);
    }
}
