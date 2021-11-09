package javabasics;

public class Methods {

    /*
    1. Access Modifier
    2. Return Type
    3. Method name
    4. Parenthesis
    5. Code Blocks {}
     */

    public static void main(String[] args) {

        calculateNumbers();
        myName();
        myShoesize();
        printName("Ahmed", 20);

    }

    public static void calculateNumbers() {

        int myNumber = 8505;

        System.out.println("My Student Number is " + myNumber);
    }

    public static String myName() {
        String myName = "Ahmed";

        System.out.println("My name is " + myName);
        return myName;

    }

    public static void myShoesize() {

        double myShoesize = 9.5;

        System.out.println("My Shoe Size is " + myShoesize);

    }

    public static void printName(String name, int age) {
        System.out.println("My Name is " + name + " and My age is " + age);

    }

}
