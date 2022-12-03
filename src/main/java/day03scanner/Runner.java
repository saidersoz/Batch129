package day03scanner;

public class Runner {

    public static void main(String[] args) {

        //Object nasıl oluşturulur ?
        //Class ismi  + objeye isim  + atama operatörü  + "new" keyword  +  Constructor
              Car          myCar             =                new              Car();
        System.out.println(myCar.fiyat);
        System.out.println(myCar.model);
        myCar.hareket();
        myCar.dur();

        System.out.println("" +
                "********************************************");

        Student myStudent = new Student();
        System.out.println(myStudent.name);
        System.out.println(myStudent.grade);
        System.out.println(myStudent.adress);
        myStudent.feed();
        myStudent.study();

    }
}
