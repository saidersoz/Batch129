package day04ascii_wrapperclass_opators_memoryusage;

public class AsciiValues {
    // Java ' da her karakterin sayısal bir değeri vardır.  a:97  A:65
    // Bu değerler ASCII Değer'ler olarak adlandırılır
    //Bu değerlerin bulunduğu tabloya ASCII Table denir.
    public static void main(String[] args) {

        //Herhangi bir karakterin ACII değerini bulmak için "int" data tipinde bir variablenin içine koyuyunuz.
        int ch = 'A';

        System.out.println(ch);

        int aa = '!';
        System.out.println(aa);

        char c1 = 'K';
        char c2 = '?';
        //Java'da char'ları matematiksel işlemlerde kullanırsanız,Java o char'ların ASCII değerlerini verir...
        System.out.println(c1+c2); //138
    }
}
