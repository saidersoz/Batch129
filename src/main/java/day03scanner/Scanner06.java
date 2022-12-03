package day03scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli
        //bir sayinin ilk iki ve son iki basamagindaki
        //rakamlari toplamini yazdiran kodu yaziniz

        /*
        Bir sayının son rakamını alabilmek için o sayıyı 10 a bçlün kalana bakın
        Bir tam sayıyı bir tam sayıya bölerseniz java sonucu kesinlikle tam sayı yapar
        Java sonucu nasıl tam sayı yapar?
        Ondalık kısmı iptal eder
        Java yuvarlama işlemi yapmaz
        */

        Scanner input = new Scanner(System.in);
        System.out.println(" 5 basamaklı sayı giriniz : ");
        int number = input.nextInt();

        //son rakamı al
        int lastDigit = number%10;                    //"%" ==> (Modulus Operator)
        number = number/10;                           //38671 % 10 = 3867.1 java nokta'dan sonra ki sayıyı almaz.
        //sondan ikinci rakamı al                     //3867 % 10 = 386.7 java nokta'dan sonra ki sayıyı almaz.
        int secondLastDigit = number%10;              //386 % 10 = 38.6 java nokta'dan sonra ki sayıyı almaz.
        number = number/10;                           //38 % 10 = 3.8 java nokta'dan sonra ki sayıyı almaz.
        //sondan üçüncü rakamı al                     //3 % 10 = 3 küçük sayıyı 10'a böldük kalan 3 olduğu için sonuç 3.
        int thirdLastDigit = number%10;
        number = number/10;
        //sondan dördüncü rakamı al
        int fourthLastDigit = number%10;
        number = number/10;
        //sondan beşinci rakamı al
        int fifthLastDigit = number%10;
        number = number/10;

        System.out.println(lastDigit+secondLastDigit+fourthLastDigit+fifthLastDigit);


    }
}
