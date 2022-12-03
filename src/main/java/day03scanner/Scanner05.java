package day03scanner;

import java.util.Scanner;

public class Scanner05 {

    //Kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alın
    //i)alanı hesaplayınnız ==> kısa kenar * uzun kenar
    //ii)çevresini hesaplayınız ==> 2*kısa kenar + 2*uzun kenar

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Dikdörtgenin Kısa Kenarını Giriniz : ");
        double kısaKenar = input.nextDouble();

        System.out.println("Lütfen Dikdörtgenin Uzun Kenarını Giriniz : ");
        double uzunKenar = input.nextDouble();

        System.out.println("Alan : "+ (kısaKenar*uzunKenar));
        System.out.println("Çevre : "+ (2*kısaKenar + 2*uzunKenar));

    }
}
