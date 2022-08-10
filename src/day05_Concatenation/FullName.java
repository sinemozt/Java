package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Aaron";
        String lastName = "Daniel";
        int age = 19;
        String jobtitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;


        String fullName = firstName + " " + lastName;

        System.out.println("fullName = " + fullName);

        //Full  name of the person is ____

        System.out.println("Full name of the person is " + fullName);

        //___ is __ years old.

        System.out.println(fullName  + " is " + age +" years old.");

        //FullName is JobTitle, works at CompanyName, and FullName' salary is Salary

        System.out.println(fullName + " is " + jobtitle +",works at " + companyName + ", and " + fullName + "' salary is $" + salary );


    }
}
 /*
  Create a class FullName that include variables : firstName and lastName
         */