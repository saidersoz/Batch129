package day03scanner;

public class Car {

    //variable'lar oluşturalım
    public String model = "Corolla";
    public int fiyat = 20000;

    //methodlar oluşturalım
    //Return type "void" olduğunda method içerisinde "return" kelimesi kullanılmaz..
    public void hareket(){
        System.out.println("Corolla hızlı hareket eder...");
    }
    public void dur(){
        System.out.println("Corolla güvenli bir şekilde durur...");
    }
}

