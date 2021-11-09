package javabasics;

public class DataTypes {
    /*
    DATA TYPE:
    a) Primitive
    b) Non-Primitive
     */

    public static void main(String[] args) {

//    Primitive
        int x = 100;
        double y = 20.2;
        int z = 50;

        int result = (x+z);

        System.out.println(result);

//    Non-Primitive

        String myName = "Ahmed";
        myName.length();

        System.out.println(myName);
        System.out.println("My name is " + myName);
        System.out.println(myName.length());
        System.out.println(myName.toLowerCase());
        System.out.println(myName.toUpperCase());
    }
}
