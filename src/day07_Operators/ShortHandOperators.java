package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        //assignment

        int number = 100;
        System.out.println("number = " + number); //100

        number = 200;
        System.out.println("number = " + number); //200

        String word = "Java Programming";
        System.out.println("word = " + word); // "Java Programming"

       // word = "123" + 1 ; //1231
        System.out.println("word = " + word);

        word = "Wooden Spoon";
        System.out.println("word = " + word); //Wooden Spoon

        word = "Cydeo" ;
        System.out.println("word = " + word); //Cydeo

        System.out.println("------------------------------------------");

        //Addition Assignment Operator
        int x = 100;
        System.out.println(" x = " + x );
        System.out.println(x + 200); // 300
        System.out.println(" x = " + x);
        // x = x + 200;
        x+=200;
        System.out.println(" x = " + x);

        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1); // 2.5

        num1 += 5.5;

        System.out.println("num1 = " +num1); //8.0

        double availableBalance = 1000.50;

        //deposit 300$
        availableBalance += 300; // availableBalance = 1000.50+300
        System.out.println("availableBalance = " + availableBalance); //1300.50

        System.out.println("-------------------------------------------");

        //withdrawing 500$
        availableBalance -= 500; //availableBalance = 1300.50 - 500
        System.out.println("availableBalance = " + availableBalance);

        ////withdrawing 200$, then depositing is 400$

        availableBalance -= 200; //availableBalance = 600.5
        availableBalance += 400; //availableBalance = 1000.5
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("---------------------------------------");

        double salary = 50000.50 ;
        System.out.println("salary = " + salary);
        salary *= 2 ;
        System.out.println("salary = " + salary);

        double doge = 0.00000001;
        doge *= 1000000;
        System.out.println("dodge = " + doge);
























    }
}
