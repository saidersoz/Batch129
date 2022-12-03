package day01variables;

public class Variables01 {
    public static void main(String[] args) {

        //Variable oluşturmak
        //Java cümlesi = Statement
        //Java da Eşittir demek "==". Yani Matematik'de "=" , Java'da "=="
        //Java'da "==" "assigment operator" dir. Sağda ki değeri alır solda ki kutuya atar.
        //Access Modifier yazmazsanız "access modifier" "default" demektir.
        //Data Type + Variable Name == Variable Declaration
        //Assigment Operator(Atama operatörü) + Variable değeri == Assigment
        //Default değerler sayılar için 0'dır.........
        //Data Type'ni yazınız     Variable ismi yazınız     Assigment Operator(Atama operatörü)       Variable değeri     İngilizcede ki nokta gibi
                 int                        age                                =                               13                       ;

        //örnek 1: öğrenci ismi için variable oluşturup değer olarak alican atayınız.
        //string'lere verilen değerler çift tırnal içinde olmalıdır.
        //Stringler için "default value" "null" dır.
        String studentName = "Ali Can";

        /*
        Java da temelde iki tip data vardır;
        1)Primitive data type :
             char: Tek karakterler için kullanırlır. A,X,?,5,
             boolean: Booleanlar sadece iki farklı değer alabilirler ; True Or False
             byte: -128 den +127 ' ye kadar tam sayı değerleri için kullanılır (1 byte)
             short:-32768 ile +32767 arawsında ki tam sayılar için kullanılır (2 byte)
             int:-2,147,483,648 ile +2,147,483,647 arasında ki sayılar için
             long:-9,223,372,036,854,775,808 ile +9,223,372,036,854,775,807 arasında ki sayılar için
             float:
             double:
        2)non-primitive data type :
         */

        //Ornek2: char data type'ında ilk ismin ilk harfi olarak bir variable oluşturunuz ve bir değer atayınız
        // NOTE : Char data type'inde değerler tek tırnak içine konulur.
        char isminIlkHarfi = 'M';


        //Ornek 3 : booolean data type'inde emeklimisin için bir variable oluturun ve false değeri atayın
        boolean emeklımısın = false;


        //Ornek 4 : Byte data type'inde öğreci yasi için bir variable oluştur değer ata.
        byte ogrenciYasi = 18;


        //ornek 5 : Site nüfusu için bir variable oluştur değer ata.
        short siteNüfusu = 5998;


        //ornek 6 : Ülke  nufusu için variable oluştur değer ata.
        int countryPopulation = 1864184648;


        //ornek 7 : insan hücresi için variable oluştur değer ata.
        //Note : bir değer long ise sonuna "L" veya "l" konulur.
        long cellNumberInHumanBody = 9223372036854775807L;
        //eğer long'a atadığınız değer int'lerin aralığında ise sonuna "L" koymaya gerek yok.
        long gunesinAğırlığı = 123456;
    }
}
