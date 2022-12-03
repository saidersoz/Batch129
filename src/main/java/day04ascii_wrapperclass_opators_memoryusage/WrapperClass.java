package day04ascii_wrapperclass_opators_memoryusage;

public class WrapperClass {
    public static void main(String[] args) {
        //Primitive     :   char     - boolean - byte  - short -  int    - long  - float - double
        //Wrapper Class : Character  - Boolean - Byte  - Short - Integer - Long  - Float - Double
                //Wrapper Class'lar Non-Primitive'dir o yüzden çok yer kaplarlar.
                //O yüzden şart değilse Wrapper class kullanmayı tercih etmeyiz.


        int n = 12; //"n" yazıp nokta koyarsanız hiç method göremezsiniz, çünkü primitive'ler method içermez.
        Integer m = 12; //"m" yazıp nokta koyarsanız birçok method görürsünüz , çümkü "wrapper class" ' lar method içerir.


        byte p = 23;
        Byte r = 43;

        //Example 1 : short data type'nin minimum ve maximum değerlerini kod yazarak bulunuz.
        short minValue = Short.MIN_VALUE;
        System.out.println(minValue); //-32768

        short maxValue = Short.MAX_VALUE;
        System.out.println(maxValue); //32767

        System.out.println(minValue+maxValue);


        //Example 2 : int data type'nin minimum ve byte max değeri bul.
        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("TOPLAM : " + (intMin+byteMax));


        //Example 3 : i)Primitive int'i Wrapper Integer'a çevir
        int num = 22;
        Integer wrapperNum = num;
        System.out.println(wrapperNum);
        //        ii) Wrapper byte'i primitive byta'a çevir.
        Byte k = 54;
        byte primitiveK = k;
        System.out.println(primitiveK);//54

        //EXAMPLE 4: İ)Primitive CHAR'I Wrapper CHARACTER'E çevir
        //           ii) Wrapper Boolean'ı primitive boolean'a çevir.

        char a = 'a';
        Character wrapperA = a;
        System.out.println(wrapperA);

        Boolean gs = true;
        boolean gsCokİyi = gs;
        System.out.println(gsCokİyi);



        //Example 5 : Size String olarak verilen iki fiyatın toplamını ekrana yazdırın.
        String shirt = "400";
        String shoes = "5200";

        // Java'da "+" sembolü iki sayı arasında kullanılırsa "toplama işlemi" olur.
        // Java'da "+" sembolü iki string arasında veya bir string veya bir sayı arasında kullanılırsa "concatenation işlemi" olur.
        //NOTE: CONCATENATİON işlemlerinde Java matematikte ki işlem önceliği kurallarını kullanır.
        System.out.println(shirt+shoes); //4005200 ==> Concatenation(birleştirme) yapar.
        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat); //5600


        //Example 6 : Size String olarak verilen iki fiyatın toplamını ekrana yazdırın.
        //Note : Eger valueOf() methodu kullanirken String'in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz.
        //Bu hatayi duzeltmeyi ileride ogrenecegiz.

        String tv = "$11000";
        String radio = "$3000";

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);








    }
}
