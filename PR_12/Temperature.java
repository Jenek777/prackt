/*
Write a program that converts the temperature in integers to Fahrenheit 
from 0 to 212 degrees to values with floating point temperature Celsius 
up to 3 characters. Output data should be displayed on two columns with 
alignment at the right margin of the field, and the temperature value in 
Celsius should contain the sign i before the positive, 
and before the minus temperatures.
*/

public class Temperature {

    private static double CtoF(double Celsius) {

        System.out.println("Celsius  |   Fahrenheit");
        System.out.println("");
        for (int i = 0; i <= 50; i++) {
            Celsius = (Celsius*9/5)+32;
            System.out.printf("+" + "%3d     |    ", i);
            System.out.println((int) Celsius);
        }
        return Celsius;
    }

    private static double FtoC(double Fahrenheit) {

        System.out.println("\nFahrenheit |   Celsius");
        System.out.println("");
        for (int i = 0; i <= 212; i++) {
            Fahrenheit = (Fahrenheit-32)*5/9;
            System.out.printf(" %3d       |    ", i);
            System.out.println((int) Fahrenheit);
        }
        return Fahrenheit;
    }

    public static void main(String[] args) {

        CtoF(0);
        System.out.printf("--------------------------");
        FtoC(0);
    }
}
