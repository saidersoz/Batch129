package day02datatypesmethodcreation;

public class MethodCreation01 {

        /*
                                        Java'da method nasıl oluşturulur?

                      1)Main method'un dışında oluşturulur
                      2)Acces Modifier + Return Typye + Method İsmi + () + {}



                                        Oluşturulan methodlar nasıl kullanılır?
                      1)main method'un içinde kullanıllır
                      2method'un ismini + () yazın.
         */

    public static void main(String[] args) {
        int sonuc = add(30,50);
        System.out.println(sonuc);

        long carpmaSonuc = multiply(3,6);
        System.out.println(carpmaSonuc);

        int ucluSonuc = multiplyAndAdd(2,5,8);
        System.out.println(ucluSonuc);

        double kup = kupHesaplama(5);
        System.out.println(kup);
    }
    public static int add(int a,int b){
        return a+b;

    }

    protected static long multiply(int a,int b){
        return a*b;
    }

    //Ornek 1: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu toplayan method'u olusturunuz ve kullaniniz.

    private static int multiplyAndAdd (int a,int b,int c){
        return a*b+c;

    }

    //Ornek 2: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz.
    //Access Modifier'i default yapmak access modifier'i yazmayınız.
    static double kupHesaplama(double a){
        return a*a*a;
    }


}
