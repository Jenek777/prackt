/*
Write the program that uses the for structure to print the ASCll values table 
for the ASCll character set from 33 to 126. The program must print the decimal,
octal, hexadecimal, and symbolic values of each character
*/

public class Numbers {
    public static void main(String[] args) {

        //ASCII
        for (char letter = 33; letter <= 126; letter++) {
            System.out.printf("%d = %c\n", (int) letter, letter);
        }
        //Binary
        System.out.println("$$$$$$$$$$$$$$$");
        for (char letter = 33; letter <= 126; letter++){
            String convert = Integer.toBinaryString(letter);
            System.out.println("   " + convert);
        }
        //Octal
        System.out.println("******************");
        for (char letter = 33; letter <= 126; letter++){
            String convert = Integer.toOctalString(letter);
            System.out.println("     " + convert);
        }
        //Hexadecimal
        System.out.println("&&&&&&&&&&&&&&&&&");
        for (char letter = 33; letter <= 126; letter++){
            String convert = Integer.toHexString(letter);
            System.out.println("     " + convert);
        }
    }
}
