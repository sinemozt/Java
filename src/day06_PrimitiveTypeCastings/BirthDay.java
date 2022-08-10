package day06_PrimitiveTypeCastings;

public class BirthDay {

    public static void main(String[] args) {

        String name = "Aaron";
        int birthDay = 25;
        String month = "April";
        int year = 1995;

        System.out.println(name + " was borned on " + birthDay + "/" + month + "/" + year +".");

        System.out.println("----------------------------------------------------------");
        //My favorite book is "bookName"

        String bookName = "The rich Dad and the poor Dad";
        System.out.println("My favorite book is " + "\"" + bookName + "\"");
        /*
        \n
        \t
        \"
        \\
        \'
        
         */


    }

}




/*
Warmup tasks
1. Create a class named BirthDay and create the following variable
 name, birthDay(int), birthMonth(String),
birthYear(int)
 use concatenation to display the birthday of
the person
 if  name = "John"
 birthDay = 25
     birthMonth = "April"
     birthYear = 1995;
 output:
 John was born on
April/25/1995.
Primitives:
double > float > long > int > short > byte
smaller primitives can be directly assigned to larger primitive type
larger ptimitives can NOT be directly assigned to smaller primitive
types (need to be casted manually)
 */
