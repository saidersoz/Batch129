package day02datatypesmethodcreation;

public class Variables01 {


   //1)Primitive data type : --> char - bbolean - byte - short - int - long - float - double
   //Float : Virgüllü sayılar ( Ondalık sayılar - Decimal Numbers) için kullanılır. ( Fiyatlandırmalarda - 12.99)
   //Double : Virgüllü sayılar ( Ondalık sayılar - Decimal Numbers) için kullanılır. (Hücre Ağırlığı : 0.00000000121)

    // Note 1 : Primitive data type'larını Jaava oluşturmuştur,biz oluşturamayız.
    // Note 2 : Primitive Data type'larının isimlerinde sadece küçük harf kullanılır.
    // Note 3 : Primitive data'lar data type'lara göre memory de farklı farklı yer kaplarlar
    // Note 4 : Primitive data'lar içlerinde sadece sizin atadığınız değerleri barındırırlar

    public static void main(String[] args) {

        // Ornek 1 : Gömlek ve ayakkabı fiyatları için iki tane variable oluştur ekrana yazdır.
        //Nore : Java Ondalık sayıları(Decimal Numbers)'i otomatik olarak "double" kabul eder.
        //       Siz data type'ını "float" yazarsanız hata verir.
        //       float olmasında ısrar ediyorsanız sonuna "F" koymalısınız.
        //       float memory'de 4 byte yer kaplar, double iste 8 byte

        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;
        //System.out.println() --> Ekrana yazdırır ve pointer'i sonraki satıra koyar.
        //System.out.print() --> Ekrana yazdırır ve pointer'i aynı satırda tutar.
        System.out.println(shoesPrice + shirtPrice);


        //Ornek 2 : Hücre ağırlığı ve amip'in ağırlığı için iki tane variable oluştur ve ağırlıkları farkını yazdır.
        double weightCell = 0.0000000000122;
        double weightAmip = 0.0000000000451;
        System.out.println(weightAmip-weightCell);



        }
    }

