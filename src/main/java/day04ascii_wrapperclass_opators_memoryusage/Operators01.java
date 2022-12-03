package day04ascii_wrapperclass_opators_memoryusage;

public class Operators01 {

    /*
    1) " +,-,*,/ "  işlemleri Java'da matematikte kullanıldığı gibi kullanır.
    NOTE 1 : int / int = int olur.
    NOTE 2 : double / int = double olur. Çünkü Java'da matematiksel işlemlerde farklı data type'ları kullanılırsa sonuç büyük data type'inde olur.

    2)JAVA 'da "Logical Operators" lar vardır. AND(&&) ve OR(||) işlemleri "Logical Operators" lardır.
    NOTE :&& AND işleminden true alabilmek için her şey true olmalıdır.
           AND işlemi "perfectionist" tir.
           AND işleminde bir tane false sonucu false yapar.

    NOTE : || OR işleminde bir tane true sonucu true yapmaya yeter.(|| or symbol)
              OR işleminde sonucun false olması için her şey false olmalıdır.
              OR işlemi "polyanna" gibidir.

    NOTE : NOT Operatörü(!) true olanı false, false olanı true yapar.
            !true = false
            !false = true
            !!true = true

    3)(Comparison)Karşılaştırma Operatörleri
            <, >, <=, >=, ==, !=
            NOTE : Karşılaştırma operatörlerini kullandığınızda kesinlikle Boolean(True veya False) alırsınız.
        NOTE : Biz AND işlemi için "&&" kullanırız ama "&" kullanımda geçerlidir.
               Farkları nedir?
               && ilk ifade false olursa diğerlerini kontrol etmez daha hızlı çalışır.
               &  ilk ifade ne olusa lsun diğerlerini kontrol eder yavaş çalışır.
               bu yüzden biz "&&" kullanıcaz.
     */

    public static void main(String[] args) {

        boolean first = 3<5;//true
        boolean second = 2+3 != 5 ; //false
        boolean third = 2+3*5 >= 19 ;

        System.out.println(first + " - " + second + " - " + third);
        System.out.println(first && second);
        System.out.println(first || second || third);

    }
}
