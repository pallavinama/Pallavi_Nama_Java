package com.company;

public class App {
//    Main Method
    public static void main(String[] args){
        Calculator calc = new Calculator();

        System.out.println(" Addition of 1 + 1 = " + calc.addInt(1,1));
        System.out.println(" Subtraction of 23 - 52 = " + calc.subractInt(23,52));
        System.out.println(" Multiplication of 34 * 2 = " + calc.multiplyInt(34,2));
        System.out.println(" Multiplication of 12 / 3 = " + calc.divisionInt(12,3));
        System.out.println(" Multiplication of 12 / 7 = " + calc.divisionInt(12,7));


        System.out.println(" Addition of 3.4 + 2.3 = " + calc.addDouble(3.4,2.3));
        System.out.println(" Mulitplication of 6.7 * 4.4 = " + calc.multiplyDouble(6.7,4.4));
        System.out.println(" Subtraction of 5.5 - 0.5 = " + calc.subtractDouble(5.5 , 0.5));
        System.out.println(" Division of 10.8 / 2.2 = " + calc.divisionDouble(10.8,2.2));
    }
}
