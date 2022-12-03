package day03scanner;

import java.util.Scanner;

public class Scanner02 {
    //Kullanıcıdan İlk ismini ve soy ismini alıp ikisini aynı satırda ekrana yazdırınız
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen İlk İsminizi Giriniz : ");
        //next() Method kullanıcıdan "tek kelimeli String" almak için kullanılır.
        String firstName = input.next();

        System.out.println("Lütfen Soy İsminizi Giriniz : ");
        String lastName = input.next();

        System.out.println(firstName +" "+ lastName);
    }
}
