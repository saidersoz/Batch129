package day02datatypesmethodcreation;

import java.util.Scanner;

public class Variables03 {
    public static void main(String[] args) {
        /*
        Non-Primitive Data Types : *String bir Non-Primitive Data Type'dır
                                   Üretilen her bir Class aynı zamanda bir "Non-Primitive Data Type'dır"
                                   bu yüzden Non-Primitive Data Type'lar sınırsız sayıdadır denilebilir.
                                   *Non-Primitive Data Type'ların isimleri büyük harf ile başlar.
                                   *Non-Primitive Data Type'ların tamamı için Java memory'de aynı miktarda yer ayırır.


               Interview Sorusu : "Primitive"  ve   "Non-Primitive" data type'ları arasında ki farklar nedir?
                                   1)Primitive'ler sadece bizim atadığımız değeri içerir
                                   "Non-Primitive" ler ise bizim atadığımız değer ve method'lar içerir.
                                   2)Primitive'ler küçük harfle başlar,"Non-Primitive" ler ise büyük harfle başlar.
                                   3)Primitive'leri Java üretmiştir ve 8 tanedir.
                                   "Non-Primitive" leri Java ve Developerlar üretebilir, sınırsız sayıdadırlar.
                                   4)Primitive'ler memory'de data type'ına göre yer kaplar,
                                   "Non-Primitive" ler için Java memory'de hep aynı büyüklükte yer alırlar.
         */

        //Ornek 1 : Şehir isimleri için bir variable oluştur. bir değer atayıp onu ekrana yazdır.
        String cityName = "İstanbul";
        System.out.println(cityName);



    }
}
