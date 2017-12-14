/*
Write a program that displays the value 100.453627, rounded to the nearest 
integer, to one tenth, one hundred, one thousand and ten thousand
*/

public class Rounding {
    public static void main(String[] args){

        double number = 100.453627;
        System.out.printf("%.0f%n", number);
        System.out.printf("%.1f%n", number);
        System.out.printf("%.2f%n", number);
        System.out.printf("%.3f%n", number);
        System.out.printf("%.4f%n", number);
    }
}
