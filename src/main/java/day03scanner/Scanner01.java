package day03scanner;

import java.util.Scanner;

public class Scanner01 {

    //Kullanıcıdan data alıp kodlarımızda kullancağız.

    public static void main(String[] args) {

        //1. Adım : Scanner Class'dan object oluştur.
        Scanner input = new Scanner(System.in);
        //2. Adım : Kullanıcıya ne istedğimize dair mesaj veriniz
        System.out.println("Lütfen yaşınızı giriniz : ");
        //3. Adım : Uygun Method'u kullanarak kullanıcının verdiği data'yı memory'e yerleştiriniz
        byte age = input.nextByte();

        System.out.println(age);


    }
}
